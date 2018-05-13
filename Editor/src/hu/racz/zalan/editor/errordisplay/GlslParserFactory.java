package hu.racz.zalan.editor.errordisplay;

import java.util.*;
import org.netbeans.modules.parsing.api.*;
import org.netbeans.modules.parsing.spi.*;

public class GlslParserFactory extends ParserFactory {

    @Override
    public Parser createParser(Collection<Snapshot> snapshots) {
	return new GlslParser();
    }
}
