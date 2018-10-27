package hu.racz.zalan.editor.core.scope.type;

public enum TypeCategory {
    CUSTOM,
    TRANSPARENT,
    FLOATING_POINT_OPAQUE,
    SIGNED_INTEGER_OPAQUE,
    UNSIGNED_INTEGER_OPAQUE;

    public String getXmlName() {
        return this.name()
                .replaceAll("_", "-")
                .toLowerCase();
    }
}
