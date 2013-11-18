package checkers;


import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Mark Earl, Ryan Plumb
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
                    break;
                case "2":
                    break;
                case "Q":
                    return "QUIT";
            }
        } while (!command.equals("Q"));

        return "PLAYING";
    }

    public GamePreferencesMenuControl getGamePreferenceControl() {
        return gamePreferenceControl;
    }

    public void setGamePreferenceControl(GamePreferencesMenuControl gamePreferenceControl) {
        this.gamePreferenceControl = gamePreferenceControl;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.gamePreferenceControl);
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
        final GamePreferencesMenuView other = (GamePreferencesMenuView) obj;
        if (!Objects.equals(this.gamePreferenceControl, other.gamePreferenceControl)) {
            return false;
        }
        return true;
    }
    
}
