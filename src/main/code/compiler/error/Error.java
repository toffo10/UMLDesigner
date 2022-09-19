package compiler.error;

import compiler.enums.ERROR_TYPE;

import java.io.Serializable;

public class Error implements Serializable {
    private String message;
    private ERROR_TYPE type;

    public Error() {
    }

    public Error(String message) {
        this.message = message;
        type = ERROR_TYPE.GENERIC;
    }

    public Error(String message, ERROR_TYPE type) {
        this.message = message;
        this.type = type;
    }

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
