package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class VariableHelper {

    public static VariableUsage createVariableUsage(TerminalNode tn, TypeUsage previousTu, Scope currentScope) {
        VariableUsage vu = new VariableUsage(tn.getText());
        vu.setNameStartIndex(tn.getSymbol().getStartIndex());
        vu.setNameStopIndex(tn.getSymbol().getStopIndex() + 1);
        setDeclaration(vu, previousTu, currentScope);
        return vu;
    }

    private static void setDeclaration(VariableUsage vu, TypeUsage previousTu, Scope currentScope) {
        VariableDeclaration vd = getVariableDeclaration(vu, previousTu, currentScope);
        if (vd == null) {
            if (!Scope.getMacroDefinitions().contains(vu.getName())) {
                ErrorHelper.addUndeclaredVariableUsageError(vu);
            }
        } else {
            vu.setDeclaration(vd);
            vd.addUsage(vu);
        }
    }

    private static VariableDeclaration getVariableDeclaration(VariableUsage vu, TypeUsage previousTu, Scope currentScope) {
        if (previousTu == null) {
            VariableDeclaration ret = getBuiltinVariableDeclaration(vu);
            return ret == null ? getUserVariableDeclaration(vu, currentScope) : ret;
        } else if (previousTu.getDeclaration() != null) {
            VariableDeclaration ret = getUserVariableDeclaration(vu, previousTu);
            return ret == null ? getSwizzleDeclaration(vu, previousTu) : ret;
        }
        return null;
    }

    private static VariableDeclaration getSwizzleDeclaration(VariableUsage vu, TypeUsage previousTu) {
        boolean sw = isSwizzle(vu.getName(), previousTu.getDeclaration().getWidth());
        if (previousTu.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT || !previousTu.getDeclaration().isVector() || !sw) {
            return null;
        } else {
            String name = "";
            if (vu.getName().length() > 1) {
                switch (previousTu.getDeclaration().getTypeBase()) {
                    case BOOL:
                        name = "b";
                        break;
                    case DOUBLE:
                        name = "d";
                        break;
                    case INT:
                        name = "i";
                        break;
                    case UINT:
                        name = "u";
                        break;
                }
                name = name + "vec" + vu.getName().length();
            } else {
                name = previousTu.getDeclaration().getTypeBase().name().toLowerCase();
            }
            TypeDeclaration td = Builtin.getType(name);
            TypeUsage tu = new TypeUsage(td.getName());
            tu.setDeclaration(td);
            VariableDeclaration vd = new VariableDeclaration(tu, vu.getName());
            if (sw) {
                vd.setBuiltIn(true);
            }
            return vd;
        }
    }

    private static boolean isSwizzle(String str, int dimension) {
        char[] rgba = {'r', 'g', 'b', 'a'};
        char[] xyzw = {'x', 'y', 'z', 'w'};
        char[] stpq = {'s', 't', 'p', 'q'};
        if (str.length() < 1 || str.length() > 4) {
            return false;
        }
        return 1 == allCharacterIsOneOf(str, stpq, dimension) + allCharacterIsOneOf(str, rgba, dimension) + allCharacterIsOneOf(str, xyzw, dimension);
    }

    private static int allCharacterIsOneOf(String str, char[] chars, int dim) {
        for (int i = 0; i < str.length(); i++) {
            boolean valid = false;
            for (int j = 0; j < dim; j++) {
                if (str.charAt(i) == chars[j]) {
                    valid = true;
                    break;
                }
            }
            if (!valid) {
                return 0;
            }
        }
        return 1;
    }

    private static VariableDeclaration getBuiltinVariableDeclaration(VariableUsage vu) {
        for (VariableDeclaration vd : Builtin.getVariables().values()) {
            if (vd.getName().equals(vu.getName())) {
                return vd;
            }
        }
        return null;
    }

    private static VariableDeclaration getUserVariableDeclaration(VariableUsage vu, Scope currentScope) {
        Scope scope = currentScope;
        while (scope != null) {
            VariableDeclaration vd = getUserVariableDeclarationInScope(vu, scope);
            if (vd != null) {
                return vd;
            }
            scope = scope.getParent();
        }
        return null;
    }

    private static VariableDeclaration getUserVariableDeclarationInScope(VariableUsage vu, Scope currentScope) {
        for (VariableDeclaration vd : currentScope.getVariableDeclarations()) {
            if (vd.getName().equals(vu.getName())) {
                return vd;
            }
        }
        return null;
    }

    private static VariableDeclaration getUserVariableDeclaration(VariableUsage vu, TypeUsage previousTu) {
        TypeDeclaration td = previousTu.getDeclaration();
        for (VariableDeclaration vd : td.getMembers()) {
            if (vu.getName().equals(vd.getName())) {
                return vd;
            }
        }
        return null;
    }

    //
    //variable declaration------------------------------------------------------
    //
    public static VariableDeclaration createVariableDeclarationWithoutQualifiers(Scope currentScope, AntlrGlslParser.Member_declarationContext mdc, AntlrGlslParser.Identifier_optarrayContext ioc) {
        TypeUsage tu = TypeHelper.createTypeUsageWithoutQualifiers(currentScope, mdc.type(), mdc.array_subscript());
        tu.setArrayDepth(tu.getArrayDepth() + Helper.getArrayDepth(ioc.array_subscript()));
        TypeHelper.addTypeUsageToScopeIfCustom(tu, currentScope);
        return VariableHelper.createVariableDeclarationWithoutQualifiers(tu, mdc, ioc);
    }

    public static VariableDeclaration createVariableDeclarationWithoutQualifiers(TypeUsage tu, AntlrGlslParser.Variable_declarationContext ctx, AntlrGlslParser.Identifier_optarray_optassignmentContext iooc) {
        VariableDeclaration vd = new VariableDeclaration(tu, iooc.identifier_optarray().IDENTIFIER().getText());
        vd.setNameStartIndex(iooc.identifier_optarray().IDENTIFIER().getSymbol().getStartIndex());
        vd.setNameStopIndex(iooc.identifier_optarray().IDENTIFIER().getSymbol().getStopIndex() + 1);
        vd.setDeclarationStartIndex(ctx.getStart().getStartIndex());
        vd.setDeclarationStopIndex(ctx.getStop().getStopIndex() + 1);
        return vd;
    }

    public static VariableDeclaration createVariableDeclarationWithoutQualifiers(TypeUsage tu, AntlrGlslParser.Member_declarationContext mdc, AntlrGlslParser.Identifier_optarrayContext ioc) {
        //TODO: identifier warnings
        String name = ioc.IDENTIFIER().getText();
        VariableDeclaration vd = new VariableDeclaration(tu, name, false);
        vd.setNameStartIndex(ioc.IDENTIFIER().getSymbol().getStartIndex());
        vd.setNameStopIndex(ioc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        vd.setDeclarationStartIndex(mdc.getStart().getStartIndex());
        vd.setDeclarationStopIndex(mdc.getStop().getStopIndex() + 1);
        return vd;
    }

    public static VariableDeclaration createVariableDeclarationWithoutQualifiers(TypeUsage tu, AntlrGlslParser.Function_parameterContext fpc) {
        String name = fpc.identifier_optarray() != null ? fpc.identifier_optarray().IDENTIFIER().getText() : "";
        VariableDeclaration vd = new VariableDeclaration(tu, name);
        setParameterIndices(vd, fpc);
        return vd;
    }

    private static void setParameterIndices(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.identifier_optarray() != null) {
            vd.setNameStartIndex(fpc.identifier_optarray().IDENTIFIER().getSymbol().getStartIndex());
            vd.setNameStopIndex(fpc.identifier_optarray().IDENTIFIER().getSymbol().getStopIndex() + 1);
        }
        vd.setDeclarationStartIndex(fpc.getStart().getStartIndex());
        vd.setDeclarationStopIndex(fpc.getStop().getStopIndex() + 1);
    }

    public static List<VariableDeclaration> createMembers(Scope currentScope, List<AntlrGlslParser.Member_declarationContext> mdcs) {
        List<VariableDeclaration> vds = new ArrayList<>();
        for (AntlrGlslParser.Member_declarationContext mdc : mdcs) {
            for (AntlrGlslParser.Identifier_optarrayContext ioc : mdc.member_declarator().identifier_optarray()) {
                vds.add(VariableHelper.createVariableDeclarationWithoutQualifiers(currentScope, mdc, ioc));
            }
        }
        return vds;
    }
}
