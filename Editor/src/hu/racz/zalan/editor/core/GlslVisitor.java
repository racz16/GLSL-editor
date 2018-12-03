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
                addMacroDefinition(token);
            }
        }
        ErrorHelper.addNoVersionMacroWarning();
    }

    private static void addMacroDefinition(Token token) {
        String text = token.getText();
        if (text.startsWith("#define")) {
            text = text.substring(7);
            int start = -1;
            int stop = -1;
            for (int i = 0; i < text.length(); i++) {
                if (start == -1 && text.charAt(i) != Constants.SPACE && text.charAt(i) != Constants.TAB) {
                    start = i;
                } else if (start != -1 && stop == -1 && (text.charAt(i) == Constants.SPACE || text.charAt(i) == Constants.TAB) || text.charAt(i) == Constants.LRB) {
                    stop = i;
                    break;
                }
            }
            if (start != -1 && stop != -1) {
                Scope.addMacroDefinition(text.substring(start, stop));
            }
        }
    }

    @Override
    public TypeUsage visitStatement(AntlrGlslParser.StatementContext ctx) {
        if ((ctx.parent instanceof AntlrGlslParser.Do_while_iterationContext || ctx.parent instanceof AntlrGlslParser.While_iterationContext || ctx.parent instanceof AntlrGlslParser.For_iterationContext || ctx.parent instanceof AntlrGlslParser.Selection_statementContext) && ctx.compound_statement() == null) {
            return bracelessScope(ctx);
        }
        return super.visitStatement(ctx);
    }

    private TypeUsage bracelessScope(AntlrGlslParser.StatementContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        Scope.addBracelessScope(currentScope);
        TypeUsage ret = super.visitStatement(ctx);
        currentScope = currentScope.getParent();
        return ret;
    }

    @Override
    public TypeUsage visitCompound_statement(AntlrGlslParser.Compound_statementContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        super.visitCompound_statement(ctx);
        currentScope = currentScope.getParent();
        return null;
    }

    //
    //functions-----------------------------------------------------------------
    //
    @Override
    public TypeUsage visitFunction_definition(AntlrGlslParser.Function_definitionContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        try {
            FunctionDeclaration fd = FunctionHelper.createFunctionDefinition(ctx, currentScope);
            currentFunctionReturnType = fd.getFunction().getReturnType();
            Scope.addFunctionDefinition(fd);
        } catch (NullPointerException ex) {
        }
        visitCompound_statement(ctx.compound_statement());
        currentScope = currentScope.getParent();
        return null;
    }

    @Override
    public TypeUsage visitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        try {
            FunctionDeclaration fp = FunctionHelper.createFunctionPrototype(ctx, currentScope);
            Scope.addFunctionPrototype(fp);
        } catch (NullPointerException ex) {
        }
        currentScope = currentScope.getParent();
        return null;
    }

    //
    //if, for, while, do-while, case, jump
    //
    @Override
    public TypeUsage visitSelection_statement(AntlrGlslParser.Selection_statementContext ctx) {
        try {
            selectionStatement(ctx);
        } catch (NullPointerException ex) {
        }
        return null;
    }

    private void selectionStatement(AntlrGlslParser.Selection_statementContext ctx) {
        TypeUsage tu = visitExpression(ctx.expression());
        ErrorHelper.addBoolExpressionExpectedError(tu, ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
        for (AntlrGlslParser.StatementContext sc : ctx.statement()) {
            visitStatement(sc);
        }
    }

    @Override
    public TypeUsage visitFor_iteration(AntlrGlslParser.For_iterationContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        try {
            forIteration(ctx);
        } catch (NullPointerException ex) {
        }
        currentScope = currentScope.getParent();
        return null;
    }

    private void forIteration(AntlrGlslParser.For_iterationContext ctx) {
        if (ctx.variable_declaration() != null) {
            visitVariable_declaration(ctx.variable_declaration());
        }
        forExpressions(ctx);
        visitStatement(ctx.statement());
    }

    private void forExpressions(AntlrGlslParser.For_iterationContext ctx) {
        if (ctx.expression_list() != null) {
            visitExpression_list(ctx.expression_list(0));
        }
        if (ctx.expression() != null) {
            TypeUsage tu = visitExpression(ctx.expression());
            ErrorHelper.addBoolExpressionExpectedError(tu, ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
        }
    }

    @Override
    public TypeUsage visitDo_while_iteration(AntlrGlslParser.Do_while_iterationContext ctx) {
        try {
            TypeUsage tu = visitExpression(ctx.expression());
            ErrorHelper.addBoolExpressionExpectedError(tu, ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
            visitStatement(ctx.statement());
        } catch (NullPointerException ex) {
        }
        return null;
    }

    @Override
    public TypeUsage visitWhile_iteration(AntlrGlslParser.While_iterationContext ctx) {
        try {
            TypeUsage tu = visitExpression(ctx.expression());
            ErrorHelper.addBoolExpressionExpectedError(tu, ctx.expression().getStart().getStartIndex(), ctx.expression().getStop().getStopIndex() + 1);
            visitStatement(ctx.statement());
        } catch (NullPointerException ex) {
        }
        return null;
    }

    @Override
    public TypeUsage visitCase_statement_list(AntlrGlslParser.Case_statement_listContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        Scope.addBracelessScope(currentScope);
        super.visitCase_statement_list(ctx);
        currentScope = currentScope.getParent();
        return null;
    }

    @Override
    public TypeUsage visitJump_statement(AntlrGlslParser.Jump_statementContext ctx) {
        if (ctx.KW_RETURN() != null) {
            ErrorHelper.addReturnError(currentFunctionReturnType, ctx);
        }
        return super.visitJump_statement(ctx);
    }

    //
    //misc----------------------------------------------------------------------
    //
    @Override
    public TypeUsage visitExpression(AntlrGlslParser.ExpressionContext ctx) {
        try {
            return ExpressionHelper.expression(ctx, this, currentScope);
        } catch (NullPointerException ex) {
            return null;
        }
    }

    @Override
    public TypeUsage visitLiteral(AntlrGlslParser.LiteralContext ctx) {
        if (ctx.BOOL_LITERAL() == null) {
            visitNumber_literal(ctx.number_literal());
        }
        String name = getLiteralTypeName(ctx);
        TypeUsage tu = new TypeUsage(name);
        Helper.setDeclaration(null, tu);
        return tu;
    }

    private String getLiteralTypeName(AntlrGlslParser.LiteralContext ctx) {
        String name;
        if (ctx.BOOL_LITERAL() != null) {
            name = "bool";
        } else {
            name = asd(ctx);
        }
        return name;
    }

    private String asd(AntlrGlslParser.LiteralContext ctx) {
        if (ctx.number_literal().INT_LITERAL() != null) {
            return getFixPointLiteralTypeName(ctx);
        } else {
            return getFloatingPointLiteralTypeName(ctx);
        }
    }

    private String getFixPointLiteralTypeName(AntlrGlslParser.LiteralContext ctx) {
        String number = ctx.number_literal().INT_LITERAL().getText();
        boolean unsigned = number.endsWith("u") || number.endsWith("U");
        return unsigned ? "uint" : "int";
    }

    private String getFloatingPointLiteralTypeName(AntlrGlslParser.LiteralContext ctx) {
        String number = ctx.number_literal().FLOAT_LITERAL().getText();
        boolean longFloat = number.endsWith("lf") || number.endsWith("LF");
        return longFloat ? "double" : "float";
    }

    @Override
    public TypeUsage visitNumber_literal(AntlrGlslParser.Number_literalContext ctx) {
        if (ctx.INT_LITERAL() != null) {
            long number = parseStringNumber(ctx.INT_LITERAL().getText());
            ErrorHelper.addIntegerOverflowError(number, ctx);
        }
        return super.visitNumber_literal(ctx);
    }

    private long parseStringNumber(String number) {
        number = number.charAt(number.length() - 1) == 'u' || number.charAt(number.length() - 1) == 'U' ? number.substring(0, number.length() - 1) : number;
        return parseSignedStringNumber(number);
    }

    private long parseSignedStringNumber(String number) {
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
    @Override
    public TypeUsage visitStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        if (ctx.IDENTIFIER() != null) {
            TypeDeclaration t = new TypeDeclaration(ctx.IDENTIFIER().getText());
            t.setNameStartIndex(ctx.IDENTIFIER().getSymbol().getStartIndex());
            t.setNameStopIndex(ctx.IDENTIFIER().getSymbol().getStopIndex() + 1);
            t.setStructStopIndex(ctx.RCB().getSymbol().getStopIndex());
            ErrorHelper.addIdentifierWarnings(t);
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
            ErrorHelper.addIdentifierWarnings(var);
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
                        ErrorHelper.addIdentifierWarnings(vd);
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

}
