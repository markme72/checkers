/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.awt.Point;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Mark Earl
 */
public class Location {
    private int markerRow;
    private int markerCol;

    
    public Point getMarkerLocation(Game game) {
        Scanner input = Checkers.getInputFile();
        String coordinates[];
        Point location = null;
        
        boolean valid = false;
        
        while(!valid) {
            System.out.println(game.getCurrentPlayer().getName() + ", what is the location of the piece that you want to move?"
                    + " (e.g. 1 8 or 1,8)");
            String rowColumn = input.nextLine();
            rowColumn = rowColumn.trim();
            rowColumn = rowColumn.replace(',', ' ');
            coordinates = rowColumn.split("\\s");
            
            if (coordinates.length == 1) { 
                if (coordinates[0].toUpperCase().equals("Q")) {
                    return null;
                } 
                else {
                    new CheckersError().displayError(
                        "You must enter a valid row and column, "
                        + "or a \"Q\" to quit.");
                continue;
                }
            }
            else if (coordinates[0].length() >= 2 || coordinates[1].length() >= 2 || coordinates.length > 2){
                new CheckersError().displayError(
                        "You must enter a valid row and column, "
                        + "or a \"Q\" to quit.");
                continue;
                }
            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[^1-8]");
                if (pattern.matcher(coordinates[0]).matches() && pattern.matcher(coordinates[1]).matches()){
                  new CheckersError().displayError(
                        "You must enter a number between 1-8 for both the row and column.");
                  continue;  
                }
            Board board = game.getBoard();
            
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            this.markerRow = Integer.parseInt(coordinates[0]);
            this.markerCol = Integer.parseInt(coordinates[1]);

            
            location = new Point(row-1, column-1);
            
            if (board.locationUnoccupied(location, game.getOtherPlayer(), game.getInvalidSpaces(), game.getKingedOtherPlayer())) {
                new CheckersError().displayError(
                    "You do not have a marker here. Select another location");
                continue;
            }
            
            if (!board.canMarkerMove(row - 1, column - 1, game.getInvalidSpaces(), game.getCurrentPlayer(), game.getOtherPlayer())) {
                new CheckersError().displayError(
                        "This marker has no moves. Select another marker.");
                continue;
            }
                
            valid = true;
            
        }
        
        return location;
    }
    
    public Point getMoveLocation(Game game) {
        Scanner input = Checkers.getInputFile();
        String coordinates[];
        Point location = null;
        
        boolean valid = false;
        
        while(!valid) {
            System.out.println(game.getCurrentPlayer().getName() + ", where would you like to move?"
                    + " (e.g. 1 8 or 1,8)");
            String rowColumn = input.nextLine();
            rowColumn = rowColumn.trim();
            rowColumn = rowColumn.replace(',', ' ');
            coordinates = rowColumn.split("\\s"); 
                        
            if (coordinates.length == 1) { 
                if (coordinates[0].toUpperCase().equals("Q")) {
                    return null;
                }
                else {
                    new CheckersError().displayError(
                        "You must enter the row and the column, "
                        + "or a \"Q\" to quit.");
                continue;
                }
            } 
            
            else if (coordinates[0].length() >= 2 || coordinates[1].length() >= 2 || coordinates.length > 2){
                new CheckersError().displayError(
                        "You must enter a valid row and column, "
                        + "or a \"Q\" to quit.");
                continue;
            }

            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[^1-8]");
                if (pattern.matcher(coordinates[0]).matches() && pattern.matcher(coordinates[1]).matches()){
                    new CheckersError().displayError(
                        "You must enter a number between 1-8 for the row.");
                    continue;  
                }
                
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            Board board = game.getBoard();
            
            location = new Point(row-1, column-1);
            
            if (board.locationOccupied(location)) {
                new CheckersError().displayError(
                    "The current location is taken. Select another location");
                continue;
            }
            
            if (!board.checkMoveLocation(row - 1, column - 1, this.markerRow - 1, this.markerCol - 1, game.getCurrentPlayer())) {
                new CheckersError().displayError(
                        "This marker cannot move here. Select another location.");
                continue;
            }
                
            valid = true;
            
        }
        
        return location;
    }
    
}
