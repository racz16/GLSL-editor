package hu.racz.zalan.editor.markoccurrences;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.awt.*;
import java.lang.ref.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.settings.*;
import org.netbeans.modules.editor.*;
import org.netbeans.spi.editor.highlighting.support.*;
import org.openide.cookies.*;
import org.openide.loaders.*;
import org.openide.util.*;

public class GlslMarkOccurrencesHighlighter implements CaretListener {

    private static final AttributeSet defaultColors = AttributesUtilities.createImmutable(StyleConstants.Background, new Color(236, 235, 163));

    private final OffsetsBag bag;

    private JTextComponent comp;

    private final RequestProcessor rp;
    private final static int REFRESH_DELAY = 100;
    private RequestProcessor.Task lastRefreshTask;

    private int caret;

    public GlslMarkOccurrencesHighlighter(Document doc) {
        rp = new RequestProcessor(GlslMarkOccurrencesHighlighter.class);
        bag = new OffsetsBag(doc);
        WeakReference<Document> weakDoc = new WeakReference<>((Document) doc);
        DataObject dobj = NbEditorUtilities.getDataObject(weakDoc.get());
        if (dobj != null) {
            EditorCookie pane = dobj.getLookup().lookup(EditorCookie.class);
            JEditorPane[] panes = pane.getOpenedPanes();
            if (panes != null && panes.length > 0) {
                comp = panes[0];
                comp.addCaretListener(this);
            }
        }
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        bag.clear();
        caret = comp.getCaretPosition();
        setupAutoRefresh();
    }

    public void setupAutoRefresh() {
        if (lastRefreshTask == null) {
            lastRefreshTask = rp.create(new Runnable() {
                @Override
                public void run() {
                    Scope rootScope = GlslProcessor.getRootScope();
                    if (rootScope == null) {
                        return;
                    }
                    addFunctionOccurrences(rootScope);
                    addVariableOccurrences();
                    addTypeOccurrences();
                }
            });
        }
        lastRefreshTask.schedule(REFRESH_DELAY);
    }

    private void addFunctionOccurrences(Scope rootScope) {
        for (Function fd : rootScope.getFunctionDefinitions()) {
            if (fd.getNameStartIndex() <= caret && fd.getNameStopIndex() >= caret) {
                bag.addHighlight(fd.getNameStartIndex(), fd.getNameStopIndex(), defaultColors);
                if (fd.getUsageCount() > 0) {
                    Function fp = fd.getUsage(0);
                    bag.addHighlight(fp.getNameStartIndex(), fp.getNameStopIndex(), defaultColors);
                }
            }
        }
        for (Function fp : rootScope.getFunctionPrototypes()) {
            if (fp.getNameStartIndex() <= caret && fp.getNameStopIndex() >= caret) {
                bag.addHighlight(fp.getNameStartIndex(), fp.getNameStopIndex(), defaultColors);
                for (Function fd : fp.getUsages()) {
                    bag.addHighlight(fd.getNameStartIndex(), fd.getNameStopIndex(), defaultColors);
                }
            }
        }
    }

    private void addVariableOccurrences() {
        VariableDeclaration declaration = findVariableDeclaration();
        addVariableOccurrences(declaration);
    }

    private VariableDeclaration findVariableDeclaration() {
        VariableDeclaration declaration = null;
        Scope scope = GlslProcessor.getCaretScope(caret);
        search:
        while (scope != null) {
            for (VariableDeclaration vd : scope.getVariables()) {
                if (vd.getStartIndex() <= caret && vd.getStopIndex() >= caret) {
                    declaration = vd;
                    break search;
                }
            }
            for (VariableUsage vu : scope.getVariableUsages()) {
                if (vu.getStartIndex() <= caret && vu.getStopIndex() >= caret) {
                    declaration = vu.getDeclaration();
                    break search;
                }
            }
            scope = scope.getParent();
        }
        return declaration;
    }

    private void addVariableOccurrences(VariableDeclaration declaration) {
        if (declaration != null) {
            bag.addHighlight(declaration.getStartIndex(), declaration.getStopIndex(), defaultColors);
            for (VariableUsage vu : declaration.getUsages()) {
                bag.addHighlight(vu.getStartIndex(), vu.getStopIndex(), defaultColors);
            }
        }
    }

    private void addTypeOccurrences() {
        TypeDeclaration declaration = findTypeDeclaration();
        addTypeOccurrences(declaration);
    }

    private TypeDeclaration findTypeDeclaration() {
        TypeDeclaration declaration = null;
        Scope scope = GlslProcessor.getCaretScope(caret);
        search:
        while (scope != null) {
            for (TypeDeclaration td : scope.getTypeDeclarations()) {
                if (td.getStartIndex() <= caret && td.getStopIndex() >= caret) {
                    declaration = td;
                    break search;
                }
            }
            for (TypeUsage tu : scope.getTypeUsages()) {
                if (tu.getStartIndex() <= caret && tu.getStopIndex() >= caret) {
                    declaration = tu.getDeclaration();
                    break search;
                }
            }
            scope = scope.getParent();
        }
        return declaration;
    }

    private void addTypeOccurrences(TypeDeclaration declaration) {
        if (declaration != null) {
            bag.addHighlight(declaration.getStartIndex(), declaration.getStopIndex(), defaultColors);
            for (TypeUsage tu : declaration.getUsages()) {
                bag.addHighlight(tu.getStartIndex(), tu.getStopIndex(), defaultColors);
            }
        }
    }

    public OffsetsBag getHighlightsBag() {
        return bag;
    }

}
