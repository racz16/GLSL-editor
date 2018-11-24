package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.core.helper.Helper;
import hu.racz.zalan.editor.core.helper.FunctionHelper;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.helper.*;
import hu.racz.zalan.editor.core.scope.type.TypeDeclaration;
import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.folding.*;
import java.util.*;
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
        Scope.reset();
        tokenOperations();
        currentScope = new Scope();
        return super.visitStart(ctx);
    }

    //
    //token errors--------------------------------------------------------------
    //
    private void tokenOperations() {
        for (Token token : GlslProcessor.getTokens()) {
            if (token.getType() == AntlrGlslLexer.RESERVED_KEYWORD) {
                ErrorHelper.addError(Severity.ERROR, token.getText() + " : reserved word", token.getStartIndex(), token.getStopIndex() + 1);
            } else if (token.getType() == AntlrGlslLexer.ILLEGAL_CHARACTERS) {
                ErrorHelper.addError(Severity.ERROR, "illegal character(s) " + token.getText(), token.getStartIndex(), token.getStopIndex() + 1);
            } else if (token.getType() == AntlrGlslLexer.MULTI_LINE_COMMENT) {
                FoldingBlock fb = new FoldingBlock(FoldingType.COMMENT, token.getStartIndex(), token.getStopIndex() + 1);
                Scope.addFoldingBlock(fb);
            } else if (token.getType() == AntlrGlslLexer.MACRO) {
                String text = token.getText();
                int index = computeFirstIndexOfSpaceOrTab(text);
                if (index != -1) {
                    String operation = text.substring(0, index);
                    if (operation.equals("#define") && text.length() - operation.length() > 1) {
                        index = computeFirstIndexOfNotSpaceOrTab(text, index + 1);
                        if (index != -1) {
                            String data = text.substring(index);
                            index = computeFirstIndexOfSpaceOrTab(data);
                            if (index != -1) {
                                String name = data.substring(0, index);
                                Scope.addMacroDefinition(name);
                            }
                        }
                    }
                }
            }
        }
        if (GlslProcessor.getTokens() != null && !GlslProcessor.getTokens().isEmpty()) {
            Token ft = GlslProcessor.getTokens().get(0);
            if (ft.getType() != AntlrGlslLexer.MACRO || !ft.getText().startsWith("#version")) {
                ErrorHelper.addError(Severity.WARNING, "The shader should starts with the version macro", ft.getStartIndex(), ft.getStopIndex() + 1);
            }
        }
    }

    private int computeFirstIndexOfNotSpaceOrTab(String text, int startIndex) {
        for (int i = startIndex; i < text.length(); i++) {
            if (text.charAt(i) != Constants.SPACE && text.charAt(i) != Constants.TAB) {
                return i;
            }
        }
        return -1;
    }

    private int computeFirstIndexOfSpaceOrTab(String text) {
        int index1 = text.indexOf(Constants.SPACE);
        int index2 = text.indexOf(Constants.TAB);
        if (index1 == -1) {
            return index2;
        } else if (index2 == -1) {
            return index1;
        }
        return Math.min(index1, index2);
    }

    @Override
    public TypeUsage visitVariable_declaration(AntlrGlslParser.Variable_declarationContext ctx) {
        super.visitVariable_declaration(ctx);
        AntlrGlslParser.Single_declarationContext sdc = ctx.single_declaration();
        TypeUsage tu = null;
        if (sdc.type() != null) {
            String type = sdc.type().getText();

            tu = new TypeUsage(type);
            tu.setNameStartIndex(sdc.type().start.getStartIndex());
            tu.setNameStopIndex(sdc.type().stop.getStopIndex() + 1);
            //currentScope.addTypeUsage(tu);
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
            if (tu.getDeclaration() == null) {
                for (TypeDeclaration td : Builtin.getTypes().values()) {
                    if (td.getName().equals(tu.getName())) {
                        tu.setDeclaration(td);
                        td.addUsage(tu);
                        break;
                    }
                }
            }
        } else {
            if (sdc.identifier_optarray() != null) {
                String type = sdc.struct_declaration().IDENTIFIER().getText();
                TypeDeclaration td = Helper.getTypeDeclaration(currentScope, type);
                //TODO: array, indices
                tu = new TypeUsage(type);
                tu.setDeclaration(td);
                td.addUsage(tu);
            }
        }
        if (sdc.identifier_optarray() != null) {
            String varName = sdc.identifier_optarray().IDENTIFIER().getText();
            VariableDeclaration var = new VariableDeclaration(tu/*new TypeUsage(type)*/, varName);
            var.setNameStartIndex(sdc.identifier_optarray().IDENTIFIER().getSymbol().getStartIndex());
            var.setNameStopIndex(sdc.identifier_optarray().IDENTIFIER().getSymbol().getStopIndex() + 1);
            ErrorHelper.addIdentifierWarnings(varName, var.getNameStartIndex(), var.getNameStopIndex());
            if (currentScope.getParent() == null) {
                var.setGlobal(true);
            }
            currentScope.addVariableDeclaration(var);
            for (AntlrGlslParser.Identifier_optarrayContext ioa : ctx.identifier_optarray()) {
                TerminalNode name = ioa.IDENTIFIER();
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
        return null;
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
        if ((ctx.parent instanceof AntlrGlslParser.Do_while_iterationContext || ctx.parent instanceof AntlrGlslParser.While_iterationContext || ctx.parent instanceof AntlrGlslParser.For_iterationContext || ctx.parent instanceof AntlrGlslParser.Selection_statementContext) && ctx.compound_statement() == null) {
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
        currentFunctionReturnType = fd.getFunction().getReturnType();
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

    private boolean isStructValid(AntlrGlslParser.Struct_declarationContext ctx) {
        return ctx.KW_STRUCT() != null && ctx.LCB() != null && ctx.RCB() != null && ctx.member_declaration() != null;
    }

    @Override
    public TypeUsage visitStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx) {
        if (!isStructValid(ctx)) {
            return null;
        }
        currentScope = Helper.createScope(currentScope, ctx);
        if (ctx.IDENTIFIER() != null) {
            TypeDeclaration t = new TypeDeclaration(ctx.IDENTIFIER().getText());
            t.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
            t.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
            t.setStructStopIndex(ctx.RCB().getSymbol().getStopIndex());
            ErrorHelper.addIdentifierWarnings(t.getName(), t.getNameStartIndex(), t.getNameStopIndex());
            currentScope.getParent().addTypeDeclaration(t);

            List<AntlrGlslParser.Member_declarationContext> sdl = ctx.member_declaration();
            for (AntlrGlslParser.Member_declarationContext sdc : sdl) {
                if (sdc.type() != null && (sdc.type().TYPE() != null || sdc.type().IDENTIFIER() != null) && sdc.member_declarator() != null) {
                    for (AntlrGlslParser.Identifier_optarrayContext sdc2 : sdc.member_declarator().identifier_optarray()) {
                        String typeName = sdc.type().TYPE() != null ? sdc.type().TYPE().getText() : sdc.type().IDENTIFIER().getText();
                        TypeUsage tu = new TypeUsage(typeName);
                        tu.setNameStartIndex(sdc.type().start.getStartIndex());
                        tu.setNameStopIndex(sdc.type().stop.getStopIndex() + 1);
                        int depth1 = sdc.array_subscript() != null ? sdc.array_subscript().LSB().size() : 0;
                        int depth2 = sdc2.array_subscript() != null ? sdc2.array_subscript().LSB().size() : 0;
                        tu.setArrayDepth(depth1 + depth2);
                        Helper.setDeclaration(currentScope, tu);
                        if (tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
                            currentScope.addTypeUsage(tu);
                        }
                        if (sdc2.IDENTIFIER() != null) {
                            String name = sdc2.IDENTIFIER().getText();
                            VariableDeclaration vd = new VariableDeclaration(tu, name, false);
                            vd.setNameStartIndex(sdc2.IDENTIFIER().getSymbol().getStartIndex());
                            vd.setNameStopIndex(sdc2.IDENTIFIER().getSymbol().getStopIndex() + 1);
                            currentScope.addVariableDeclaration(vd);
                            t.addMember(vd);
                        }
                    }
                }
            }
        }
        FoldingBlock fb = new FoldingBlock(FoldingType.BLOCK, ctx.LCB().getSymbol().getStartIndex(), ctx.RCB().getSymbol().getStopIndex() + 1);
        Scope.addFoldingBlock(fb);

        super.visitStruct_declaration(ctx);
        currentScope = currentScope.getParent();
        return null;
    }

    @Override
    public TypeUsage visitExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ExpressionHelper.expression(ctx, this, currentScope);
    }

    @Override
    public TypeUsage visitLiteral(AntlrGlslParser.LiteralContext ctx) {
        String name;
        if (ctx.BOOL_LITERAL() != null) {
            name = "bool";
        } else {
            visitNumber_literal(ctx.number_literal());
            if (ctx.number_literal().INT_LITERAL() != null) {
                String number = ctx.number_literal().INT_LITERAL().getText();
                boolean unsigned = number.endsWith("u") || number.endsWith("U");
                name = unsigned ? "uint" : "int";
            } else {
                String number = ctx.number_literal().FLOAT_LITERAL().getText();
                boolean longFloat = number.endsWith("lf") || number.endsWith("LF");
                name = longFloat ? "double" : "float";
            }
        }
        TypeUsage tu = new TypeUsage(name);
        TypeDeclaration td = Helper.getTypeDeclaration(currentScope, name);
        tu.setDeclaration(td);
        return tu;
    }

    @Override
    public TypeUsage visitSelection_statement(AntlrGlslParser.Selection_statementContext ctx) {
        TypeUsage tu = visitExpression(ctx.expression());
        if (tu != null && !tu.getName().equals("bool")) {
            ErrorHelper.addError(Severity.ERROR, "boolean expression expected", ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
        }
        for (AntlrGlslParser.StatementContext sc : ctx.statement()) {
            visitStatement(sc);
        }
        return null;
    }

    @Override
    public TypeUsage visitJump_statement(AntlrGlslParser.Jump_statementContext ctx) {
        if (ctx.KW_RETURN() != null) {
            if (ctx.expression() != null && currentFunctionReturnType.isVoid()) {
                ErrorHelper.addError(Severity.ERROR, "return : void function cannot return a value", ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
            } else if (ctx.expression() == null && !currentFunctionReturnType.isVoid()) {
                ErrorHelper.addError(Severity.ERROR, "return : non-void function must return a value ", ctx.KW_RETURN().getSymbol().getStartIndex(), ctx.KW_RETURN().getSymbol().getStopIndex() + 1);
            }
        }
        return super.visitJump_statement(ctx);
    }

    @Override
    public TypeUsage visitDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx) {
        //if it's an interface block
        List<AntlrGlslParser.Member_declarationContext> sdlc = ctx.member_declaration();
        if (ctx.LCB() != null) {
            for (AntlrGlslParser.Member_declarationContext sdc : sdlc) {
                if (sdc.member_declarator() != null) {
                    for (AntlrGlslParser.Identifier_optarrayContext sdc2 : sdc.member_declarator().identifier_optarray()) {
                        TypeUsage tu = new TypeUsage(sdc.type().getText());
                        tu.setNameStartIndex(sdc.type().getStart().getStartIndex());
                        tu.setNameStopIndex(sdc.type().getStop().getStopIndex() + 1);
                        int depth1 = sdc.array_subscript() != null ? sdc.array_subscript().LSB().size() : 0;
                        int depth2 = sdc2.array_subscript() != null ? sdc2.array_subscript().LSB().size() : 0;
                        tu.setArrayDepth(depth1 + depth2);
                        Helper.setDeclaration(currentScope, tu);
                        if (tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
                            currentScope.addTypeUsage(tu);
                        }

                        String name = sdc2.IDENTIFIER().getText();
                        VariableDeclaration vd = new VariableDeclaration(tu, name, false);
                        vd.setNameStartIndex(sdc2.IDENTIFIER().getSymbol().getStartIndex());
                        vd.setNameStopIndex(sdc2.IDENTIFIER().getSymbol().getStopIndex() + 1);
                        vd.setDeclarationStartIndex(ctx.getStart().getStartIndex());
                        vd.setDeclarationStopIndex(ctx.getStop().getStopIndex());
                        ErrorHelper.addIdentifierWarnings(name, vd.getNameStartIndex(), vd.getNameStopIndex());
                        vd.setGlobal(currentScope.getParent() == null);
                        currentScope.addVariableDeclaration(vd);
                    }
                }
            }
            //TODO named interface block
            FoldingBlock fb = new FoldingBlock(FoldingType.BLOCK, ctx.LCB().getSymbol().getStartIndex(), ctx.RCB().getSymbol().getStopIndex() + 1);
            Scope.addFoldingBlock(fb);
        }

        return super.visitDeclaration_statement(ctx);
    }

    @Override
    public TypeUsage visitNumber_literal(AntlrGlslParser.Number_literalContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            long l = parseStringNumber(ctx.INT_LITERAL().getText());
            if (l >= Math.pow(2, 32)) {
                ErrorHelper.addError(Severity.ERROR, l + " : integer overflow", ctx.INT_LITERAL().getSymbol().getStartIndex(), ctx.INT_LITERAL().getSymbol().getStopIndex() + 1);
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

}
