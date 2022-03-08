package compiler.util;

import java.util.List;

public interface ComponentBehaviour {
    void addImplementation(String name, Component component);

    void addRelation(String name, Component component);

    void addExtension(String name, Component component);

    List<Component> getImplementedComponents();

    List<Component> getRelatedComponents();

    List<Component> getExtendedComponents();

    void setUpRelations(Component component);

    void checkClassesExistence();
}
