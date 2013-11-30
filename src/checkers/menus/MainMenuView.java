package checkers.menus;

import checkers.Game;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */


public class MainMenuView extends Menu {
    
    
    private static final String[][] menuItems = {
        {"S", "Start Checkers"},
        {"H", "Help"},
        {"X", "Exit Checkers"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
    
    public String getInput(Object object) {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();

            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "S":
                    mainMenuControl.startGame(2);
                    break;
                case "H":
                    mainMenuControl.displayHelpMenu();
                    break;
                case "X":
                    return Game.EXIT;
            }
        } while (!gameStatus.equals(Game.EXIT));

        return Game.EXIT;
    }

    
}
