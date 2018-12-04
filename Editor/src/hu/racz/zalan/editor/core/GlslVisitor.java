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
import org.antlr.v4.runtime.*;
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
    //if, for, while, do-while, case, jump--------------------------------------
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
    //expression----------------------------------------------------------------------
    //
    @Override
    public TypeUsage visitExpression(AntlrGlslParser.ExpressionContext ctx) {
        try {
            return ExpressionHelper.expression(ctx, this, currentScope);
        } catch (NullPointerException ex) {
            return null;
        }
    }

    //
    //literal-------------------------------------------------------------------
    //
    @Override
    public TypeUsage visitLiteral(AntlrGlslParser.LiteralContext ctx) {
        if (ctx.BOOL_LITERAL() == null) {
            visitNumber_literal(ctx.number_literal());
        }
        String name = getLiteralTypeName(ctx);
        TypeUsage tu = new TypeUsage(name);
        TypeHelper.setDeclaration(null, tu);
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
    //struct--------------------------------------------------------------------
    //
    @Override
    public TypeUsage visitStruct_declaration(AntlrGlslParser.Struct_declarationContext ctx) {
        currentScope = Helper.createScope(currentScope, ctx);
        try {
            TypeDeclaration td = TypeHelper.createTypeDeclaration(currentScope, ctx);
            currentScope.getParent().addTypeDeclaration(td);
            createConstructor(td);
            FoldingBlock fb = new FoldingBlock(FoldingType.BLOCK, ctx.LCB().getSymbol().getStartIndex(), ctx.RCB().getSymbol().getStopIndex() + 1);
            Scope.addFoldingBlock(fb);
            super.visitStruct_declaration(ctx);
        } catch (NullPointerException ex) {
        }
        currentScope = currentScope.getParent();
        return null;
    }

    private void createConstructor(TypeDeclaration td) {
        Function f = new Function();
        f.setConstructor(true);
        TypeUsage tu = new TypeUsage(td.getName());
        tu.setDeclaration(td);
        f.setReturnType(tu);
        setConstructorSignature(f, td);
        Scope.addFunction(f);
    }

    private void setConstructorSignature(Function f, TypeDeclaration td) {
        f.setName(td.getName());
        for (VariableDeclaration vd : td.getMembers()) {
            f.addParameter(vd);
        }
    }

    //
    //variable declaration------------------------------------------------------
    //
    @Override
    public TypeUsage visitVariable_declaration(AntlrGlslParser.Variable_declarationContext ctx) {
        try {
            for (AntlrGlslParser.Identifier_optarray_optassignmentContext iooc : ctx.identifier_optarray_optassignment()) {
                TypeUsage tu = TypeHelper.createTypeUsageWithoutQualifiers(currentScope, ctx, ctx.array_subscript());
                tu.setArrayDepth(tu.getArrayDepth() + Helper.getArrayDepth(iooc.identifier_optarray().array_subscript()));
                TypeHelper.addTypeUsageToScopeIfCustom(tu, currentScope);
                VariableDeclaration vd = VariableHelper.createVariableDeclarationWithoutQualifiers(tu, ctx, iooc);
                currentScope.addVariableDeclaration(vd);
                TypeUsage tu2 = ExpressionHelper.expression(iooc.expression(), this, currentScope);
                ErrorHelper.addIncompatibleTypesError(tu, tu2, iooc.expression());
            }
        } catch (NullPointerException ex) {
        }
        return super.visitVariable_declaration(ctx);
    }

    //
    //interface block-----------------------------------------------------------
    //
    @Override
    public TypeUsage visitDeclaration_statement(AntlrGlslParser.Declaration_statementContext ctx) {
        //if it's an interface block
        try {
            if (ctx.LCB() != null) {
                for (VariableDeclaration vd : VariableHelper.createMembers(currentScope, ctx.member_declaration())) {
                    currentScope.addVariableDeclaration(vd);
                }
                FoldingBlock fb = new FoldingBlock(FoldingType.BLOCK, ctx.LCB().getSymbol().getStartIndex(), ctx.RCB().getSymbol().getStopIndex() + 1);
                Scope.addFoldingBlock(fb);
            }
        } catch (NullPointerException ex) {
        }
        return super.visitDeclaration_statement(ctx);
    }

}
