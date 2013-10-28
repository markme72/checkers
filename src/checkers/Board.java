/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.awt.Point;

/**
 *
 * @author Mark Earl
 */
public class Board {
    Point boardDimensions;
    Location[][] boardLocations;
    
    
    public Board(int noRows, int noColumns) {
        this.boardLocations = new Location[noRows][noColumns];
    }
    
    public int getRowCount() {
        return 1;
    }

    public int getColumnCount() {
        return 1;
    }
   
    public Point getBoardDimensions() {
        return boardDimensions;
    }
   
    public Location[][] getBoardLocations() {
        return boardLocations;
    }
    
    public void setBoardLocations(Location[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
    
    public boolean locationOccupied(Point location) {
       return false;
        }
    }

    
