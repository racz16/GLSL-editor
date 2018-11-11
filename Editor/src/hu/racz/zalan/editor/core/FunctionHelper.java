package hu.racz.zalan.editor.core;

import hu.racz.zalan.editor.core.scope.qualifier.QualifierUsage;
import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.netbeans.spi.editor.hints.*;

public class FunctionHelper {

    private static Scope currentScope;

    private static FunctionPrototype fp;
    private static FunctionDefinition fd;
    private static FunctionBase fb;
    private static Function f;

    public static FunctionPrototype createFunctionPrototype(AntlrGlslParser.Function_prototypeContext fpc, Scope scope) {
        initializeForPrototype(scope);
        setIndices(fpc);
        setFunctionForPrototype(fpc.function_header());
        setFunctionDefinition();
        Scope.addFunctionPrototype(fp);
        return fp;
    }

    private static void initializeForPrototype(Scope scope) {
        currentScope = scope;
        fp = new FunctionPrototype();
        fb = fp;
    }

    public static FunctionDefinition createFunctionDefinition(AntlrGlslParser.Function_definitionContext fdc, Scope scope) {
        initializeForDefinition(scope);
        setIndices(fdc);
        setFunctionForDefinition(fdc.function_header());
        setFunctionPrototype();
        addFoldingBlock();
        Scope.addFunctionDefinition(fd);
        return fd;
    }

    private static void addFoldingBlock() {
        FoldingBlock fb = new FoldingBlock(FoldingBlock.FoldingType.BLOCK, fd.getSignatureStopIndex(), fd.getStopIndex());
        Scope.addFoldingBlock(fb);
    }

    private static void initializeForDefinition(Scope scope) {
        currentScope = scope;
        fd = new FunctionDefinition();
        fb = fd;
    }

    private static void setFunctionForPrototype(AntlrGlslParser.Function_headerContext fhc) {
        f = creteFunction(fhc);
        fp.setFunction(f);
        f.addPrototype(fp);
    }

    private static void setFunctionForDefinition(AntlrGlslParser.Function_headerContext fhc) {
        f = creteFunction(fhc);
        fd.setFunction(f);
        f.setDefinition(fd);
    }

    private static Function creteFunction(AntlrGlslParser.Function_headerContext fhc) {
        f = new Function();
        setReturnType(f, fhc);
        setFunctionSignature(fhc);
        return f;
    }

    private static void setIndices(ParserRuleContext prc) {
        fb.setStartIndex(prc.start.getStartIndex());
        fb.setStopIndex(prc.stop.getStopIndex() + 1);
    }

    private static void setFunctionDefinition() {
        Scope s = Helper.getRootScope(currentScope);
        for (FunctionDefinition fd : Scope.getFunctionDefinitions()) {
            connectFunctionPrototypeWithDefinition(fp, fd);
            if (fp.getDefinition() != null) {
                f = fd.getFunction();
                f.addPrototype(fp);
                fp.setFunction(f);
                return;
            }
        }
        Scope.addFunction(f);
    }

    private static void setFunctionPrototype() {
        Scope s = Helper.getRootScope(currentScope);
        for (FunctionPrototype fp : Scope.getFunctionPrototypes()) {
            connectFunctionPrototypeWithDefinition(fp, fd);
            if (fd.getPrototype() != null) {
                f = fp.getFunction();
                f.setDefinition(fd);
                fd.setFunction(f);
                return;
            }
        }
        Scope.addFunction(f);
    }

    private static void connectFunctionPrototypeWithDefinition(FunctionPrototype fp, FunctionDefinition fd) {
        if (fp.getFunction().equals(fd.getFunction())) {
            fp.setDefinition(fd);
            fd.setPrototype(fp);
        }
    }

    //
    //return type---------------------------------------------------------------
    //
    private static void setReturnType(Function fb, AntlrGlslParser.Function_headerContext fhc) {
        if (fhc.return_type().KW_VOID() == null) {
            setNotVoidReturnType(fb, fhc.return_type());
        } else {
            setVoidReturnType(fb, fhc.return_type());
        }
    }

