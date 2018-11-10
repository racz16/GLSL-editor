package hu.racz.zalan.editor.core.scope.qualifier;

import hu.racz.zalan.editor.core.scope.Builtin;
import hu.racz.zalan.editor.core.scope.CompletionElement;
import java.util.*;
import javax.swing.*;
import org.openide.util.*;

public class Qualifier implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/keyword.png"));

    private String name;
    private final List<QualifierUsage> usages = new ArrayList<>();

    public Qualifier(String name) {
        setName(name);
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
    //usages--------------------------------------------------------------------
    //
    public void addUsage(QualifierUsage usage) {
        usages.add(usage);
    }

    public List<QualifierUsage> getUsages() {
        return Collections.unmodifiableList(usages);
    }

    //
    //--------------------------------------------------------------------------
    //
    public boolean isCompatibleWith(Qualifier qualifier) {
        if (this == qualifier) {
            return false;
        }
        return isCompatibleWithUnsafe(qualifier);
    }

    private boolean isCompatibleWithUnsafe(Qualifier qualifier) {
        for (Set<Qualifier> qs : Builtin.getQualifierRules()) {
            if (qs.contains(this) && qs.contains(qualifier)) {
                return false;
            }
        }
        return true;
    }

    //
    //completion----------------------------------------------------------------
    //
    @Override
    public ImageIcon getIcon() {
        return ICON;
    }

    @Override
    public int getPriority() {
        return KEYWORD_PRIORITY;
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
        return getName();
    }

    @Override
    public String getDocumentationName() {
        return null;
    }

    //
    //misc----------------------------------------------------------------------
    //
    @Override
    public boolean equals(Object o) {
        Qualifier q = (Qualifier) o;
        return getName().equals(q.getName());
    }

    @Override
    public String toString() {
        return getName();
    }

}
