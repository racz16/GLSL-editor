package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser;
import hu.racz.zalan.editor.errordisplay.GlslParser.FunctionSignature;
import hu.racz.zalan.editor.errordisplay.scope.Function;
import java.util.*;
import javax.swing.text.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.hints.*;
import org.openide.filesystems.FileObject;

public class SyntaxErrorsHighlightingTask extends ParserResultTask<GlslParser.GlslEditorParserResult> {

    private Document document;
    private List<SyntaxError> antlrGeneratedErrors;

    private AntlrGlslParser parser;

    public SyntaxErrorsHighlightingTask() {
    }

    @Override
    public void run(GlslParser.GlslEditorParserResult result, SchedulerEvent event) {
        initialize(result);
        addErrorsToNetbeansEditor(result);
    }

    private void initialize(GlslParser.GlslEditorParserResult result) {
        try {
            document = result.getSnapshot().getSource().getDocument(false);
            SyntaxErrorListener sel = (SyntaxErrorListener) result.getGlslParser().getErrorListeners().get(0);
            antlrGeneratedErrors = sel.getSyntaxErrors();
            parser = result.getGlslParser();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addErrorsToNetbeansEditor(GlslParser.GlslEditorParserResult result) {
        List<ErrorDescription> errors = new ArrayList<>();
        for (SyntaxError error : antlrGeneratedErrors) {
            ErrorDescription errorDescription = transformAntlrErrorToNetbeansError(error);
            errors.add(errorDescription);
        }

        //ParseTreeWalker ptw = new ParseTreeWalker();
        //ptw.walk(new Listener(), parser.start());
        //Listener lst = new Listener();
        //parser.function_definition().exitRule(lst);
        for (int i = 0; i < result.getRootScope().getFunctionDefinitionCount(); i++) {
            Function def = result.getRootScope().getFunctionDefinition(i);
            boolean valid = false;
            boolean valid2 = true;
            if (def.getName().equals("main") && def.getParameterCount() == 0 && def.getReturnType().equals("void")) {
                valid = true;
            }
            for (int j = 0; j < result.getRootScope().getFunctionPrototypeCount(); j++) {
                Function prot = result.getRootScope().getFunctionPrototype(j);
                if (prot.equals(def) && prot.getEndIndex() < def.getStartIndex()) {
                    valid = true;
                }
            }
            for (int j = 0; j < result.getRootScope().getFunctionDefinitionCount(); j++) {
                Function def2 = result.getRootScope().getFunctionDefinition(j);
                if (def != def2 && def.equalsSignature(def2) && def.getEndIndex() > def2.getStartIndex()) {
                    valid2 = false;
                }
            }
            if (!valid) {
                List<Fix> fixes = new ArrayList<>();
                fixes.add(new CreateFunctionPrototype(def));
                ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.WARNING, def.getName() + " function's prototype not exists", fixes, document, new MyPosition(def.getStartIndex()), new MyPosition(def.getSignatureEnd()));
                errors.add(ed);
            }
            if (!valid2) {
                //ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, " method " + def.name + " is already defined", document, def.line);
                List<Fix> fixes = new ArrayList<>();
                fixes.add(new MyFix(def.getStartIndex(), def.getEndIndex()));
                ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, "'" + def.getName() + "' function already has a body", fixes, document, new MyPosition(def.getStartIndex()), new MyPosition(def.getSignatureEnd()));
                errors.add(ed);
            }
        }

        HintsController.setErrors(document, "GLSL", errors);
    }

    public class MyPosition implements Position {

        private final int position;

        public MyPosition(int pos) {
            position = pos;
        }

        @Override
        public int getOffset() {
            return position;
        }

    }

    public class CreateFunctionPrototype implements Fix {

        private Function functionDefinition;

        public CreateFunctionPrototype(Function func) {
            this.functionDefinition = func;
        }

        @Override
        public String getText() {
            return "Create prototype";
        }

        @Override
        public ChangeInfo implement() throws Exception {
            document.insertString(functionDefinition.getStartIndex(), functionDefinition + ";\n\n", null);
            return null;
        }

    }

    public class MyFix implements Fix {

        int start;
        int end;

        public MyFix(int start, int end) {
            this.start = start;
            this.end = end;
            System.out.println(start + "   " + end);
        }

        @Override
        public String getText() {
            return "Remove this function";
        }

        @Override
        public ChangeInfo implement() throws Exception {
            document.remove(start, end - start);
            return null;
        }

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
