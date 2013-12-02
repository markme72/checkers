/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import checkers.enums.ErrorType;
import checkers.interfaces.DisplayInfo;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class CheckersError implements DisplayInfo {
    ErrorType error;

    public CheckersError(ErrorType error) {
        this.error = error;
    }

    @Override
    public void display() {
        String message = (String) this.error.getMessage();                            
        System.out.println("\tZOMG!!!!!!!!!!!!!!!!!!!!!!! YOU DID SOMETHING WRONG !!!!!!!!!!!!!!!!!!!!!!!GMOZ");
        System.out.println("\t ERROR: " + message);
        System.out.println("\tZOMG!!!!!!!!!!!!!!!!!!!!!!!    DON'T DO IT AGAIN    !!!!!!!!!!!!!!!!!!!!!!!GMOZ");
    }
}