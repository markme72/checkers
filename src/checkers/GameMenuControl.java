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
        
        if (!this.game.status.equals(Game.NEW_GAME)  && 
            !this.game.status.equals(Game.PLAYING)) {
            new CheckersError().displayError("You must start a new game first.");
            return;
        }
         
            // regular player takes turn
            returnValue = this.regularPlayerTurn(this.game.currentPlayer);            

            this.displayBoard();
            this.alternatePlayers(); // alternate players             
            
            // other player takes turn 
            returnValue = this.regularPlayerTurn(this.game.currentPlayer);            

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
        this.game.getBoard().unoccupyLocation(this.game.getCurrentPlayer(), markerLocation.x, markerLocation.y, noJump);
        this.game.getBoard().occupyLocation(player, moveLocation.x, moveLocation.y);
        
        return 0;
    }
    
     /*
     * A regular player takes a turn
     * @parameter player The player who is the computer
     */
    private void coumputerTakesTurn(Player player) {
        // computer takes turn 
        Point location = this.getComputersSelection();
        this.game.getBoard().occupyLocation(player, location.x, location.y);
        return;
    }
    


    /*
     * Alternate players
     */
    public void alternatePlayers() {
        if (this.game.getCurrentPlayer() == this.game.getPlayerA()) {
            this.game.setCurrentPlayer(this.game.getPlayerB());
            this.game.setOtherPlayer(this.game.getPlayerA());
        } else {
            this.game.setCurrentPlayer(this.game.getPlayerA());
            this.game.setOtherPlayer(this.game.getPlayerB());
        }
    }
    


    
    
    /* 
     * Get computers selection
     */
    private Point getComputersSelection() {
        Point coordinate;

        coordinate = this.findWinningLocation(game.getCurrentPlayer());
        if (coordinate != null) { // winning location found for computer
            return coordinate;
        }

        // find winning location for other player
        coordinate = this.findWinningLocation(game.getOtherPlayer());
        if (coordinate == null) { // no winning location found for other player
            coordinate = this.chooseRandomLocation();

            if (coordinate == null) {
                new CheckersError().displayError("No empty locations found on the board");
                return null;
            }
        }
   
        return coordinate;
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
     * Is the game won
     */
/*    private boolean isWinner() {

        Player[][] locations = this.board.getBoardLocations();

        // for every row in the table
        for (int row = 0; row < locations.length; row++) {
            
            // get the list of locstaions (columns) in the row
            Player[] rowLocations = locations[row];
            
            // for every column in the row
            for (int col = 0; col < rowLocations.length; col++) {
                
                // three of the same players markers in a row?
                if (threeInARow(row, col, locations)) { 
                    return true; // three in a row found (a winner)
                }
            }
        }

        return false; // no one is a winner yet
    }
*/

    /* 
     * Find a winning location
     */
    private Point findWinningLocation(Player player) {
        Point coordinate = new Point();
        Player[][] locations = this.board.getBoardLocations();
        for (int row = 0; row < locations.length; row++) {
            Player[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                Player location = rowLocations[col];
                coordinate.setLocation(row, col);

                if (rowLocations[col] != null) { // location is occupied
                    continue;
                }

                // search for three adjacent horizontally
                if ((row < locations.length
                        && col < rowLocations.length - 2)
                        && (locations[row][col + 1] == player
                        && locations[row][col + 2] == player)) {
                    return coordinate;
                } else if ((row < locations.length
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row][col - 1] == player
                        && locations[row][col + 1] == player)) {
                    return coordinate;
                } else if ((row < locations.length && col > 1)
                        && (locations[row][col - 1] == player
                        && locations[row][col - 2] == player)) {
                    return coordinate;
                } // search for three adjacent vertically
                else if ((row < locations.length - 2
                        && col < rowLocations.length)
                        && (locations[row + 1][col] == player
                        && locations[row + 2][col] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col < rowLocations.length)
                        && (locations[row - 1][col] == player
                        && locations[row + 1][col] == player)) {
                    return coordinate;
                } else if ((row > 1 && col < rowLocations.length)
                        && (locations[row - 1][col] == player
                        && locations[row - 2][col] == player)) {
                    return coordinate;
                } // search for three adjacent diagonally leaning backward
                else if ((row < locations.length - 2
                        && col < rowLocations.length - 2)
                        && (locations[row + 1][col + 1] == player
                        && locations[row + 2][col + 2] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row - 1][col + 1] == player
                        && locations[row + 1][col - 1] == player)) {
                    return coordinate;
                } else if ((row > 1 && col > 1)
                        && (locations[row - 1][col - 1] == player
                        && locations[row - 2][col - 2] == player)) {
                    return coordinate;
                } // search for three adjacent diagonally learning forward
                else if ((row < locations.length - 2 && col > 1)
                        && (locations[row + 1][col - 1] == player
                        && locations[row + 2][col - 2] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row - 1][col + 1] == player
                        && locations[row + 1][col - 1] == player)) {
                    return coordinate;
                } else if ((row > 1 && col < rowLocations.length - 2)
                        && (locations[row - 1][col + 1] == player
                        && locations[row - 2][col + 2] == player)) {
                    return coordinate;
                }
            }
        }

        return null; // not found
    }

    /* 
     * Choose a random location
     */
    private Point chooseRandomLocation() {
        Point randomLocation;

        ArrayList<Point> listOfEmptyLocations = new ArrayList<>();
        Player[][] locations = this.board.getBoardLocations();

        // create list of empty locations
        for (int row = 0; row < locations.length; row++) {
            Player[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                Player location = rowLocations[col];
                if (location == null) { // location not occupied?
                    listOfEmptyLocations.add(new Point(row, col));
                }
            }
        }

        int noOfEmptyLocations = listOfEmptyLocations.size();

        if (noOfEmptyLocations == 0) { // no empty locations?
            return null;
        } else if (listOfEmptyLocations.size() == 1) { // only one empty location?
            randomLocation = listOfEmptyLocations.get(0);
            return randomLocation;
        } else { // randomly choose one of the empty locations
            int randomNumber = new Random().nextInt(noOfEmptyLocations);
            randomLocation = listOfEmptyLocations.get(randomNumber);
            return randomLocation;
        }
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
