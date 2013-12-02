package checkers.enums;

/**
 *
 * @author
 * Mark Earl, Ryan Plumb
 */
public enum ErrorType {
    ERROR101 ("Invalid command. Please enter a valid command."),
    ERROR102 ("You must start a new game first."),
    ERROR103 ("There is no active game. You must start a new game before \n"
              + "you can take a turn"),
    ERROR104 ("You must enter a valid row and column, "
                        + "or a \"Q\" to quit."),
    ERROR105 ("You must enter a number between 1-8 for both the row and column."),
    ERROR106 ("You do not have a marker here. Select another location"),
    ERROR107 ("This marker has no moves. Select another marker."),
    ERROR108 ("The current location is taken. Select another location"),
    ERROR109 ("This marker cannot move here. Select another location."),
    ERROR110 ("There is no marker at this location. "
                    + "Try a different location."),
    ERROR111 ("This is not your marker. "
                    + "Try a different location.");
    
    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
}
