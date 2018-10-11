package hu.racz.zalan.editor.core.scope.variable;

import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
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
    private TypeUsage type;

    private int declarationStartIndex;
    private int declarationStopIndex;

    //TODO: milyen módosítói vannak? pl. readonly, out stb., függvényparamétereknél még jól jöhet
    //TODO: lehetne valami szülő vagy ilyesmi, hogy milyen structban van benne
    //----------------------------------------------------------
    private final List<VariableUsage> usages = new ArrayList<>();

    public VariableDeclaration(TypeUsage type, String name, boolean builtIn, boolean array) {
        this(type, name);
        setArray(array);
        setBuiltIn(builtIn);
    }

    public VariableDeclaration(TypeUsage type, String name) {
        setType(type);
        setName(name);
    }

    public TypeUsage getType() {
        return type;
    }

    public void setType(TypeUsage type) {
        this.type = type;
    }

    public int getDeclarationStartIndex() {
        return declarationStartIndex;
    }

    public void setDeclarationStartIndex(int declarationStartIndex) {
        this.declarationStartIndex = declarationStartIndex;
    }

    public int getDeclarationStopIndex() {
        return declarationStopIndex;
    }

    public void setDeclarationStopIndex(int declarationStopIndex) {
        this.declarationStopIndex = declarationStopIndex;
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

    //
    //usages--------------------------------------------------------------------
    //
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

    //
    //misc----------------------------------------------------------------------
    //
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
        return type.getName() + (isArray() ? "[]" : "");
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
