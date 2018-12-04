package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class TypeHelper {

    public static void addTypeUsageToScopeIfCustom(TypeUsage tu, Scope currentScope) {
        if (tu != null && tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
            currentScope.addTypeUsage(tu);
        }
    }

    public static boolean areConvertible(TypeDeclaration td1, TypeDeclaration td2) {
        return td1 != null && td2 != null && (td1.isConvertibleTo(td2) || td2.isConvertibleTo(td1));
    }

    public static TypeDeclaration getConversion(TypeDeclaration td1, TypeDeclaration td2) {
        if (td1 == null || td2 == null) {
            return null;
        }
        return getConversionUnsafe(td1, td2);
    }

    private static TypeDeclaration getConversionUnsafe(TypeDeclaration td1, TypeDeclaration td2) {
        if (td1.getName().equals(td2.getName()) || td2.getImplicitConversions().contains(td1)) {
            return td1;
        }
        if (td1.getImplicitConversions().contains(td2)) {
            return td2;
        }
        return null;
    }

    //
    //type usage----------------------------------------------------------------
    //
    public static TypeUsage createTypeUsageWithoutQualifiers(Scope currentScope, AntlrGlslParser.Variable_declarationContext vdc, AntlrGlslParser.Array_subscriptContext asc) {
        if (vdc.type() != null) {
            return TypeHelper.createTypeUsageWithoutQualifiers(currentScope, vdc.type(), asc);
        } else {
            return TypeHelper.createTypeUsageWithoutQualifiers(currentScope, vdc.struct_declaration().IDENTIFIER(), asc);
        }
    }

    public static TypeUsage createTypeUsageWithoutQualifiers(Scope scope, AntlrGlslParser.TypeContext tc, AntlrGlslParser.Array_subscriptContext asc) {
        TerminalNode tn = tc.IDENTIFIER() != null ? tc.IDENTIFIER() : tc.TYPE();
        return TypeHelper.createTypeUsageWithoutQualifiers(scope, tn, asc);
    }

    public static TypeUsage createTypeUsageWithoutQualifiers(Scope scope, TerminalNode tn, AntlrGlslParser.Array_subscriptContext asc) {
        int arrayDepth = Helper.getArrayDepth(asc);
        TypeUsage tu = new TypeUsage(tn.getText(), arrayDepth);
        tu.setNameStartIndex(tn.getSymbol().getStartIndex());
        tu.setNameStopIndex(tn.getSymbol().getStopIndex() + 1);
        setDeclaration(scope, tu);
        return tu;
    }

    public static void setDeclaration(Scope s, TypeUsage tu) {
        TypeDeclaration td = getTypeDeclaration(s, tu.getName());
        if (td == null) {
            ErrorHelper.addUndeclaredTypeUsageError(tu);
        } else {
            tu.setDeclaration(td);
            td.addUsage(tu);
        }
    }

    private static TypeDeclaration getTypeDeclaration(Scope scope, String type) {
        while (scope != null) {
            for (TypeDeclaration td : scope.getTypeDeclarations()) {
                if (td.getName().equals(type)) {
                    return td;
                }
            }
            scope = scope.getParent();
        }
        return Builtin.getType(type);
    }

    //
    //type declaration----------------------------------------------------------
    //
    public static TypeDeclaration createTypeDeclaration(Scope currentScope, AntlrGlslParser.Struct_declarationContext ctx) {
        TypeDeclaration td = new TypeDeclaration(ctx.IDENTIFIER().getText());
        setStructIndices(td, ctx);
        setMembers(currentScope, td, ctx.member_declaration());
        ErrorHelper.addIdentifierWarnings(td);
        return td;
    }

    private static void setMembers(Scope currentScope, TypeDeclaration td, List<AntlrGlslParser.Member_declarationContext> mdcs) {
        for (VariableDeclaration vd : VariableHelper.createMembers(currentScope, mdcs)) {
            currentScope.addVariableDeclaration(vd);
            td.addMember(vd);
        }
    }

    private static void setStructIndices(TypeDeclaration td, AntlrGlslParser.Struct_declarationContext ctx) {
        td.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
        td.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
        td.setStructStartIndex(ctx.getStart().getStartIndex());
        td.setStructStopIndex(ctx.getStop().getStopIndex() + 1);
    }
}
