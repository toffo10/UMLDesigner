package compiler.util;

import compiler.Parser;
import compiler.error.ERROR_TYPE;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBehaviour implements ComponentBehaviour {
    public InterfaceBehaviour() {
    }

    @Override
    public void addImplementation(String name, Component component) {
        Parser.addError("Can't implement an interface", ERROR_TYPE.SEMANTICS);
    }

    @Override
    public void addRelation(String name, String cardinality, Component component) {
        Parser.addError("Can't add relations to an interface", ERROR_TYPE.SEMANTICS);
    }

    @Override
    public void addExtension(String name, Component component) {
        Parser.addError("Can't extend an interface", ERROR_TYPE.SEMANTICS);
    }

    @Override
    public List<Component> getImplementedComponents() {
        return new ArrayList<>();
    }

    @Override
    public List<Pair> getRelatedComponents() {
        return new ArrayList<>();
    }

    @Override
    public List<Component> getExtendedComponents() {
        return new ArrayList<>();
    }

    @Override
    public void setUpRelations(Component component) {

    }

    @Override
    public void checkClassesExistence() {

    }
}
