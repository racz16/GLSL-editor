package hu.racz.zalan.editor.core.helper;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.folding.*;
import org.antlr.v4.runtime.*;

public class FunctionHelper {

    private static Scope currentScope;

    private static FunctionDeclaration fd;
    private static Function func;

    public static FunctionDeclaration createFunctionPrototype(AntlrGlslParser.Function_prototypeContext fpc, Scope scope) {
        try {
            return createFunctionPrototypeUnsafe(fpc, scope);
        } catch (NullPointerException ex) {
            return null;
        }
    }

    private static FunctionDeclaration createFunctionPrototypeUnsafe(AntlrGlslParser.Function_prototypeContext fpc, Scope scope) {
        initialize(scope);
        setDeclarationData(fpc, fpc.function_header());
        setFunctionData(fpc.function_header());
        setFunctionDefinition();
        connectPrototype();
        return fd;
    }

    public static FunctionDeclaration createFunctionDefinition(AntlrGlslParser.Function_definitionContext fdc, Scope scope) {
        try {
            return createFunctionDefinitionUnsafe(fdc, scope);
        } catch (NullPointerException ex) {
            return null;
        }
    }

    private static FunctionDeclaration createFunctionDefinitionUnsafe(AntlrGlslParser.Function_definitionContext fdc, Scope scope) {
        initialize(scope);
        setDeclarationData(fdc, fdc.function_header());
        setFunctionData(fdc.function_header());
        addFoldingBlock();
        setFunctionPrototype();
        connectDefinition();
        return fd;
    }

    private static void initialize(Scope scope) {
        currentScope = scope;
        fd = new FunctionDeclaration();
        func = new Function();
    }

    private static void setDeclarationData(ParserRuleContext prc, AntlrGlslParser.Function_headerContext fhc) {
        setDeclarationIndices(prc, fhc);
        fd.setName(fhc.IDENTIFIER().getText());
        ErrorHelper.addIdentifierWarnings(fd);
    }

