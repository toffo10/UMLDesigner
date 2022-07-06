package compiler.objects.behaviour;

import compiler.Parser;
import compiler.objects.Component;
import javafx.util.Pair;
import org.antlr.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBehaviour implements ComponentBehaviour {
    public InterfaceBehaviour() {
    }

    @Override
    public void addImplementation(Token id, String name, Component component) {
        Parser.addError("Can't implement an interface", id);
    }

    @Override
    public void addRelation(Token id, String name, String cardinality, Component component) {
        Parser.addError("Can't add relations to an interface", id);
    }

    @Override
    public void addExtension(Token id, String name, Component component) {
        Parser.addError("Can't extend an interface", id);
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
    public void checkClassesExistence(Token token) {

    }
}
