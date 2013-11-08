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




public class GamePreferencesMenuView  {
    
    private Game game;
    private GamePreferencesMenuControl gamePreferenceControl;

    private final static String[][] menuItems = {
        {"1", "Change Marker of the first Player"},
        {"2", "Change Marker of the second Player"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView(Game game) {
        this.game = game;
        this.gamePreferenceControl = new GamePreferencesMenuControl(this.game);
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < GamePreferencesMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    private boolean validCommand(String command) {
        String[][] items = GamePreferencesMenuView.menuItems;

        for (String[] item : GamePreferencesMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }

    private final String getCommand() {

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
    
    
    public String getInput() { 
       this.game = game;
       String command = "";
        
        do {
            this.display();

            // get commaned entered
           command = this.getCommand();
            
            switch (command) {
                case "1":
                    this.gamePreferenceControl.getMarker(this.game.getPlayerA());
                    break;
                case "2":
                    this.gamePreferenceControl.getMarker(this.game.getPlayerB());
                    break;
                case "Q":
                    return "QUIT";
            }
        } while (!command.equals("Q"));

        return "PLAYING";
    }
    
    
}
