/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class CheckersError {

    public Object displayError(Object object) {
        String message = (String) object;
                              
        System.out.println("\tZOMG!!!!!!!!!!!!!!!!!!!!!!! YOU DID SOMETHING WRONG !!!!!!!!!!!!!!!!!!!!!!!GMOZ");
        System.out.println("\t ERROR: " + message);
        System.out.println("\tZOMG!!!!!!!!!!!!!!!!!!!!!!!    DON'T DO IT AGAIN    !!!!!!!!!!!!!!!!!!!!!!!GMOZ");
        return null;
    }
    
}