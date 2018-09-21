package hu.racz.zalan.editor.errordisplay.scope;

import java.util.ArrayList;
import java.util.List;

public class Scope {

    private Scope parent;
    private final List<Scope> children = new ArrayList<>();

    private final List<Variable> variables = new ArrayList<>();
    private final List<Function> functionPrototypes = new ArrayList<>();
    private final List<Function> functionDefinitions = new ArrayList<>();

    private String functionReturnType = "";

    private int startIndex;
    private int endIndex;

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Scope getChild(int index) {
        return children.get(index);
    }

    public void addChild(Scope scope) {
        children.add(scope);
    }

    public int getChildCount() {
        return children.size();
    }

    public String getFunctionReturnType() {
        return functionReturnType;
    }

    public void setFunctionReturnType(String frt) {
        this.functionReturnType = frt;
    }

    public Variable getVariable(int index) {
        return variables.get(index);
    }

    public void addVariable(Variable var) {
        variables.add(var);
    }

    public int getVariableCount() {
        return variables.size();
    }

    public Function getFunctionPrototype(int index) {
        return functionPrototypes.get(index);
    }

    public void addFunctionPrototype(Function func) {
        functionPrototypes.add(func);
    }

    public int getFunctionPrototypeCount() {
        return functionPrototypes.size();
    }

    public Function getFunctionDefinition(int index) {
        return functionDefinitions.get(index);
    }

    public void addFunctionDefinition(Function func) {
        functionDefinitions.add(func);
    }

    public int getFunctionDefinitionCount() {
        return functionDefinitions.size();
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

}
