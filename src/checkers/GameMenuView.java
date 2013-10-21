/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

// import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author jacksonrkj
 */
public class GameMenuView {
    
    private Game game;
    private GameMenuControl gameMenuControl ; 


    private final static String[][] menuItems = {
        {"1", "Take your turn"},
        {"2", "Display the board"},
        {"3", "New Game"},
        {"4", "Report stastics"},
        {"5", "Change game preferences"},
        {"6", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
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
                    break;
                case "2":
                    gameMenuControl.displayBoard();
                    break;
                case "3":
                    gameMenuControl.startNewGame();
                    break;
                case "4":
                    gameMenuControl.displayStatistics();
                    break;
                case "5":
                    gameMenuControl.displayPreferencesMenu();
                    break;
                case "6":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":
                    gameStatus = "QUIT";
                    break;
            }
        } while (!gameStatus.equals("QUIT"));

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
