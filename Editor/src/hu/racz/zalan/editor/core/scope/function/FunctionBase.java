package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;

public abstract class FunctionBase extends Element {

    private TypeUsage returnType;
    private final List<VariableDeclaration> parameters = new ArrayList<>();

    private int startIndex;
    private int stopIndex;
    private int signatureStartIndex;
    private int signatureStopIndex;

    public TypeUsage getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeUsage returnType) {
        this.returnType = returnType;
    }

    //
    //indices-------------------------------------------------------------------
    //
    public int getSignatureStartIndex() {
        return signatureStartIndex;
    }

    public void setSignatureStartIndex(int signatureStartIndex) {
        this.signatureStartIndex = signatureStartIndex;
    }

    public int getSignatureStopIndex() {
        return signatureStopIndex;
    }

    public void setSignatureStopIndex(int signatureStopIndex) {
        this.signatureStopIndex = signatureStopIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    //
    //parameters----------------------------------------------------------------
    //
    public VariableDeclaration getParameter(int index) {
        return parameters.get(index);
    }

    public int getParameterCount() {
        return parameters.size();
    }

    public void addParameter(VariableDeclaration parameter) {
        parameters.add(parameter);
    }

    public List<VariableDeclaration> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    //
    //misc----------------------------------------------------------------------
    //
    public boolean equalsSignature(Object obj) {
        FunctionBase fb = (FunctionBase) obj;
        if (!getName().equals(fb.getName()) || parameters.size() != fb.parameters.size()) {
            return false;
        }
        return equalsParameters(fb);
    }

    private boolean equalsParameters(FunctionBase function) {
        for (int i = 0; i < parameters.size(); i++) {
            if (!parameters.get(i).getType().equals(function.parameters.get(i).getType()) || !parameters.get(i).qualifiersEquals(function.parameters.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        FunctionBase fb = (FunctionBase) obj;
        return equalsSignature(fb) && returnType.equals(fb.getReturnType());
    }

    public String toStringSignature(boolean showParameters) {
        String ret = getName() + "(";
        if (showParameters) {
            ret += toStringParameterList();
        }
        ret += ")";
        return ret;
    }

    public String toStringParameterList() {
        String ret = "";
        for (int i = 0; i < parameters.size(); i++) {
            ret += toStringParameter(i);
        }
        return ret;
    }

    private String toStringParameter(int index) {
        String ret = "";
        ret += parameters.get(index);
        if (index != parameters.size() - 1) {
            ret += ", ";
        }
        return ret;
    }

    @Override
    public String toString() {
        return getReturnType() + " " + toStringSignature(true);
    }
}
