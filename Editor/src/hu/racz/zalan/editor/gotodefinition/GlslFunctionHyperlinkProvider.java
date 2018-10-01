package hu.racz.zalan.editor.gotodefinition;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import java.lang.ref.*;
import javax.swing.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.lib.editor.hyperlink.spi.*;
import org.netbeans.modules.editor.*;
import org.openide.cookies.*;
import org.openide.loaders.*;

@MimeRegistration(mimeType = "text/x-glsl", service = HyperlinkProvider.class)
public class GlslFunctionHyperlinkProvider implements HyperlinkProvider {

    private Function func;

    @Override
    public boolean isHyperlinkPoint(Document doc, int offset) {
        return verifyState(doc, offset);
    }

    public boolean verifyState(Document doc, int caret) {
        Scope scope = GlslProcessor.getRootScope();
        if (scope == null) {
            return false;
        }
        for (Function fd : scope.getFunctionDefinitions()) {
            if (fd.getNameStartIndex() <= caret && fd.getNameStopIndex() >= caret && fd.getUsageCount() > 0) {
                func = fd;
                return true;
            }
        }
        return false;
    }

    @Override
    public int[] getHyperlinkSpan(Document document, int offset) {
        if (verifyState(document, offset)) {
            return new int[]{func.getNameStartIndex(), func.getNameStopIndex()};
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
                    //kell ez az ellenőrzés? nem ellenőrzöm már a verify-ban?
                    if (func.getUsages().size() > 0) {
                        comp.setCaretPosition(func.getUsage(0).getNameStartIndex());
                    }
                }
            }
        }
    }

}
