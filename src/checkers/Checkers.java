/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Scanner;

/**
 *
 * @author
 * Mark Earl
 */
public class Checkers {
        String name;
        String instructions = "This is Checkers! It is a fun game! You'll love it! It is a two player game.\n"
                            + "Each player starts with 12 pieces called checkers. One player has red checkers\n"
                            + "while the other player has black. In the game one color will be represented by\n"
                            + "\"x\" and the other will be represented by \"o\". The game bored has 2 colors on\n"
                            + "it: white and black. The checkers will be placed on the lighter color squares.\n"
                            + "The way checkers move is diagonal. If an opponent’s checker is directly diagonal\n"
                            + "to them and the space diagonal to the opponent is empty then the player must jump\n" 
                            + "their opponent on their turn resulting in the opponent’s checker being lost and\n"
                            + "is removed from the board. If while playing you successfully navigate a piece\n"
                            + "to the opposite side of the board then your checker is kinged and can move both\n" 
                            + "forward and backward diagonally now. These kings will be represented by \"X\"\n"
                            + "and \"O\". Once one player successfully takes all of their opponent's checkers\n"
                            + "the game is over and the remaining player wins.";
        
        public static void main(String[] args) {
            Checkers myGame = new Checkers();
            myGame.getName();
            myGame.displayHelp();
    }
        public void getName() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name: ");
            this.name = input.next();
        }
        
        public void displayHelp() {
            System.out.println("\nWelcome " + this.name + "\n");
            System.out.println(this.instructions);
        }
}