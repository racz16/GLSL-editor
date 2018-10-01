package hu.racz.zalan.editor.syntaxhighlighting;

import org.netbeans.api.lexer.*;

public class GlslTokenId implements TokenId {

    private final String name;
    private final TokenCategory category;
    private final int id;
    private static final Language<GlslTokenId> LANGUAGE = new GlslLanguageHierarchy().language();

    public GlslTokenId(String name, TokenCategory category, int id) {
        this.name = name;
        this.category = category;
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
        return category.getCategoryName();
    }

    public static final Language<GlslTokenId> getLanguage() {
        return LANGUAGE;
    }

}
