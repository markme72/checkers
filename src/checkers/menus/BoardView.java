package checkers.menus;

import checkers.frames.GameFrame;
import checkers.models.Board;
import checkers.models.Game;
import checkers.models.Player;
import javax.swing.JLabel;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class BoardView {
    
    private Board board;
    private Game game;
    
    public void displayBoard(Board board, JLabel[][] markerLocationsView, Game game) {
        this.board = board;
        this.game = game;
        
        // for all rows in the board
        for (int i = 0; i < this.board.getRowCount(); i++) {
            // get the list of list of columns locations in the row
            Player[] boardLocations = this.board.getBoardLocations()[i];
            JLabel[] markerLocations = markerLocationsView[i];
            
            // print the contents of each location in the row
            this.printBoard(markerLocations, boardLocations, game); 
        }
        
        System.out.println(); // print blank line after the board
    }

    private void printHeadRow() {

        // print the first column in the header row
        System.out.print("\n\t      1   ");
        
        // print remaining header cells in row between the first and last column
        int columnsInRow = this.board.getColumnCount();
        for (int i = 1; i < columnsInRow - 1; i++) {
            int col = i + 1;
            System.out.print("  " + col + "   ");
        }
        // print the header for the last column in the header
        System.out.print("  " + columnsInRow + "    ");
    }

    private void printDividerRow() {

        // print the divider for the first column in the row
        System.out.print("\n\t  |------");
        
        int columnsInRow = this.board.getColumnCount();
        // print remaining divider for each column between the first and last
        for (int i = 1; i < columnsInRow - 1; i++) {
            System.out.print("------");
        }
        // print the row divider for the last column in the row
        System.out.print("-------|");
    }

    private void printRow(int rowNumber, Player[] rowLocations) {
        
        // print contents of first column in the row
        String letter = "       ";
        if (rowNumber % 2 == 0) {
            letter = " |||||";
        }
        
        if (rowLocations[0] != null && !rowLocations[0].getMarker().equals("$")) {
            letter = "   " + rowLocations[0].getMarker() + "   ";
        }
        System.out.print("\n\t" + rowNumber + " |" + letter);

        // print the contents of the rest of the columns in the row 
        for (int i = 1; i < rowLocations.length; i++) {
            if ((i + rowNumber) % 2 == 0) {
                letter = "|||||";
            }
            
            else if (rowLocations[i] == null) {
                letter = "       ";
            } else {
                letter = "   " + rowLocations[i].getMarker() + "   ";
            }
            
            System.out.print(letter);
        }
        if (rowNumber % 2 == 0){
            System.out.print("|");
        }
        else {
            System.out.print(" |");
        }        
    }

    private void printBoard(JLabel[] markerLocations, Player[] boardLocations, Game game) {
        for (int i=0; i < 8; i++) {
            if (markerLocations[i] != null){
                if (boardLocations[i] == game.getPlayerA() || boardLocations[i] == game.getPlayerB() || 
                    boardLocations[i] == game.getKingedPlayerA() || boardLocations[i] == game.getKingedPlayerB()) {
                    markerLocations[i].setText(boardLocations[i].getMarker());
                }
                else if (boardLocations[i] == null){
                    markerLocations[i].setText("");
                }
            }
        }
    }
    
    
}
