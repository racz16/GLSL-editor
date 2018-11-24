package hu.racz.zalan.editor.errordisplay.fix;

import javax.swing.text.*;
import org.netbeans.spi.editor.hints.*;

public abstract class GlslErrorFix implements Fix {

    private String text = "";
    private Document document;

    @Override
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

}
