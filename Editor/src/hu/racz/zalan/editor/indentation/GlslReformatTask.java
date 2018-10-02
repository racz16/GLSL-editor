package hu.racz.zalan.editor.indentation;

import hu.racz.zalan.editor.antlr.generated.*;
import hu.racz.zalan.editor.core.*;
import java.util.List;
import javax.swing.text.BadLocationException;
import org.antlr.v4.runtime.Token;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.modules.editor.indent.spi.ExtraLock;
import org.netbeans.modules.editor.indent.spi.ReformatTask;

public class GlslReformatTask implements ReformatTask {

    private final Context context;

    public GlslReformatTask(Context context) {
        this.context = context;
    }

    @Override
    public void reformat() throws BadLocationException {
        String ret = "";
        String specialText = "";
        int newLineCount = 0;
        boolean indent = true;
        int indentLevel = 0;
        boolean inForHeader = false;
        int forHeaderBraceCount = 0;

        List<? extends Token> tokens = GlslProcessor.getTokens();
        if (tokens.isEmpty() || tokens.size() == 1) {
            return;
        }

        Token lastReal = tokens.get(0);
        //GlslTokenType tt1 = GlslTokenType.valueOf(lastReal.getType());
        int tt1 = lastReal.getType();
        if (tt1 == AntlrGlslLexer.SPACE || tt1 == AntlrGlslLexer.NEW_LINE || tt1 == AntlrGlslLexer.TAB) {
            //if (tt1 == GlslTokenType.SPACE || tt1 == GlslTokenType.NEW_LINE || tt1 == GlslTokenType.TAB) {
            specialText += lastReal.getText();
            if (tt1 == AntlrGlslLexer.NEW_LINE) {
                //if (tt1 == GlslTokenType.NEW_LINE) {
                newLineCount++;
            }
        } else {
            indent = false;
            ret += lastReal.getText();
        }

        Token current;
        //GlslTokenType tt2;
        int tt2;

        for (int i = 1; i < tokens.size(); i++) {
            current = tokens.get(i);
            //tt2 = GlslTokenType.valueOf(current.getType());
            tt2 = current.getType();

            if (tt2 == AntlrGlslLexer.SPACE || tt2 == AntlrGlslLexer.NEW_LINE || tt2 == AntlrGlslLexer.TAB) {
                //if (tt2 == GlslTokenType.SPACE || tt2 == GlslTokenType.NEW_LINE || tt2 == GlslTokenType.TAB) {
                specialText += current.getText();
                if (tt2 == AntlrGlslLexer.NEW_LINE) {
                    //if (tt2 == GlslTokenType.NEW_LINE) {
                    newLineCount = newLineCount == 2 ? 2 : newLineCount + 1;
                }
            } else if (tt2 == AntlrGlslLexer.MULTI_LINE_COMMENT || tt2 == AntlrGlslLexer.SINGLE_LINE_COMMENT) {
                //} else if (tt2 == GlslTokenType.MULTI_LINE_COMMENT || tt2 == GlslTokenType.SINGLE_LINE_COMMENT) {
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
                ret += res + current.getText();
                //ret += specialText + current.getText();
                specialText = "";
                newLineCount = 0;
                lastReal = current;
                tt1 = tt2;
            } else {
                if (tt2 == AntlrGlslLexer.KW_FOR) {
                    //if (tt2 == GlslTokenType.KW_FOR) {
                    inForHeader = true;
                }
                if (inForHeader) {
                    if (tt2 == AntlrGlslLexer.LRB) {
                        //if (tt2 == GlslTokenType.LRB) {
                        forHeaderBraceCount++;
                    } else if (tt2 == AntlrGlslLexer.RRB) {
                        //} else if (tt2 == GlslTokenType.RRB) {
                        forHeaderBraceCount--;
                        if (forHeaderBraceCount == 0) {
                            inForHeader = false;
                        }
                    }
                }
                specialText = "";
                /*if (tt1 == GlslTokenType.LCB
                        || tt1 == GlslTokenType.SINGLE_LINE_COMMENT
                        || (tt1 == GlslTokenType.RCB && tt2 != GlslTokenType.SEMICOLON && tt2 != GlslTokenType.KW_ELSE)
                        || tt1 == GlslTokenType.SEMICOLON && forHeaderBraceCount == 0
                        || tt1 == GlslTokenType.MACRO) {
                    ret += "\n";
                    indent = true;
                } else if (tt2 == GlslTokenType.SEMICOLON
                        || tt2 == GlslTokenType.COMMA
                        || tt1 == GlslTokenType.LRB
                        || tt1 == GlslTokenType.LSB
                        || tt2 == GlslTokenType.RRB
                        || tt2 == GlslTokenType.RSB
                        || tt1 == GlslTokenType.DOT
                        || tt2 == GlslTokenType.DOT
                        || (tt1 == GlslTokenType.IDENTIFIER || tt1 == GlslTokenType.TYPE || tt1 == GlslTokenType.Q_LAYOUT || tt1 == GlslTokenType.KW_IF || tt1 == GlslTokenType.KW_WHILE || tt1 == GlslTokenType.KW_FOR) && tt2 == GlslTokenType.LRB
                        || tt1 == GlslTokenType.IDENTIFIER && tt2 == GlslTokenType.LSB
                        || tt1 == GlslTokenType.OP_LOGICAL_UNARY
                        || (tt1 == GlslTokenType.OP_INC || tt1 == GlslTokenType.OP_DEC) && tt2 == GlslTokenType.IDENTIFIER
                        || (tt2 == GlslTokenType.OP_INC || tt2 == GlslTokenType.OP_DEC) && (tt1 == GlslTokenType.IDENTIFIER || tt1 == GlslTokenType.RRB)) {

                }*/
                if (tt1 == AntlrGlslLexer.LCB
                        || tt1 == AntlrGlslLexer.SINGLE_LINE_COMMENT
                        || (tt1 == AntlrGlslLexer.RCB && tt2 != AntlrGlslLexer.SEMICOLON && tt2 != AntlrGlslLexer.KW_ELSE)
                        || tt1 == AntlrGlslLexer.SEMICOLON && forHeaderBraceCount == 0
                        || tt1 == AntlrGlslLexer.MACRO) {
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
                    //if (indentLevel == 0 && tt1 == GlslTokenType.RCB || tt2 == GlslTokenType.KW_STRUCT) {
                    //    ret += "\n";
                    //}
                    for (int j = 0; j < newLineCount - 1; j++) {
                        ret += "\n";
                    }
                    newLineCount = 0;
                    for (int j = 0; j < (tt2 == AntlrGlslLexer.RCB /*GlslTokenType.RCB*/ ? indentLevel - 1 : indentLevel); j++) {
                        ret += "    ";
                    }
                    indent = false;
                }
                ret += current.getText();

                if (tt2 == AntlrGlslLexer.LCB) {
                    //if (tt2 == GlslTokenType.LCB) {
                    indentLevel++;
                } else if (tt2 == AntlrGlslLexer.RCB) {
                    //} else if (tt2 == GlslTokenType.RCB) {
                    indentLevel--;
                }

                lastReal = current;
                tt1 = tt2;
            }
        }

        int len = context.document().getLength();
        context.document().insertString(len, ret, null);
        context.document().remove(0, len);
    }

    @Override
    public ExtraLock reformatLock() {
        return null;
    }

}
