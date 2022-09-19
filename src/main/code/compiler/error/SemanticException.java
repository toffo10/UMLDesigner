package compiler.error;

import org.antlr.runtime.Token;

public class SemanticException extends Exception {

    private Token errorToken;

    public SemanticException(String message, Token token) {
        super(message);

        this.errorToken = token;
    }

    public Token getErrorToken() {
        return errorToken;
    }
}
