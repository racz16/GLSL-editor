package hu.racz.zalan.editor.errordisplay;

import hu.racz.zalan.editor.antlr.generated.*;
import javax.swing.event.*;
import org.antlr.v4.runtime.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.*;

public class GlslParser extends Parser {

    private Snapshot snapshot;
    private AntlrGlslParser glslParser;

    @Override
    public void parse(Snapshot snpsht, Task task, SourceModificationEvent sme) throws ParseException {
	this.snapshot = snpsht;
	ANTLRInputStream ais = new ANTLRInputStream(snapshot.getText().toString());
	Lexer lexer = new AntlrGlslLexer(ais);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	glslParser = new AntlrGlslParser(tokens);
	startParser();
    }

    private void startParser() {
	glslParser.removeErrorListeners();
	glslParser.addErrorListener(new SyntaxErrorListener());
	glslParser.start();
    }

    @Override
    public Result getResult(Task task) throws ParseException {
	return new GlslEditorParserResult(snapshot, glslParser);
    }

    @Override
    public void addChangeListener(ChangeListener cl) {

    }

    @Override
    public void removeChangeListener(ChangeListener cl) {

    }

    public static class GlslEditorParserResult extends Result {

	private final AntlrGlslParser glslParser;
	private boolean valid = true;

	GlslEditorParserResult(Snapshot snapshot, AntlrGlslParser oracleParser) {
	    super(snapshot);
	    this.glslParser = oracleParser;
	}

	public AntlrGlslParser getGlslParser() throws ParseException {
	    if (!valid) {
		throw new ParseException();
	    }
	    return glslParser;
	}

	@Override
	protected void invalidate() {
	    valid = false;
	}
    }

}
