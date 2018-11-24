package hu.racz.zalan.editor.core.scope.function;

public class FunctionPrototype extends FunctionBase {

    //TODO: biztosan kell külön prototype meg definition?
    //és kell ezeknek getter? nem elég a function-on keresztül elérni?
    private FunctionDefinition definition;

    public FunctionDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(FunctionDefinition definition) {
        this.definition = definition;
    }
}
