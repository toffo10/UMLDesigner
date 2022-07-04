package compiler.objects.behaviour;

import compiler.objects.Component;
import javafx.util.Pair;

import java.util.List;

public interface ComponentBehaviour {
    void addImplementation(String name, Component component);

    void addRelation(String name, String cardinality, Component component);

    void addExtension(String name, Component component);

    List<Component> getImplementedComponents();

    List<Pair> getRelatedComponents();

    List<Component> getExtendedComponents();

    void setUpRelations(Component component);

    void checkClassesExistence();
}
