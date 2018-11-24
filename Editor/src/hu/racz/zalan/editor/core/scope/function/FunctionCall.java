package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;

public class FunctionCall extends Element {

    private Function function;
    private int startIndex;
    private int stopIndex;

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
        FunctionBase fc = (FunctionBase) obj;
        return function.equals(fc.getFunction());
    }

    @Override
    public String toString() {
        return function.toString();
    }
}
