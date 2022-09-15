package compiler.objects.behaviour;

import compiler.Parser;
import compiler.enums.ComponentType;
import compiler.objects.Component;
import javafx.util.Pair;
import org.antlr.runtime.Token;

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
    public void addImplementation(Token id, String name, Component component) {
        implementedComponent.put(name, component);
    }

    @Override
    public void addRelation(Token id, String name, String cardinality, Component component) {
        relatedComponent.put(name, new Pair<>(component, cardinality));
    }

    @Override
    public void addExtension(Token id, String name, Component component) {
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
    public void setUpRelations(Token token, Component component) {
        if (implementedComponent.containsKey(component.getName())) {
            if (component.getComponentType().equals(ComponentType.INTERFACE)) {
                implementedComponent.replace(component.getName(), component);
            } else {
                Parser.addError("Can't implement a class", token);
            }
        } else if (relatedComponent.containsKey(component.getName())) {
            relatedComponent.replace(component.getName(), new Pair<>(component, relatedComponent.get(component.getName()).getValue()));
        } else if (extendedComponent.containsKey(component.getName())) {
            if (component.getComponentType().equals(ComponentType.CLASS)) {
                extendedComponent.replace(component.getName(), component);
            } else {
                Parser.addError("Can't extend an interface", token);
            }
        }
    }

    @Override
    public void checkClassesExistence(Token token) {
        for (String key : implementedComponent.keySet()) {
            if (implementedComponent.get(key) == null) {
                Parser.addError(String.format("Interface %s doesn't exist", key), token);
            }
        }
        for (String key : relatedComponent.keySet()) {
            if (relatedComponent.get(key).getKey() == null) {
                Parser.addError(String.format("Class %s doesn't exist", key), token);
            }
        }
        for (String key : extendedComponent.keySet()) {
            if (extendedComponent.get(key) == null) {
                Parser.addError(String.format("Class %s doesn't exist", key), token);
            }
        }
    }
}
