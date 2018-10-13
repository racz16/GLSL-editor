package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;

public class Scope {

    private Scope parent;
    private final List<Scope> children = new ArrayList<>();

    private static final List<Scope> BRACELESS_SCOPES = new ArrayList<>();

    //TODO: lehet, hogy ezeket érdemes volna egy mapba rakni
    private final List<VariableDeclaration> variableDeclarations = new ArrayList<>();
    private final List<VariableUsage> variableUsages = new ArrayList<>();

    private final List<FunctionPrototype> functionPrototypes = new ArrayList<>();
    private final List<FunctionDefinition> functionDefinitions = new ArrayList<>();

    private final List<TypeDeclaration> typeDeclarations = new ArrayList<>();
    private final List<TypeUsage> typeusages = new ArrayList<>();

    private int startIndex;
    private int stopIndex;

    public static void clearBracelessScopes() {
        BRACELESS_SCOPES.clear();
    }

    public static Scope getBracelessScope(int index) {
        return BRACELESS_SCOPES.get(index);
    }

    public static void addBracelessScope(Scope scope) {
        BRACELESS_SCOPES.add(scope);
    }

    public static int getBracelessScopedCount() {
        return BRACELESS_SCOPES.size();
    }

    public static List<? extends Scope> getBracelessScopes() {
        return Collections.unmodifiableList(BRACELESS_SCOPES);
    }

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
    //variable declarations-----------------------------------------------------
    //
    public VariableDeclaration getVariableDeclaration(int index) {
        return variableDeclarations.get(index);
    }

    public void addVariableDeclaration(VariableDeclaration var) {
        variableDeclarations.add(var);
    }

    public int getVariableDeclarationCount() {
        return variableDeclarations.size();
    }

    public List<? extends VariableDeclaration> getVariableDeclarations() {
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
    public FunctionPrototype getFunctionPrototype(int index) {
        return functionPrototypes.get(index);
    }

    public void addFunctionPrototype(FunctionPrototype func) {
        functionPrototypes.add(func);
    }

    public int getFunctionPrototypeCount() {
        return functionPrototypes.size();
    }

    public List<? extends FunctionPrototype> getFunctionPrototypes() {
        return Collections.unmodifiableList(functionPrototypes);
    }

    //
    //function definitions------------------------------------------------------
    //
    public FunctionDefinition getFunctionDefinition(int index) {
        return functionDefinitions.get(index);
    }

    public void addFunctionDefinition(FunctionDefinition func) {
        functionDefinitions.add(func);
    }

    public int getFunctionDefinitionCount() {
        return functionDefinitions.size();
    }

    public List<? extends FunctionDefinition> getFunctionDefinitions() {
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

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int endIndex) {
        this.stopIndex = endIndex;
    }

}
