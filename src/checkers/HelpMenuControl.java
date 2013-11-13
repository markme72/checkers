package checkers;

/**
 *
 * @author Mark Earl
 */
public class HelpMenuControl {

    public HelpMenuControl() {
    
}
    
    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBoarder();             
        System.out.println( 
                "\tThe game board for Checkers. It consists of a grid of "
                + "\n\tlocations. Players have 12 pieces on different locations "
                + "\n\ton the board. The board size is 8 rows by 8 columns.");
        displayHelpBoarder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
                 "\tThe objective of the game is to be the first player to take all "
                + "\n\tof the opponents pieces. Each player takes turns moving their"
                + "\n\tmarker diagonally toward the opponent on the locations on the "
                + "\n\tboard. The first player to overtake all of their opponents pieces wins."
                ); 
        displayHelpBoarder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
                "\tA player takes their turn by placing their marker "
                + "\n\tin an unused location diagonally from the piece they desire"
                + "\n\tto move on the board."
                ); 
        displayHelpBoarder();
    }
    
             
    public void displayLocationHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
               "\tA location on the board is where a player can place their marker."
                + "\n\tThey are all diagonal from their marker."
                ); 
        displayHelpBoarder();
    }
                 
    public void displayMarkerHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
               "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by\n\ta player. "
                + "The default markers are \"x\" and \"o\". If a certain marker is"
                + "\n\tkinged then it is displayed as either \"X\" or \"O\"."
                ); 
        displayHelpBoarder();
    }
    
    public void displayMovementHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
               "\tA marker can only move one space diagonally toward their opponent"
                + "\n\tif the space is not taken by another marker. A kinged piece"
                + "\n\t(i.e. X or O) can move forwards or backwards diagonally."
                ); 
        displayHelpBoarder();
    }
    
     public void displayOvertakingHelp() {
        System.out.println();
        displayHelpBoarder();     
        System.out.println( 
               "\tIf an opponents marker is diagonal from your marker and their is no"
                + "\n\tmarker behind theirs, you have to overtake their marker by jumping"
                + "\n\tit. If a marker is overtaken and another can be overtaken by the same"
                + "\n\tpiece then you must continue until no other jumps are possible."
                ); 
        displayHelpBoarder();
    }
    
    public void displayHelpBoarder() {       
        System.out.println(
        "\t************************************************************************");
    }
}
