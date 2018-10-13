package hu.racz.zalan.editor.markoccurrences;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.Element;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.text.*;
import org.netbeans.api.editor.settings.*;
import org.netbeans.spi.editor.highlighting.support.*;
import org.openide.util.*;

public class GlslMarkOccurrencesHighlighter implements CaretListener, Runnable {

    private static final AttributeSet HIGHLIGHT_COLOR = AttributesUtilities.createImmutable(StyleConstants.Background, new Color(236, 235, 163));
    private final static int REFRESH_DELAY = 100;

    private final OffsetsBag bag;
    private final Document document;
    private final JTextComponent textComponent;
    private final RequestProcessor requestProcessor;
    private RequestProcessor.Task lastRefreshTask;

    private int caretPosition;
    private Scope rootScope;
    private Scope caretScope;

    public GlslMarkOccurrencesHighlighter(Document document) {
        requestProcessor = new RequestProcessor(GlslMarkOccurrencesHighlighter.class);
        bag = new OffsetsBag(document);
        this.document = document;
        textComponent = Utility.getTextComponent(document);
        if (textComponent != null) {
            textComponent.addCaretListener(this);
        }
    }

    @Override
    public void caretUpdate(CaretEvent e) {
        if (lastRefreshTask == null) {
            lastRefreshTask = requestProcessor.create(this);
        }
        lastRefreshTask.schedule(REFRESH_DELAY);
    }

    @Override
    public void run() {
        initializeHighlight();
        addFunctionOccurrences();
        addVariableOccurrences();
        addTypeOccurrences();
    }

    private void initializeHighlight() {
        bag.clear();
        caretPosition = textComponent.getCaretPosition();
        //System.out.println(caretPosition);
        initializeScopes();
    }

    private void initializeScopes() {
        try {
            rootScope = getRootScope();
            caretScope = GlslProcessor.getCaretScope(caretPosition);
        } catch (BadLocationException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    private Scope getRootScope() throws BadLocationException {
        Scope ret = GlslProcessor.getRootScope();
        if (rootScope == null) {
            GlslProcessor.setText(document.getText(0, document.getLength()));
            ret = GlslProcessor.getRootScope();
        }
        return ret;
    }

    //
    //functions-----------------------------------------------------------------
    //
    private void addFunctionOccurrences() {
        FunctionPrototype prototype = findFunctionPrototype();
        addFunctionOccurrences(prototype);
    }

    private FunctionPrototype findFunctionPrototype() {
        FunctionPrototype fp = funcFunctionPrototypeAtCaret();
        return fp == null ? findFunctionDefinitionSPrototypeAtCaret() : fp;
    }

    private FunctionPrototype funcFunctionPrototypeAtCaret() {
        for (FunctionPrototype fp : rootScope.getFunctionPrototypes()) {
            if (isElementAtCaret(fp)) {
                return fp;
            }
        }
        return null;
    }

    private FunctionPrototype findFunctionDefinitionSPrototypeAtCaret() {
        for (FunctionDefinition fd : rootScope.getFunctionDefinitions()) {
            if (isElementAtCaret(fd)) {
                return fd.getPrototype();
            }
        }
        return null;
    }

    private void addFunctionOccurrences(FunctionPrototype prototype) {
        if (prototype != null) {
            addElementToBag(prototype);
            if (prototype.getDefinition() != null) {
                addElementToBag(prototype.getDefinition());
            }
        }
    }

    //
    //variables-----------------------------------------------------------------
    //
    private void addVariableOccurrences() {
        VariableDeclaration declaration = findVariableDeclaration();
        addVariableOccurrences(declaration);
    }

    private VariableDeclaration findVariableDeclaration() {
        VariableDeclaration vd = findVariableDeclarationAtCaret();
        return vd == null ? findVariableUsageSDeclarationAtCaret() : vd;
    }

    private VariableDeclaration findVariableDeclarationAtCaret() {
        for (VariableDeclaration vd : caretScope.getVariableDeclarations()) {
            if (isElementAtCaret(vd)) {
                return vd;
            }
        }
        return null;
    }

    private VariableDeclaration findVariableUsageSDeclarationAtCaret() {
        for (VariableUsage vu : caretScope.getVariableUsages()) {
            if (isElementAtCaret(vu)) {
                return vu.getDeclaration();
            }
        }
        return null;
    }

    private void addVariableOccurrences(VariableDeclaration declaration) {
        if (declaration != null) {
            addElementToBag(declaration);
            for (VariableUsage vu : declaration.getUsages()) {
                addElementToBag(vu);
            }
        }
    }

    //
    //types---------------------------------------------------------------------
    //
    private void addTypeOccurrences() {
        TypeDeclaration declaration = findTypeDeclaration();
        addTypeOccurrences(declaration);
    }

    private TypeDeclaration findTypeDeclaration() {
        TypeDeclaration td = findTypeDeclarationAtCaret();
        return td == null ? findTypeUsageSDeclarationAtCaret() : td;
    }

    private TypeDeclaration findTypeDeclarationAtCaret() {
        for (TypeDeclaration td : caretScope.getTypeDeclarations()) {
            if (isElementAtCaret(td)) {
                return td;
            }
        }
        return null;
    }

    private TypeDeclaration findTypeUsageSDeclarationAtCaret() {
        for (TypeUsage vu : caretScope.getTypeUsages()) {
            if (isElementAtCaret(vu)) {
                return vu.getDeclaration();
            }
        }
        return null;
    }

    private void addTypeOccurrences(TypeDeclaration declaration) {
        if (declaration != null) {
            addElementToBag(declaration);
            for (TypeUsage tu : declaration.getUsages()) {
                addElementToBag(tu);
            }
        }
    }

    //
    //misc----------------------------------------------------------------------
    //
    private boolean isElementAtCaret(Element element) {
        return element.getNameStartIndex() <= caretPosition && element.getNameStopIndex() >= caretPosition;
    }

    private boolean isElementAtCaret(FunctionBase element) {
        return element.getNameStartIndex() <= caretPosition && element.getNameStopIndex() >= caretPosition;
    }

    private void addElementToBag(Element element) {
        bag.addHighlight(element.getNameStartIndex(), element.getNameStopIndex(), HIGHLIGHT_COLOR);
    }

    private void addElementToBag(FunctionBase element) {
        bag.addHighlight(element.getNameStartIndex(), element.getNameStopIndex(), HIGHLIGHT_COLOR);
    }

    public OffsetsBag getHighlightsBag() {
        return bag;
    }

}
