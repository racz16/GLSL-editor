package hu.racz.zalan.editor.core.scope;

import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

public class Keyword extends Element implements CompletionElement {

    private static final ImageIcon ICON = new ImageIcon(ImageUtilities.loadImage("hu/racz/zalan/editor/core/scope/res/keyword.png"));

    public Keyword(String name) {
        setName(name);
    }

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

}
