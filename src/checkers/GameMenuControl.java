/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;


import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Mark Earl, Ryan Plumb, Mike Coleman
 */
public class GameMenuControl {
    
    private Game game;
    private Board board;
    private Location getLocationView = new Location();
    private BoardView boardView = new BoardView();

    
    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }
    
     
    /* 
     * Take a turn action
     */
    public void takeTurn() {
        
        int returnValue = 1;
        
        if (!this.game.getStatus().equals(Game.NEW_GAME)  && 
            !this.game.getStatus().equals(Game.PLAYING)) {
            new CheckersError().displayError("You must start a new game first.");
            return;
        } else {
    }
         
            // regular player takes turn
            returnValue = this.regularPlayerTurn(this.game.getCurrentPlayer());            

            this.displayBoard();
            this.alternatePlayers(); // alternate players             
            
            // other player takes turn 
            returnValue = this.regularPlayerTurn(this.game.getCurrentPlayer());            

            this.game.getBoard().kingMe(game);
            this.displayBoard();
            this.alternatePlayers(); // alternate players
    }
    
    
    /*
     * Display the board acton
     */
    public void displayBoard() {
        boardView.displayBoard(this.board);
    }
    
    /*
     * Start a new game action
     */
    public void startNewGame() {
        this.game.start();
        this.board.setInvalidLocations(game);
        this.board.setInitialLocations(game);
        this.displayBoard();
    }
  
    
    
    // Display game statistics
    public void displayGameStatistics() {
        int playerAPieces = this.game.getPlayerA().getNumOfMarkers();
    }
    
    /*
     * Display statistics action
     */
     public void displayPlayerStatistics() {
        String playerAStatistics = this.game.getPlayerA().getPlayerStastics();
        String playerBStatistics = this.game.getPlayerB().getPlayerStastics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerAStatistics);
        System.out.println("\n\t " + playerBStatistics);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
     
     /*
      * Display game preferences menu action
      */ 
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferenceMenuView = new GamePreferencesMenuView(this.game);
        gamePreferenceMenuView.getInput();
    }
    
    
    /*
      * Display help menu action
      */
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    

    
    private void displayGameOverMessage(Player player, String message) {
        System.out.println("\n\t************************************************");
        System.out.println("\t " + player.getName() + ": " + message);
        System.out.println("\t************************************************");
    }
    
    /*
     * A regular player takes a turn
     * @parameter player The player taking the turn
     */
    private int regularPlayerTurn(Player player) {
        boolean noJump = false;
        if (!this.game.getStatus().equals(Game.NEW_GAME)  &&
            !this.game.getStatus().equals(Game.PLAYING)) {
            new CheckersError().displayError(
                    "There is no active game. You must start a new game before "
                    + "you can take a turn");
            return -1;
        } 
        
        this.game.setStatus(Game.PLAYING);

        Point markerLocation = getLocationView.getMarkerLocation(this.game);
        if (markerLocation == null) { // no location was entered?
            return -1;
        }
        
        Point moveLocation = getLocationView.getMoveLocation(this.game);
        if (moveLocation == null) { // no location was entered?
            return -1;
        }
        
        this.game.getBoard().occupyLocation(player, markerLocation.x, markerLocation.y, moveLocation.x, moveLocation.y);
        this.game.getBoard().unoccupyLocation(this.game.getCurrentPlayer(), markerLocation.x, markerLocation.y, noJump);        
        return 0;
    }

    /*
     * Alternate players
     */
    public void alternatePlayers() {
        if (this.game.getCurrentPlayer() == this.game.getPlayerA()) {
            this.game.setCurrentPlayer(this.game.getPlayerB());
            this.game.setKingedCurrentPlayer(this.game.getKingedPlayerB());
            this.game.setOtherPlayer(this.game.getPlayerA());            
            this.game.setKingedOtherPlayer(this.game.getKingedPlayerA());

        } else {
            this.game.setCurrentPlayer(this.game.getPlayerA());
            this.game.setKingedCurrentPlayer(this.game.getKingedPlayerA());
            this.game.setOtherPlayer(this.game.getPlayerB());
            this.game.setKingedOtherPlayer(this.game.getKingedPlayerB());

        }
    }
   
    /* 
     * Is the game tied?
     */ 
    private boolean isTie() {
        
        Player[][] locations = this.board.getBoardLocations();
        
        // for every row in the table
        for (int row = 0; row < locations.length; row++) {
            
            Player[] rowLocations = locations[row];
            
            // for every column in the row
            for (int col = 0; col < rowLocations.length; col++) {
                Player location = rowLocations[col]; // get contents of cell
                if (locations[row][col] == null) { // location not taken yet?
                    return false;
                }
            }
        }

        return true; // all locations are taken
    }
    
      /* 
     * Clear the board action
     */
    public void clearTheBoard() {
        Player[][] locations = this.game.getBoard().getBoardLocations();
        
        for (int i = 0; i < this.board.getBoardLocations().length; i++) {
            Player[] rowlocations = locations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        }
    }
        
}
