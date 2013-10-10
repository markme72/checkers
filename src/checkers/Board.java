/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Mike Coleman
 */
public class Board {
    int actualRowCount = 8;
    int actualColumnCount = 8;
    
    public Board() {
        
    }
    
    public void displaySize() {
        System.out.println("\nThe board is " + this.actualRowCount + " by " + this.actualColumnCount + " in size.\n");
    }
    
    // Paired Programming Assignment L3 Part 2
    public int boardSize() {
        Scanner inputRow = new Scanner(System.in);
        System.out.println("How many rows does a checker board have? ");
        long row = inputRow.nextInt();
        if (row < 0) {
            System.out.println(row + " is not a valid number. Must be a positive number.");
            return -1;
        }
        Scanner inputColumn = new Scanner(System.in);
        System.out.println("How many columns does a checker board have? ");
        long col = inputColumn.nextInt();
        if (col < 0) {
            System.out.println(col + " is not a valid number. Must be a positive number.");
            return -1;
        }
        
        int squares = (int)(row * col);
        int actualSquares = actualRowCount * actualColumnCount;     
        
        if (squares != actualSquares) {
            System.out.println("\n\t" + row + "x" + col + " is not the correct dimensions.\n"
                    + "\tA checker board does not have " + squares + " squares.\n"
                    + "\t" + actualRowCount + "x" + actualColumnCount + " is the correct dimensions.\n"
                    + "\tA checker board has " + actualSquares + " squares.\n");
        }
        else {
            System.out.println("\n\t" + row + "x" + col + " is the correct board dimensions!\n"
                    + "\tA checker board does have " + squares + " squares.\n");
        }
        return 0;
    //End of Paired Programming Assignment L3 P2
        
    }
    
}
