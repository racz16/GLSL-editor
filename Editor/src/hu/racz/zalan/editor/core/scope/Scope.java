package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import hu.racz.zalan.editor.errordisplay.*;
import java.util.*;

public class Scope {

    private Scope parent;
    private final List<Scope> children = new ArrayList<>();

    private static final List<FoldingBlock> FOLDING_BLOCKS = new ArrayList<>();
    private static final List<Scope> BRACELESS_SCOPES = new ArrayList<>();
    private static final List<UniqueSyntaxError> ERRORS = new ArrayList<>();
    private static final List<String> MACRO_DEFINITIONS = new ArrayList<>();

    //functions
    private static final List<Function> FUNCTIONS = new ArrayList<>();
    private static final List<FunctionPrototype> FUNCTION_PROTOTYPES = new ArrayList<>();
    private static final List<FunctionDefinition> FUNCTION_DEFINITIONS = new ArrayList<>();
    private final List<FunctionCall> functionCalls = new ArrayList<>();

    //variables
    private final List<VariableDeclaration> variableDeclarations = new ArrayList<>();
    private final List<VariableUsage> variableUsages = new ArrayList<>();

    //types
    private final List<TypeDeclaration> typeDeclarations = new ArrayList<>();
    private final List<TypeUsage> typeusages = new ArrayList<>();

    //indices
    private int startIndex;
    private int stopIndex;

    public static void clearErrorss() {
        ERRORS.clear();
    }

    public static void addError(UniqueSyntaxError error) {
        ERRORS.add(error);
    }

    public static List<? extends UniqueSyntaxError> getErrors() {
        return Collections.unmodifiableList(ERRORS);
    }

    public static void clearBracelessScopes() {
        BRACELESS_SCOPES.clear();
    }

    public static void addBracelessScope(Scope scope) {
        BRACELESS_SCOPES.add(scope);
    }

    public static List<? extends Scope> getBracelessScopes() {
        return Collections.unmodifiableList(BRACELESS_SCOPES);
    }

    public static void clearFoldingBlocks() {
        FOLDING_BLOCKS.clear();
    }

    public static void addFoldingBlock(FoldingBlock fb) {
        FOLDING_BLOCKS.add(fb);
    }

    public static List<? extends FoldingBlock> getFoldingBlocks() {
        return Collections.unmodifiableList(FOLDING_BLOCKS);
    }

    public static void clearMacroDefinitions() {
        MACRO_DEFINITIONS.clear();
    }

    public static void addMacroDefinition(String macroDefinition) {
        MACRO_DEFINITIONS.add(macroDefinition);
    }

    public static List<String> getMacroDefinitions() {
        return Collections.unmodifiableList(MACRO_DEFINITIONS);
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
    public void addChild(Scope scope) {
        children.add(scope);
    }

    public List<? extends Scope> getScopes() {
        return Collections.unmodifiableList(children);
    }

    //
    //variable declarations-----------------------------------------------------
    //
    public void addVariableDeclaration(VariableDeclaration var) {
        variableDeclarations.add(var);
    }

    public List<? extends VariableDeclaration> getVariableDeclarations() {
        return Collections.unmodifiableList(variableDeclarations);
    }

    //
    //variable usages-----------------------------------------------------------
    //
    public void addVariableUsage(VariableUsage var) {
        variableUsages.add(var);
    }

    public List<? extends VariableUsage> getVariableUsages() {
        return Collections.unmodifiableList(variableUsages);
    }

    //
    //functions-----------------------------------------------------------------
    //
    public static void addFunctionPrototype(FunctionPrototype func) {
        FUNCTION_PROTOTYPES.add(func);
    }

    public static List<? extends FunctionPrototype> getFunctionPrototypes() {
        return Collections.unmodifiableList(FUNCTION_PROTOTYPES);
    }

    public static void clearFunctionPrototypes() {
        FUNCTION_PROTOTYPES.clear();
    }

    public static void addFunctionDefinition(FunctionDefinition func) {
        FUNCTION_DEFINITIONS.add(func);
    }

    public static List<? extends FunctionDefinition> getFunctionDefinitions() {
        return Collections.unmodifiableList(FUNCTION_DEFINITIONS);
    }

    public static void clearFunctionDefinitions() {
        FUNCTION_DEFINITIONS.clear();
    }

    public static void addFunction(Function func) {
        FUNCTIONS.add(func);
    }

    public static List<Function> getFunctions() {
        return Collections.unmodifiableList(FUNCTIONS);
    }

    public static void clearFunctions() {
        FUNCTIONS.clear();
    }

    public void addFunctionCall(FunctionCall fc) {
        functionCalls.add(fc);
    }

    public List<FunctionCall> getFunctionCalls() {
        return Collections.unmodifiableList(functionCalls);
    }

    //
    //type declarations---------------------------------------------------------
    //
    public void addTypeDeclaration(TypeDeclaration type) {
        typeDeclarations.add(type);
    }

    public List<? extends TypeDeclaration> getTypeDeclarations() {
        return Collections.unmodifiableList(typeDeclarations);
    }

    //
    //type usages---------------------------------------------------------------
    //
    public void addTypeUsage(TypeUsage type) {
        typeusages.add(type);
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
