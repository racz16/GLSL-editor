package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.core.scope.qualifier.Qualifier;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.errordisplay.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.netbeans.spi.editor.hints.*;

public class Helper {

    public static TypeDeclaration getTypeDeclaration(Scope scope, String type) {
        while (scope != null) {
            for (TypeDeclaration td : scope.getTypeDeclarations()) {
                if (td.getName().equals(type)) {
                    return td;
                }
            }
            scope = scope.getParent();
        }
        for (TypeDeclaration td : Builtin.getTypes().values()) {
            if (td.getName().equals(type)) {
                return td;
            }
        }
        return null;
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

    public static void addPrecisionQualifier(TypeUsage tu, AntlrGlslParser.Precision_qualifierContext pcx) {
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

    public static QualifierUsage createQualifierUsage(String name, int startIndex, int stopIndex) {
        Qualifier q = Builtin.getQualifier(name);
        QualifierUsage qu = new QualifierUsage(name);
        qu.setNameStartIndex(startIndex);
        qu.setNameStopIndex(stopIndex);
        qu.setQualifier(q);
        q.addUsage(qu);
        return qu;
    }

}
