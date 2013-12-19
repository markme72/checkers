package checkers.controls;

import javax.swing.JTextArea;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class HelpMenuControl {

    public HelpMenuControl() {
    
}
    String helpBoarder = "************************************************************************";
    
    public void displayBoardHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nThe game board for Checkers. It consists of a grid of "
                + "\nlocations. Players have 12 pieces on different locations "
                + "\non the board. The board size is 8 rows by 8 columns.\n" + helpBoarder);
    }
    
    
        
    public void displayGameHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nThe objective of the game is to be the first player to take all "
                + "\nof the opponents pieces. Each player takes turns moving their"
                + "\nmarker diagonally toward the opponent on the locations on the "
                + "\nboard. The first player to overtake all of their opponents pieces wins.\n" + helpBoarder);
    }
            
    public void displayRealPlayerHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nA player takes their turn by placing their marker "
                + "\nin an unused location diagonally from the piece they desire"
                + "\nto move on the board.\n" + helpBoarder);
    }
    
             
    public void displayLocationHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nA location on the board is where a player can place their marker."
                + "\nThey are all diagonal from their marker.\n" + helpBoarder);
    }
                 
    public void displayMarkerHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nA symbol that \"marks\" the locations in the board that are occupied "
                + "by\na player. "
                + "The default markers are \"x\" and \"o\". If a certain marker is"
                + "\nkinged then it is displayed as either \"X\" or \"O\".\n" + helpBoarder);
    }
    
    public void displayMovementHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nA marker can only move one space diagonally toward their opponent"
                + "\nif the space is not taken by another marker. A kinged piece"
                + "\n(i.e. X or O) can move forwards or backwards diagonally.\n" + helpBoarder);
    }
    
     public void displayOvertakingHelp(JTextArea textArea) {
        textArea.setText("\n" + helpBoarder + "\nIf an opponents marker is diagonal from your marker and their is no"
                + "\nmarker behind theirs, you have to overtake their marker by jumping"
                + "\nit. If a marker is overtaken and another can be overtaken by the same"
                + "\npiece then you must continue until no other jumps are possible.\n" + helpBoarder);
    }
    
    private void displayHelpBoarder() {       
        System.out.println(
        "\t************************************************************************");
    }
}
