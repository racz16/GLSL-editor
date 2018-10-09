package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.core.scope.Builtin;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.Element;
import hu.racz.zalan.editor.core.scope.function.*;
import java.util.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.completion.*;
import org.netbeans.spi.editor.completion.support.*;
import org.openide.util.*;

@MimeRegistration(mimeType = "text/x-glsl", service = CompletionProvider.class)
public class GlslCompletionProvider implements CompletionProvider {

    private CompletionResultSet resultSet;
    private int caretPosition;
    private String filter;

    private static final char CARRIGE_RETURN = '\r';
    private static final char LINE_FEED = '\n';
    private static final char TAB = '\t';
    private static final char SPACE = ' ';
    private static final char LCB = '{';
    private static final char RCB = '}';
    private static final char LSB = '[';
    private static final char LRB = '(';
    private static final char COMMA = ',';
    private static final char COLON = ':';
    private static final char SEMICOLON = ';';

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE) {
            return null;
        }
        return new AsyncCompletionTask(new GlslAsyncCompletionQuery(), jtc);
    }

    private void initializeCodeCompletion(CompletionResultSet completionResultSet, Document document, int caretPosition) throws BadLocationException {
        this.resultSet = completionResultSet;
        this.caretPosition = caretPosition;
        //kódkiegészítés során leütött karaktereket a parser valamiéert nem érzékeli, úgyhogy manuálisan frissítem
        if (GlslProcessor.getText().length() != document.getLength()) {
            GlslProcessor.setText(document.getText(0, document.getLength()));
        }
    }

    private void addCodeCompletionItems() throws BadLocationException, ParseException {
        Scope rootScope = GlslProcessor.getRootScope();
        Scope caretScope = GlslProcessor.getCaretScope(caretPosition);
        filter = computeFilter();
        addUserElements(rootScope, caretScope);
        addBuiltInElements();
    }

    private void addUserElements(Scope rootScope, Scope caretScope) {
        addElementListIfDeclared(rootScope.getTypeDeclarations());  //TODO: nem csak a root-ban lehet típust deklarálni
        addUserVariablesFromScopes(caretScope);
        addUserFunctions();
    }

    private void addUserVariablesFromScopes(Scope scope) {
        while (scope != null) {
            addElementListIfDeclared(scope.getVariableDeclarations());
            scope = scope.getParent();
        }
    }

    private void addUserFunctions() {
        Scope rootScope = GlslProcessor.getRootScope();
        for (FunctionPrototype function : rootScope.getFunctionPrototypes()) {
            if (function.getSignature().getStopIndex() < caretPosition) {
                addElement(function);
            }
        }
    }

    private void addElementListIfDeclared(List<? extends Element> elements) {
        for (Element element : elements) {
            if (element.getStopIndex() < caretPosition) {
                addElement(element);
            }
        }
    }

    private void addBuiltInElements() {
        if (!filter.isEmpty()) {
            addElementList(Builtin.getKeywords());
            addElementMap(Builtin.getTypes());
            addElementMap(Builtin.getVariables());
            addElementList(Builtin.getFunctions());
        }
    }

    private void addElementList(List<? extends Element> elements) {
        for (Element element : elements) {
            addElement(element);
        }
    }

    private void addElementMap(Map<String, ? extends Element> elements) {
        for (Element element : elements.values()) {
            addElement(element);
        }
    }

    private void addElement(Element element) {
        if (element.getName().startsWith(filter)) {
            resultSet.addItem(new GlslCompletionItem((CompletionElement) element, filter.length(), caretPosition));
        }
    }

    private String computeFilter() throws BadLocationException {
        if (caretPosition == 0) {
            return "";
        }
        String text = GlslProcessor.getText();
        int offset = computeFilterOffset(text, caretPosition - 1);
        return offset == caretPosition ? "" : text.substring(offset, caretPosition);
    }

    private int computeFilterOffset(String text, int offset) {
        while (offset >= 0) {
            if (isIdentifierSeparator(text.charAt(offset))) {
                return offset + 1;
            }
            offset--;
        }
        return offset + 1;
    }

    private boolean isIdentifierSeparator(char character) {
        return character == SPACE || character == CARRIGE_RETURN || character == LINE_FEED
                || character == TAB || character == LCB || character == LRB
                || character == LSB || character == COMMA || character == SEMICOLON
                || character == RCB || character == COLON;
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        return 0;

    }

    private class GlslAsyncCompletionQuery extends AsyncCompletionQuery {

        @Override
        protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {
            try {
                initializeCodeCompletion(completionResultSet, document, caretOffset);
                addCodeCompletionItems();
                completionResultSet.finish();
            } catch (BadLocationException | ParseException ex) {
                Exceptions.printStackTrace(ex);
            }
        }

    }

}
