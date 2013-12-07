package checkers.menus;

import checkers.controls.HelpMenuControl;
import checkers.exceptions.MenuException;
import checkers.models.Game;
import checkers.menus.Menu;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class HelpMenuView extends Menu  {
        
   
    private final static String[][] menuItems = {
        {"1", "The board"},
        {"2", "The Checkers game"},
        {"3", "A location"},
        {"4", "A marker"},
        {"5", "Movement"},
        {"6", "Overtaking"},
        {"7", "A regular player"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
    super(HelpMenuView.menuItems);        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() throws MenuException {       
        
        String gameStatus = Game.PLAYING;
        do {
            this.display();
            
            // get commaned entered
            String command = this.getCommand();
            switch (command) {
                case "1":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "2":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "3":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "4":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                case "5":
                    this.helpMenuControl.displayMovementHelp();
                    break;
                case "6":
                    this.helpMenuControl.displayOvertakingHelp();
                    break;
                case "7":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break;
                case "Q": 
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }
  
}
