package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.qualifier.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.errordisplay.*;
import hu.racz.zalan.editor.errordisplay.fix.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.editor.hints.*;

public class ErrorHelper {

    public static void addIncompatibleTypesError(TypeUsage tu, TypeUsage tu2, AntlrGlslParser.ExpressionContext ec) {
        if (tu2 != null && tu2.getDeclaration() != null && (!tu2.getDeclaration().isConvertibleTo(tu.getDeclaration()) || tu2.getArrayDepth() != tu.getArrayDepth())) {
            ErrorHelper.addError(Severity.ERROR, tu.getName() + ", " + tu2.getName() + " : incompatible types", ec.getStart().getStartIndex(), ec.getStop().getStopIndex() + 1);
        }
    }

    public static void addVoidQualifierError(AntlrGlslParser.Precision_qualifierContext pqc) {
        if (pqc != null) {
            String message = "void : Only floating point, integer or opaque type declaration can have the type preceded by a precision qualifier. Unacceptable type";
            int start = pqc.getStart().getStartIndex();
            int stop = pqc.getStop().getStopIndex() + 1;
            addError(Severity.ERROR, message, start, stop);
        }
    }

    public static void addDuplicatedFunctionDefinitionError(FunctionDeclaration fd) {
        if (isFunctionDuplicated(fd)) {
            String message = "'" + fd.getName() + "' function already has a body";
            int start = fd.getSignatureStartIndex();
            int stop = fd.getSignatureStopIndex();
            ErrorHelper.addError(Severity.ERROR, message, start, stop, new RemoveElementFix(fd.getStartIndex(), fd.getStopIndex(), "remove function"));
        }
    }

    private static boolean isFunctionDuplicated(FunctionDeclaration fd) {
        for (FunctionDeclaration fd2 : Scope.getFunctionDefinitions()) {
            if (fd != fd2 && fd.getFunction().equalsSignature(fd2.getFunction()) && fd.getNameStopIndex() > fd2.getNameStartIndex()) {
                return true;
            }
        }
        return false;
    }

    public static void addInconsistentFunctionParameterQualifiersError(VariableDeclaration vd, QualifierUsage qu, AntlrGlslParser.Parameter_qualifierContext pq) {
        for (QualifierUsage fqu : vd.getType().getQualifiers()) {
            if (!qu.getQualifier().isCompatibleWith(fqu.getQualifier())) {
                String message = fqu.getQualifier().getName() + ", " + qu.getQualifier().getName() + " : inconsistent qualifiers";
                addError(Severity.ERROR, message, pq.getStart().getStartIndex(), pq.getStart().getStopIndex() + 1);
            }
        }
    }

    public static void addIdentifierWarnings(Element element) {
        addReservedIdentifierNameWarning(element);
        addTooLongIdentifierNameWarning(element);
    }

    private static void addReservedIdentifierNameWarning(Element element) {
        if (element.getName().startsWith("__") || element.getName().startsWith("gl_")) {
            String message = element.getName().startsWith("__") ? element.getName() + " : two consecutive underscores are reserved for future use" : element.getName() + " : the gl_ identifier prefix is reserved for use by OpenGL";
            int start = element.getNameStartIndex();
            int stop = element.getNameStopIndex();
            addError(Severity.WARNING, message, start, stop);
        }
    }

    private static void addTooLongIdentifierNameWarning(Element element) {
        if (element.getName().length() > 1024) {
            String message = "some compilers may not support identifiers with name longer than 1024 characters";
            int start = element.getNameStartIndex();
            int stop = element.getNameStopIndex();
            addError(Severity.WARNING, message, start, stop);
        }
    }

    public static void addBoolExpressionExpectedError(TypeUsage tu, int start, int stop) {
        if (tu != null && !tu.getName().equals("bool")) {
            String message = "boolean expression expected";
            ErrorHelper.addError(Severity.ERROR, message, start, stop);
        }
    }

    public static void addNoVersionMacroWarning() {
        if (GlslProcessor.getTokens() != null && !GlslProcessor.getTokens().isEmpty()) {
            Token ft = GlslProcessor.getTokens().get(0);
            if (ft.getType() != AntlrGlslLexer.MACRO || !ft.getText().startsWith("#version")) {
                ErrorHelper.addError(Severity.WARNING, "The shader should starts with the version macro", ft.getStartIndex(), ft.getStopIndex() + 1);
            }
        }
    }

    public static void addReturnError(TypeUsage currentFunctionReturnType, AntlrGlslParser.Jump_statementContext ctx) {
        if (ctx.expression() != null && currentFunctionReturnType.isVoid()) {
            ErrorHelper.addError(Severity.ERROR, "return : void function cannot return a value", ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
        } else if (ctx.expression() == null && !currentFunctionReturnType.isVoid()) {
            ErrorHelper.addError(Severity.ERROR, "return : non-void function must return a value ", ctx.KW_RETURN().getSymbol().getStartIndex(), ctx.KW_RETURN().getSymbol().getStopIndex() + 1);
        }
    }

    public static void addIntegerOverflowError(long number, AntlrGlslParser.Number_literalContext ctx) {
        if (number >= Math.pow(2, 32)) {
            String message = number + " : integer overflow";
            int start = ctx.INT_LITERAL().getSymbol().getStartIndex();
            int stop = ctx.INT_LITERAL().getSymbol().getStopIndex() + 1;
            ErrorHelper.addError(Severity.ERROR, message, start, stop);
        }
    }

    public static void addCannotConvertError(TypeDeclaration td1, TypeDeclaration td2, int start, int stop) {
        addError(Severity.ERROR, "'assign' :  cannot convert from '" + td2 + "' to '" + td1 + "'", start, stop);
    }

    //
    //
    //
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

    public static void addError(Severity severity, String message, int start, int stop, GlslErrorFix... fixes) {
        UniqueSyntaxError ed = new UniqueSyntaxError(severity, message, start, stop);
        for (GlslErrorFix fix : fixes) {
            ed.addFix(fix);
        }
        Scope.addError(ed);
    }

}
