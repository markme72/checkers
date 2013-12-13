package checkers.menus;

import checkers.controls.MainMenuControl;
import checkers.enums.StatusType;
import checkers.exceptions.MenuException;

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
    
    public String getInput(Object object) throws MenuException {       
        
        String gameStatus = StatusType.PLAYING.getValue();
        do {
            this.display();

            // get commaned entered
            try {
                String command = this.getCommand();
                switch (command) {
                    case "S":
                        mainMenuControl.startGame(2);
                        break;
                    case "H":
                        mainMenuControl.displayHelpMenu();
                        break;
                    case "X":
                        return StatusType.EXIT.getValue();
                }
            } catch (MenuException cex) {
                    System.out.println("\n\t" + cex.getMessage());
                }
        } while (!gameStatus.equals(StatusType.EXIT.getValue()));

        return StatusType.EXIT.getValue();
    }

    
}
