package compiler.objects.behaviour;

import compiler.error.SemanticException;
import compiler.objects.Component;
import javafx.util.Pair;
import org.antlr.runtime.Token;

import java.util.List;

public interface ComponentBehaviour {
    void addImplementation(Token id, String name, Component component) throws SemanticException;

    void addRelation(Token id, String name, String cardinality, Component component);

    void addExtension(Token id, String name, Component component);

    List<Component> getImplementedComponents();

    List<Pair> getRelatedComponents();

    List<Component> getExtendedComponents();

    void setUpRelations(Token token, Component component) throws SemanticException;

    void checkClassesExistence(Token token) throws SemanticException;
}
