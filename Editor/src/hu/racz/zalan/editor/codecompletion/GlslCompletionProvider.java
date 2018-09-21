package hu.racz.zalan.editor.codecompletion;

import hu.racz.zalan.editor.antlr.generated.AntlrGlslLexer;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParser;
import hu.racz.zalan.editor.antlr.generated.AntlrGlslParserBaseListener;
import hu.racz.zalan.editor.errordisplay.GlslParser;
import hu.racz.zalan.editor.errordisplay.scope.Function;
import hu.racz.zalan.editor.errordisplay.scope.GlslVisitor;
import hu.racz.zalan.editor.errordisplay.scope.Scope;
import hu.racz.zalan.editor.errordisplay.scope.Variable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.completion.CompletionProvider;
import org.netbeans.spi.editor.completion.CompletionResultSet;
import org.netbeans.spi.editor.completion.CompletionTask;
import org.netbeans.spi.editor.completion.support.AsyncCompletionQuery;
import org.netbeans.spi.editor.completion.support.AsyncCompletionTask;
import org.openide.util.Exceptions;

@MimeRegistration(mimeType = "text/x-glsl", service = CompletionProvider.class)
public class GlslCompletionProvider implements CompletionProvider {

    public GlslCompletionProvider() {
    }

    private List<String> functions = new ArrayList<>();

    private class FuncListener extends AntlrGlslParserBaseListener {

        @Override
        public void exitFunction_prototype(AntlrGlslParser.Function_prototypeContext ctx) {
            functions.add(ctx.function_signature().IDENTIFIER().getText());
        }
    }

    @Override
    public CompletionTask createTask(int queryType, JTextComponent jtc) {
        if (queryType != CompletionProvider.COMPLETION_QUERY_TYPE) {
            return null;
        }

        return new AsyncCompletionTask(new AsyncCompletionQuery() {

            @Override
            protected void query(CompletionResultSet completionResultSet, Document document, int caretOffset) {
                try {
                    functions.clear();
                    String s = document.getText(0, document.getLength());
                    //System.out.println(s);
                    ANTLRInputStream ais = new ANTLRInputStream(s);
                    Lexer lexer = new AntlrGlslLexer(ais);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    AntlrGlslParser glslParser = new AntlrGlslParser(tokens);
                    glslParser.addParseListener(new FuncListener());
                    ParseTree pt = glslParser.start();

                    GlslVisitor visitor = new GlslVisitor(caretOffset);
                    visitor.visit(pt);

                    //System.out.println(tokens.getTokens(caretOffset, caretOffset).get(0));
                    //Iterate through the available locales
                    //and assign each country display name
                    //to a CompletionResultSet:
                    /*Locale[] locales = Locale.getAvailableLocales();
                    for (int i = 0; i < locales.length; i++) {
                        final Locale locale = locales[i];
                        final String country = locale.getDisplayCountry();
                        if (!country.equals("")) {
                            completionResultSet.addItem(new GlslCompletionItem(country, caretOffset));
                        }
                    }*/
                    Scope rs = visitor.getCaretScope();
                    while (rs != null) {
                        for (int i = 0; i < rs.getVariableCount(); i++) {
                            Variable var = rs.getVariable(i);
                            if (var.getEndIndex() < caretOffset) {
                                completionResultSet.addItem(new GlslCompletionItem(var.getName(), var.getType(), caretOffset, "variable.png"));
                            }
                        }
                        rs = rs.getParent();
                    }

                    for (int i = 0; i < visitor.getRootScope().getFunctionPrototypeCount(); i++) {
                        Function func = visitor.getRootScope().getFunctionPrototype(i);
                        if (func.getEndIndex() < caretOffset) {
                            completionResultSet.addItem(new GlslCompletionItem(func.getName() + "()", func.getReturnType(), caretOffset, "function.png"));
                        }
                    }

                    completionResultSet.finish();
                } catch (BadLocationException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }

        }, jtc);
    }

    @Override
    public int getAutoQueryTypes(JTextComponent jtc, String string) {
        return 0;
    }

}
