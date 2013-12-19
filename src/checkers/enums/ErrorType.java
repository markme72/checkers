package checkers.enums;

/**
 *
 * @author
 * Mark Earl, Ryan Plumb
 */
public enum ErrorType {
    ERROR101 ("Invalid command. Please enter a valid command."),
    ERROR102 ("You must start a new game first."),
    ERROR103 ("There is no active game. You must start a new\n"
            + "\tgame before you can take a turn"),
    ERROR104 ("You must enter a valid row and column, "
                        + "\tor a \"Q\" to quit."),
    ERROR105 ("You must enter a number between 1-8 for both the row and column."),
    ERROR106 ("You do not have a marker here.\n\tSelect another location"),
    ERROR107 ("This marker has no moves.\n\tSelect another marker."),
    ERROR108 ("The current location is taken.\n\tSelect another location"),
    ERROR109 ("This marker cannot move here.\n\tSelect another location."),
    ERROR110 ("There is no marker at this location.\n"
                    + "\tTry a different location."),
    ERROR111 ("This is not your marker. "
                    + "\tTry a different location.\n"),
    ERROR201 ("Game quit unexpectedly");
    
    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return    "ZOMG!!!!!!!!!!!!!! YOU DID SOMETHING WRONG !!!!!!!!!!!!!!GMOZ\n"
                + "     ERROR: " + this.message + "\n"
                + "ZOMG!!!!!!!!!!!!!!         DON'T DO IT AGAIN         !!!!!!!!!!!!!!GMOZ";
    }
}
