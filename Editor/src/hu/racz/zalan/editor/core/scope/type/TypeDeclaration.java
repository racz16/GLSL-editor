package hu.racz.zalan.editor.core.scope.type;

import hu.racz.zalan.editor.core.scope.CompletionElement;
import hu.racz.zalan.editor.core.scope.Element;
import java.util.*;
import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class TypeDeclaration extends Element implements CompletionElement {

    private static final ImageIcon BI_ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/bi_type.png"));
    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/type.png"));

    private boolean builtIn;
    private int structStopIndex;

    private final List<TypeUsage> usages = new ArrayList<>();

    public TypeDeclaration(String name) {
        setName(name);
    }

    public TypeDeclaration(String name, boolean builtIn) {
        setName(name);
        setBuiltIn(builtIn);
    }

    public boolean isBuiltIn() {
        return builtIn;
    }

    public void setBuiltIn(boolean builtIn) {
        this.builtIn = builtIn;
    }

    public int getStructStopIndex() {
        return structStopIndex;
    }

    public void setStructStopIndex(int structStopIndex) {
        this.structStopIndex = structStopIndex;
    }

    public int getUsageCount() {
        return usages.size();
    }

    public TypeUsage getUsage(int i) {
        return usages.get(i);
    }

    public void addUsage(TypeUsage vu) {
        usages.add(vu);
    }

    public List<TypeUsage> getUsages() {
        return Collections.unmodifiableList(usages);
    }

    @Override
    public ImageIcon getIcon() {
        return isBuiltIn() ? BI_ICON : ICON;
    }

    @Override
    public int getPriority() {
        return TYPE_PRIORITY;
    }

    @Override
    public String getLeftText() {
        return getName();
    }

    @Override
    public String getRightText() {
        return null;
    }

    @Override
    public String getPasteText() {
        return getName() + " ";
    }

    @Override
    public String getDocumentationName() {
        return null;
    }

}
