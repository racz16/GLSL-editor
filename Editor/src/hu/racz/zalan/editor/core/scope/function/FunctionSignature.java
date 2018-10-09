package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;

public class FunctionSignature extends Element {

    private int nameStartIndex;
    private int nameStopIndex;
    private final List<VariableDeclaration> parameters = new ArrayList<>();

    public int getNameStartIndex() {
        return nameStartIndex;
    }

    public void setNameStartIndex(int nameStartIndex) {
        this.nameStartIndex = nameStartIndex;
    }

    public int getNameStopIndex() {
        return nameStopIndex;
    }

    public void setNameStopIndex(int nameStopIndex) {
        this.nameStopIndex = nameStopIndex;
    }

    public VariableDeclaration getParameter(int index) {
        return parameters.get(index);
    }

    public void addParameter(VariableDeclaration par) {
        parameters.add(par);
    }

    public int getParameterCount() {
        return parameters.size();
    }

    public List<VariableDeclaration> getParameters() {
        return Collections.unmodifiableList(parameters);
    }

    public String toStringReplaceParameters(String replace) {
        return getName() + "(" + replace + ")";
    }

    public boolean equals(Object obj) {
        FunctionSignature fs = (FunctionSignature) obj;
        if (!getName().equals(fs.getName()) || parameters.size() != fs.parameters.size()) {
            return false;
        }
        for (int i = 0; i < parameters.size(); i++) {
            if (!parameters.get(i).getTypeOLD().equals(fs.parameters.get(i).getTypeOLD())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String ret = getName() + "(";
        for (int i = 0; i < parameters.size(); i++) {
            VariableDeclaration param = parameters.get(i);
            ret += param.getTypeOLD() + " " + param.getName();
            if (i != parameters.size() - 1) {
                ret += ", ";
            }
        }
        ret += ")";
        return ret;
    }
}
