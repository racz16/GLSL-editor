package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.errordisplay.scope.Scope;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.errordisplay.scope.Function;
import hu.racz.zalan.editor.errordisplay.scope.GlslVisitor;
import hu.racz.zalan.editor.errordisplay.scope.Variable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.*;

public class GlslParser extends Parser {

    private Snapshot snapshot;
    private AntlrGlslParser glslParser;

    private Scope scope;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        this.snapshot = snpsht;
        ANTLRInputStream ais = new ANTLRInputStream(snapshot.getText().toString());
        Lexer lexer = new AntlrGlslLexer(ais);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        glslParser = new AntlrGlslParser(tokens);
        startParser();
    }

    private void startParser() {
        glslParser.removeErrorListeners();
        glslParser.addErrorListener(new SyntaxErrorListener());
        //glslParser.addParseListener(new Listener());
        ParseTree pt = glslParser.start();

        GlslVisitor visitor = new GlslVisitor(0);
        visitor.visit(pt);
        scope = visitor.getRootScope();
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return new GlslEditorParserResult(snapshot, glslParser, scope);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {

    }

    @Override
    public void removeChangeListener(ChangeListener cl) {

    }

    public class FunctionSignature {

        String name;
        String type;
        List<String> parameters = new ArrayList<>();
        int line;
        //int start;
        //int end;

        int functionStart;
        int functionEnd;
        int signatureEnd;

        public boolean equalsSignature(FunctionSignature fs) {
            if (!name.equals(fs.name) || parameters.size() != fs.parameters.size()) {
                return false;
            }
            for (int i = 0; i < parameters.size(); i++) {
                if (!parameters.get(i).equals(fs.parameters.get(i))) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public boolean equals(Object obj) {
            FunctionSignature fs = (FunctionSignature) obj;
            return equalsSignature(fs) && type.equals(fs.type);
        }

        @Override
        public String toString() {
            String res = type + " " + name + "(";
            for (String param : parameters) {
                res += param + ", ";
            }
            res += ")";
            return res;
        }

    }

    public class Listener extends AntlrGlslParserBaseListener {

        @Override
        public void exitFunction_definition(AntlrGlslParser.Function_definitionContext ctx) {
            FunctionSignature fs = new FunctionSignature();
            AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
            fs.name = fsc.IDENTIFIER().getText();
            fs.type = fsc.return_type().getText();
            if (fsc.function_parameter_list() != null) {
                for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                    if (param.type() != null) {
                        fs.parameters.add(param.type().getText());
                    }
                }
            }
            fs.functionStart = ctx.start.getStartIndex();
            fs.functionEnd = ctx.stop.getStopIndex() + 1;
            fs.signatureEnd = fsc.stop.getStopIndex() + 1;
            //defs.add(fs);
        }

        @Override
        public void exitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
            FunctionSignature fs = new FunctionSignature();
            AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
            fs.name = fsc.IDENTIFIER().getText();
            fs.type = fsc.return_type().getText();
            if (fsc.function_parameter_list() != null) {
                for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                    if (param.type() != null) {
                        fs.parameters.add(param.type().getText());
                    }
                }
            }
            fs.functionStart = ctx.start.getStartIndex();
            fs.functionEnd = ctx.stop.getStopIndex() + 1;
            fs.signatureEnd = fsc.stop.getStopIndex() + 1;
            //prots.add(fs);
        }

    }

    public static class GlslEditorParserResult extends Result {

        private final AntlrGlslParser glslParser;
        private boolean valid = true;
        private Scope rootScope;

        GlslEditorParserResult(Snapshot snapshot, AntlrGlslParser oracleParser, Scope rootScope) {
            super(snapshot);
            this.glslParser = oracleParser;
            this.rootScope = rootScope;
        }

        public AntlrGlslParser getGlslParser() throws ParseException {
            if (!valid) {
                throw new ParseException();
            }
            return glslParser;
        }

        public Scope getRootScope() {
            return rootScope;
        }

        @Override
        protected void invalidate() {
            valid = false;
        }
    }

}
