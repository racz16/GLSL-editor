package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.core.scope.variable.VariableDeclaration;
import java.util.*;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class Function extends Element implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/function.png"));
    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/bi_function.png"));

    private boolean builtIn;
    private boolean hideParameters;
    private String returnType;
    private final List<VariableDeclaration> parameters = new ArrayList<>();

    private int signatureStopIndex;
    private int nameStartIndex;
    private int nameStopIndex;
    private boolean prototype;

    private final List<Function> usages = new ArrayList<>();

    public Function() {
    }

    public Function(String returnType, String name, boolean builtIn) {
        setReturnType(returnType);
        setName(name);
        setBuiltIn(builtIn);
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String type) {
        this.returnType = type;
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

    public int getSignatureStopIndex() {
        return signatureStopIndex;
    }

    public void setSignatureStopIndex(int signatureStopIndex) {
        this.signatureStopIndex = signatureStopIndex;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public boolean isHideParameters() {
        return hideParameters;
    }

    public void setHideParameters(boolean hideParameters) {
        this.hideParameters = hideParameters;
    }

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

    public boolean getPrototype() {
        return prototype;
    }

    public void setPrototype(boolean prototype) {
        this.prototype = prototype;
    }

    public int getUsageCount() {
        return usages.size();
    }

    public Function getUsage(int i) {
        return usages.get(i);
    }

    public void addUsage(Function func) {
        usages.add(func);
    }

    public List<Function> getUsages() {
        return Collections.unmodifiableList(usages);
    }

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
        return isHideParameters() ? toStringSignatureReplaceParameters("...") : toStringSignature();
    }

    @Override
    public String getRightText() {
        return getReturnType();
    }

    @Override
    public String getPasteText() {
        return toStringSignatureReplaceParameters("");
    }

    @Override
    public String getDocumentationName() {
        return isBuiltIn() ? getName() : null;
    }

    public boolean equalsSignature(Function fs) {
        if (!getName().equals(fs.getName()) || parameters.size() != fs.parameters.size()) {
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

    public String toStringSignatureReplaceParameters(String replace) {
        return getName() + "(" + replace + ")";
    }

    public String toStringSignature() {
        String ret = getName() + "(";
        for (int i = 0; i < parameters.size(); i++) {
            VariableDeclaration param = parameters.get(i);
            ret += param.getType() + " " + param.getName();
            if (i != parameters.size() - 1) {
                ret += ", ";
            }
        }
        ret += ")";
        return ret;
    }

    @Override
    public String toString() {
        return returnType + " " + toStringSignature();
    }

}
