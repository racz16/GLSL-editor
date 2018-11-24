package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.core.scope.Builtin;
import hu.racz.zalan.editor.core.*;
import static hu.racz.zalan.editor.core.Constants.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.core.scope.function.*;
import hu.racz.zalan.editor.core.scope.type.*;
import hu.racz.zalan.editor.core.scope.variable.*;
import java.util.*;
import javax.swing.text.*;
import org.netbeans.api.editor.mimelookup.*;
import org.netbeans.modules.parsing.spi.*;
import org.netbeans.spi.editor.completion.*;
import org.netbeans.spi.editor.completion.support.*;
import org.openide.util.*;

@MimeRegistration(mimeType = GLSL_MIME_TYPE, service = CompletionProvider.class)
public class GlslCompletionProvider implements CompletionProvider {

    private CompletionResultSet resultSet;
    private int caretPosition;
    private String filter;

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
        GlslProcessor.setText(document.getText(0, document.getLength()));
    }

    private void addCodeCompletionItems() throws BadLocationException, ParseException {
        Scope caretScope = GlslProcessor.getCaretScope(caretPosition + 1);
        filter = computeFilter();
        addUserElements(caretScope);
        addBuiltInElements();
    }

    private void addElement(CompletionElement element) {
        if (element.getLeftText().startsWith(filter)) {
            resultSet.addItem(new GlslCompletionItem(element, filter.length(), caretPosition));
        }
    }

    //
    //add user elements---------------------------------------------------------
    //
    private void addUserElements(Scope caretScope) {
        addUserTypesFromScopes(caretScope);
        addUserVariablesFromScopes(caretScope);
        addUserFunctions();
    }

    private void addUserVariablesFromScopes(Scope scope) {
        while (scope != null) {
            addVariableDeclarationListIfDeclared(scope.getVariableDeclarations());
            scope = scope.getParent();
        }
    }

    private void addVariableDeclarationListIfDeclared(List<? extends VariableDeclaration> elements) {
        for (VariableDeclaration element : elements) {
            if (element.getNameStopIndex() < caretPosition) {
                addElement(element);
            }
        }
    }

    private void addUserTypesFromScopes(Scope scope) {
        while (scope != null) {
            addTypeDeclarationListIfDeclared(scope.getTypeDeclarations());
            scope = scope.getParent();
        }
    }

    private void addTypeDeclarationListIfDeclared(List<? extends TypeDeclaration> elements) {
        for (TypeDeclaration element : elements) {
            if (element.getNameStopIndex() < caretPosition) {
                addElement(element);
            }
        }
    }

    private void addUserFunctions() {
        for (Function function : Scope.getFunctions()) {
            if (functionsHasDefinitionOrPrototypeBefore(function, caretPosition)) {
                addElement(function);
            }
        }
    }

    private boolean functionsHasDefinitionOrPrototypeBefore(Function func, int position) {
        if (func.getDefinition() != null && func.getDefinition().getNameStopIndex() < position) {
            return true;
        }
        return functionHasPrototypeBefore(func, position);
    }

    private boolean functionHasPrototypeBefore(Function func, int position) {
        for (FunctionDeclaration fp : func.getPrototypes()) {
            if (fp.getStopIndex() < position) {
                return true;
            }
        }
        return false;
    }

    //
    //add builtin elements------------------------------------------------------
    //
    private void addBuiltInElements() {
        if (!filter.isEmpty()) {
            addElementList(Builtin.getKeywords());
            addElementMap(Builtin.getQualfiers());
            addElementMap(Builtin.getTypes());
            addElementMap(Builtin.getVariables());
            addElementList(Builtin.getFunctions());
        }
    }

    private void addElementList(List<? extends CompletionElement> elements) {
        for (CompletionElement element : elements) {
            addElement(element);
        }
    }

    private void addElementMap(Map<String, ? extends CompletionElement> elements) {
        for (CompletionElement element : elements.values()) {
            addElement(element);
        }
    }

    //
    //filter--------------------------------------------------------------------
    //
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
        return character == SPACE || character == CR || character == LF
                || character == TAB || character == LCB || character == LRB
                || character == LSB || character == COMMA || character == SEMICOLON
                || character == RCB || character == COLON;
    }

    //
    //misc----------------------------------------------------------------------
    //
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
