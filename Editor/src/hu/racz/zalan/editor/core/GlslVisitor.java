package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.type.TypeDeclaration;
import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser.Parameter_qualifierContext;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.errordisplay.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.spi.editor.hints.*;

public class GlslVisitor extends AntlrGlslParserBaseVisitor<TypeUsage> {

    private Scope currentScope;
    private TypeUsage currentFunctionReturnType;

    public Scope getRootScope() {
        return currentScope;
    }

    @Override
    public TypeUsage visitStart(AntlrGlslParser.StartContext ctx) {
        Scope.clearBracelessScopes();
        Scope.clearErrorss();
        addTokenErrors();
        currentScope = new Scope();
        return super.visitStart(ctx);
    }

    //
    //token errors--------------------------------------------------------------
    //
    private void addTokenErrors() {
        for (Token token : GlslProcessor.getTokens()) {
            if (token.getType() == AntlrGlslLexer.RESERVED_KEYWORD) {
                Helper.addError(Severity.ERROR, token.getText() + " : reserved word", token.getStartIndex(), token.getStopIndex() + 1);
            } else if (token.getType() == AntlrGlslLexer.ILLEGAL_CHARACTERS) {
                Helper.addError(Severity.ERROR, "illegal character(s) " + token.getText(), token.getStartIndex(), token.getStopIndex() + 1);
            }
        }
    }

