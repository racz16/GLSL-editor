package hu.racz.zalan.editor.core;

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

    public static FunctionPrototype createFunctionPrototype(AntlrGlslParser.Function_prototypeContext fpc, Scope scope) {
        FunctionHelper.currentScope = scope;
        FunctionPrototype fp = new FunctionPrototype();
        setIndices(fp, fpc);
        setFunctionData(fp, fpc.function_header());
        setFunctionDefinition(fp);
        currentScope.getParent().addFunctionPrototype(fp);
        return fp;
    }

    public static FunctionDefinition createFunctionDefinition(AntlrGlslParser.Function_definitionContext fdc, Scope scope) {
        FunctionHelper.currentScope = scope;
        FunctionDefinition fp = new FunctionDefinition();
        setIndices(fp, fdc);
        setFunctionData(fp, fdc.function_header());
        setFunctionPrototype(fp);
        currentScope.getParent().addFunctionDefinition(fp);
        return fp;
    }

    private static void setFunctionData(FunctionBase fb, AntlrGlslParser.Function_headerContext fsc) {
        setReturnType(fb, fsc);
        setFunctionSignature(fb, fsc);
    }

    private static void setIndices(FunctionBase fb, ParserRuleContext prc) {
        fb.setStartIndex(prc.start.getStartIndex());
        fb.setStopIndex(prc.stop.getStopIndex() + 1);
    }

    private static void setFunctionDefinition(FunctionPrototype fp) {
        Scope s = Helper.getRootScope(currentScope);
        for (FunctionDefinition fd : s.getFunctionDefinitions()) {
            if (fd.getStopIndex() <= fp.getStartIndex()) {
                connectFunctionPrototypeWithDefinition(fp, fd);
                return;
            }
        }
    }

    private static void setFunctionPrototype(FunctionDefinition fd) {
        Scope s = Helper.getRootScope(currentScope);
        for (FunctionPrototype fp : s.getFunctionPrototypes()) {
            if (fp.getStopIndex() <= fd.getStartIndex()) {
                connectFunctionPrototypeWithDefinition(fp, fd);
                return;
            }
        }
    }

    private static void connectFunctionPrototypeWithDefinition(FunctionPrototype fp, FunctionDefinition fd) {
        if (fp.isPrototypeOf(fd)) {
            fp.setDefinition(fd);
            fd.setPrototype(fp);
        }
    }

    //
    //return type---------------------------------------------------------------
    //
    private static void setReturnType(FunctionBase fb, AntlrGlslParser.Function_headerContext fhc) {
        if (fhc.return_type().KW_VOID() == null) {
            setNotVoidReturnType(fb, fhc.return_type());
        } else {
            setVoidReturnType(fb, fhc.return_type());
        }
    }

    private static void setNotVoidReturnType(FunctionBase fb, AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = createNotVoidReturnType(rtc);
        fb.setReturnType(returnType);
    }

    private static TypeUsage createNotVoidReturnType(AntlrGlslParser.Return_typeContext rtc) {
        TypeUsage returnType = new TypeUsage(rtc.type().getText());
        setTypeUsageIndices(returnType, rtc.type());
        setReturnTypeQualifier(returnType, rtc);
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

    private static void setReturnTypeQualifier(TypeUsage returnType, AntlrGlslParser.Return_typeContext rtc) {
        if (rtc.precision_qualifier() != null) {
            setReturnTypeQualifierUnsafe(returnType, rtc);
        }
    }

    private static void setReturnTypeQualifierUnsafe(TypeUsage returnType, AntlrGlslParser.Return_typeContext rtc) {
        if (rtc.precision_qualifier().Q_LOWP() != null) {
            returnType.setQualifier(Qualifier.getQualifier("lowp"));
        } else if (rtc.precision_qualifier().Q_MEDIUMP() != null) {
            returnType.setQualifier(Qualifier.getQualifier("mediump"));
        } else if (rtc.precision_qualifier().Q_HIGHP() != null) {
            returnType.setQualifier(Qualifier.getQualifier("highp"));
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

    private static void setVoidReturnType(FunctionBase fb, AntlrGlslParser.Return_typeContext rtc) {
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
    private static void setFunctionSignature(FunctionBase fb, AntlrGlslParser.Function_headerContext fsc) {
        fb.setName(fsc.IDENTIFIER().getText());
        setFunctionSignatureIndices(fb, fsc);
        Helper.addIdentifierWarnings(fb.getName(), fb.getNameStartIndex(), fb.getNameStopIndex());
        setParameters(fb, fsc);
    }

    private static void setFunctionSignatureIndices(FunctionBase fb, AntlrGlslParser.Function_headerContext fhc) {
        fb.setNameStartIndex(fhc.IDENTIFIER().getSymbol().getStartIndex());
        fb.setNameStopIndex(fhc.IDENTIFIER().getSymbol().getStopIndex() + 1);
        fb.setSignatureStartIndex(fhc.start.getStartIndex());
        fb.setSignatureStopIndex(fhc.stop.getStopIndex() + 1);
    }

    private static void setParameters(FunctionBase fb, AntlrGlslParser.Function_headerContext fsc) {
        if (fsc.function_parameter_list() != null) {
            List<AntlrGlslParser.Function_parameterContext> fpcs = fsc.function_parameter_list().function_parameter();
            for (AntlrGlslParser.Function_parameterContext fpc : fpcs) {
                setParameter(fb, fpc);
            }
        }
    }

    private static void setParameter(FunctionBase fb, AntlrGlslParser.Function_parameterContext fpc) {
        VariableDeclaration vd = createParameter(fpc);
        fb.addParameter(vd);
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
            setParameterPrecisionQualifier(vd, fpc);
            setParameterOtherQualifiers(vd, fpc);
        }
        setParameterImplicitQualifier(vd);
    }

    private static void setParameterPrecisionQualifier(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers().precision_qualifier() != null) {
            Qualifier q = Qualifier.getQualifier(fpc.parameter_qualifiers().precision_qualifier().getText());
            vd.addQualifier(q);
        }
    }

    private static void setParameterOtherQualifiers(VariableDeclaration vd, AntlrGlslParser.Function_parameterContext fpc) {
        if (fpc.parameter_qualifiers().parameter_qualifier() != null) {
            for (AntlrGlslParser.Parameter_qualifierContext pq : fpc.parameter_qualifiers().parameter_qualifier()) {
                Qualifier q = Qualifier.getQualifier(pq.getText());
                createInconsistentFunctionParameterQualifiersError(vd, q, pq);
                vd.addQualifier(q);
            }
        }
    }

    private static void createInconsistentFunctionParameterQualifiersError(VariableDeclaration vd, Qualifier q, AntlrGlslParser.Parameter_qualifierContext pq) {
        for (Qualifier fq : vd.getQualifiers()) {
            if (!Qualifier.areCompatible(q, fq)) {
                Helper.addError(Severity.ERROR, fq.getName() + ", " + q.getName() + " : inconsistent qualifiers", pq.getStart().getStartIndex(), pq.getStart().getStopIndex() + 1);
            }
        }
    }

    private static void setParameterImplicitQualifier(VariableDeclaration p) {
        if (!p.getQualifiers().contains(Qualifier.getQualifier("in")) && !p.getQualifiers().contains(Qualifier.getQualifier("out")) && !p.getQualifiers().contains(Qualifier.getQualifier("inout"))) {
            p.addImplicitQualifier(Qualifier.getQualifier("in"));
        }
    }

}
