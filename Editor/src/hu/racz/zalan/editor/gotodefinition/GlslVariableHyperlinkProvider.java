package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.lang.ref.*;
import javax.swing.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;
import org.netbeans.modules.editor.*;
import org.openide.cookies.*;
import org.openide.loaders.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HyperlinkProvider.class)
public class GlslVariableHyperlinkProvider implements HyperlinkProvider {

    private VariableUsage usage;

    @Override
    public boolean isHyperlinkPoint(Document doc, int offset) {
        return verifyState(doc, offset);
    }

    public boolean verifyState(Document doc, int caret) {
        Scope scope = GlslProcessor.getCaretScope(caret);
        if (scope == null) {
            return false;
        }
        for (VariableUsage vu : scope.getVariableUsages()) {
            if (vu.getStartIndex() <= caret && vu.getStopIndex() >= caret && vu.getDeclaration() != null) {
                usage = vu;
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getHyperlinkSpan(Document document, int offset) {
        if (verifyState(document, offset)) {
            return new int[]{usage.getStartIndex(), usage.getStopIndex()};
        } else {
            return null;
        }
    }

    @Override
    public void performClickAction(Document document, int offset) {
        if (verifyState(document, offset)) {
            WeakReference<Document> weakDoc = new WeakReference<>((Document) document);
            DataObject dobj = NbEditorUtilities.getDataObject(weakDoc.get());
            if (dobj != null) {
                EditorCookie pane = dobj.getLookup().lookup(EditorCookie.class);
                JEditorPane[] panes = pane.getOpenedPanes();
                if (panes != null && panes.length > 0) {
                    JTextComponent comp = panes[0];
                    comp.setCaretPosition(usage.getDeclaration().getStartIndex());
                }
            }
        }
    }

}
