package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.errordisplay.*;
import org.antlr.v4.runtime.*;
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
            addUndeclaredTypeUsageError(tu);
        } else {
            tu.setDeclaration(td);
            td.addUsage(tu);
        }
    }

    private static void addUndeclaredTypeUsageError(TypeUsage tu) {
        String message = tu.getName() + " : not declared type";
        int start = tu.getNameStartIndex();
        int stop = tu.getNameStopIndex();
        addError(Severity.ERROR, message, start, stop);
    }

    public static void addError(Severity severity, String message, int start, int stop) {
        ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(severity, message, GlslProcessor.getDocument(), new ErrorPosition(start), new ErrorPosition(stop));
        Scope.addError(ed);
    }

    public static void addIdentifierWarnings(String name, int startIndex, int stopIndex) {
        addReservedIdentifierNameWarning(name, startIndex, stopIndex);
        addTooLongIdentifierNameWarning(name, startIndex, stopIndex);
    }

    private static void addReservedIdentifierNameWarning(String name, int startIndex, int stopIndex) {
        if (name.startsWith("__") || name.startsWith("gl_")) {
            String message = name.startsWith("__") ? name + " : two consecutive underscores are reserved for future use" : name + " : the gl_ identifier prefix is reserved for use by OpenGL";
            addError(Severity.WARNING, message, startIndex, stopIndex);
        }
    }

    private static void addTooLongIdentifierNameWarning(String name, int startIndex, int stopIndex) {
        if (name.length() > 1024) {
            String message = "some compilers may not support identifiers with name longer than 1024 characters";
            addError(Severity.WARNING, message, startIndex, stopIndex);
        }
    }

    public static Scope createScope(Scope currentScope, ParserRuleContext prc) {
        Scope newScope = new Scope();
        newScope.setStartIndex(prc.start.getStartIndex());
        newScope.setStopIndex(prc.stop.getStopIndex() + 1);
        currentScope.addChild(newScope);
        newScope.setParent(currentScope);
        return newScope;
    }

}
