package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.core.scope.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.completion.*;
import org.netbeans.spi.editor.completion.*;
import org.netbeans.spi.editor.completion.support.*;
import org.openide.util.*;

public class GlslCompletionItem implements CompletionItem {

    private final static Color BACKGROUND = Color.WHITE;
    private final static Color SELECTED_BACKGROUND = Color.decode("0x0000B2");

    private final CompletionElement element;
    private final int filterLength;
    private final int caretPosition;

    public GlslCompletionItem(CompletionElement element, int filterLength, int caretPosition) {
        this.element = element;
        this.filterLength = filterLength;
        this.caretPosition = caretPosition;
    }

    @Override
    public void defaultAction(JTextComponent jtc) {
        try {
            insertCompletionText(jtc);
            Completion.get().hideAll();
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private void insertCompletionText(JTextComponent jtc) throws BadLocationException {
        StyledDocument doc = (StyledDocument) jtc.getDocument();
        doc.remove(caretPosition - filterLength, filterLength);
        doc.insertString(caretPosition - filterLength, element.getPasteText(), null);
    }

    @Override
    public void processKeyEvent(KeyEvent ke) {

    }

    @Override
    public int getPreferredWidth(Graphics graphics, Font font) {
        return CompletionUtilities.getPreferredWidth(element.getLeftText(), element.getRightText(), graphics, font);
    }

    @Override
    public void render(Graphics g, Font defaultFont, Color color, Color color1, int width, int height, boolean selected) {
        CompletionUtilities.renderHtml(element.getIcon(), element.getLeftText(), element.getRightText(), g, defaultFont, (selected ? BACKGROUND : SELECTED_BACKGROUND), width, height, selected);
    }

    @Override
    public CompletionTask createDocumentationTask() {
        if (element.getDocumentationName() == null) {
            return null;
        }
        return new AsyncCompletionTask(new GlslAsyncCompletionItemQuery());
    }

    @Override
    public CompletionTask createToolTipTask() {
        return null;
    }

    @Override
    public boolean instantSubstitution(JTextComponent jtc) {
        return false;
    }

    @Override
    public int getSortPriority() {
        return element.getPriority();
    }

    @Override
    public CharSequence getSortText() {
        return element.getPasteText();
    }

    @Override
    public CharSequence getInsertPrefix() {
        return element.getPasteText();
    }

    private class GlslAsyncCompletionItemQuery extends AsyncCompletionQuery {

        @Override
        protected void query(CompletionResultSet completionResultSet, Document document, int i) {
            completionResultSet.setDocumentation(new GlslCompletionDocumentation(element.getDocumentationName()));
            completionResultSet.finish();
        }
    }

}
