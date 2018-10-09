package hu.racz.zalan.editor.core;

import java.lang.ref.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.text.*;
import org.netbeans.modules.editor.*;
import org.openide.cookies.*;
import org.openide.loaders.*;

public class Utility {

    public static void replaceAll(StringBuilder sb, Pattern pattern, String replacement) {
        Matcher m = pattern.matcher(sb);
        int start = 0;
        while (m.find(start)) {
            sb.replace(m.start(), m.end(), replacement);
            start = m.start() + replacement.length();
        }
    }

    public static int getCaretPosition(Document document) {
        return getTextComponent(document).getCaretPosition();
    }

    public static void setCaretPosition(Document document, int position) {
        getTextComponent(document).setCaretPosition(position);
    }

    public static JTextComponent getTextComponent(Document document) {
        WeakReference<Document> weakDoc = new WeakReference<>(document);
        DataObject dobj = NbEditorUtilities.getDataObject(weakDoc.get());
        if (dobj != null) {
            return getTextComponent(dobj);
        }
        return null;
    }

    private static JTextComponent getTextComponent(DataObject dobj) {
        EditorCookie pane = dobj.getLookup().lookup(EditorCookie.class);
        JEditorPane[] panes = pane.getOpenedPanes();
        if (panes != null && panes.length > 0) {
            return panes[0];
        }
        return null;
    }
}
