package hu.racz.zalan.editor.errordisplay.scope;

import java.util.ArrayList;
import java.util.List;

public class Function extends Element {

    private String returnType;
    private String name;
    private final List<Variable> parameters = new ArrayList<>();

    private int signatureEnd;

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String type) {
        this.returnType = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Variable getParameter(int index) {
        return parameters.get(index);
    }

    public void addParameter(Variable par) {
        parameters.add(par);
    }

    public int getParameterCount() {
        return parameters.size();
    }

    public int getSignatureEnd() {
        return signatureEnd;
    }

    public void setSignatureEnd(int se) {
        this.signatureEnd = se;
    }

    public boolean equalsSignature(Function fs) {
        if (!name.equals(fs.name) || parameters.size() != fs.parameters.size()) {
            return false;
        }
        for (int i = 0; i < parameters.size(); i++) {
            if (!parameters.get(i).getType().equals(fs.parameters.get(i).getType())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        Function fs = (Function) obj;
        return equalsSignature(fs) && returnType.equals(fs.returnType);
    }

    @Override
    public String toString() {
        String ret = returnType + " " + name + "(";
        for (int i = 0; i < parameters.size(); i++) {
            Variable param = parameters.get(i);
            ret += param.getType() + " " + param.getName();
            if (i != parameters.size() - 1) {
                ret += ", ";
            }
        }
        ret += ")";
        return ret;
    }

}
