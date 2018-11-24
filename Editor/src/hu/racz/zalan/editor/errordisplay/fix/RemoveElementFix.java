package hu.racz.zalan.editor.errordisplay.fix;

import org.netbeans.spi.editor.hints.*;

public class RemoveElementFix extends GlslErrorFix {

    private int startIndex;
    private int stopIndex;

    public RemoveElementFix(int startIndex, int stopIndex, String text) {
        setStartIndex(startIndex);
        setStopIndex(stopIndex);
        setText(text);
    }

    @Override
    public ChangeInfo implement() throws Exception {
        getDocument().remove(startIndex, stopIndex - startIndex);
        return null;
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
