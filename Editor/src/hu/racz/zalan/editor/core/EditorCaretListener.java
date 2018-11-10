package hu.racz.zalan.editor.core;

import javax.swing.event.*;

public class EditorCaretListener implements CaretListener {

    private int caretPosition;

    @Override
    public void caretUpdate(CaretEvent e) {
        caretPosition = e.getDot();
    }

    public int getCaretPosition() {
        return caretPosition;
    }

}
