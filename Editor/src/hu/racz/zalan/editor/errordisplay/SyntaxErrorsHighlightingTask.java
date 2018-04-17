package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import javax.swing.text.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.hints.*;

public class SyntaxErrorsHighlightingTask extends ParserResultTask<GlslParser.GlslEditorParserResult> {

    private Document document;
    private List<SyntaxError> antlrGeneratedErrors;

    public SyntaxErrorsHighlightingTask() {
    }

    @Override
    public void run(GlslParser.GlslEditorParserResult result, SchedulerEvent event) {
        initialize(result);
        addErrorsToNetbeansEditor();
    }

    private void initialize(GlslParser.GlslEditorParserResult result) {
        try {
            document = result.getSnapshot().getSource().getDocument(false);
            SyntaxErrorListener sel = (SyntaxErrorListener) result.getGlslParser().getErrorListeners().get(0);
            antlrGeneratedErrors = sel.getSyntaxErrors();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addErrorsToNetbeansEditor() {
        List<ErrorDescription> errors = new ArrayList<>();
        for (SyntaxError error : antlrGeneratedErrors) {
            ErrorDescription errorDescription = transformAntlrErrorToNetbeansError(error);
            errors.add(errorDescription);
        }
        HintsController.setErrors(document, "GLSL", errors);
    }

    private ErrorDescription transformAntlrErrorToNetbeansError(SyntaxError antlrError) {
        String message = antlrError.getMessage();
        int line = antlrError.getLine();
        return ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, message, document, line);
    }

    @Override
    public int getPriority() {
        return 100;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

    @Override
    public void cancel() {
    }

}
