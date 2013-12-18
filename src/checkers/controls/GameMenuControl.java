package checkers.controls;

import checkers.models.Board;
import checkers.menus.BoardView;
import checkers.models.Game;
import checkers.menus.Location;
import checkers.enums.ErrorType;
import checkers.enums.StatusType;
import checkers.exceptions.GameException;
import checkers.exceptions.MenuException;
import checkers.frames.GameFrame;
import checkers.menus.GamePreferencesMenuView;
import checkers.menus.HelpMenuView;
import checkers.models.Player;
import java.awt.Point;
import java.util.Objects;
import javax.swing.JLabel;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class GameMenuControl {
    
    private Game game;
    private GameFrame gameFrame;
    private Board board;
    private Location getLocation = new Location();
    private BoardView boardView = new BoardView();
    private JLabel[][] markerLocations = null;

    
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
    public void takeTurn() throws GameException {
        
        if ((!this.game.getStatus().equals(StatusType.NEW_GAME.getValue()))  && 
            !this.game.getStatus().equals(StatusType.PLAYING.getValue())) {
            throw new GameException(ErrorType.ERROR102.getMessage());
        }
    }
    
    
    /*
     * Display the board acton
     */
    public void displayBoard(JLabel[][] markerLocationsView) {
        boardView.displayBoard(this.board, markerLocationsView, this.game);
    }
    
    /*
     * Start a new game action
     */
    public void startNewGame(JLabel[][] markerLocationsView) {
        this.game.start();
        this.markerLocations = markerLocationsView;
        this.board.setInvalidLocations(game, this.markerLocations);
        this.board.setInitialLocations(game, this.markerLocations);
        this.displayBoard(this.markerLocations);
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
    public void displayPreferencesMenu() throws MenuException {
        GamePreferencesMenuView gamePreferenceMenuView = new GamePreferencesMenuView(this.game);
        gamePreferenceMenuView.getInput();
    }
    
    
    /*
      * Display help menu action
      */
    public void displayHelpMenu() throws MenuException {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    

    
    private void displayGameOverMessage(Player player, String message) {
        System.out.println("\n\t************************************************");
        System.out.println("\t " + player.getName() + ": " + message);
        System.out.println("\t************************************************");
    }
    

    public boolean regularPlayerSelection(Player player, JLabel[][] markerLocationsView, Point coordinate) throws GameException {
        boolean move = false;
        if ((!this.game.getStatus().equals(StatusType.NEW_GAME.getValue()))  &&
            !this.game.getStatus().equals(StatusType.PLAYING.getValue())) {
            throw new GameException(ErrorType.ERROR103.getMessage());
        } 
        
        this.game.setStatus(StatusType.PLAYING.getValue());

        move = getLocation.getMarkerLocation(this.game, coordinate);
        
        return true;
    }
    
    public boolean regularPlayerMove(Player player, JLabel[][] markerLocationsView, Point markerLocation) throws GameException {
        boolean noJump = false;
        
        Point moveLocation = getLocation.getMoveLocation(this.game, false, markerLocation);
        
        Point[] jumpCorners = {
          new Point(markerLocation.x-2,markerLocation.y-2),  
          new Point(markerLocation.x-2,markerLocation.y+2),  
          new Point(markerLocation.x+2,markerLocation.y-2),  
          new Point(markerLocation.x+2,markerLocation.y+2)
        };
        
        this.game.getBoard().occupyLocation(player, markerLocation.x, markerLocation.y, moveLocation.x, moveLocation.y);
        this.game.getBoard().unoccupyLocation(this.game, getLocation.getMarkerRow(), getLocation.getMarkerCol(), noJump);        
        
        // Checks if the player can make multiple jumps and allows them to
        return this.multiJump(moveLocation, jumpCorners, markerLocationsView, player);
    }

    
    public boolean multiJump(Point moveLocation, Point[] jumpCorners, JLabel[][] markerLocationsView, Player player) {
            if (jumpCorners[0].equals(moveLocation) || jumpCorners[1].equals(moveLocation) || jumpCorners[2].equals(moveLocation) 
                || jumpCorners[3].equals(moveLocation))
            return board.canJumpAgain(this.game, moveLocation.x, moveLocation.y);
            else {
                return false;
            }
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
