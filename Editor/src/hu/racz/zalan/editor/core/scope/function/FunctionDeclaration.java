package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;

public class FunctionDeclaration extends Element {

    private Function function;
    private int startIndex;
    private int stopIndex;
    private int signatureStartIndex;
    private int signatureStopIndex;

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
    //function------------------------------------------------------------------
    //
    public Function getFunction() {
        return function;
    }

    public void setFunction(Function function) {
        this.function = function;
    }

    @Override
    public boolean equals(Object obj) {
        FunctionDeclaration fb = (FunctionDeclaration) obj;
        return function.equals(fb.getFunction());
    }

    @Override
    public String toString() {
        return function.toString();
    }

}
