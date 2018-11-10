package hu.racz.zalan.editor.core.scope;

import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class Keyword implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/img/keyword.png"));

    private String name = "";

    public Keyword(String name) {
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
    public boolean equals(Object obj) {
        Keyword kw = (Keyword) obj;
        return getName().equals(kw.getName());
    }

    @Override
    public String toString() {
        return getName();
    }
}
