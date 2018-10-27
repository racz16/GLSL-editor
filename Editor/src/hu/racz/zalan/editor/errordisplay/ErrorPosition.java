package hu.racz.zalan.editor.errordisplay;

import javax.swing.text.*;

public class ErrorPosition implements Position {

    private final int position;

    public ErrorPosition(int pos) {
        position = pos;
    }

    @Override
    public int getOffset() {
        return position;
    }
}
