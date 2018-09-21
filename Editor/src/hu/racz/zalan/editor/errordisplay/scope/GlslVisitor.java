package hu.racz.zalan.editor.errordisplay.scope;

import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GlslVisitor extends AntlrGlslParserBaseVisitor<Object> {

    private Scope currentScope;
    private Scope caretScope;
    private final int caretPosition;

    public GlslVisitor(int caretPosition) {
        this.caretPosition = caretPosition;
    }

    public Scope getRootScope() {
        return currentScope;
    }

    public Scope getCaretScope() {
        return caretScope;
    }

    @Override
    public Object visitStart(AntlrGlslParser.StartContext ctx) {
        currentScope = new Scope();
        caretScope = currentScope;
        return super.visitStart(ctx);
    }

    @Override
    public Object visitInit_declaration_list(AntlrGlslParser.Init_declaration_listContext ctx) {
        AntlrGlslParser.Single_declarationContext sdc = ctx.single_declaration();
        String type;
        if (sdc.type() != null) {
            type = sdc.type().getText();
        } else {
            type = sdc.struct_specifier().IDENTIFIER().getText();
        }
        if (sdc.IDENTIFIER() != null) {
            Variable var = new Variable();
            var.setType(type);
            var.setName(sdc.IDENTIFIER().getText());
            var.setStartIndex(sdc.IDENTIFIER().getSymbol().getStartIndex());
            var.setEndIndex(sdc.IDENTIFIER().getSymbol().getStopIndex());
            currentScope.addVariable(var);
            for (TerminalNode name : ctx.IDENTIFIER()) {
                Variable v = new Variable();
                v.setType(type);
                v.setName(name.getText());
                v.setStartIndex(name.getSymbol().getStartIndex());
                v.setEndIndex(name.getSymbol().getStopIndex());
                currentScope.addVariable(v);
            }
        }
        Object ret = super.visitInit_declaration_list(ctx);

        return ret;
    }

    @Override
    public Object visitCompound_statement(AntlrGlslParser.Compound_statementContext ctx) {
        Scope s = new Scope();
        s.setStartIndex(ctx.start.getStartIndex());
        s.setEndIndex(ctx.stop.getStopIndex());
        currentScope.addChild(s);
        s.setParent(currentScope);
        currentScope = s;
        if (s.getStartIndex() <= caretPosition && caretPosition <= s.getEndIndex()) {
            caretScope = currentScope;
        }
        Object ret = super.visitCompound_statement(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public Object visitFunction_definition(AntlrGlslParser.Function_definitionContext ctx) {
        Function func = new Function();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());
        func.setReturnType(fsc.return_type().getText());
        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    Variable p = new Variable();
                    p.setType(param.type().getText());
                    if (param.IDENTIFIER() != null) {
                        p.setName(param.IDENTIFIER().getText());
                    }
                    func.addParameter(p);
                }
            }
        }
        func.setStartIndex(ctx.start.getStartIndex());
        func.setEndIndex(ctx.stop.getStopIndex() + 1);
        func.setSignatureEnd(fsc.stop.getStopIndex() + 1);
        currentScope.addFunctionDefinition(func);
        return super.visitFunction_definition(ctx);
    }

    @Override
    public Object visitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
        Function func = new Function();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());
        func.setReturnType(fsc.return_type().getText());
        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    Variable p = new Variable();
                    p.setType(param.type().getText());
                    if (param.IDENTIFIER() != null) {
                        p.setName(param.IDENTIFIER().getText());
                    }
                    func.addParameter(p);
                }
            }
        }
        func.setStartIndex(ctx.start.getStartIndex());
        func.setEndIndex(ctx.stop.getStopIndex() + 1);
        func.setSignatureEnd(fsc.stop.getStopIndex() + 1);
        currentScope.addFunctionPrototype(func);
        return super.visitFunction_prototype(ctx);
    }

}
