package checkers.controls;

import checkers.Board;
import checkers.BoardView;
import checkers.CheckersError;
import checkers.Game;
import checkers.Location;
import checkers.Player;
import checkers.enums.ErrorType;
import checkers.menus.GamePreferencesMenuView;
import checkers.menus.HelpMenuView;
import java.awt.Point;
import java.util.Objects;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class GameMenuControl {
    
    private Game game;
    private Board board;
    private Location getLocation = new Location();
    private BoardView boardView = new BoardView();

    
    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }

    public BoardView getBoardView() {
        return boardView;
    }
    
     
    /* 
     * Take a turn action
     */
    public void takeTurn() {
        
        int returnValue = 1;
        
        if (!this.game.getStatus().equals(Game.NEW_GAME)  && 
            !this.game.getStatus().equals(Game.PLAYING)) {
            new CheckersError(ErrorType.ERROR102).display();
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
        boolean jump = false;
        if (!this.game.getStatus().equals(Game.NEW_GAME)  &&
            !this.game.getStatus().equals(Game.PLAYING)) {
            new CheckersError(ErrorType.ERROR103).display();
            return -1;
        } 
        
        this.game.setStatus(Game.PLAYING);

        Point markerLocation = getLocation.getMarkerLocation(this.game);
        if (markerLocation == null) { // no location was entered?
            return -1;
        }
        
        Point moveLocation = getLocation.getMoveLocation(this.game, false);
        if (moveLocation == null) { // no location was entered?
            return -1;
        }
        
        Point[] jumpCorners = {
          new Point(markerLocation.x-2,markerLocation.y-2),  
          new Point(markerLocation.x-2,markerLocation.y+2),  
          new Point(markerLocation.x+2,markerLocation.y-2),  
          new Point(markerLocation.x+2,markerLocation.y+2)
        };
        
        this.game.getBoard().occupyLocation(player, markerLocation.x, markerLocation.y, moveLocation.x, moveLocation.y);
        this.game.getBoard().unoccupyLocation(game, markerLocation.x, markerLocation.y, noJump);        
        
        if (jumpCorners[0].equals(moveLocation) || jumpCorners[1].equals(moveLocation) || jumpCorners[2].equals(moveLocation) 
                || jumpCorners[3].equals(moveLocation))
            jump = board.canJumpAgain(game, moveLocation.x, moveLocation.y);
            while (jump) {
                boardView.displayBoard(board);
                int moveRow = getLocation.getMoveRow()-1;
                int moveCol = getLocation.getMoveCol()-1;
                Point newMoveLocation = getLocation.getMoveLocation(this.game, jump);
                    if (newMoveLocation == null) { // no location was entered?
                        return -1;
                    }
                this.game.getBoard().occupyLocation(player, moveRow, moveCol, newMoveLocation.x, newMoveLocation.y);
                this.game.getBoard().unoccupyLocation(game, moveRow, moveCol, noJump);
                jump = board.canJumpAgain(game, newMoveLocation.x, newMoveLocation.y);
            }
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

    public Location getGetLocation() {
        return getLocation;
    }

    public void setGetLocation(Location getLocation) {
        this.getLocation = getLocation;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.getLocation);
        hash = 83 * hash + Objects.hashCode(this.boardView);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GameMenuControl other = (GameMenuControl) obj;
        if (!Objects.equals(this.getLocation, other.getLocation)) {
            return false;
        }
        if (!Objects.equals(this.boardView, other.boardView)) {
            return false;
        }
        return true;
    }
        
}
