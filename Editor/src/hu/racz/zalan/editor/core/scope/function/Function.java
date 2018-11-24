package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;
import static hu.racz.zalan.editor.core.scope.CompletionElement.BI_FUNCTION_PRIORITY;
import static hu.racz.zalan.editor.core.scope.CompletionElement.FUNCTION_PRIORITY;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import javax.swing.*;
import org.openide.util.*;

public class Function implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/function.png"));
    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/bi_function.png"));

    private TypeUsage returnType;
    private String name;
    private final List<VariableDeclaration> parameters = new ArrayList<>();
    private boolean builtIn;
    private boolean constructor;

    private final List<FunctionPrototype> prototypes = new ArrayList<>();
    private final List<FunctionCall> calls = new ArrayList<>();
    private FunctionDefinition definition;

    //
    //builtin-------------------------------------------------------------------
    //
    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public boolean isConstructor() {
        return constructor;
    }

    public void setConstructor(boolean constructor) {
        this.constructor = constructor;
    }

    //
    //return type---------------------------------------------------------------
    //
    public TypeUsage getReturnType() {
        return returnType;
    }

    public void setReturnType(TypeUsage returnType) {
        this.returnType = returnType;
    }

    //
    //name----------------------------------------------------------------------
    //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //
    //parameters----------------------------------------------------------------
    //
    public void addParameter(VariableDeclaration parameter) {
        parameters.add(parameter);
    }

    public List<VariableDeclaration> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    //
    //definition, protoypes, calls----------------------------------------------
    //
    public FunctionDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(FunctionDefinition definition) {
        this.definition = definition;
    }

    public void addPrototype(FunctionPrototype prototype) {
        this.prototypes.add(prototype);
    }

    public List<FunctionPrototype> getPrototypes() {
        return Collections.unmodifiableList(prototypes);
    }

    public void addCall(FunctionCall prototype) {
        this.calls.add(prototype);
    }

    public List<FunctionCall> getCalls() {
        return Collections.unmodifiableList(calls);
    }

    //
    //completion----------------------------------------------------------------
    //
    @Override
    public ImageIcon getIcon() {
        return isBuiltIn() ? BI_ICON : ICON;
    }

    @Override
    public int getPriority() {
        return isBuiltIn() ? BI_FUNCTION_PRIORITY : FUNCTION_PRIORITY;
    }

    @Override
    public String getLeftText() {
        return toStringSignature(true);
    }

    @Override
    public String getRightText() {
        return getReturnType().toString();
    }

    @Override
    public String getPasteText() {
        return toStringSignature(false);
    }

    @Override
    public String getDocumentationName() {
        return isBuiltIn() ? getName() : null;
    }

    //
    //misc----------------------------------------------------------------------
    //
    @Override
    public boolean equals(Object obj) {
        Function fb = (Function) obj;
        return equalsSignature(fb) && returnType.equals(fb.getReturnType());
    }

    public boolean equalsSignature(Function f) {
        if (!getName().equals(f.getName()) || parameters.size() != f.parameters.size()) {
            return false;
        }
        return equalsParameters(f);
    }

    private boolean equalsParameters(Function function) {
        for (int i = 0; i < parameters.size(); i++) {
            if (!parameters.get(i).getType().equals(function.parameters.get(i).getType())) {
                return false;
            }
        }
        return true;
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
