package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import org.antlr.v4.runtime.tree.*;
import org.netbeans.spi.editor.hints.*;

public class ExpressionHelper {

    private static GlslVisitor visitor;
    private static Scope scope;

    public static TypeUsage expression(AntlrGlslParser.ExpressionContext ctx, GlslVisitor visitor, Scope scope) {
        ExpressionHelper.visitor = visitor;
        ExpressionHelper.scope = scope;
        //TODO: értékadás
        if (ctx != null) {
            if (isLiteral(ctx)) {
                return literal(ctx);
            } else if (isParentheticalExpression(ctx)) {
                return parentheticalExpression(ctx);
            } else if (isIdentifier(ctx)) {
                return identifier(ctx);
            } else if (isArithmeticUnaryExpression(ctx)) {
                return arithmeticUnaryExpression(ctx);
            } else if (isRelationalExpression(ctx)) {
                return relationalExpression(ctx);
            } else if (isEqualityExpression(ctx)) {
                return equalityExpression(ctx);
            } else if (isLogicalBinaryExpression(ctx)) {
                return logicalBinaryExpression(ctx);
            } else if (isLogicalUnaryExpression(ctx)) {
                return logicalUnaryExpression(ctx);
            } else if (isBitUnaryExpression(ctx)) {
                return bitUnaryExpression(ctx);
            } else if (isShiftExpression(ctx)) {
                return shiftExpression(ctx);
            } else if (isBitBinaryExpression(ctx)) {
                return bitBinaryExpression(ctx);
            } else if (isModuloExpression(ctx)) {
                return moduloExpression(ctx);
            } else if (isLengthExpression(ctx)) {
                return lengthExpression(ctx);
            } else if (isArithmeticBinaryExpression(ctx)) {
                return arithmeticBinaryExpression(ctx);
            } else if (isTernaryExpression(ctx)) {
                return ternaryExpression(ctx);
            } else if (isArraySubscript(ctx)) {
                return arraySubscript(ctx);
            } else if (isFunctionCall(ctx)) {
                return functionCall(ctx);
            } else {
                for (ParseTree pt : ctx.children) {
                    visitor.visit(pt);
                }
            }
        }
        return null;
    }

    //
    //ltieral-------------------------------------------------------------------
    //
    private static boolean isLiteral(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.literal() != null;
    }

    private static TypeUsage literal(AntlrGlslParser.ExpressionContext ctx) {
        return visitor.visitLiteral(ctx.literal());
    }

