package hu.racz.zalan.editor.folding;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import java.util.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.fold.*;
import org.netbeans.spi.editor.fold.*;

public class GlslFoldManager implements FoldManager {

    private FoldOperation operation;

    @Override
    public void init(FoldOperation operation) {
        this.operation = operation;
    }

    @Override
    public void initFolds(FoldHierarchyTransaction transaction) {
        updateFolds(transaction, org.netbeans.api.editor.EditorRegistry.lastFocusedComponent().getDocument());
    }

    private void updateFolds(FoldHierarchyTransaction transaction, Document doc) {
        try {
            updateModel(doc);
            removePreviousFolds(transaction);
            addFolds(transaction);
        } catch (BadLocationException ex) {
            //az options menüben lévő kódrészlet megnyitásakor nem lehet 
            //elkérni a document objektumot, így ha a megnyitott fájl 
            //hosszabb, mint az options menüben lévő, akkor túl fog indexelni
        }
    }

    private void updateModel(Document doc) throws BadLocationException {
        if (doc != null) {
            String s = doc.getText(0, doc.getLength());
            GlslProcessor.setText(s);
        }
    }

    private void removePreviousFolds(FoldHierarchyTransaction transaction) {
        List<Fold> folds = collectFolds();
        while (!folds.isEmpty()) {
            Fold f = folds.get(0);
            operation.removeFromHierarchy(f, transaction);
            folds.remove(f);
        }
    }

    private List<Fold> collectFolds() {
        List<Fold> folds = new ArrayList<>();
        Iterator<Fold> iterator = operation.foldIterator();
        while (iterator.hasNext()) {
            folds.add(iterator.next());
        }
        return folds;
    }

    private void addFolds(FoldHierarchyTransaction transaction) throws BadLocationException {
        for (FoldingBlock fb : Scope.getFoldingBlocks()) {
            FoldingBlock.FoldingType ft = fb.getFoldingType();
            if (fb.getStartIndex() <= fb.getStopIndex()) {
                operation.addToHierarchy(ft.getFoldType(), fb.getStartIndex(), fb.getStopIndex(), ft.isCollapsed(), ft.getFoldTemplate(), ft.getTextLabel(), null, transaction);
            }
        }
    }

    @Override
    public void insertUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        updateFolds(fht, de.getDocument());
    }

    @Override
    public void removeUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        updateFolds(fht, de.getDocument());
    }

    @Override
    public void changedUpdate(DocumentEvent de, FoldHierarchyTransaction fht) {
        updateFolds(fht, de.getDocument());
    }

    @Override
    public void removeEmptyNotify(Fold fold) {

    }

    @Override
    public void removeDamagedNotify(Fold fold) {

    }

    @Override
    public void expandNotify(Fold fold) {

    }

    @Override
    public void release() {
    }
}
