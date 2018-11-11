package hu.racz.zalan.editor.core.scope;

import org.netbeans.api.editor.fold.*;

public class FoldingBlock {

    private final FoldingType foldingType;
    private final int startIndex;
    private final int stopIndex;

    public FoldingBlock(FoldingType foldingType, int startIndex, int stopIndex) {
        this.foldingType = foldingType;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public FoldingType getFoldingType() {
        return foldingType;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

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

}
