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
    private Game game;
    private Checkers checkers;
    private Player player = null;
    private Board board;
    private Point boardLocation;
    
    public Location(Board board) {
        this.board = board;
    }
    
    public Point getMarkerLocation(Game game) {
        Scanner input = checkers.getInput();
        String coordinates[];
        Point location = null;
        
        boolean valid = false;
        
        while(!valid) {
            System.out.println(/*game.getCurrentPlayer().getName() + */"Fred, what is the location of the piece that you want to move?"
                    + " (e.g. 1 8 or 1,8)");
            String rowColumn = input.nextLine();
            rowColumn = rowColumn.trim();
            rowColumn = rowColumn.replace(',', ' ');
            coordinates = rowColumn.split("\\s");
            
            if (coordinates.length < 1) {
                new CheckersError().displayError(
                        "You must enter the row and the column, "
                        + "or a \"Q\" to quit.");
                continue;
            } 
                        
            else if (coordinates.length == 1) { 
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
            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[1-8]");
                if (pattern.matcher(coordinates[0]).matches() || pattern.matcher(coordinates[1]).matches())
                {}
                else {
                
                  new CheckersError().displayError(
                        "You must enter a number between 1-8 for both the row and column.");
                  continue;  
                }
            
            
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            location = new Point(row-1, column-1);
                
            valid = true;
            
        }
        
        return location;
    }
    
    public Point getMoveLocation(Game game) {
        Scanner input = checkers.getInput();
        String coordinates[];
        Point location = null;
        
        boolean valid = false;
        
        while(!valid) {
            System.out.println(/*game.getCurrentPlayer().getName() + */"Fred, where would you like to move?"
                    + " (e.g. 1 8 or 1,8)");
            String rowColumn = input.nextLine();
            rowColumn = rowColumn.trim();
            rowColumn = rowColumn.replace(',', ' ');
            coordinates = rowColumn.split("\\s");
            
            if (coordinates.length < 1) {
                new CheckersError().displayError(
                        "You must enter the row and the column, "
                        + "or a \"Q\" to quit.");
                continue;
            } 
                        
            else if (coordinates.length == 1) { 
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
            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[1-8]");
                if (pattern.matcher(coordinates[0]).matches() || pattern.matcher(coordinates[1]).matches())
                {}
                else {
                
                  new CheckersError().displayError(
                        "You must enter a number between 1-8 for the row.");
                  continue;  
                }
                
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            location = new Point(row-1, column-1);
            
            if (board.locationOccupied(location)) {
                new CheckersError().displayError(
                    "The current location is taken. Select another location");
                continue;
            }
            valid = true;
            
        }
        
        return location;
    }
    
    public void setLocation(int row, int col) {
        this.boardLocation = new Point(row, col);
    }
}
