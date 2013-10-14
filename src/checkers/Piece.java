/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Ryan Plumb
 */
public class Piece {
    public Piece() {
    
}
           
   int numOfPieces = 12;
   public void displayNumOfPieces() {
      System.out.println("\nEach Player has " + numOfPieces + ".");
      
   }
   //w3 indv programing assignment
   public int pieceColor(){
       Scanner inputColor = new Scanner(System.in);
        System.out.println("Enter a 0 for red peices or 1 for black peices ");
        long color = inputColor.nextInt();
        if (color == 0) {
            System.out.println(color + " is Red");
            return 0;}
        
            else if (color == 1) {
            System.out.println(color + " is Black");
            return 1;
        }
            else {
        System.out.println("Please Pick either a 0 for red ro a 1 for black.");
            return 2;
        }
            
        }
   }
    

