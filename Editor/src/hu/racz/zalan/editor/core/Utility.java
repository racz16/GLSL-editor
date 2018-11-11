package hu.racz.zalan.editor.core;

import java.awt.*;
import java.lang.ref.*;
import java.lang.reflect.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.regex.*;
import javax.swing.*;
import javax.swing.text.*;
import org.netbeans.modules.editor.*;
import org.netbeans.modules.editor.indent.spi.*;
import org.openide.cookies.*;
import org.openide.loaders.*;
import org.openide.util.*;

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
        JTextComponent tc = getTextComponent(document);
        if (tc != null) {
            tc.setCaretPosition(position);
        }
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

    public static int getCaretPositionInAwtThread(final Context context) {
        ThreadReturner<Integer> r = new ThreadReturner<Integer>() {
            @Override
            public void run() {
                setValue(context.caretOffset());
            }
        };
        EventQueue.invokeLater(r);
        return r.getValue();
    }

    private static abstract class ThreadReturner<T> implements Runnable {

        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

    }

    public static void setCaretPositionInAwtThread(final Context context, final int position) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    context.setCaretOffset(position);
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
        });
    }

    public static void setCaretPositionInAwtThread(final Document document, final int position) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Utility.setCaretPosition(document, position);
            }
        });
    }
}
