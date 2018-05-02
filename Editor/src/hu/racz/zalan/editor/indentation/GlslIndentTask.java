package hu.racz.zalan.editor.indentation;

import javax.swing.text.*;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.*;

public class GlslIndentTask implements IndentTask {

    private final Context context;

    private String text;
    private int cursorPosition;

    private int depth;
    private boolean nonSpaceTabAfterCursor;
    private boolean rightBraceAfterCursor;
    private int spaceTabCountAfterCursor;

    private boolean newBlock;

    private int indentLevelSize;
    private int tabSize;
    private boolean expandTabs;

    public GlslIndentTask(Context context) {
	this.context = context;
    }

    @Override
    public void reindent() throws BadLocationException {
	initialize();
	determineNewBlock();
	computeDepth();
	String indentation = computeIndentation();
	context.document().insertString(context.startOffset(), indentation, null);
    }

    private void initialize() throws BadLocationException {
	cursorPosition = context.startOffset();
	text = context.document().getText(0, context.document().getLength());
	indentLevelSize = IndentUtils.indentLevelSize(context.document());
	tabSize = IndentUtils.tabSize(context.document());
	expandTabs = IndentUtils.isExpandTabs(context.document());
    }

    private void determineNewBlock() {
	if (cursorPosition > 1 && cursorPosition < text.length() && text.charAt(cursorPosition) == '}') {
	    if (text.charAt(cursorPosition - 2) == '{' || cursorPosition > 2 && text.charAt(cursorPosition - 3) == '{') {
		newBlock = true;
	    }
	}
    }

    private void printHelper() {
	System.err.println("----------");
	for (int i = -10; i < 0; i++) {
	    printChar(i);
	}
	System.err.println("-----");
	printChar(0);
	System.err.println("-----");
	for (int i = 1; i <= 10; i++) {
	    printChar(i);
	}
	System.err.println("----------");
    }

    private void printChar(int i) {
	char c = text.charAt(cursorPosition +i);
	if (c == ' ') {
	    System.err.println("SPACE");
	} else if (c == '\r') {
	    System.err.println("CR");
	} else if (c == '\n') {
	    System.err.println("LF");
	} else if (c == '\t') {
	    System.err.println("TAB");
	} else {
	    System.err.println(c);
	}
    }

    private void computeDepth() {
	for (int i = 0; i < text.length() && !nonSpaceTabAfterCursor; i++) {
	    computeCharacterImpact(text.charAt(i), i);
	}
	if (rightBraceAfterCursor) {
	    depth -= spaceTabCountAfterCursor;
	}
    }

    private void computeCharacterImpact(char character, int index) {
	if (index < cursorPosition) {
	    computeCharacterImpactBeforeCursor(character);
	} else {
	    computeCharacterImpactAfterCursor(character);
	}
    }

    private void computeCharacterImpactBeforeCursor(char character) {
	if (character == '{') {
	    depth += indentLevelSize;
	} else if (character == '}') {
	    depth -= indentLevelSize;
	}
    }

    private void computeCharacterImpactAfterCursor(char character) {
	computeSpaceTabImpactAfterCursor(character);
	if (character != ' ' && character != '\t') {
	    nonSpaceTabAfterCursor = true;
	    if (character == '}') {
		computeRightBraceImpactAfterCursor();
	    }
	}
    }

    private void computeSpaceTabImpactAfterCursor(char character) {
	if (character == ' ') {
	    spaceTabCountAfterCursor += 1;
	} else if (character == '\t') {
	    spaceTabCountAfterCursor += tabSize;
	}
    }

    private void computeRightBraceImpactAfterCursor() {
	rightBraceAfterCursor = true;
	depth -= indentLevelSize;
    }

    private String computeIndentation() {
	if (depth < 0) {
	    return "";
	} else {
	    return computeIndentationWithoutInspection();
	}
    }

    private String computeIndentationWithoutInspection() {
	String indentation = computeIndentationString(depth);
	if (newBlock) {
	    indentation += computeIndentationString(indentLevelSize)
		    + System.lineSeparator()
		    + computeIndentationString(depth);
	}
	return indentation;
    }

    private String computeIndentationString(int depth) {
	if (expandTabs) {
	    return computeIndentationStringWithSpaces(depth);
	} else {
	    return computeIndentationStringWithTabs(depth);
	}
    }

    private String computeIndentationStringWithTabs(int depth) {
	String indentation = "";
	while (depth >= tabSize) {
	    indentation += "\t";
	    depth -= tabSize;
	}
	indentation += computeIndentationStringWithSpaces(depth);
	return indentation;
    }

    private String computeIndentationStringWithSpaces(int depth) {
	String indentation = "";
	for (int i = 0; i < depth; i++) {
	    indentation += " ";
	}
	return indentation;
    }

    @Override
    public ExtraLock indentLock() {
	return null;
    }
}
