package compiler.error;

import compiler.enums.ERROR_TYPE;

import java.io.Serializable;

public class Error implements Serializable {
    private String message;
    private ERROR_TYPE type;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ERROR_TYPE getType() {
        return type;
    }

    public void setType(ERROR_TYPE type) {
        this.type = type;
    }
}
