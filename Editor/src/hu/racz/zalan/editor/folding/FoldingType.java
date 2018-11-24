package hu.racz.zalan.editor.folding;

import org.netbeans.api.editor.fold.*;

public enum FoldingType {
    BLOCK(false, FoldTemplate.DEFAULT_BLOCK, null, FoldType.CODE_BLOCK),
    COMMENT(true, FoldTemplate.DEFAULT, "comment", FoldType.COMMENT);

    private final Boolean collapsed;
    private final FoldTemplate foldTemplate;
    private final String textLabel;
    private final FoldType foldType;

    private FoldingType(boolean collapsed, FoldTemplate foldTemplate, String textLabel, FoldType foldType) {
        this.collapsed = collapsed;
        this.foldTemplate = foldTemplate;
        this.textLabel = textLabel;
        this.foldType = foldType;
    }

    public Boolean isCollapsed() {
        return collapsed;
    }

    public FoldTemplate getFoldTemplate() {
        return foldTemplate;
    }

    public String getTextLabel() {
        return textLabel;
    }

    public FoldType getFoldType() {
        return foldType;
    }

}
