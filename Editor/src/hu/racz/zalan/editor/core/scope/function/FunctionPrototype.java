package hu.racz.zalan.editor.core.scope.function;

import hu.racz.zalan.editor.core.scope.*;
import static hu.racz.zalan.editor.core.scope.CompletionElement.BI_FUNCTION_PRIORITY;
import static hu.racz.zalan.editor.core.scope.CompletionElement.FUNCTION_PRIORITY;
import javax.swing.*;
import org.openide.util.*;

public class FunctionPrototype extends FunctionBase implements CompletionElement {

    private FunctionDefinition definition;

    //TODO: ide majd jönnek a haszálatok
    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/function.png"));
    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/bi_function.png"));

    private boolean builtIn;
    private String builtInParameters;

    public String getBuiltInParameters() {
        return builtInParameters;
    }

    public void setBuiltInParameters(String builtInParameters) {
        this.builtInParameters = builtInParameters;
    }

    public FunctionDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(FunctionDefinition definition) {
        this.definition = definition;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
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
        return toStringSignature(true);
    }

    @Override
    public String getRightText() {
        return getReturnType().getName();
    }

    @Override
    public String getPasteText() {
        return toStringSignature(false);
    }

    @Override
    public String getDocumentationName() {
        return isBuiltIn() ? getName() : null;
    }

    public boolean isPrototypeOf(FunctionDefinition fd) {
        return equalsSignature(fd) && getReturnType().equals(fd.getReturnType());
    }

    @Override
    public String toStringSignature(boolean showParameters) {
        if (!isBuiltIn()) {
            return super.toStringSignature(showParameters);
        } else {
            return getName() + "(" + (showParameters ? getBuiltInParameters() : "") + ")";
        }
    }

}
