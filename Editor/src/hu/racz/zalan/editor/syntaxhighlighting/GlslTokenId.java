package hu.racz.zalan.editor.syntaxhighlighting;

import org.netbeans.api.lexer.*;

public class GlslTokenId implements TokenId {

    private final String name;
    private final String primaryCategory;
    private final int id;
    private static final Language<GlslTokenId> language = new GlslLanguageHierarchy().language();

    public GlslTokenId(String name, String primaryCategory, int id) {
	this.name = name;
	this.primaryCategory = primaryCategory;
	this.id = id;
    }

    @Override
    public String name() {
	return name;
    }

    @Override
    public int ordinal() {
	return id;
    }

    @Override
    public String primaryCategory() {
	return primaryCategory;
    }

    public static final Language<GlslTokenId> getLanguage() {
	return language;
    }

}
