/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.exceptions;

/**
 *
 * @author
 * markearl
 */
public class CheckersException extends Exception {

    public CheckersException() {
    }

    public CheckersException(String message) {
        super(message);
    }

    public CheckersException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckersException(Throwable cause) {
        super(cause);
    }
    
}
