package hu.racz.zalan.editor.errordisplay;

import javax.swing.text.*;
import org.netbeans.spi.editor.hints.*;

public class UniqueSyntaxError {

    private Severity severity;
    private String message;
    private int startIndex;
    private int stopIndex;

    public UniqueSyntaxError(Severity severity, String message, int startIndex, int stopIndex) {
        setSeverity(severity);
        setMessage(message);
        setStartIndex(startIndex);
        setStopIndex(stopIndex);
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    public ErrorDescription createError(Document doc) {
        return ErrorDescriptionFactory.createErrorDescription(severity, message, doc, new ErrorPosition(startIndex), new ErrorPosition(stopIndex));
    }

}
