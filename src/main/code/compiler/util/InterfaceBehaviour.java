package compiler.util;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBehaviour implements ComponentBehaviour {
    public InterfaceBehaviour() {
    }

    @Override
    public void addImplementation(String name, Component component) {
        System.out.println("Non è possibile effettuare l'implements su una interfaccia");
    }

    @Override
    public void addRelation(String name, String cardinality, Component component) {
        System.out.println("Non è possibile aggiungere relazioni su una interfaccia");
    }

    @Override
    public void addExtension(String name, Component component) {
        System.out.println("Non è possibile estendere una interfaccia");
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
