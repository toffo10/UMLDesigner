package compiler.util;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;

public class ClassBehaviour implements ComponentBehaviour {
    HashMap<String, Component> implementedComponent;
    HashMap<String, Component> extendedComponent;
    HashMap<String, Pair> relatedComponent;

    public ClassBehaviour() {
        implementedComponent = new HashMap<>();
        extendedComponent = new HashMap<>();
        relatedComponent = new HashMap<>();
    }

    @Override
    public void addImplementation(String name, Component component) {
        implementedComponent.put(name, component);
    }

    @Override
    public void addRelation(String name, String cardinality, Component component) {
        relatedComponent.put(name, new Pair<>(component, cardinality));
    }

    @Override
    public void addExtension(String name, Component component) {
        extendedComponent.put(name, component);
    }

    @Override
    public List<Component> getImplementedComponents() {
        return implementedComponent.values().stream().toList();
    }

    @Override
    public List<Pair> getRelatedComponents() {
        return relatedComponent.values().stream().toList();
    }

    @Override
    public List<Component> getExtendedComponents() {
        return extendedComponent.values().stream().toList();
    }

    @Override
    public void setUpRelations(Component component) {
        if (implementedComponent.containsKey(component.getName())) {
            if (component.getComponentType().equals(ComponentType.INTERFACE))
                implementedComponent.replace(component.getName(), component);
        } else if (relatedComponent.containsKey(component.getName())) {
                relatedComponent.replace(component.getName(), new Pair<>(component, relatedComponent.get(component.getName()).getValue()));
        } else if (extendedComponent.containsKey(component.getName())) {
            if (component.getComponentType().equals(ComponentType.CLASS))
                extendedComponent.replace(component.getName(), component);
        }
    }

    @Override
    public void checkClassesExistence() {
        for (String key : implementedComponent.keySet()) {
            if (implementedComponent.get(key) == null) {
                System.out.printf("Non esiste l'interfaccia %s \n", key);
            }
        }
        for (String key : relatedComponent.keySet()) {
            if (relatedComponent.get(key).getKey() == null) {
                System.out.printf("Non esiste la classe %s \n", key);
            }
        }
        for (String key : extendedComponent.keySet()) {
            if (extendedComponent.get(key) == null) {
                System.out.printf("Non esiste la classe %s \n", key);
            }
        }
    }
}
