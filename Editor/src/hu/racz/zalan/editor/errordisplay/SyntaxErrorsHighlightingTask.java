package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import javax.swing.text.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.hints.*;

public class SyntaxErrorsHighlightingTask extends ParserResultTask<GlslParser.GlslEditorParserResult> {

    public SyntaxErrorsHighlightingTask() {
    }

    @Override
    public void run(GlslParser.GlslEditorParserResult result, SchedulerEvent event) {
        try {
            SyntaxErrorListener sel = (SyntaxErrorListener) result.getAbcParser().getErrorListeners().get(0);
            List<SyntaxError> syntaxErrors = sel.getSyntaxErrors();
            Document document = result.getSnapshot().getSource().getDocument(false);
            List<ErrorDescription> errors = new ArrayList<>();
            for (SyntaxError syntaxError : syntaxErrors) {
                String message = syntaxError.getMessage();
                int line = syntaxError.getLine();
                if (line <= 0) {
                    continue;
                }
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR,
                        message,
                        document,
                        line);
                errors.add(errorDescription);
            }
            HintsController.setErrors(document, "abc", errors);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
