package hu.racz.zalan.editor.core.scope.function;

public class FunctionDefinition extends FunctionBase {

    private FunctionPrototype prototype;

    public FunctionPrototype getPrototype() {
        return prototype;
    }

    public void setPrototype(FunctionPrototype prototype) {
        this.prototype = prototype;
    }
}
