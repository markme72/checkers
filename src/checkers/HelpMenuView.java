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
public class HelpMenuView  {
        
   
    private final static String[][] menuItems = {
        {"1", "The board"},
        {"2", "A computer player"}, 
        {"3", "The Checkers game"},
        {"4", "A location"},
        {"5", "A marker"},
        {"6", "Movement"},
        {"7", "Overtaking"},
        {"8", "A regular player"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public String getInput() {       
        
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
                    this.helpMenuControl.displayComputerPlayerHelp();
                    break;
                case "3":
                    this.helpMenuControl.displayGameHelp();
                    break;                  
                case "4":
                    this.helpMenuControl.displayLocationHelp();
                    break;
                case "5":
                    this.helpMenuControl.displayMarkerHelp();
                    break;
                case "6":
                    this.helpMenuControl.displayMovementHelp();
                    break;
                case "7":
                    this.helpMenuControl.displayOvertakingHelp();
                    break;
                case "8":
                    this.helpMenuControl.displayRealPlayerHelp();
                    break;
                case "Q": 
                    return "QUIT";
            }
        } while (!gameStatus.equals("QUIT"));  
        
         return gameStatus;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    
    
    // retrieves the command entered by the end user
    protected final String getCommand() {

        Scanner inFile = Checkers.getInput();
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
    
    
    // determines if the command is valid
    private boolean validCommand(String command) {
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
  
}