    private static void setNotVoidReturnType(Function fb, AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = createNotVoidReturnType(rtc);
        fb.setReturnType(returnType);
    }

    private static TypeUsage createNotVoidReturnType(AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = new TypeUsage(rtc.type().getText());
        setTypeUsageIndices(returnType, rtc.type());
        Helper.addPrecisionQualifier(returnType, rtc.precision_qualifier());
        setReturnTypeArray(returnType, rtc);
        Helper.setDeclaration(currentScope, returnType);
        return returnType;
    }

    private static void setTypeUsageIndices(TypeUsage tu, AntlrGlslParser.TypeContext tc) {
        if (tc.IDENTIFIER() != null) {
            tu.setNameStartIndex(tc.IDENTIFIER().getSymbol().getStartIndex());
            tu.setNameStopIndex(tc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        } else {
            tu.setNameStartIndex(tc.TYPE().getSymbol().getStartIndex());
            tu.setNameStopIndex(tc.TYPE().getSymbol().getStopIndex() + 1);
        }
    }

    private static void setReturnTypeArray(TypeUsage returnType, AntlrGlslParser.Return_typeContext rtc) {
        if (rtc.array_declaration() != null) {
            returnType.setArray(true);
            returnType.setArraySize(TypeUsage.ARRAY_SIZE_DONT_CARE);
            //TODO: tömb méretét általában meg kell tudni határozni fordítási időben
            //hibát lehetne dobni, ha nem const expression
        }
    }

    private static void setVoidReturnType(Function fb, AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = createVoidReturnType(rtc);
        fb.setReturnType(returnType);
        addVoidQualifierError(rtc.precision_qualifier());
    }

    private static TypeUsage createVoidReturnType(AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = new TypeUsage("void");
        returnType.setNameStartIndex(rtc.KW_VOID().getSymbol().getStartIndex());
        returnType.setNameStopIndex(rtc.KW_VOID().getSymbol().getStopIndex() + 1);
        return returnType;
    }

    private static void addVoidQualifierError(AntlrGlslParser.Precision_qualifierContext pqc) {
        if (pqc != null) {
            String message = "void : Only floating point, integer or opaque type declaration can have the type preceded by a precision qualifier. Unacceptable type";
            int start = pqc.getStart().getStartIndex();
            int stop = pqc.getStop().getStopIndex() + 1;
            Helper.addError(Severity.ERROR, message, start, stop);
        }
    }

    //
    //function header-----------------------------------------------------------
    //
    private static void setFunctionSignature(AntlrGlslParser.Function_headerContext fsc) {
        fb.setName(fsc.IDENTIFIER().getText());
        f.setName(fsc.IDENTIFIER().getText());
        setFunctionSignatureIndices(fsc);
        Helper.addIdentifierWarnings(fb.getName(), fb.getNameStartIndex(), fb.getNameStopIndex());
        setParameters(fsc);
    }

    private static void setFunctionSignatureIndices(AntlrGlslParser.Function_headerContext fhc) {
        fb.setNameStartIndex(fhc.IDENTIFIER().getSymbol().getStartIndex());
        fb.setNameStopIndex(fhc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        fb.setSignatureStartIndex(fhc.start.getStartIndex());
        fb.setSignatureStopIndex(fhc.stop.getStopIndex() + 1);
    }

    private static void setParameters(AntlrGlslParser.Function_headerContext fsc) {
        if (fsc.function_parameter_list() != null) {
            List<AntlrGlslParser.Function_parameterContext> fpcs = fsc.function_parameter_list().function_parameter();
            for (AntlrGlslParser.Function_parameterContext fpc : fpcs) {
                setParameter(fpc);
            }
        }
    }

    private static void setParameter(AntlrGlslParser.Function_parameterContext fpc) {
        VariableDeclaration vd = createParameter(fpc);
        f.addParameter(vd);
    }

    private static VariableDeclaration createParameter(AntlrGlslParser.Function_parameterContext fpc) {
        String name = fpc.IDENTIFIER() != null ? fpc.IDENTIFIER().getText() : "";
        TypeUsage tu = createTypeUsage(fpc);
        VariableDeclaration vd = new VariableDeclaration(tu, name);
        setParameterIndices(vd, fpc);
        Helper.addIdentifierWarnings(name, vd.getNameStartIndex(), vd.getNameStopIndex());
        setParameterQualifiers(vd, fpc);

        currentScope.addVariableDeclaration(vd);

        return vd;
    }

    private static TypeUsage createTypeUsage(AntlrGlslParser.Function_parameterContext fpc) {
        TypeUsage tu = new TypeUsage(fpc.type().getText());
        tu.setNameStartIndex(fpc.type().getStart().getStartIndex());
        tu.setNameStopIndex(fpc.type().getStop().getStopIndex() + 1);
        Helper.setDeclaration(currentScope, tu);
        setArray(tu, fpc);
        if (tu.getDeclaration() != null && !tu.getDeclaration().isBuiltIn()) {
            currentScope.addTypeUsage(tu);
        }
        return tu;
    }

    private static void setArray(TypeUsage tu, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.array_declaration() != null) {
            tu.setArray(true);//TODO: tömb mérete
        }
    }

    private static void setParameterIndices(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.IDENTIFIER() != null) {
            vd.setNameStartIndex(fpc.IDENTIFIER().getSymbol().getStartIndex());
            vd.setNameStopIndex(fpc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        }
        vd.setDeclarationStartIndex(fpc.getStart().getStartIndex());
        vd.setDeclarationStopIndex(fpc.getStop().getStopIndex() + 1);
    }

    private static void setParameterQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers() != null) {
            Helper.addPrecisionQualifier(vd.getType(), fpc.parameter_qualifiers().precision_qualifier());
            setParameterOtherQualifiers(vd, fpc);
        }
        setParameterImplicitQualifier(vd);
    }

    private static void setParameterOtherQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers().parameter_qualifier() != null) {
            for (AntlrGlslParser.Parameter_qualifierContext pq : fpc.parameter_qualifiers().parameter_qualifier()) {
                QualifierUsage qu = Helper.createQualifierUsage(pq.getText(), pq.getStart().getStartIndex(), pq.getStop().getStopIndex() + 1);
                createInconsistentFunctionParameterQualifiersError(vd, qu, pq);
                vd.getType().addQualifier(qu);
            }
        }
    }

    private static void createInconsistentFunctionParameterQualifiersError(VariableDeclaration vd, QualifierUsage q, AntlrGlslParser.Parameter_qualifierContext pq) {
        for (QualifierUsage fq : vd.getType().getQualifiers()) {
            if (!q.getQualifier().isCompatibleWith(fq.getQualifier())) {
                Helper.addError(Severity.ERROR, fq.getQualifier().getName() + ", " + q.getQualifier().getName() + " : inconsistent qualifiers", pq.getStart().getStartIndex(), pq.getStart().getStopIndex() + 1);
            }
        }
    }

    private static void setParameterImplicitQualifier(VariableDeclaration p) {
        if (isImplicitQualifierNeeds(p)) {
            p.getType().addImplicitQualifier(Builtin.getQualifier("in"));
        }
    }

    private static boolean isImplicitQualifierNeeds(VariableDeclaration p) {
        for (QualifierUsage qu : p.getType().getQualifiers()) {
            if (!qu.getQualifier().equals(Builtin.getQualifier("in")) && !qu.getQualifier().equals(Builtin.getQualifier("out")) && !qu.getQualifier().equals(Builtin.getQualifier("inout"))) {
                return true;
            }
        }
        return p.getType().getQualifiers().isEmpty();
    }

}
