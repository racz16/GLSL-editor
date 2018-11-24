package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import java.util.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.*;
import org.netbeans.modules.csl.spi.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.modules.parsing.spi.Parser;

public class GlslParser extends Parser {

    private Snapshot snapshot;
    private static EditorCaretListener caretListener;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        JTextComponent lastFocused = EditorRegistry.lastFocusedComponent();
        if (caretListener == null && lastFocused != null) {
            caretListener = new EditorCaretListener();
            lastFocused.addCaretListener(caretListener);
        }
        this.snapshot = snpsht;
        GlslProcessor.setText(snpsht.getText().toString());
    }

    public static EditorCaretListener getCaretListener() {
        return caretListener;
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return new GlslEditorParserResult(snapshot);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {

    }

    @Override
    public void removeChangeListener(ChangeListener cl) {

    }

    public static class GlslEditorParserResult extends ParserResult {

        GlslEditorParserResult(Snapshot snapshot) {
            super(snapshot);
        }

        public AntlrGlslParser getGlslParser() throws ParseException {
            return GlslProcessor.getParser();
        }

        @Override
        protected void invalidate() {

        }

        @Override
        public List<? extends org.netbeans.modules.csl.api.Error> getDiagnostics() {
            return new ArrayList<>();
        }
    }

    public class EditorCaretListener implements CaretListener {

        private int caretPosition;

        private EditorCaretListener() {
        }

        @Override
        public void caretUpdate(CaretEvent e) {
            caretPosition = e.getDot();
        }

        public int getCaretPosition() {
            return caretPosition;
        }

    }

}
