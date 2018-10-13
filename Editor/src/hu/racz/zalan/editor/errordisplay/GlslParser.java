package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import javax.swing.event.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.modules.parsing.spi.Parser;

public class GlslParser extends Parser {

    private Snapshot snapshot;

    public static class CaretListener2 implements CaretListener {

        public static int CARET_POSITION;

        @Override
        public void caretUpdate(CaretEvent e) {
            CARET_POSITION = e.getDot();
            System.out.println(CARET_POSITION);
        }

    }

    boolean added;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
        if (!added) {
            org.netbeans.api.editor.EditorRegistry.lastFocusedComponent().addCaretListener(new CaretListener2());
            added = false;
        }

        this.snapshot = snpsht;
        //TODO: várni párszár millisec-et, hogy gyors gépelésnél ne járjuk be az egész fát minden karakterre
        //de mondjuk azért néha jó lenne azonnal
        //  - pl. ha még nem volt soha futtatva, nehogy valami nullptr exception legyen
        //  - vagy a code completionnál, mert ha megállunk a gépeléssel, a code completion még a régi adatokat kapta a parsertől
        //          és utána már hiába van meg a friss a parsernél, a code completion nem fogja újra megkérdezni, amíg nem ütünk 
        //          egy új karaktert
        GlslProcessor.setText(snpsht.getText().toString());
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

    public static class GlslEditorParserResult extends Result {

        GlslEditorParserResult(Snapshot snapshot) {
            super(snapshot);
        }

        public AntlrGlslParser getGlslParser() throws ParseException {
            return GlslProcessor.getParser();
        }

        @Override
        protected void invalidate() {

        }
    }

}
