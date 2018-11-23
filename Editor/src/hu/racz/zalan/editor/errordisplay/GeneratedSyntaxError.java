package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.core.helper.*;
import javax.swing.text.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.editor.hints.*;

public class GeneratedSyntaxError {

    private final Recognizer<?, ?> recognizer;
    private final Object offendingSymbol;
    private final int line;
    private final int charPositionInLine;
    private final String message;
    private final RecognitionException exception;

    public GeneratedSyntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        this.recognizer = recognizer;
        this.offendingSymbol = offendingSymbol;
        this.line = line;
        this.charPositionInLine = charPositionInLine;
        this.message = msg;
        this.exception = e;
    }

    public Recognizer<?, ?> getRecognizer() {
        return recognizer;
    }

    public Object getOffendingSymbol() {
        return offendingSymbol;
    }

    public int getLine() {
        return line;
    }

    public int getCharPositionInLine() {
        return charPositionInLine;
    }

    public String getMessage() {
        return message;
    }

    public RecognitionException getException() {
        return exception;
    }

    public ErrorDescription createError(Document doc) {
        return ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, message, doc, line);
    }
}
