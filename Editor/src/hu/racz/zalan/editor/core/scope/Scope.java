package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;

public class Scope {

    private Scope parent;
    private final List<Scope> children = new ArrayList<>();

    private final List<VariableDeclaration> variableDeclarations = new ArrayList<>();
    private final List<VariableUsage> variableUsages = new ArrayList<>();

    private final List<Function> functionPrototypes = new ArrayList<>();
    private final List<Function> functionDefinitions = new ArrayList<>();

    private final List<TypeDeclaration> typeDeclarations = new ArrayList<>();
    private final List<TypeUsage> typeusages = new ArrayList<>();

    private int startIndex;
    private int endIndex;

    //
    //parent--------------------------------------------------------------------
    //
    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    //
    //children------------------------------------------------------------------
    //
    public Scope getChild(int index) {
        return children.get(index);
    }

    public void addChild(Scope scope) {
        children.add(scope);
    }

    public int getChildCount() {
        return children.size();
    }

    public List<? extends Scope> getScopes() {
        return Collections.unmodifiableList(children);
    }

    //
    //variables-----------------------------------------------------------------
    //
    public VariableDeclaration getVariable(int index) {
        return variableDeclarations.get(index);
    }

    public void addVariable(VariableDeclaration var) {
        variableDeclarations.add(var);
    }

    public int getVariableCount() {
        return variableDeclarations.size();
    }

    public List<? extends VariableDeclaration> getVariables() {
        return Collections.unmodifiableList(variableDeclarations);
    }

    //
    //variable usages-----------------------------------------------------------
    //
    public VariableUsage getVariableUsage(int index) {
        return variableUsages.get(index);
    }

    public void addVariableUsage(VariableUsage var) {
        variableUsages.add(var);
    }

    public int getVariableUsageCount() {
        return variableUsages.size();
    }

    public List<? extends VariableUsage> getVariableUsages() {
        return Collections.unmodifiableList(variableUsages);
    }

    //
    //function prototypes-------------------------------------------------------
    //
    public Function getFunctionPrototype(int index) {
        return functionPrototypes.get(index);
    }

    public void addFunctionPrototype(Function func) {
        functionPrototypes.add(func);
    }

    public int getFunctionPrototypeCount() {
        return functionPrototypes.size();
    }

    public List<? extends Function> getFunctionPrototypes() {
        return Collections.unmodifiableList(functionPrototypes);
    }

    //
    //function definitions------------------------------------------------------
    //
    public Function getFunctionDefinition(int index) {
        return functionDefinitions.get(index);
    }

    public void addFunctionDefinition(Function func) {
        functionDefinitions.add(func);
    }

    public int getFunctionDefinitionCount() {
        return functionDefinitions.size();
    }

    public List<? extends Function> getFunctionDefinitions() {
        return Collections.unmodifiableList(functionDefinitions);
    }

    //
    //type declarations---------------------------------------------------------
    //
    public TypeDeclaration getTypeDeclaration(int index) {
        return typeDeclarations.get(index);
    }

    public void addTypeDeclaration(TypeDeclaration type) {
        typeDeclarations.add(type);
    }

    public int getTypeDeclarationCount() {
        return typeDeclarations.size();
    }

    public List<? extends TypeDeclaration> getTypeDeclarations() {
        return Collections.unmodifiableList(typeDeclarations);
    }

    //
    //type usages---------------------------------------------------------------
    //
    public TypeUsage getTypeUsage(int index) {
        return typeusages.get(index);
    }

    public void addTypeUsage(TypeUsage type) {
        typeusages.add(type);
    }

    public int getTypeUsageCount() {
        return typeusages.size();
    }

    public List<? extends TypeUsage> getTypeUsages() {
        return Collections.unmodifiableList(typeusages);
    }

    //
    //indices-------------------------------------------------------------------
    //
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
