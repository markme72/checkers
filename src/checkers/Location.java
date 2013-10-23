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
    
    public Point getMarkerLocation(Game game) {
        Scanner input = checkers.getInput();
        String coordinates[];
        Point location = null;
        Point marker = null;
        
        boolean valid = false;
        
        while(!valid) {
            System.out.println(/*game.getCurrentPlayer().getName() + */"Fred, what is the location of the piece that you want to move?"
                    + " (e.g. 1 a or 1,a)");
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
            Pattern patternRow = Pattern.compile("[1-8]");
                if (patternRow.matcher(coordinates[0]).matches())
                {}
                else {
                
                  new CheckersError().displayError(
                        "You must enter a number between 1-8 for the row.");
                  continue;  
                }
            
            // Checks if column is a letter a-h
            Pattern patternCol = Pattern.compile("[a-hA-H]");
                if (patternCol.matcher(coordinates[1]).matches())
                {}
                else {
                
                    new CheckersError().displayError(
                        "You must enter a letter from \"a\" to \"h\" for the column.");
                    continue;
                }
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
                    + " (e.g. 1 a or 1,a)");
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
            Pattern patternRow = Pattern.compile("[1-8]");
                if (patternRow.matcher(coordinates[0]).matches())
                {}
                else {
                
                  new CheckersError().displayError(
                        "You must enter a number between 1-8 for the row.");
                  continue;  
                }
            
            // Checks if column is a letter a-h
            Pattern patternCol = Pattern.compile("[a-hA-H]");
                if (patternCol.matcher(coordinates[1]).matches())
                {}
                else {
                
                    new CheckersError().displayError(
                        "You must enter a letter from \"a\" to \"h\" for the column.");
                    continue;
                }
            valid = true;
            
        }
        
        return location;
    }
}
