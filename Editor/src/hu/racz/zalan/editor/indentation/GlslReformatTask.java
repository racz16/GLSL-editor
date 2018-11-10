package hu.racz.zalan.editor.indentation;

import static hu.racz.zalan.editor.antlr.generated.AntlrGlslLexer.*;

import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.errordisplay.*;
import java.util.*;
import javax.swing.text.BadLocationException;
import org.antlr.v4.runtime.Token;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.*;
import static hu.racz.zalan.editor.core.Constants.LF;

public class GlslReformatTask implements ReformatTask {

    //document
    private final Context context;
    private int caretPosition;

    //settings
    private int indentLevelSize;
    private int tabSize;
    private boolean expandTabs;

    //tokens
    private Token currentToken;
    private int previousTokenType = -1;
    private int currentTokenType;

    //struct state
    private boolean inStructBody;
    private boolean inStructInitList;

    //for state
    private boolean inForHeader;
    private int forHeaderBraceCount;

    //else if state
    private boolean lastRegularElse;
    private final List<Scope> ignoredBracelessScopes = new ArrayList<>();

    //user's text
    private static final int MAX_ALLOWED_BLANK_LINES = 1;
    private String userSpaceTabNewLine = "";
    private int userNewLineCount;

    //indentation
    private int indentLevel;

    //results
    private int resultCaretPosition;
    private String result = "";

    public GlslReformatTask(Context context) {
        this.context = context;
    }

    @Override
    public void reformat() throws BadLocationException {
        initialize();
        List<? extends Token> tokens = GlslProcessor.getTokens();
        for (Token token : tokens) {
            setToken(token);
            formatToken();
        }
        setResultTextAndCaretPosition();
    }

    private void initialize() {
        indentLevelSize = IndentUtils.indentLevelSize(context.document());
        tabSize = IndentUtils.tabSize(context.document());
        expandTabs = IndentUtils.isExpandTabs(context.document());
        caretPosition = GlslParser.getCaretListener().getCaretPosition();
    }

    private void setToken(Token token) {
        currentToken = token;
        currentTokenType = currentToken.getType();
    }

    private void formatToken() {
        if (isCurrentTokenOneOfThem(SPACE, NEW_LINE, TAB)) {
            formatSpaceTabNewLine();
        } else if (isCurrentTokenOneOfThem(MULTI_LINE_COMMENT, SINGLE_LINE_COMMENT)) {
            formatComment();
        } else {
            formatRegular();
        }
    }

    private void refreshStructState() {
        refreshStructBodyStartState();
        refreshStructBodyStopState();
        refreshStructEndState();
    }

    private void refreshStructBodyStartState() {
        if (isCurrentTokenOneOfThem(KW_STRUCT)) {
            inStructBody = true;
        }
    }

    private void refreshStructBodyStopState() {
        if (inStructBody && isCurrentTokenOneOfThem(RCB)) {
            inStructBody = false;
            inStructInitList = true;
        }
    }

    private void refreshStructEndState() {
        if (inStructInitList && isCurrentTokenOneOfThem(SEMICOLON)) {
            inStructInitList = false;
        }
    }

    private void formatSpaceTabNewLine() {
        refreshUserTextState();
        refreshResultCaretPosition();
    }

    private void refreshUserTextState() {
        userSpaceTabNewLine += currentToken.getText();
        if (isCurrentTokenOneOfThem(NEW_LINE)) {
            userNewLineCount = userNewLineCount == 2 ? 2 : userNewLineCount + 1;
        }
    }

    private void refreshResultCaretPosition() {
        if (currentToken.getStartIndex() <= caretPosition && currentToken.getStopIndex() + 1 >= caretPosition) {
            resultCaretPosition = result.length() + (caretPosition - currentToken.getStartIndex());
        }
    }

    private void formatComment() {
        result += computeUserText();
        refreshResultCaretPosition();
        result += currentToken.getText();
        previousTokenType = currentTokenType;
        clearUserTextState();
    }

    private String computeUserText() {
        return substringFromNthLastIndexOf(userSpaceTabNewLine, LF, MAX_ALLOWED_BLANK_LINES + 1);

    }

    private String substringFromNthLastIndexOf(String str, char character, int n) {
        int lastIndexOfC = str.lastIndexOf(character);
        if (n < 1 || lastIndexOfC == -1) {
            return str;
        } else {
            return substringFromNthLastIndexOf(str.substring(0, lastIndexOfC), character, n - 1) + str.substring(lastIndexOfC);
        }
    }

    private void clearUserTextState() {
        userSpaceTabNewLine = "";
        userNewLineCount = 0;
    }

    private void formatRegular() {
        refreshStates();
        format();
        refreshIndentState();
        userSpaceTabNewLine = "";
        lastRegularElse = isCurrentTokenOneOfThem(KW_ELSE);
        previousTokenType = currentTokenType;
    }

    private void refreshStates() {
        if (lastRegularElse && isCurrentTokenOneOfThem(KW_IF)) {
            addStartScopeToIgnored();
        }
        refreshStructState();
        refreshForState();
    }

