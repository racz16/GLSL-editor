package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.errordisplay.*;
import org.netbeans.spi.editor.hints.*;

public class ErrorHelper {

    public static void addUndeclaredTypeUsageError(TypeUsage tu) {
        String message = tu.getName() + " : not declared type";
        int start = tu.getNameStartIndex();
        int stop = tu.getNameStopIndex();
        addError(Severity.ERROR, message, start, stop);
    }

    public static void addUndeclaredVariableUsageError(VariableUsage vu) {
        String message = vu.getName() + " : undeclared identifier";
        int start = vu.getNameStartIndex();
        int stop = vu.getNameStopIndex();
        addError(Severity.ERROR, message, start, stop);
    }

    public static void addError(Severity severity, String message, int start, int stop) {
        //ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(severity, message, org.netbeans.api.editor.EditorRegistry.lastFocusedComponent ().getDocument(), new ErrorPosition(start), new ErrorPosition(stop));
        UniqueSyntaxError ed = new UniqueSyntaxError(severity, message, start, stop);
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
}
