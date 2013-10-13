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
    
    public int spacesUsed() {
        int actualSquares = 64;
        int actualPieces = 24;
        double percentage;
        Scanner squaresInput = new Scanner(System.in);
        System.out.println("How many squares are on a checker board?");
        int squares = squaresInput.nextInt();
        if (squares != actualSquares) {
            System.out.println("That is incorrect");
            return -1;
        }
        Scanner piecesInput = new Scanner(System.in);
        System.out.println("How many pieces are on a checker board?");
        int pieces = piecesInput.nextInt();
        if (pieces != actualPieces) {
            System.out.println("That is incorrect");
            return -1;
        }
        
        percentage = ((double)actualPieces / (double)actualSquares * 100);
        
        System.out.println("\n\t" + percentage + "% of the squares on checker board contain pieces.");
        
        return 0;
    }
    
}
