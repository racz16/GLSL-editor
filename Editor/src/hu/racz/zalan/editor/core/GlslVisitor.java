package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.core.scope.type.TypeDeclaration;
import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParserBaseVisitor;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GlslVisitor extends AntlrGlslParserBaseVisitor<Object> {

    private Scope currentScope;

    private final List<Scope> bracelessScopes = new ArrayList<>();

    private boolean isFunctionDefinition;

    public GlslVisitor() {
    }

    public Scope getRootScope() {
        return currentScope;
    }

    @Override
    public Object visitStart(AntlrGlslParser.StartContext ctx) {
        currentScope = new Scope();
        return super.visitStart(ctx);
    }

    @Override
    public Object visitInit_declaration_list(AntlrGlslParser.Init_declaration_listContext ctx) {
        AntlrGlslParser.Single_declarationContext sdc = ctx.single_declaration();
        String type;
        if (sdc.type() != null) {
            type = sdc.type().getText();

            TypeUsage tu = new TypeUsage();
            tu.setName(type);
            tu.setStartIndex(sdc.type().start.getStartIndex());
            tu.setStopIndex(sdc.type().stop.getStopIndex() + 1);
            currentScope.addTypeUsage(tu);
            Scope scope = currentScope;
            search:
            while (scope != null) {
                for (TypeDeclaration td : scope.getTypeDeclarations()) {
                    if (td.getName().equals(tu.getName())) {
                        tu.setDeclaration(td);
                        td.addUsage(tu);
                        break search;
                    }
                }
                scope = scope.getParent();
            }
        } else {
            if (sdc.IDENTIFIER() != null) {
                type = sdc.struct_specifier().IDENTIFIER().getText();
            } else {
                type = "";
            }
        }
        if (sdc.IDENTIFIER() != null) {
            VariableDeclaration var = new VariableDeclaration();
            var.setType(type);
            var.setName(sdc.IDENTIFIER().getText());
            var.setStartIndex(sdc.IDENTIFIER().getSymbol().getStartIndex());
            var.setStopIndex(sdc.IDENTIFIER().getSymbol().getStopIndex() + 1);
            var.setArray(sdc.array_declaration() != null);
            if (currentScope.getParent() == null) {
                var.setGlobal(true);
            }
            currentScope.addVariable(var);
            for (TerminalNode name : ctx.IDENTIFIER()) {
                VariableDeclaration v = new VariableDeclaration();
                v.setType(type);
                v.setName(name.getText());
                v.setStartIndex(name.getSymbol().getStartIndex());
                v.setStopIndex(name.getSymbol().getStopIndex() + 1);
                //TODO: array
                if (currentScope.getParent() == null) {
                    v.setGlobal(true);
                }
                currentScope.addVariable(v);
            }
        }
        //isFor = false;
        Object ret = super.visitInit_declaration_list(ctx);

        return ret;
    }

    @Override
    public Object visitStatement(AntlrGlslParser.StatementContext ctx) {
        if (!(ctx.parent instanceof AntlrGlslParser.Statement_listContext) && ctx.compound_statement() == null) {

            Scope s = new Scope();
            s.setStartIndex(ctx.start.getStartIndex());
            s.setEndIndex(ctx.stop.getStopIndex());
            currentScope.addChild(s);
            s.setParent(currentScope);
            currentScope = s;
            bracelessScopes.add(s);
            Object ret = super.visitStatement(ctx);
            currentScope = s.getParent();
            return ret;
        }

        return super.visitStatement(ctx);
    }

    @Override
    public Object visitCompound_statement(AntlrGlslParser.Compound_statementContext ctx) {
        Scope s = new Scope();
        s.setStartIndex(ctx.start.getStartIndex());
        s.setEndIndex(ctx.stop.getStopIndex());
        currentScope.addChild(s);
        s.setParent(currentScope);
        currentScope = s;
        Object ret = super.visitCompound_statement(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public Object visitFunction_definition(AntlrGlslParser.Function_definitionContext ctx) {
        isFunctionDefinition = true;

        Scope s = new Scope();
        s.setStartIndex(ctx.start.getStartIndex());
        s.setEndIndex(ctx.stop.getStopIndex());
        currentScope.addChild(s);
        s.setParent(currentScope);

        Function func = new Function();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());
        func.setReturnType(fsc.return_type().getText());
        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    VariableDeclaration p = new VariableDeclaration();
                    p.setType(param.type().getText());
                    if (param.IDENTIFIER() != null) {
                        p.setName(param.IDENTIFIER().getText());
                        p.setStartIndex(param.IDENTIFIER().getSymbol().getStartIndex());
                        p.setStopIndex(param.IDENTIFIER().getSymbol().getStopIndex() + 1);
                        if (param.array_declaration() != null) {
                            p.setArray(true);
                        }
                    }
                    func.addParameter(p);
                    s.addVariable(p);
                }
            }
        }
        func.setStartIndex(ctx.start.getStartIndex());
        func.setStopIndex(ctx.stop.getStopIndex() + 1);
        func.setSignatureStopIndex(fsc.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        /*Scope rootScope = currentScope;
        while (rootScope.getParent() != null) {
            rootScope = rootScope.getParent();
        }*/
        for (Function fp : currentScope.getFunctionPrototypes()) {
            if (fp.equals(func)) {
                fp.addUsage(func);
                func.addUsage(fp);
            }
        }
        currentScope.addFunctionDefinition(func);

        currentScope = s;
        Object ret = super.visitFunction_definition(ctx);

        currentScope = currentScope.getParent();
        return ret;
    }

    @Override
    public Object visitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
        isFunctionDefinition = false;
        Function func = new Function();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());
        func.setReturnType(fsc.return_type().getText());
        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    VariableDeclaration p = new VariableDeclaration();
                    p.setType(param.type().getText());
                    if (param.IDENTIFIER() != null) {
                        p.setName(param.IDENTIFIER().getText());
                    }
                    func.addParameter(p);
                }
            }
        }
        func.setStartIndex(ctx.start.getStartIndex());
        func.setStopIndex(ctx.stop.getStopIndex() + 1);
        func.setSignatureStopIndex(fsc.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        func.setPrototype(true);
        currentScope.addFunctionPrototype(func);
        return super.visitFunction_prototype(ctx);
    }

    @Override
    public Object visitFunction_parameter_list(AntlrGlslParser.Function_parameter_listContext ctx) {
        if (isFunctionDefinition && ctx.function_parameter() != null) {
            for (AntlrGlslParser.Function_parameterContext param : ctx.function_parameter()) {
                if (param.IDENTIFIER() != null) {
                    VariableDeclaration var = new VariableDeclaration();
                    var.setType(param.type().getText());

                    TypeUsage tu = new TypeUsage();
                    tu.setName(param.type().getText());
                    tu.setStartIndex(param.type().start.getStartIndex());
                    tu.setStopIndex(param.type().start.getStopIndex() + 1);
                    currentScope.addTypeUsage(tu);
                    Scope scope = currentScope;
                    search:
                    while (scope != null) {
                        for (TypeDeclaration td : scope.getTypeDeclarations()) {
                            if (td.getName().equals(tu.getName())) {
                                tu.setDeclaration(td);
                                td.addUsage(tu);
                                break search;
                            }
                        }
                        scope = scope.getParent();
                    }

                    var.setName(param.IDENTIFIER().getText());
                    var.setStartIndex(param.IDENTIFIER().getSymbol().getStartIndex());
                    var.setStopIndex(param.IDENTIFIER().getSymbol().getStopIndex());
                    var.setArray(param.array_declaration() != null);
                }
            }
        }
        isFunctionDefinition = false;
        return super.visitFunction_parameter_list(ctx);
    }

    @Override
    public Object visitFor_iteration(AntlrGlslParser.For_iterationContext ctx) {
        Scope s = new Scope();
        s.setStartIndex(ctx.start.getStartIndex());
        s.setEndIndex(ctx.stop.getStopIndex());
        currentScope.addChild(s);
        s.setParent(currentScope);
        currentScope = s;
        Object ret = super.visitFor_iteration(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public Object visitStruct_specifier(AntlrGlslParser.Struct_specifierContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            TypeDeclaration t = new TypeDeclaration(ctx.IDENTIFIER().getText());
            t.setStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
            t.setStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
            t.setStructStopIndex(ctx.RCB().getSymbol().getStopIndex());
            currentScope.addTypeDeclaration(t);
        }
        return super.visitStruct_specifier(ctx);
    }

    @Override
    public Object visitVariable_usage_identifier(AntlrGlslParser.Variable_usage_identifierContext ctx) {
        VariableUsage var = new VariableUsage();
        var.setName(ctx.IDENTIFIER().getText());
        var.setStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
        var.setStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
        currentScope.addVariableUsage(var);

        Scope scope = currentScope;
        search:
        while (scope != null) {
            for (VariableDeclaration vd : scope.getVariables()) {
                if (vd.getName().equals(var.getName())) {
                    var.setDeclaration(vd);
                    vd.addUsage(var);
                    break search;
                }
            }
            scope = scope.getParent();
        }

        return super.visitVariable_usage_identifier(ctx);
    }

}
