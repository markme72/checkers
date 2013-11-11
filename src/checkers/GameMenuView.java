/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Scanner;

/**
 *
 * @author Mark Earl, Ryan Plumb, Mike Coleman
 */
public class GameMenuView {
    
    private Game game;
    private GameMenuControl gameMenuControl = null; 


    private final static String[][] menuItems = {
        {"1", "Take your turn"},
        {"2", "Display the board"},
        {"3", "New Game"},
        {"4", "Report Game Statistics"},
        {"5", "Report Player Stastics"},
        {"6", "Change game preferences"},
        {"7", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        this.game = game;
        this.gameMenuControl = new GameMenuControl(game);      
    }

    
    
    public Object getInput(Object object) {
        this.game = (Game) object;

        this.game.setStatus(Game.CONTINUE);

        String gameStatus = this.game.getStatus();

        do {
            this.display();
        
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "1":
                    this.gameMenuControl.takeTurn();
                    if (this.game.getStatus().equals(Game.PLAYING)) {
                        this.game.setStatus(this.game.checkForWin(this.game.getBoard().getBoardLocations(), 
                                            this.game.getCurrentPlayer(), this.game.getStatus()));
                        gameStatus = this.game.getStatus();
                    }
                    break;
                case "2":
                    this.gameMenuControl.displayBoard();
                    break;
                case "3":
                    this.gameMenuControl.startNewGame();
                    break;
                case "4":
                    this.gameMenuControl.displayGameStatistics();
                    break;
                case "5":
                    this.gameMenuControl.displayPlayerStatistics();
                    break;
                case "6":
                    this.gameMenuControl.displayPreferencesMenu();
                    break;
                case "7":
                    this.gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    gameStatus = "QUIT";
                    break;
            }  
        } while (!gameStatus.equals("QUIT") && !gameStatus.equals(Game.WINNER));
        
        return Game.PLAYING;
    }
    


    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GameMenuView.menuItems;

        for (String[] item : GameMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    protected final String getCommand() {

        Scanner inFile = Checkers.getInputFile();
        String command;
        boolean valid = false;
        do {
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new CheckersError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
                
        } while (!valid);
        
        return command;
    }



   
}