    @Override
    public TypeUsage visitInit_declaration_list(AntlrGlslParser.Init_declaration_listContext ctx) {
        AntlrGlslParser.Single_declarationContext sdc = ctx.single_declaration();
        TypeUsage tu = null;
        if (sdc.type() != null) {
            String type = sdc.type().getText();

            tu = new TypeUsage(type);
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
        }/* else {
            if (sdc.IDENTIFIER() != null) {
                type = sdc.struct_specifier().IDENTIFIER().getText();
            } else {
                type = "";
            }
        }*/
        if (sdc.IDENTIFIER() != null) {
            String varName = sdc.IDENTIFIER().getText();
            VariableDeclaration var = new VariableDeclaration(tu/*new TypeUsage(type)*/, varName);
            var.setNameStartIndex(sdc.IDENTIFIER().getSymbol().getStartIndex());
            var.setNameStopIndex(sdc.IDENTIFIER().getSymbol().getStopIndex() + 1);
            Helper.addIdentifierWarnings(varName, var.getNameStartIndex(), var.getNameStopIndex());
            //var.setArray(sdc.array_declaration() != null);
            if (currentScope.getParent() == null) {
                var.setGlobal(true);
            }
            currentScope.addVariableDeclaration(var);
            for (TerminalNode name : ctx.IDENTIFIER()) {
                varName = name.getText();
                VariableDeclaration v = new VariableDeclaration(tu/*new TypeUsage(type)*/, varName);
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
        TypeUsage ret = super.visitInit_declaration_list(ctx);

        return ret;
    }

    @Override
    public TypeUsage visitCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx) {
        Scope s = Helper.createScope(currentScope, ctx);
        currentScope = s;
        Scope.addBracelessScope(s);
        TypeUsage ret = super.visitCase_statement_list(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public TypeUsage visitStatement(AntlrGlslParser.StatementContext ctx) {
        if (!(ctx.parent instanceof AntlrGlslParser.Statement_listContext) && ctx.compound_statement() == null) {
            Scope s = Helper.createScope(currentScope, ctx);
            currentScope = s;
            Scope.addBracelessScope(s);
            TypeUsage ret = super.visitStatement(ctx);
            currentScope = s.getParent();
            return ret;
        }

        return super.visitStatement(ctx);
    }

    @Override
    public TypeUsage visitCompound_statement(AntlrGlslParser.Compound_statementContext ctx) {
        Scope s = Helper.createScope(currentScope, ctx);
        currentScope = s;
        TypeUsage ret = super.visitCompound_statement(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public TypeUsage visitFunction_definition(AntlrGlslParser.Function_definitionContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        FunctionDefinition fd = FunctionHelper.createFunctionDefinition(ctx, currentScope);
        currentFunctionReturnType = fd.getReturnType();
        TypeUsage ret = super.visitFunction_definition(ctx);
        currentScope = currentScope.getParent();
        return ret;
    }

    //
    //functions-----------------------------------------------------------------
    //
    @Override
    public TypeUsage visitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
        Scope functionScope = Helper.createScope(currentScope, ctx);
        FunctionHelper.createFunctionPrototype(ctx, functionScope);
        return null;
    }

    @Override
    public TypeUsage visitFor_iteration(AntlrGlslParser.For_iterationContext ctx) {
        Scope s = Helper.createScope(currentScope, ctx);
        currentScope = s;
        TypeUsage ret = super.visitFor_iteration(ctx);
        currentScope = s.getParent();
        return ret;
    }

    @Override
    public TypeUsage visitStruct_specifier(AntlrGlslParser.Struct_specifierContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        if (ctx.IDENTIFIER() != null) {
            TypeDeclaration t = new TypeDeclaration(ctx.IDENTIFIER().getText());
            t.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
            t.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
            t.setStructStopIndex(ctx.RCB().getSymbol().getStopIndex());
            Helper.addIdentifierWarnings(t.getName(), t.getNameStartIndex(), t.getNameStopIndex());
            currentScope.getParent().addTypeDeclaration(t);

            AntlrGlslParser.Struct_declaration_listContext sdl = ctx.struct_declaration_list();
            for (AntlrGlslParser.Struct_declarationContext sdc : sdl.struct_declaration()) {
                String typeName = sdc.type().TYPE() != null ? sdc.type().TYPE().getText() : sdc.type().IDENTIFIER().getText();
                TypeUsage tu = new TypeUsage(typeName);
                TypeDeclaration td = Helper.getTypeDeclaration(currentScope, typeName);
                tu.setDeclaration(td);
                td.addUsage(tu);
                currentScope.addTypeUsage(tu);
                AntlrGlslParser.Struct_declarator_listContext sdlc = sdc.struct_declarator_list();
                for (AntlrGlslParser.Struct_declaratorContext sdc2 : sdlc.struct_declarator()) {
                    String name = sdc2.IDENTIFIER().getText();
                    boolean array = sdc2.array_declaration() != null;
                    VariableDeclaration vd = new VariableDeclaration(tu, name, false);
                    vd.setNameStartIndex(sdc2.IDENTIFIER().getSymbol().getStartIndex());
                    vd.setNameStopIndex(sdc2.IDENTIFIER().getSymbol().getStopIndex() + 1);
                    currentScope.addVariableDeclaration(vd);
                    t.addMember(vd);
                }
            }
        }
        super.visitStruct_specifier(ctx);
        currentScope = currentScope.getParent();
        return null;
    }

    @Override
    public TypeUsage visitExpression(AntlrGlslParser.ExpressionContext ctx) {
        if (ctx.literal() != null) {
            return visitLiteral(ctx.literal());
        } else if (ctx.LRB() != null) {
            return visitExpression(ctx.expression(0));
        } else if (ctx.function_call() != null) {
            return null;
        } else if (ctx.DOT() != null) {
            TypeUsage tu = visitExpression(ctx.expression(0));
            VariableUsage vu = createVariableUsage(ctx.IDENTIFIER(), tu);
            if (vu.getDeclaration() == null) {
                return null;
            }
            return vu.getDeclaration().getType();
        } else if (ctx.IDENTIFIER() != null) {
            VariableUsage vu = createVariableUsage(ctx.IDENTIFIER(), null);
            if (vu.getDeclaration() == null) {
                return null;
            }
            return vu.getDeclaration().getType();
        }

        return super.visitExpression(ctx);
    }

    private VariableUsage createVariableUsage(TerminalNode tn, TypeUsage ptu) {
        VariableUsage vu = new VariableUsage();
        vu.setName(tn.getText());
        vu.setNameStartIndex(tn.getSymbol().getStartIndex());
        vu.setNameStopIndex(tn.getSymbol().getStopIndex() + 1);
        if (ptu == null) {
            for(VariableDeclaration vd : Builtin.getVariables().values()){
                if(vd.getName().equals(vu.getName())){
                    vu.setDeclaration(vd);
                    vd.addUsage(vu);
                    break;
                }
            }
            Scope scope = currentScope;
            search:
            while (scope != null) {
                for (VariableDeclaration vd : scope.getVariableDeclarations()) {
                    if (vd.getName().equals(vu.getName())) {
                        vu.setDeclaration(vd);
                        vd.addUsage(vu);
                        break search;
                    }
                }
                scope = scope.getParent();
            }
        } else if (ptu.getDeclaration() != null) {
            TypeDeclaration td = ptu.getDeclaration();
            for (VariableDeclaration vd : td.getMembers()) {
                if (vu.getName().equals(vd.getName())) {
                    vu.setDeclaration(vd);
                    vd.addUsage(vu);
                    break;
                }
            }
        }
        if (vu.getDeclaration() == null) {
            ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, vu.getName() + " : undeclared identifier", GlslProcessor.getDocument(), new ErrorPosition(vu.getNameStartIndex()), new ErrorPosition(vu.getNameStopIndex()));
            Scope.addError(ed);
        }
        currentScope.addVariableUsage(vu);
        return vu;
    }

    @Override
    public TypeUsage visitSelection_statement(AntlrGlslParser.Selection_statementContext ctx) {
        TypeUsage tu = visitExpression(ctx.expression());
        if (!tu.getName().equals("bool")) {
            ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, "boolean expression expected", GlslProcessor.getDocument(), new ErrorPosition(ctx.expression().getStart().getStartIndex()), new ErrorPosition(ctx.expression().getStop().getStopIndex() + 1));
            Scope.addError(ed);
        }

        for (AntlrGlslParser.StatementContext sc : ctx.statement()) {
            visitStatement(sc);
        }

        return null;
    }

    @Override
    public TypeUsage visitLiteral(AntlrGlslParser.LiteralContext ctx) {
        String name;
        if (ctx.BOOL_LITERAL() != null) {
            name = "bool";
        } else {
            if (ctx.number_literal().INT_LITERAL() != null) {
                String number = ctx.number_literal().INT_LITERAL().getText();
                boolean unsigned = number.endsWith("u") || number.endsWith("U");
                name = unsigned ? "uint" : "int";
            } else {
                //TODO ha LF a vége, akkor double
                name = "float";
            }
        }

        TypeUsage tu = new TypeUsage(name);
        TypeDeclaration td = Helper.getTypeDeclaration(currentScope, name);
        tu.setDeclaration(td);
        return tu;
    }

    @Override
    public TypeUsage visitJump_statement(AntlrGlslParser.Jump_statementContext ctx) {
        if (ctx.KW_RETURN() != null) {
            if (ctx.expression() != null && currentFunctionReturnType.isVoid()) {
                ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, "return : void function cannot return a value", GlslProcessor.getDocument(), new ErrorPosition(ctx.expression().getStart().getStartIndex()), new ErrorPosition(ctx.expression().getStop().getStopIndex() + 1));
                Scope.addError(ed);
            } else if (ctx.expression() == null && !currentFunctionReturnType.isVoid()) {
                ErrorDescription ed = ErrorDescriptionFactory.createErrorDescription(Severity.ERROR, "return : non-void function must return a value ", GlslProcessor.getDocument(), new ErrorPosition(ctx.KW_RETURN().getSymbol().getStartIndex()), new ErrorPosition(ctx.KW_RETURN().getSymbol().getStopIndex() + 1));
                Scope.addError(ed);
            }
        }
        return super.visitJump_statement(ctx);
    }

    @Override
    public TypeUsage visitDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx) {
        //if it's an interface block
        AntlrGlslParser.Struct_declaration_listContext sdlc = ctx.struct_declaration_list();
        if (sdlc != null) {
            for (AntlrGlslParser.Struct_declarationContext sdc : sdlc.struct_declaration()) {
                TypeUsage tu = new TypeUsage(sdc.type().getText());
                tu.setNameStartIndex(sdc.type().getStart().getStartIndex());
                tu.setNameStopIndex(sdc.type().getStop().getStopIndex() + 1);
                TypeDeclaration td = Helper.getTypeDeclaration(currentScope, tu.getName());
                tu.setDeclaration(td);
                td.addUsage(tu);
                currentScope.addTypeUsage(tu);

                AntlrGlslParser.Struct_declarator_listContext sdlc2 = sdc.struct_declarator_list();
                for (AntlrGlslParser.Struct_declaratorContext sdc2 : sdlc2.struct_declarator()) {
                    String name = sdc2.IDENTIFIER().getText();
                    boolean array = sdc2.array_declaration() != null;
                    VariableDeclaration vd = new VariableDeclaration(tu, name, false);
                    vd.setNameStartIndex(sdc2.IDENTIFIER().getSymbol().getStartIndex());
                    vd.setNameStopIndex(sdc2.IDENTIFIER().getSymbol().getStopIndex() + 1);
                    vd.setDeclarationStartIndex(ctx.getStart().getStartIndex());
                    vd.setDeclarationStopIndex(ctx.getStop().getStopIndex());
                    Helper.addIdentifierWarnings(name, vd.getNameStartIndex(), vd.getNameStopIndex());
                    vd.setGlobal(currentScope.getParent() == null);
                    currentScope.addVariableDeclaration(vd);
                }
            }
        }

        return super.visitDeclaration_statement(ctx);
    }

    @Override
    public TypeUsage visitNumber_literal(AntlrGlslParser.Number_literalContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            long l = parseStringNumber(ctx.INT_LITERAL().getText());
            if (l >= Math.pow(2, 32)) {
                Helper.addError(Severity.ERROR, l + " : integer overflow", ctx.INT_LITERAL().getSymbol().getStartIndex(), ctx.INT_LITERAL().getSymbol().getStopIndex() + 1);
            }
        } else {

        }

        return super.visitNumber_literal(ctx);
    }

    private long parseStringNumber(String number) {
        number = number.charAt(number.length() - 1) == 'u' || number.charAt(number.length() - 1) == 'U' ? number.substring(0, number.length() - 1) : number;
        if (number.startsWith("0x") || number.startsWith("0X")) {
            return Long.parseLong(number.substring(2), 16);
        } else if (number.startsWith("0")) {
            return Long.parseLong(number.substring(0), 8);
        } else {
            return Long.parseLong(number);
        }
    }

    //
    //
    //
}
