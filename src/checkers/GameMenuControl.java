/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.awt.Point;

/**
 *
 * @author  Mark Earl
 */
public class GameMenuControl {

    private Game game;
    private Board board = new Board(8,8);
    private Location getLocation = new Location(this.board);
    private BoardView displayBoard = new BoardView();

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }

       
    
   public void takeTurn() {
        Point markerLocation = getLocation.getMarkerLocation(game);
        Point moveLocation = getLocation.getMoveLocation(game);
    }
   
       
   public void displayBoard() {
        System.out.println("\n\tdisplayBoard() called");
    }
   
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
        this.displayBoard();
    }
    
    
            
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferencesMenu = Checkers.getGamePreferencesMenu();
        gamePreferencesMenu.getInput(this.game);
    }
    
    
    public void displayStatistics() {
        String playerAStatistics = this.game.getPlayerA().getPlayerStatistics();
        String playerBStatistics = this.game.getPlayerB().getPlayerStatistics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerAStatistics);
        System.out.println("\n\t " + playerBStatistics);
        System.out.println("\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = Checkers.getHelpMenu();
        helpMenu.getInput();
    }
    

    
    
    
}