    private void addStartScopeToIgnored() {
        for (Scope bs : Scope.getBracelessScopes()) {
            if (bs.getStartIndex() == currentToken.getStartIndex()) {
                ignoredBracelessScopes.add(bs);
            }
        }
    }

    private void refreshForState() {
        refreshForHeaderState();
        if (inForHeader) {
            refreshForHeaderBraceCount();
        }
    }

    private void refreshForHeaderState() {
        if (isCurrentTokenOneOfThem(KW_FOR)) {
            inForHeader = true;
        }
    }

    private void refreshForHeaderBraceCount() {
        if (isCurrentTokenOneOfThem(LRB)) {
            forHeaderBraceCount++;
        } else if (isCurrentTokenOneOfThem(RRB)) {
            forHeaderBraceCount--;
            refreshForHeaderStop();
        }
    }

    private void refreshForHeaderStop() {
        if (forHeaderBraceCount == 0) {
            inForHeader = false;
        }
    }

    private void format() {
        if (previousTokenType != -1) {
            addSpaceOrIndentationOrNothing();
        }
        refreshResultCaretPosition();
        result += currentToken.getText();
    }

    private void addSpaceOrIndentationOrNothing() {
        if (isIndentationNeeded()) {
            result += computeIndentation();
            userNewLineCount = 0;
        } else if (isSpaceNeeded()) {
            result += " ";
        }
    }

    private void refreshIndentState() {
        if (isCurrentTokenOneOfThem(LCB)) {
            indentLevel++;
        } else if (isCurrentTokenOneOfThem(RCB)) {
            indentLevel--;
        }
    }

    private String computeIndentation() {
        String indentationNewLines = computeIndentationNewLines();
        int depth = computeIndentationDepth();
        return indentationNewLines + IndentUtils.createIndentString(depth, expandTabs, tabSize);
    }

    private String computeIndentationNewLines() {
        String indentationNewLines = "";
        for (int j = 0; j < userNewLineCount - 1; j++) {
            indentationNewLines += LF;
        }
        indentationNewLines += LF;
        return indentationNewLines;
    }

    private int computeIndentationDepth() {
        int depth = (isCurrentTokenOneOfThem(RCB) ? indentLevel - 1 : indentLevel) * indentLevelSize;
        for (Scope bs : Scope.getBracelessScopes()) {
            if (!isBracelessScopeIgnored(bs) && bs.getStartIndex() <= currentToken.getStartIndex() && bs.getStopIndex() >= currentToken.getStopIndex()) {
                depth += indentLevelSize;
            }
        }
        return depth;
    }

    private boolean isBracelessScopeIgnored(Scope bs) {
        for (Scope s : ignoredBracelessScopes) {
            if (bs == s) {
                return true;
            }
        }
        return false;
    }

    private boolean isIndentationNeeded() {
        return isPreviousTokenOneOfThem(LCB, SINGLE_LINE_COMMENT, MACRO)
                || (isPreviousTokenOneOfThem(RCB) && !isCurrentTokenOneOfThem(SEMICOLON, KW_ELSE) && !inStructInitList)
                || isPreviousTokenOneOfThem(SEMICOLON) && !inForHeader
                || isBracelessScopeSStart(currentToken);
    }

    private boolean isSpaceNeeded() {
        return !isPreviousTokenOneOfThem(LRB, LSB, DOT, OP_LOGICAL_UNARY) && !isCurrentTokenOneOfThem(SEMICOLON, COMMA, RRB, RSB, DOT)
                && (!isPreviousTokenOneOfThem(IDENTIFIER, TYPE, Q_LAYOUT, KW_IF, KW_WHILE, KW_FOR, KW_SWITCH) || !isCurrentTokenOneOfThem(LRB))
                && (!isPreviousTokenOneOfThem(IDENTIFIER) || !isCurrentTokenOneOfThem(LSB))
                && (!isPreviousTokenOneOfThem(OP_INC, OP_DEC) || !isCurrentTokenOneOfThem(IDENTIFIER))
                && (!isCurrentTokenOneOfThem(OP_INC, OP_DEC) || (!isPreviousTokenOneOfThem(IDENTIFIER, RRB)));
    }

    private boolean isBracelessScopeSStart(Token t) {
        for (Scope bs : Scope.getBracelessScopes()) {
            if (bs.getStartIndex() == t.getStartIndex() && !isBracelessScopeIgnored(bs)) {
                return true;
            }
        }
        return false;
    }

    private void setResultTextAndCaretPosition() throws BadLocationException {
        context.document().remove(0, context.document().getLength());
        context.document().insertString(0, result, null);
        Utility.setCaretPositionInAwtThread(context.document(), resultCaretPosition);
    }

    private boolean isCurrentTokenOneOfThem(int... types) {
        return isTokenOneOfThem(currentTokenType, types);
    }

    private boolean isPreviousTokenOneOfThem(int... types) {
        return isTokenOneOfThem(previousTokenType, types);
    }

    private boolean isTokenOneOfThem(int token, int... types) {
        for (int type : types) {
            if (type == token) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }

}
