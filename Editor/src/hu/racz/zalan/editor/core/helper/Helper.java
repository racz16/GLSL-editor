package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.core.scope.qualifier.Qualifier;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Helper {

    public static void addTypeUsageToScopeIfCustom(TypeUsage tu, Scope currentScope) {
        if (tu != null && tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
            currentScope.addTypeUsage(tu);
        }
    }

    public static TypeUsage createTypeUsageWithoutQualifiers(Scope scope, AntlrGlslParser.TypeContext tc, AntlrGlslParser.Array_subscriptContext asc) {
        TerminalNode tn = tc.IDENTIFIER() != null ? tc.IDENTIFIER() : tc.TYPE();
        return createTypeUsageWithoutQualifiers(scope, tn, asc);
    }

    public static TypeUsage createTypeUsageWithoutQualifiers(Scope scope, TerminalNode tn, AntlrGlslParser.Array_subscriptContext asc) {
        int arrayDepth = getArrayDepth(asc);
        TypeUsage tu = new TypeUsage(tn.getText(), arrayDepth);
        tu.setNameStartIndex(tn.getSymbol().getStartIndex());
        tu.setNameStopIndex(tn.getSymbol().getStopIndex() + 1);
        setDeclaration(scope, tu);
        return tu;
    }

    public static int getArrayDepth(AntlrGlslParser.Array_subscriptContext asc) {
        return asc != null ? asc.LSB().size() : 0;
    }

    public static TypeDeclaration getTypeDeclaration(Scope scope, String type) {
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

    public static Scope getRootScope(Scope scope) {
        Scope s = scope;
        while (s.getParent() != null) {
            s = s.getParent();
        }
        return s;
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

    public static boolean areConvertible(TypeDeclaration td1, TypeDeclaration td2) {
        return td1 != null && td2 != null && (td1.isConveribleTo(td2) || td2.isConveribleTo(td1));
    }

    public static TypeDeclaration getConversion(TypeDeclaration td1, TypeDeclaration td2) {
        if (td1 == null || td2 == null) {
            return null;
        }
        if (td1.getName().equals(td2.getName()) || td2.getImplicitConversions().contains(td1)) {
            return td1;
        }
        if (td1.getImplicitConversions().contains(td2)) {
            return td2;
        }
        return null;
    }

    public static Scope createScope(Scope currentScope, ParserRuleContext prc) {
        Scope newScope = new Scope();
        newScope.setStartIndex(prc.start.getStartIndex());
        newScope.setStopIndex(prc.stop.getStopIndex() + 1);
        currentScope.addChild(newScope);
        newScope.setParent(currentScope);
        return newScope;
    }

    public static void addPrecisionQualifier2(TypeUsage tu, AntlrGlslParser.Precision_qualifierContext pcx) {
        if (pcx != null) {
            addPrecisionQualifierUnsafe(tu, pcx);
        }
    }

    private static void addPrecisionQualifierUnsafe(TypeUsage tu, AntlrGlslParser.Precision_qualifierContext pcx) {
        if (pcx.Q_LOWP() != null) {
            addQualifier(tu, pcx.Q_LOWP());
        } else if (pcx.Q_MEDIUMP() != null) {
            addQualifier(tu, pcx.Q_MEDIUMP());
        } else if (pcx.Q_HIGHP() != null) {
            addQualifier(tu, pcx.Q_HIGHP());
        }
    }

    public static void addQualifier(TypeUsage tu, TerminalNode tn) {
        String name = tn.getText();
        int startIndex = tn.getSymbol().getStartIndex();
        int stopIndex = tn.getSymbol().getStopIndex() + 1;
        QualifierUsage qu = createQualifierUsage(name, startIndex, stopIndex);
        tu.addQualifier(qu);
    }

    public static QualifierUsage createQualifierUsage(AntlrGlslParser.Precision_qualifierContext pcx) {
        if (pcx == null) {
            return null;
        } else {
            return createQualifierUsage(pcx.getText(), pcx.getStart().getStartIndex(), pcx.getStop().getStopIndex() + 1);
        }
    }

    public static QualifierUsage createQualifierUsage(AntlrGlslParser.Parameter_qualifierContext pqc) {
        if (pqc == null) {
            return null;
        } else {
            return createQualifierUsage(pqc.getText(), pqc.getStart().getStartIndex(), pqc.getStop().getStopIndex() + 1);
        }
    }

    private static QualifierUsage createQualifierUsage(String name, int startIndex, int stopIndex) {
        Qualifier q = Builtin.getQualifier(name);
        QualifierUsage qu = new QualifierUsage(name);
        qu.setNameStartIndex(startIndex);
        qu.setNameStopIndex(stopIndex);
        qu.setQualifier(q);
        q.addUsage(qu);
        return qu;
    }

}
