package checkers.exceptions;

/**
 *
 * @author
 * Mark Earl & Ryan Plumb
 */
public class MenuException extends Exception {

    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
    
}
