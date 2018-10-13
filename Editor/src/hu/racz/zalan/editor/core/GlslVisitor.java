package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.core.scope.type.TypeDeclaration;
import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParserBaseVisitor;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GlslVisitor extends AntlrGlslParserBaseVisitor<Object> {

    private Scope currentScope;

    private final List<Scope> bracelessScopes = new ArrayList<>();

    private boolean isFunctionDefinition;

    public TypeDeclaration getTypeDeclaration(Scope scope, String type) {
        while (scope != null) {
            for (TypeDeclaration td : scope.getTypeDeclarations()) {
                if (td.getName().equals(type)) {
                    return td;
                }
            }
            scope = scope.getParent();
        }
        return null;
    }

    public Scope getRootScope() {
        return currentScope;
    }

    @Override
    public Object visitStart(AntlrGlslParser.StartContext ctx) {
        Scope.clearBracelessScopes();
        currentScope = new Scope();
        return super.visitStart(ctx);
    }

    @Override
    public Object visitInit_declaration_list(AntlrGlslParser.Init_declaration_listContext ctx) {
        AntlrGlslParser.Single_declarationContext sdc = ctx.single_declaration();
        String type;
        if (sdc.type() != null) {
            type = sdc.type().getText();

            TypeUsage tu = new TypeUsage(type);
            tu.setNameStartIndex(sdc.type().start.getStartIndex());
            tu.setNameStopIndex(sdc.type().stop.getStopIndex() + 1);
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
            String varName = sdc.IDENTIFIER().getText();
            VariableDeclaration var = new VariableDeclaration(new TypeUsage(type), varName);
            var.setNameStartIndex(sdc.IDENTIFIER().getSymbol().getStartIndex());
            var.setNameStopIndex(sdc.IDENTIFIER().getSymbol().getStopIndex() + 1);
            var.setArray(sdc.array_declaration() != null);
            if (currentScope.getParent() == null) {
                var.setGlobal(true);
            }
            currentScope.addVariableDeclaration(var);
            for (TerminalNode name : ctx.IDENTIFIER()) {
                varName = name.getText();
                VariableDeclaration v = new VariableDeclaration(new TypeUsage(type), varName);
                v.setNameStartIndex(name.getSymbol().getStartIndex());
                v.setNameStopIndex(name.getSymbol().getStopIndex() + 1);
                //TODO: array
                if (currentScope.getParent() == null) {
                    v.setGlobal(true);
                }
                currentScope.addVariableDeclaration(v);
            }
        }
        //isFor = false;
        Object ret = super.visitInit_declaration_list(ctx);

        return ret;
    }

    @Override
    public Object visitCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx) {
        Scope s = new Scope();
        s.setStartIndex(ctx.start.getStartIndex());
        s.setStopIndex(ctx.stop.getStopIndex() + 1);
        currentScope.addChild(s);
        s.setParent(currentScope);
        currentScope = s;
        Scope.addBracelessScope(s);
        Object ret = super.visitCase_statement_list(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public Object visitStatement(AntlrGlslParser.StatementContext ctx) {
        if (!(ctx.parent instanceof AntlrGlslParser.Statement_listContext) && ctx.compound_statement() == null) {
            Scope s = new Scope();
            s.setStartIndex(ctx.start.getStartIndex());
            s.setStopIndex(ctx.stop.getStopIndex() + 1);
            currentScope.addChild(s);
            s.setParent(currentScope);
            currentScope = s;
            //bracelessScopes.add(s);
            Scope.addBracelessScope(s);
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
        s.setStopIndex(ctx.stop.getStopIndex());
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
        s.setStopIndex(ctx.stop.getStopIndex());
        currentScope.addChild(s);
        s.setParent(currentScope);

        FunctionDefinition func = new FunctionDefinition();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());

        if (!fsc.return_type().getText().equals("void")) {
            TypeUsage returnType = new TypeUsage(fsc.return_type().getText());
            TypeDeclaration td = getTypeDeclaration(currentScope, fsc.return_type().getText());
            returnType.setDeclaration(td);
            func.setReturnType(returnType);
        } else {
            func.setReturnType(TypeUsage.VOID);
        }

        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    String name = param.IDENTIFIER() != null ? param.IDENTIFIER().getText() : null;
                    VariableDeclaration p = new VariableDeclaration(new TypeUsage(param.type().getText()), name);
                    if (param.IDENTIFIER() != null) {
                        p.setNameStartIndex(param.IDENTIFIER().getSymbol().getStartIndex());
                        p.setNameStopIndex(param.IDENTIFIER().getSymbol().getStopIndex() + 1);
                        if (param.array_declaration() != null) {
                            p.setArray(true);
                        }
                    }
                    func.addParameter(p);
                    s.addVariableDeclaration(p);
                }
            }
        }
        func.setName(fsc.IDENTIFIER().getText());
        func.setStartIndex(ctx.start.getStartIndex());
        func.setStopIndex(ctx.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        func.setSignatureStartIndex(fsc.start.getStartIndex());
        func.setSignatureStopIndex(fsc.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        /*Scope rootScope = currentScope;
        while (rootScope.getParent() != null) {
            rootScope = rootScope.getParent();
        }*/
        for (FunctionPrototype fp : currentScope.getFunctionPrototypes()) {
            if (fp.isPrototypeOf(func)) {
                fp.setDefinition(func);
                func.setPrototype(fp);
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
        FunctionPrototype func = new FunctionPrototype();
        AntlrGlslParser.Function_signatureContext fsc = ctx.function_signature();
        func.setName(fsc.IDENTIFIER().getText());

        if (!fsc.return_type().getText().equals("void")) {
            TypeUsage returnType = new TypeUsage(fsc.return_type().getText());
            TypeDeclaration td = getTypeDeclaration(currentScope, fsc.return_type().getText());
            returnType.setDeclaration(td);
            func.setReturnType(returnType);
        } else {
            func.setReturnType(TypeUsage.VOID);
        }

        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext param : fsc.function_parameter_list().function_parameter()) {
                if (param.type() != null) {
                    String name = param.IDENTIFIER() != null ? param.IDENTIFIER().getText() : null;
                    VariableDeclaration p = new VariableDeclaration(new TypeUsage(param.type().getText()), name);
                    func.addParameter(p);
                }
            }
        }
        func.setName(fsc.IDENTIFIER().getText());
        func.setStartIndex(ctx.start.getStartIndex());
        func.setStopIndex(ctx.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        func.setSignatureStartIndex(fsc.start.getStartIndex());
        func.setSignatureStopIndex(fsc.stop.getStopIndex() + 1);
        func.setNameStartIndex(fsc.IDENTIFIER().getSymbol().getStartIndex());
        func.setNameStopIndex(fsc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        currentScope.addFunctionPrototype(func);
        return super.visitFunction_prototype(ctx);
    }

    @Override
    public Object visitFunction_parameter_list(AntlrGlslParser.Function_parameter_listContext ctx) {
        if (isFunctionDefinition && ctx.function_parameter() != null) {
            for (AntlrGlslParser.Function_parameterContext param : ctx.function_parameter()) {
                if (param.IDENTIFIER() != null) {
                    String name = param.IDENTIFIER().getText();
                    VariableDeclaration var = new VariableDeclaration(new TypeUsage(param.type().getText()), name);

                    TypeUsage tu = new TypeUsage(param.type().getText());
                    tu.setNameStartIndex(param.type().start.getStartIndex());
                    tu.setNameStopIndex(param.type().start.getStopIndex() + 1);
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
                    var.setNameStartIndex(param.IDENTIFIER().getSymbol().getStartIndex());
                    var.setNameStopIndex(param.IDENTIFIER().getSymbol().getStopIndex());
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
        s.setStopIndex(ctx.stop.getStopIndex());
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
            t.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
            t.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
            t.setStructStopIndex(ctx.RCB().getSymbol().getStopIndex());
            currentScope.addTypeDeclaration(t);
        }
        return super.visitStruct_specifier(ctx);
    }

    @Override
    public Object visitVariable_usage_identifier(AntlrGlslParser.Variable_usage_identifierContext ctx) {
        VariableUsage var = new VariableUsage();
        var.setName(ctx.IDENTIFIER().getText());
        var.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
        var.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
        currentScope.addVariableUsage(var);

        Scope scope = currentScope;
        search:
        while (scope != null) {
            for (VariableDeclaration vd : scope.getVariableDeclarations()) {
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
