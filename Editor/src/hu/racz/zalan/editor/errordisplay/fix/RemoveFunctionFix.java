package hu.racz.zalan.editor.errordisplay.fix;

import javax.swing.text.*;
import org.netbeans.spi.editor.hints.*;

public class RemoveFunctionFix implements Fix {

    private final int start;
    private final int end;
    private final Document document;

    public RemoveFunctionFix(Document document, int start, int end) {
        this.document = document;
        this.start = start;
        this.end = end;
    }

    @Override
    public String getText() {
        return "Remove this function";
    }

    @Override
    public ChangeInfo implement() throws Exception {
        document.remove(start, end - start);
        return null;
    }

}
