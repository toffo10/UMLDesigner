package compiler.handlers;

import compiler.util.Interface;
import org.antlr.runtime.Token;

public class UmlHandler {
    public ClassHandler classes;
    public InterfaceHandler interfaces;

    public UmlHandler() {
        classes = new ClassHandler();
        interfaces = new InterfaceHandler();
    }

    public void createNewInterface(Token id) {
        if (idAlreadyExists(id.getText()))
            System.out.printf("L'interfaccia %s esiste già \n", id.getText());
        else
            interfaces.getInterfaces().put(id.getText(), new Interface());
    }

    private boolean idAlreadyExists(String id) {
        if(interfaces.getInterfaces().containsKey(id))
            return true;
        else if (classes.getClasses().containsKey(id))
            return true;
        else
            return false;
    }
}
