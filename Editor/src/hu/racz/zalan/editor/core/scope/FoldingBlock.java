package hu.racz.zalan.editor.core.scope;

import hu.racz.zalan.editor.folding.*;

public class FoldingBlock {

    private FoldingType foldingType;
    private int startIndex;
    private int stopIndex;

    public FoldingBlock(FoldingType foldingType, int startIndex, int stopIndex) {
        this.foldingType = foldingType;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public FoldingType getFoldingType() {
        return foldingType;
    }

    public void setFoldingType(FoldingType foldingType) {
        this.foldingType = foldingType;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

}
