package hu.racz.zalan.editor.syntaxhighlighting;

public enum TokenCategory {
    MACRO,
    KEYWORD,
    ERROR,
    QUALIFIER,
    TYPE,
    NUMBER,
    OPERATOR,
    COMMENT,
    IDENTIFIER,
    WHITESPACE,
    DEFAULT;

    private final String categoryName;

    private TokenCategory() {
        this.categoryName = name().toLowerCase();
    }

    public String getCategoryName() {
        return categoryName;
    }
}
