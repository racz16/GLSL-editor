package hu.racz.zalan.editor.indentation;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import hu.racz.zalan.editor.core.scope.*;
import hu.racz.zalan.editor.errordisplay.*;
import java.awt.*;
import java.util.List;
import javax.swing.text.BadLocationException;
import org.antlr.v4.runtime.Token;
import org.netbeans.modules.editor.indent.api.*;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

public class GlslReformatTask implements ReformatTask {

    private final Context context;

    private int indentLevelSize;
    private int tabSize;
    private boolean expandTabs;

    public GlslReformatTask(Context context) {
        this.context = context;
    }

    @Override
    public void reformat() throws BadLocationException {
        indentLevelSize = IndentUtils.indentLevelSize(context.document());
        tabSize = IndentUtils.tabSize(context.document());
        expandTabs = IndentUtils.isExpandTabs(context.document());

        int caretPosition = GlslParser.CaretListener2.CARET_POSITION;
        int resCar = 0;
        //System.out.println(Utility.getCaretPositionInAwtThread(context));
        Utility.getCaretPositionInAwtThread(context);
        //String ret1 = "";
        //String ret2 = "";
        String ret = "";
        String specialText = "";
        int newLineCount = 0;
        boolean indent = true;
        int indentLevel = 0;
        boolean inForHeader = false;
        boolean inStruct = false;
        boolean inStructInitList = false;
        int forHeaderBraceCount = 0;
        boolean caret = false;

        List<? extends Token> tokens = GlslProcessor.getTokens();
        if (tokens.isEmpty() || tokens.size() == 1) {
            return;
        }

        Token lastReal = tokens.get(0);
        int tt1 = lastReal.getType();
        if (tt1 == AntlrGlslLexer.KW_STRUCT) {
            inStruct = true;
        }
        if (tt1 == AntlrGlslLexer.SPACE || tt1 == AntlrGlslLexer.NEW_LINE || tt1 == AntlrGlslLexer.TAB) {
            specialText += lastReal.getText();
            if (tt1 == AntlrGlslLexer.NEW_LINE) {
                newLineCount++;
            }
        } else {
            indent = false;
            ret += lastReal.getText();
        }

        Token current;
        int tt2;

        for (int i = 1; i < tokens.size(); i++) {
            current = tokens.get(i);
            tt2 = current.getType();

            if (tt2 == AntlrGlslLexer.KW_STRUCT) {
                inStruct = true;
            }
            if (inStruct && tt2 == AntlrGlslLexer.RCB) {
                inStruct = false;
                inStructInitList = true;
            }
            if (inStructInitList && tt2 == AntlrGlslLexer.SEMICOLON) {
                inStructInitList = false;
            }

            if (tt2 == AntlrGlslLexer.SPACE || tt2 == AntlrGlslLexer.NEW_LINE || tt2 == AntlrGlslLexer.TAB) {
                specialText += current.getText();
                if (tt2 == AntlrGlslLexer.NEW_LINE) {
                    newLineCount = newLineCount == 2 ? 2 : newLineCount + 1;
                }
                if (current.getStartIndex() <= caretPosition && current.getStopIndex() + 1 >= caretPosition) {
                    resCar = ret.length() + (caretPosition - current.getStartIndex());
                }
            } else if (tt2 == AntlrGlslLexer.MULTI_LINE_COMMENT || tt2 == AntlrGlslLexer.SINGLE_LINE_COMMENT) {
                String res = "";
                int index = specialText.lastIndexOf("\n");
                if (index != -1) {
                    res += specialText.substring(index);
                    specialText = specialText.substring(0, index);

                    index = specialText.lastIndexOf("\n");
                    if (index != -1) {
                        res += specialText.substring(index);
                    } else {
                        res += specialText;
                    }
                } else {
                    res += specialText;
                }
                if (caret) {
                    resCar += res.length();
                }

                if (current.getStartIndex() <= caretPosition && current.getStopIndex() + 1 >= caretPosition) {
                    resCar = ret.length() + res.length() + (caretPosition - current.getStartIndex());
                }

                ret += res + current.getText();
                specialText = "";
                newLineCount = 0;
                lastReal = current;
                tt1 = tt2;
            } else {
                if (tt2 == AntlrGlslLexer.KW_FOR) {
                    inForHeader = true;
                }
                if (inForHeader) {
                    if (tt2 == AntlrGlslLexer.LRB) {
                        forHeaderBraceCount++;
                    } else if (tt2 == AntlrGlslLexer.RRB) {
                        forHeaderBraceCount--;
                        if (forHeaderBraceCount == 0) {
                            inForHeader = false;
                        }
                    }
                }
                specialText = "";
                if (tt1 == AntlrGlslLexer.LCB
                        || tt1 == AntlrGlslLexer.SINGLE_LINE_COMMENT
                        || (tt1 == AntlrGlslLexer.RCB && tt2 != AntlrGlslLexer.SEMICOLON && tt2 != AntlrGlslLexer.KW_ELSE && !inStructInitList)
                        || tt1 == AntlrGlslLexer.SEMICOLON && forHeaderBraceCount == 0
                        || tt1 == AntlrGlslLexer.MACRO
                        || isBracelessScopeSStart(current)) {
                    ret += "\n";
                    indent = true;
                } else if (tt2 != AntlrGlslLexer.SEMICOLON
                        && tt2 != AntlrGlslLexer.COMMA
                        && tt1 != AntlrGlslLexer.LRB
                        && tt1 != AntlrGlslLexer.LSB
                        && tt2 != AntlrGlslLexer.RRB
                        && tt2 != AntlrGlslLexer.RSB
                        && tt1 != AntlrGlslLexer.DOT
                        && tt2 != AntlrGlslLexer.DOT
                        && (tt1 != AntlrGlslLexer.IDENTIFIER && tt1 != AntlrGlslLexer.TYPE && tt1 != AntlrGlslLexer.Q_LAYOUT && tt1 != AntlrGlslLexer.KW_IF && tt1 != AntlrGlslLexer.KW_WHILE && tt1 != AntlrGlslLexer.KW_FOR || tt2 != AntlrGlslLexer.LRB)
                        && (tt1 != AntlrGlslLexer.IDENTIFIER || tt2 != AntlrGlslLexer.LSB)
                        && tt1 != AntlrGlslLexer.OP_LOGICAL_UNARY
                        && (tt1 != AntlrGlslLexer.OP_INC && tt1 != AntlrGlslLexer.OP_DEC || tt2 != AntlrGlslLexer.IDENTIFIER)
                        && (tt2 != AntlrGlslLexer.OP_INC && tt2 != AntlrGlslLexer.OP_DEC || (tt1 != AntlrGlslLexer.IDENTIFIER && tt1 != AntlrGlslLexer.RRB))) {
                    ret += " ";
                    indent = false;
                }
                if (indent) {
                    for (int j = 0; j < newLineCount - 1; j++) {
                        ret += "\n";
                    }
                    newLineCount = 0;
                    int depth = (tt2 == AntlrGlslLexer.RCB ? indentLevel - 1 : indentLevel) * indentLevelSize;
                    for (Scope bs : Scope.getBracelessScopes()) {
                        if (bs.getStartIndex() <= current.getStartIndex() && bs.getStopIndex() >= current.getStopIndex()) {
                            depth += indentLevelSize;
                        }
                    }
                    ret += IndentUtils.createIndentString(depth, expandTabs, tabSize);
                    /*for (int j = 0; j < (tt2 == AntlrGlslLexer.RCB ? indentLevel - 1 : indentLevel); j++) {
                        ret += "    ";
                    }*/
                    indent = false;
                }
                if (current.getStartIndex() <= caretPosition && current.getStopIndex() + 1 >= caretPosition) {
                    resCar = ret.length() + (caretPosition - current.getStartIndex());
                }
                ret += current.getText();

                if (tt2 == AntlrGlslLexer.LCB) {
                    indentLevel++;
                } else if (tt2 == AntlrGlslLexer.RCB) {
                    indentLevel--;
                }

                lastReal = current;
                tt1 = tt2;
            }
        }

        //ret2 = ret;
        //ret = ret1 + ret2;
//        int len = context.document().getLength();
//        int len1 = caretPosition;
//        int len2 = len - caretPosition;
//
//        context.document().remove(len1 + 1, len2 - 1);
//        context.document().insertString(len1 + 1, ret2, null);
//        context.document().remove(0, len1 + 1);
//        context.document().insertString(0, ret1 + "---", null);
        context.document().remove(0, context.document().getLength());
        context.document().insertString(0, ret, null);

        //Utility.setCaretPositionInAwtThread(context, resCar);
        Utility.setCaretPositionInAwtThread(context.document(), resCar);

//        EventQueue.invokeLater(new Runnable() {
//
//            
//            public void run() {
//                Utility.setCaretPosition(context.document(), resCar);
//            }
//        });
        //context.setCaretOffset(10);
        //context.document().insertString(len, ret, null);
        //context.document().remove(0, len);
    }

    private boolean isBracelessScopeSStart(Token t) {
        for (Scope bs : Scope.getBracelessScopes()) {
            if (bs.getStartIndex() == t.getStartIndex()) {
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