    //
    //parenthetical expression--------------------------------------------------
    //
    private static boolean isParentheticalExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.LRB() != null;
    }

    private static TypeUsage parentheticalExpression(AntlrGlslParser.ExpressionContext ctx) {
        return visitor.visitExpression(ctx.expression(0));
    }

    //
    //identifier----------------------------------------------------------------
    //
    private static boolean isIdentifier(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.IDENTIFIER() != null;
    }

    private static TypeUsage identifier(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage previousTu = ctx.DOT() == null ? null : visitor.visitExpression(ctx.expression(0));
        VariableUsage vu = VariableHelper.createVariableUsage(ctx.IDENTIFIER(), previousTu, scope);
        scope.addVariableUsage(vu);
        return vu.getDeclaration() == null ? null : vu.getDeclaration().getType();
    }

    //
    //arithmetic unary expression-----------------------------------------------
    //
    private static boolean isArithmeticUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.expression().size() == 1 && (ctx.OP_INC() != null || ctx.OP_DEC() != null || ctx.OP_ADD() != null || ctx.OP_SUB() != null);
    }

    private static TypeUsage arithmeticUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu = visitor.visitExpression(ctx.expression(0));
        if (usable(tu) && tu.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT) {
            ErrorHelper.addError(Severity.ERROR, "not transparent type", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        if (tu != null && tu.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        return tu;
    }

    //
    //relational expression-----------------------------------------------------
    //
    private static boolean isRelationalExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_RELATIONAL() != null;
    }

    private static TypeUsage relationalExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1) && tu1.getDeclaration().getTypeCategory() != TypeCategory.CUSTOM && tu1.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT) {
            ErrorHelper.addError(Severity.ERROR, "opaque type", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (usable(tu2) && tu2.getDeclaration().getTypeCategory() != TypeCategory.CUSTOM && tu2.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT) {
            ErrorHelper.addError(Severity.ERROR, "opaque type", ctx.expression(1).getStart().getStartIndex(), ctx.expression(1).getStop().getStopIndex() + 1);
        }
        if (usable(tu1, tu2)
                && !Helper.areConvertible(tu1.getDeclaration(), tu2.getDeclaration())) {
            ErrorHelper.addError(Severity.ERROR, "not convertible", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        TypeDeclaration td = Builtin.getType("bool");
        TypeUsage tu = new TypeUsage("bool");
        tu.setDeclaration(td);
        return tu;
    }

    //
    //equalit expression--------------------------------------------------------
    //
    private static boolean isEqualityExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_EQUALITY() != null;
    }

    private static TypeUsage equalityExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1) && (!tu1.getDeclaration().isScalar() || tu1.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT)) {
            ErrorHelper.addError(Severity.ERROR, "not scalar", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (usable(tu2) && (!tu2.getDeclaration().isScalar() || tu2.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT)) {
            ErrorHelper.addError(Severity.ERROR, "not scalar", ctx.expression(1).getStart().getStartIndex(), ctx.expression(1).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        TypeDeclaration td = Builtin.getType("bool");
        TypeUsage tu = new TypeUsage("bool");
        tu.setDeclaration(td);
        return tu;
    }

    //
    //logical binary expression-------------------------------------------------
    //
    private static boolean isLogicalBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_LOGICAL_AND() != null || ctx.OP_LOGICAL_XOR() != null || ctx.OP_LOGICAL_OR() != null;
    }

    private static TypeUsage logicalBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (tu1 != null && !tu1.getName().equals("bool")) {
            ErrorHelper.addError(Severity.ERROR, "not bool", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (tu2 != null && !tu2.getName().equals("bool")) {
            ErrorHelper.addError(Severity.ERROR, "not bool", ctx.expression(1).getStart().getStartIndex(), ctx.expression(1).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        TypeDeclaration td = Builtin.getType("bool");
        TypeUsage tu = new TypeUsage("bool");
        tu.setDeclaration(td);
        return tu;
    }

    //
    //logical unary expression--------------------------------------------------
    //
    private static boolean isLogicalUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_LOGICAL_UNARY() != null;
    }

    private static TypeUsage logicalUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        if (tu1 != null && !tu1.getName().equals("bool")) {
            ErrorHelper.addError(Severity.ERROR, "not bool", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        TypeDeclaration td = Builtin.getType("bool");
        TypeUsage tu = new TypeUsage("bool");
        tu.setDeclaration(td);
        return tu;
    }

    //
    //bit unary expression------------------------------------------------------
    //
    private static boolean isBitUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_BIT_UNARY() != null;
    }

    private static TypeUsage bitUnaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        if (usable(tu1) && isOpaqueOrMatrixOrFloatingPoint(tu1)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        return tu1;
    }

    //
    //shift expression----------------------------------------------------------
    //
    private static boolean isShiftExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_SHIFT() != null;
    }

    private static TypeUsage shiftExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1) && isOpaqueOrMatrixOrFloatingPoint(tu1)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (usable(tu1, tu2) && (tu2.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT
                || tu2.getDeclaration().isMatrix()
                || tu1.getDeclaration().isScalar() && !Helper.areConvertible(tu1.getDeclaration(), tu2.getDeclaration())
                || tu1.getDeclaration().isVector() && !Helper.areConvertible(tu1.getDeclaration(), tu2.getDeclaration()) && !tu2.getName().equals("int") && !tu2.getName().equals("uint"))) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix, floating point or wrong size", ctx.expression(1).getStart().getStartIndex(), ctx.expression(1).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        return tu1;
    }

    //
    //bit binary expression-----------------------------------------------------
    //
    private static boolean isBitBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_BIT_AND() != null || ctx.OP_BIT_XOR() != null || ctx.OP_BIT_OR() != null;
    }

    private static TypeUsage bitBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1) && isOpaqueOrMatrixOrFloatingPoint(tu1)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (usable(tu2) && isOpaqueOrMatrixOrFloatingPoint(tu2)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        if (usable(tu1, tu2)) {
            if (tu1.getDeclaration().isScalar() && tu2.getDeclaration().isVector()) {
                return tu2;
            } else if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isScalar()) {
                return tu1;
            } else if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isVector()) {
                if (tu1.getDeclaration().getWidth() != tu2.getDeclaration().getWidth()) {
                    ErrorHelper.addError(Severity.ERROR, "different dimension", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                }
                TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
                if (td != null) {
                    TypeUsage tu = new TypeUsage(td.getName());
                    tu.setDeclaration(td);
                    return tu;
                } else {
                    ErrorHelper.addError(Severity.ERROR, "can't convert operands", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    return null;
                }
            } else {
                TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
                TypeUsage tu = new TypeUsage(td.getName());
                tu.setDeclaration(td);
                return tu;
            }
        }
        return null;
    }

    //
    //modulo expression---------------------------------------------------------
    //
    private static boolean isModuloExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.OP_MOD() != null;
    }

    private static TypeUsage moduloExpression(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1) && isOpaqueOrMatrixOrFloatingPoint(tu1)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (usable(tu2) && isOpaqueOrMatrixOrFloatingPoint(tu2)) {
            ErrorHelper.addError(Severity.ERROR, "opaqu type, matrix or floating point", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
        }
        if (tu1 != null && tu1.isArray() || tu2 != null && tu2.isArray()) {
            ErrorHelper.addError(Severity.ERROR, "array", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
        }
        if (usable(tu1, tu2)) {
            if (tu1.getDeclaration().isScalar() && tu2.getDeclaration().isVector()) {
                return tu2;
            } else if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isScalar()) {
                return tu1;
            } else if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isVector()) {
                if (tu1.getDeclaration().getWidth() != tu2.getDeclaration().getWidth()) {
                    ErrorHelper.addError(Severity.ERROR, "different dimension", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                }
                TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
                if (td != null) {
                    TypeUsage tu = new TypeUsage(td.getName());
                    tu.setDeclaration(td);
                    return tu;
                } else {
                    ErrorHelper.addError(Severity.ERROR, "can't convert operands", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    return null;
                }
            } else {
                TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
                TypeUsage tu = new TypeUsage(td.getName());
                tu.setDeclaration(td);
                return tu;
            }
        }
        return null;
    }

    //
    //length expression---------------------------------------------------------
    //
    private static boolean isLengthExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.DOT() != null && ctx.function_call() != null;
    }

    private static TypeUsage lengthExpression(AntlrGlslParser.ExpressionContext ctx) {
        if (ctx.function_call().getText().equals("length()")) {
            TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
            if (!tu1.getDeclaration().isMatrix() && !tu1.getDeclaration().isVector() && !tu1.isArray()) {
                ErrorHelper.addError(Severity.ERROR, "not vector, matrix or array", ctx.function_call().getStart().getStartIndex(), ctx.function_call().getStop().getStopIndex() + 1);
            }
            TypeUsage tu = new TypeUsage("int");
            TypeDeclaration td = Builtin.getType("int");
            tu.setDeclaration(td);
            return tu;
        } else {
            ErrorHelper.addError(Severity.ERROR, "structs don't have functions", ctx.function_call().getStart().getStartIndex(), ctx.function_call().getStop().getStopIndex() + 1);
            return null;
        }
    }

    //
    //arithmetic binary expression----------------------------------------------
    //
    private static boolean isArithmeticBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.expression().size() == 2 && (ctx.OP_ADD() != null || ctx.OP_SUB() != null || ctx.OP_DIV() != null || ctx.OP_MUL() != null);
    }

    private static TypeUsage arithmeticBinaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        //FIXME: arrays
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression(1));
        if (usable(tu1, tu2)) {
            if (tu1.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT) {
                ErrorHelper.addError(Severity.ERROR, "not transparent type", ctx.expression(0).getStart().getStartIndex(), ctx.expression(0).getStop().getStopIndex() + 1);
            }
            if (tu2.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT) {
                ErrorHelper.addError(Severity.ERROR, "not transparent type", ctx.expression(1).getStart().getStartIndex(), ctx.expression(1).getStop().getStopIndex() + 1);
            }
            if (tu1.getDeclaration().isScalar() && tu2.getDeclaration().isScalar()) {
                TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
                TypeUsage tu = new TypeUsage(td.getName());
                tu.setDeclaration(td);
                return tu;
            } else if (tu1.getDeclaration().isScalar() && !tu2.getDeclaration().isScalar()) {
                return tu2;
            } else if (!tu1.getDeclaration().isScalar() && tu2.getDeclaration().isScalar()) {
                return tu1;
            } else if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isVector()) {
                if (tu1.getDeclaration().getWidth() != tu2.getDeclaration().getWidth()) {
                    ErrorHelper.addError(Severity.ERROR, "different dimensions", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                }
                return tu1;
            } else if (tu1.getDeclaration().isMatrix() && tu2.getDeclaration().isMatrix()
                    || tu1.getDeclaration().isMatrix() && tu2.getDeclaration().isVector()
                    || tu1.getDeclaration().isVector() && tu2.getDeclaration().isMatrix()) {
                if (ctx.OP_MUL() != null) {
                    if (tu1.getDeclaration().isMatrix() && tu2.getDeclaration().isMatrix() && tu1.getDeclaration().getWidth() != tu2.getDeclaration().getHeight()) {
                        ErrorHelper.addError(Severity.ERROR, "wrong dimensions", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    }
                    if (tu1.getDeclaration().isMatrix() && tu2.getDeclaration().isVector() && tu1.getDeclaration().getWidth() != tu2.getDeclaration().getWidth()) {
                        ErrorHelper.addError(Severity.ERROR, "wrong dimensions", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    }
                    if (tu1.getDeclaration().isVector() && tu2.getDeclaration().isMatrix() && tu1.getDeclaration().getWidth() != tu2.getDeclaration().getHeight()) {
                        ErrorHelper.addError(Severity.ERROR, "wrong dimensions", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    }
                    String typePrefix = tu1.getDeclaration().getTypeBase() == TypeBase.DOUBLE || tu2.getDeclaration().getTypeBase() == TypeBase.DOUBLE ? "d" : "";
                    String name;
                    if (tu1.getDeclaration().isMatrix() && tu2.getDeclaration().isMatrix()) {
                        name = typePrefix + "mat" + tu1.getDeclaration().getHeight() + "x" + tu2.getDeclaration().getWidth();
                    } else if (tu1.getDeclaration().isVector()) {
                        name = typePrefix + "vec" + tu2.getDeclaration().getWidth();
                    } else {
                        name = typePrefix + "vec" + tu1.getDeclaration().getHeight();
                    }
                    TypeDeclaration td = Builtin.getType(name);
                    TypeUsage tu = new TypeUsage(td.getName());
                    tu.setDeclaration(td);
                    return tu;
                } else {
                    if (tu1.getDeclaration().getWidth() != tu2.getDeclaration().getWidth() || tu1.getDeclaration().getHeight() != tu2.getDeclaration().getHeight()) {
                        ErrorHelper.addError(Severity.ERROR, "different dimensions", ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex() + 1);
                    }
                    return tu1;
                }
            }
        }
        return null;
    }

    //
    //ternary expression--------------------------------------------------------
    //
    private static boolean isTernaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.QUESTION() != null;
    }

    private static TypeUsage ternaryExpression(AntlrGlslParser.ExpressionContext ctx) {
        visitor.visitExpression(ctx.expression(0));
        TypeUsage tu1 = visitor.visitExpression(ctx.expression_list(0).expression(ctx.expression_list(0).expression().size() - 1));
        TypeUsage tu2 = visitor.visitExpression(ctx.expression_list(1).expression(ctx.expression_list(1).expression().size() - 1));
        if (usable(tu1, tu2)) {
            TypeDeclaration td = Helper.getConversion(tu1.getDeclaration(), tu2.getDeclaration());
            if (td != null) {
                TypeUsage tu = new TypeUsage(td.getName());
                tu.setDeclaration(td);
                return tu;
            } else {
                ErrorHelper.addError(Severity.ERROR, "different types", ctx.start.getStartIndex(), ctx.stop.getStopIndex() + 1);
            }
        }
        return null;
    }

    //
    //array subscript-----------------------------------------------------------
    //
    private static boolean isArraySubscript(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.array_subscript() != null;
    }

    private static TypeUsage arraySubscript(AntlrGlslParser.ExpressionContext ctx) {
        TypeUsage tu1 = visitor.visitExpression(ctx.expression(0));
        for (AntlrGlslParser.ExpressionContext ec : ctx.array_subscript().expression()) {
            visitor.visitExpression(ec);
        }
        return array(ctx, tu1, ctx.array_subscript().LSB().size());
    }

    private static TypeUsage array(AntlrGlslParser.ExpressionContext ctx, TypeUsage tu1, int array) {
        if (usable(tu1)) {
            if (tu1.isArray() || tu1.getDeclaration().isVector() || tu1.getDeclaration().isMatrix()) {
                if (tu1.isArray()) {
                    int depth = tu1.getArrayDepth();
                    TypeUsage tu = new TypeUsage(tu1.getName());
                    tu.setDeclaration(tu1.getDeclaration());
                    tu.setArrayDepth(depth - 1);
                    return array > 1 ? array(ctx, tu, array - 1) : tu;
                } else if (tu1.getDeclaration().isVector()) {
                    TypeUsage tu = new TypeUsage(tu1.getDeclaration().getTypeBase().name().toLowerCase());
                    TypeDeclaration td = Builtin.getType(tu.getName());
                    tu.setDeclaration(td);
                    return array > 1 ? array(ctx, tu, array - 1) : tu;
                } else {
                    //FIXME: kódduplikáció VariableHelper
                    String name = "";
                    switch (tu1.getDeclaration().getTypeBase()) {
                        case BOOL:
                            name = "b";
                            break;
                        case DOUBLE:
                            name = "d";
                            break;
                        case INT:
                            name = "i";
                            break;
                        case UINT:
                            name = "u";
                            break;
                    }
                    name = name + "vec" + tu1.getDeclaration().getWidth();
                    TypeDeclaration td = Builtin.getType(name);
                    TypeUsage tu = new TypeUsage(td.getName());
                    tu.setDeclaration(td);
                    return array > 1 ? array(ctx, tu, array - 1) : tu;
                }
            } else {
                ErrorHelper.addError(Severity.ERROR, "not an array", ctx.array_subscript().start.getStartIndex(), ctx.array_subscript().stop.getStopIndex() + 1);
            }
        }
        return null;
    }

    //
    //function call-------------------------------------------------------------
    //
    private static boolean isFunctionCall(AntlrGlslParser.ExpressionContext ctx) {
        return ctx.function_call() != null && ctx.array_subscript() == null;
    }

    private static TypeUsage functionCall(AntlrGlslParser.ExpressionContext ctx) {
        AntlrGlslParser.Function_callContext fcc = ctx.function_call();
        String name = fcc.IDENTIFIER() != null ? fcc.IDENTIFIER().getText() : fcc.TYPE().getText();
        List<TypeUsage> parameters = new ArrayList<>();
        if (fcc.function_call_parameter_list() != null && fcc.function_call_parameter_list().expression_list() != null) {
            for (AntlrGlslParser.ExpressionContext ec : fcc.function_call_parameter_list().expression_list().expression()) {
                TypeUsage tu = visitor.visitExpression(ec);
                if (tu == null) {
                    return null;
                }
                parameters.add(tu);
            }
        }

        Function func = null;
        List<Integer> conversions = new ArrayList<>();
        for (Function f : Scope.getFunctions()) {
            if (f.getName().equals(name) && f.getParameters().size() == parameters.size()) {
                List<Integer> conv = new ArrayList<>();
                boolean valid = true;
                for (int i = 0; valid && i < parameters.size(); i++) {
                    TypeUsage tu1 = parameters.get(i);
                    TypeUsage tu2 = f.getParameters().get(i).getType();
                    if (tu1.getDeclaration().isConveribleTo(tu2.getDeclaration())) {
                        if (tu1.getName().equals(tu2.getName())) {
                            conv.add(0);
                        } else if (tu1.getName().equals("float") && tu2.getName().equals("double")) {
                            conv.add(1);
                        } else if ((tu1.getName().equals("int") || tu1.getName().equals("uint")) && tu2.getName().equals("float")) {
                            conv.add(2);
                        } else if ((tu1.getName().equals("int") || tu1.getName().equals("uint")) && tu2.getName().equals("double")) {
                            conv.add(3);
                        } else {
                            conv.add(4);
                        }
                        if (!conversions.isEmpty() && conv.get(conv.size() - 1) > conversions.get(conv.size() - 1)) {
                            valid = false;
                            break;
                        }
                    } else {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    func = f;
                    conversions = conv;
                }
            }
        }
        if (func == null) {
            for (Function f : Builtin.getFunctions()) {
                if (f.getName().equals(name) && f.getParameters().size() == parameters.size()) {
                    List<Integer> conv = new ArrayList<>();
                    boolean valid = true;
                    for (int i = 0; valid && i < parameters.size(); i++) {
                        TypeUsage tu1 = parameters.get(i);
                        TypeUsage tu2 = f.getParameters().get(i).getType();
                        if (tu1.getDeclaration().isConveribleTo(tu2.getDeclaration())) {
                            if (tu1.getName().equals(tu2.getName())) {
                                conv.add(0);
                            } else if (tu1.getName().equals("float") && tu2.getName().equals("double")) {
                                conv.add(1);
                            } else if ((tu1.getName().equals("int") || tu1.getName().equals("uint")) && tu2.getName().equals("float")) {
                                conv.add(2);
                            } else if ((tu1.getName().equals("int") || tu1.getName().equals("uint")) && tu2.getName().equals("double")) {
                                conv.add(3);
                            } else {
                                conv.add(4);
                            }
                            if (!conversions.isEmpty() && conv.get(conv.size() - 1) > conversions.get(conv.size() - 1)) {
                                valid = false;
                                break;
                            }
                        } else {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        func = f;
                        conversions = conv;
                    }
                }
            }
        }
        if (func != null) {
            FunctionCall fc = new FunctionCall();
            fc.setName(name);
            fc.setFunction(func);
            func.addCall(fc);
            fc.setNameStartIndex(fcc.IDENTIFIER() != null ? fcc.IDENTIFIER().getSymbol().getStartIndex() : fcc.TYPE().getSymbol().getStartIndex());
            fc.setNameStopIndex(fcc.IDENTIFIER() != null ? fcc.IDENTIFIER().getSymbol().getStopIndex() + 1 : fcc.TYPE().getSymbol().getStopIndex() + 1);
            fc.setStartIndex(ctx.start.getStartIndex());
            fc.setStopIndex(ctx.stop.getStopIndex() + 1);
            scope.addFunctionCall(fc);

            return func.getReturnType();
        } else {
            ErrorHelper.addError(Severity.ERROR, "there is not such a function", ctx.start.getStartIndex(), ctx.stop.getStopIndex() + 1);
            return null;
        }
    }

    //
    //misc----------------------------------------------------------------------
    //
    private static boolean usable(TypeUsage... tus) {
        for (TypeUsage tu : tus) {
            if (tu == null || tu.getDeclaration() == null) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOpaqueOrMatrixOrFloatingPoint(TypeUsage tu) {
        return tu.getDeclaration().getTypeCategory() != TypeCategory.TRANSPARENT
                || tu.getDeclaration().isMatrix()
                || tu.getDeclaration().isScalar() && tu.getDeclaration().getTypeBase() != TypeBase.INT && tu.getDeclaration().getTypeBase() != TypeBase.UINT
                || tu.getDeclaration().isVector() && tu.getDeclaration().getTypeBase() != TypeBase.INT && tu.getDeclaration().getTypeBase() != TypeBase.UINT;
    }
}
