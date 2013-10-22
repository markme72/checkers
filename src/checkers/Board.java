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
    Player[][] boardLocations;
    
    
    public Board(int noRows, int noColumns) {
        //this.boardDimensions.setLocation(noRows, noRows);
        //this.boardLocations = new Player[noRows][noColumns];
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
   
    public Player[][] getBoardLocations() {
        return boardLocations;
    }
    
    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
}
