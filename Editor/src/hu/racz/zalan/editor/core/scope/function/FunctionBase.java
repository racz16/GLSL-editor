package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;

public abstract class FunctionBase extends Element {

    private TypeUsage returnType;
    private FunctionSignature signature = new FunctionSignature();

    @Override
    public String getName() {
        return signature.getName();
    }

    public TypeUsage getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeUsage returnType) {
        this.returnType = returnType;
    }

    public FunctionSignature getSignature() {
        return signature;
    }

    public void setSignature(FunctionSignature signature) {
        this.signature = signature;
    }

    @Override
    public String toString() {
        return getReturnType().getName() + " " + getSignature();
    }
}
