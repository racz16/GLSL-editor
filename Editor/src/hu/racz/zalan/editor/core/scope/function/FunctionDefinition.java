package hu.racz.zalan.editor.core.scope.function;

public class FunctionDefinition extends FunctionBase {

    private FunctionPrototype prototype;

    public FunctionPrototype getPrototype() {
        return prototype;
    }

    public void setPrototype(FunctionPrototype prototype) {
        this.prototype = prototype;
    }

    public boolean isDefintionOf(FunctionPrototype fp) {
        return fp.isPrototypeOf(this);
    }

    @Override
    public boolean equals(Object obj) {
        FunctionDefinition fd = (FunctionDefinition) obj;
        return getSignature().equals(fd.getSignature()) && getReturnType().equals(fd.getReturnType());
    }

}
