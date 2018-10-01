package hu.racz.zalan.editor.core.scope.variable;

import hu.racz.zalan.editor.core.scope.*;
import java.util.*;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class VariableDeclaration extends Element implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/variable.png"));
    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/bi_variable.png"));
    private static final ImageIcon GL_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/gl_variable.png"));

    private boolean builtIn;
    private boolean global;
    private boolean array;
    //TODO: type ne string legyen, hanem TypeUsage
    private String type = "";

    private final List<VariableUsage> usages = new ArrayList<>();

    public VariableDeclaration(String type, String name, boolean builtIn, boolean array) {
        this(type, name, builtIn);
        setArray(array);
    }

    public VariableDeclaration(String type, String name, boolean builtIn) {
        setType(type);
        setName(name);
        setBuiltIn(builtIn);
    }

    public VariableDeclaration(String type, String name) {
        setType(type);
        setName(name);
    }

    public VariableDeclaration() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public boolean isGlobal() {
        return global;
    }

    public void setGlobal(boolean global) {
        this.global = global;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public int getUsageCount() {
        return usages.size();
    }

    public VariableUsage getUsage(int i) {
        return usages.get(i);
    }

    public void addUsage(VariableUsage vu) {
        usages.add(vu);
    }

    public List<VariableUsage> getUsages() {
        return Collections.unmodifiableList(usages);
    }

    @Override
    public ImageIcon getIcon() {
        return isBuiltIn() ? BI_ICON : isGlobal() ? GL_ICON : ICON;
    }

    @Override
    public int getPriority() {
        return isBuiltIn() ? BI_VARIABLE_PRIORITY : VARIABLE_PRIORITY;
    }

    @Override
    public String getRightText() {
        return getType() + (isArray() ? "[]" : "");
    }

    @Override
    public String getDocumentationName() {
        return isBuiltIn() ? getName() : null;
    }

    @Override
    public String getLeftText() {
        return getName();
    }

    @Override
    public String getPasteText() {
        return getName();
    }

}