    private static void setDeclarationIndices(ParserRuleContext prc, AntlrGlslParser.Function_headerContext fhc) {
        fd.setStartIndex(prc.start.getStartIndex());
        fd.setStopIndex(prc.stop.getStopIndex() + 1);
        fd.setNameStartIndex(fhc.IDENTIFIER().getSymbol().getStartIndex());
        fd.setNameStopIndex(fhc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        fd.setSignatureStartIndex(fhc.start.getStartIndex());
        fd.setSignatureStopIndex(fhc.stop.getStopIndex() + 1);
    }

    private static void setFunctionData(AntlrGlslParser.Function_headerContext fhc) {
        setReturnType(fhc);
        setFunctionHeader(fhc);
    }

    //
    //return type---------------------------------------------------------------
    //
    private static void setReturnType(AntlrGlslParser.Function_headerContext fhc) {
        if (fhc.return_type().KW_VOID() == null) {
            setNotVoidReturnType(fhc.return_type());
        } else {
            setVoidReturnType(fhc.return_type());
        }
    }

    private static void setNotVoidReturnType(AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = TypeHelper.createTypeUsageWithoutQualifiers(currentScope, rtc.type(), rtc.array_subscript());
        QualifierUsage qu = Helper.createQualifierUsage(rtc.precision_qualifier());
        if (qu != null) {
            returnType.addQualifier(qu);
        }
        TypeHelper.addTypeUsageToScopeIfCustom(returnType, currentScope);
        func.setReturnType(returnType);
    }

    private static void setVoidReturnType(AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = new TypeUsage("void");
        returnType.setNameStartIndex(rtc.KW_VOID().getSymbol().getStartIndex());
        returnType.setNameStopIndex(rtc.KW_VOID().getSymbol().getStopIndex() + 1);
        ErrorHelper.addVoidQualifierError(rtc.precision_qualifier());
        func.setReturnType(returnType);
    }

    //
    //function header-----------------------------------------------------------
    //
    private static void setFunctionHeader(AntlrGlslParser.Function_headerContext fsc) {
        func.setName(fsc.IDENTIFIER().getText());
        if (fsc.function_parameter_list() != null) {
            for (AntlrGlslParser.Function_parameterContext fpc : fsc.function_parameter_list().function_parameter()) {
                setParameter(fpc);
            }
        }
    }

    private static void setParameter(AntlrGlslParser.Function_parameterContext fpc) {
        TypeUsage tu = createParameterTypeUsage(fpc);
        TypeHelper.addTypeUsageToScopeIfCustom(tu, currentScope);
        VariableDeclaration vd = createParameterVariableDeclaration(tu, fpc);
        currentScope.addVariableDeclaration(vd);
        func.addParameter(vd);
    }

    private static TypeUsage createParameterTypeUsage(AntlrGlslParser.Function_parameterContext fpc) {
        TypeUsage tu = TypeHelper.createTypeUsageWithoutQualifiers(currentScope, fpc.type(), fpc.array_subscript());
        tu.setArrayDepth(tu.getArrayDepth() + Helper.getArrayDepth(fpc.identifier_optarray() != null ? fpc.identifier_optarray().array_subscript() : null));
        return tu;
    }

    private static VariableDeclaration createParameterVariableDeclaration(TypeUsage tu, AntlrGlslParser.Function_parameterContext fpc) {
        VariableDeclaration vd = VariableHelper.createVariableDeclarationWithoutQualifiers(tu, fpc);
        setParameterQualifiers(vd, fpc);
        ErrorHelper.addIdentifierWarnings(vd);
        return vd;
    }

    private static void setParameterQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers() != null) {
            setExplicitParameterQualifiers(vd, fpc);
        }
        setImplicitParameterQualifier(vd);
    }

    private static void setExplicitParameterQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        QualifierUsage qu = Helper.createQualifierUsage(fpc.parameter_qualifiers().precision_qualifier());
        if (qu != null) {
            vd.getType().addQualifier(qu);
        }
        setOtherParameterQualifiers(vd, fpc);
    }

    private static void setOtherParameterQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers().parameter_qualifier() != null) {
            for (AntlrGlslParser.Parameter_qualifierContext pqc : fpc.parameter_qualifiers().parameter_qualifier()) {
                QualifierUsage qu = Helper.createQualifierUsage(pqc);
                ErrorHelper.addInconsistentFunctionParameterQualifiersError(vd, qu, pqc);
                vd.getType().addQualifier(qu);
            }
        }
    }

    private static void setImplicitParameterQualifier(VariableDeclaration vd) {
        if (isImplicitQualifierNeeded(vd)) {
            vd.getType().addImplicitQualifier(Builtin.getQualifier("in"));
        }
    }

    private static boolean isImplicitQualifierNeeded(VariableDeclaration vd) {
        for (QualifierUsage qu : vd.getType().getQualifiers()) {
            if (qu.getQualifier().equals(Builtin.getQualifier("in")) || qu.getQualifier().equals(Builtin.getQualifier("out")) || qu.getQualifier().equals(Builtin.getQualifier("inout"))) {
                return false;
            }
        }
        return true;
    }

    //
    //connections---------------------------------------------------------------
    //
    private static void addFoldingBlock() {
        FoldingBlock fb = new FoldingBlock(FoldingType.BLOCK, fd.getSignatureStopIndex(), fd.getStopIndex());
        Scope.addFoldingBlock(fb);
    }

    private static void setFunctionDefinition() {
        for (FunctionDeclaration fd2 : Scope.getFunctionDefinitions()) {
            if (fd2.getFunction().equals(func)) {
                func = fd2.getFunction();
                return;
            }
        }
        setFunctionPrototype();
    }

    private static void setFunctionPrototype() {
        for (FunctionDeclaration fp : Scope.getFunctionPrototypes()) {
            if (fp.getFunction().equals(func)) {
                func = fp.getFunction();
                return;
            }
        }
        Scope.addFunction(func);
    }

    private static void connectPrototype() {
        fd.setFunction(func);
        func.addPrototype(fd);
    }

    private static void connectDefinition() {
        fd.setFunction(func);
        func.setDefinition(fd);
        ErrorHelper.addDuplicatedFunctionDefinitionError(fd);
    }

}
