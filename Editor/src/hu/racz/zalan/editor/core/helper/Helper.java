package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.core.scope.qualifier.Qualifier;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Helper {

    public static int getArrayDepth(AntlrGlslParser.Array_subscriptContext asc) {
        return asc != null ? asc.LSB().size() : 0;
    }

    public static Scope getRootScope(Scope scope) {
        Scope s = scope;
        while (s.getParent() != null) {
            s = s.getParent();
        }
        return s;
    }

    public static Scope createScope(Scope currentScope, ParserRuleContext prc) {
        Scope newScope = new Scope();
        newScope.setStartIndex(prc.start.getStartIndex());
        newScope.setStopIndex(prc.stop.getStopIndex() + 1);
        currentScope.addChild(newScope);
        newScope.setParent(currentScope);
        return newScope;
    }

    //
    //qualifiers----------------------------------------------------------------
    //
    public static QualifierUsage createQualifierUsage(AntlrGlslParser.Precision_qualifierContext pcx) {
        return createQualifierUsage((ParserRuleContext) pcx);
    }

    public static QualifierUsage createQualifierUsage(AntlrGlslParser.Parameter_qualifierContext pqc) {
        return createQualifierUsage((ParserRuleContext) pqc);
    }

    private static QualifierUsage createQualifierUsage(ParserRuleContext prc) {
        if (prc == null) {
            return null;
        } else {
            return createQualifierUsage(prc.getText(), prc.getStart().getStartIndex(), prc.getStop().getStopIndex() + 1);
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
