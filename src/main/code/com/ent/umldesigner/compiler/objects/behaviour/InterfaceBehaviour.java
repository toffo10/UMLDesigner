package com.ent.umldesigner.compiler.objects.behaviour;

import com.ent.umldesigner.compiler.enums.ComponentType;
import com.ent.umldesigner.compiler.error.SemanticException;
import com.ent.umldesigner.compiler.objects.Component;
import javafx.util.Pair;
import org.antlr.runtime.Token;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceBehaviour implements ComponentBehaviour {

    HashMap<String, Component> extendedComponent;
    HashMap<String, Pair> relatedComponent;

    public InterfaceBehaviour() {
        extendedComponent = new HashMap<>();
        relatedComponent = new HashMap<>();
    }

    @Override
    public void addImplementation(Token id, String name, Component component) throws SemanticException {
        throw new SemanticException("Can't implement an interface", id);
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
        return new ArrayList<>();
    }

    @Override
    public List<Pair> getRelatedComponents() {
        return new ArrayList<>(relatedComponent.values());
    }

    @Override
    public List<Component> getExtendedComponents() {
        return new ArrayList<>(extendedComponent.values());
    }

    @Override
    public void setUpRelations(Token token, Component component) throws SemanticException {
        if (relatedComponent.containsKey(component.getName())) {
            relatedComponent.replace(component.getName(), new Pair<>(component, relatedComponent.get(component.getName()).getValue()));
        } else if (extendedComponent.containsKey(component.getName())) {
            if (component.getComponentType().equals(ComponentType.INTERFACE)) {
                extendedComponent.replace(component.getName(), component);
            } else {
                throw new SemanticException("An interface can't extend an class", token);
            }
        }
    }

    @Override
    public void checkClassesExistence(Token token) throws SemanticException {
        for (String key : relatedComponent.keySet()) {
            if (relatedComponent.get(key).getKey() == null) {
                throw new SemanticException(String.format("Class %s doesn't exist", key), token);
            }
        }
        for (String key : extendedComponent.keySet()) {
            if (extendedComponent.get(key) == null) {
                throw new SemanticException(String.format("Interface %s doesn't exist", key), token);
            }
        }
    }
}
