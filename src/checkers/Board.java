/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Mike Coleman
 */
public class Board {
    int rowCount = 8;
    int columnCount = 8;
    
    public Board() {
        
    }
    
    public void displaySize() {
        System.out.println("\nThe board is " + this.rowCount + " by " + this.columnCount + " in size.");
    }
}
