package hu.racz.zalan.editor.errordisplay.fix;

import javax.swing.text.*;
import org.netbeans.spi.editor.hints.*;

public class RemoveElementFix implements Fix {

    private final int start;
    private final int end;
    private final String text;
    private final Document document;

    public RemoveElementFix(Document document, int start, int end, String text) {
        this.document = document;
        this.start = start;
        this.end = end;
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public ChangeInfo implement() throws Exception {
        document.remove(start, end - start);
        return null;
    }

}
