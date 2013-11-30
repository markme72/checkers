package checkers.menus;

import checkers.Game;
import checkers.menus.Menu;
import java.util.Objects;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */




public class GamePreferencesMenuView extends Menu  {
    
    private Game game;
    private GamePreferencesMenuControl gamePreferenceControl;

    private final static String[][] menuItems = {
        {"1", "Change Marker of the first Player"},
        {"2", "Change Marker of the second Player"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView() {
    }
    
    public GamePreferencesMenuView(Game game) {
        super(GamePreferencesMenuView.menuItems);
        this.game = game;
        this.gamePreferenceControl = new GamePreferencesMenuControl(this.game);
    }
    
    public String getInput() { 
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
