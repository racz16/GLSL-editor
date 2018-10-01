package hu.racz.zalan.editor.core.scope;

import javax.swing.*;

public interface CompletionElement {

    public static final int VARIABLE_PRIORITY = 0;
    public static final int FUNCTION_PRIORITY = 1;
    public static final int TYPE_PRIORITY = 2;
    public static final int KEYWORD_PRIORITY = 3;
    public static final int BI_VARIABLE_PRIORITY = 4;
    public static final int BI_FUNCTION_PRIORITY = 5;

    public abstract ImageIcon getIcon();

    public abstract int getPriority();

    public String getLeftText();

    public String getRightText();

    public String getPasteText();

    public String getDocumentationName();
}
