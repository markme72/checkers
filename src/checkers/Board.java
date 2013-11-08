/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.awt.Point;



/**
 *
 * @author Mark Earl, Ryan Plumb, Mike Coleman
 */
public class Board {
    int rowCount = 8;
    int columnCount = 8;
    private String name;
    private Point boardDimensions = new Point();
    public Player[][] boardLocations;

    public Board() {
    }

    public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new Player[noRows][noColumns];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return rowCount;
    }
    
    public Player[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        return boardLocations[rowIndex][columnIndex];
    } 
   

    public Player getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }


    public void clearTheBoard() {
        for (int i = 0; i < this.boardLocations.length; i++) {
            Player[] rowlocations = this.boardLocations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] =  null;
            }
        }
    }
    
    public boolean locationOccupied(Point location) {
        int row = location.x;
        int column = location.y;
        
        if (this.boardLocations[row][column] != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean locationUnoccupied(Point location, Player otherPlayer, Player invalidSpaces) {
        int row = location.x;
        int column = location.y;
        
        if (this.boardLocations[row][column] == null || this.boardLocations[row][column] == otherPlayer || 
                this.boardLocations[row][column] == invalidSpaces) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public void occupyLocation(Player player, int row, int column)  {
        // subtract 1 from row and column number because the array starts a position 0

         Player playerAtLocation = this.boardLocations[row][column];

        if (playerAtLocation != null) { // location already occupied
            new CheckersError().displayError("This location is already occupied. "
                    + "Try a different location.");
        }
        this.boardLocations[row][column] = player;
    }
    
    public void unoccupyLocation(Player currentPlayer, int row, int column) {
        Player location = this.boardLocations[row][column];
            if (location == null) {
                new CheckersError().displayError("There is no marker at this location. "
                    + "Try a different location.");
        }

            if (!location.getMarker().equals(currentPlayer.getMarker())) {
                new CheckersError().displayError("This is not your marker. "
                    + "Try a different location.");
        }
                this.boardLocations[row][column] = null;
    }
     
    
    public boolean canMarkerMove(int x, int y, Player invalidSpaces, Player currentPlayer, Player otherPlayer) {
        Player[] corners = new Player[4];
        boolean valid = false;
        
        // Checks for valid moves for "o" player
        if (currentPlayer.getMarker().equals("o")) {     
            // Check to see if corner is out of the bounds of the array
            if (x - 1 >= 0 && y - 1 >= 0 && x - 1 <= 7 && y - 1 <= 7) { 
                corners[0] = boardLocations[x-1][y-1];
                }
            else {
                corners[0] = invalidSpaces;
            }
            if (x - 1 >= 0 && y + 1 >= 0 && x - 1 <= 7 && y + 1 <= 7) { 
               corners[1] = boardLocations[x-1][y+1];
                }
            else {
                corners[1] = invalidSpaces;
            }
            for (int i = 0; i < 2 ; i++) {
                if (corners[i] == null)
                    valid = true;
                else {
                    if(canJump(x, y, i, corners[i], currentPlayer))
                        valid = true;
                }
            }
        }
        
        // Checks valid moves for "x" player
        else if (currentPlayer.getMarker().equals("x")) {            
            // Check to see if corner is out of the bounds of the array
            if (x + 1 >= 0 && y - 1 >= 0 && x + 1 <= 7 && y - 1 <= 7) { 
                corners[2] = boardLocations[x+1][y-1];
                }
            else {
                corners[2] = invalidSpaces;
            }
            if (x + 1 >= 0 && y + 1 >= 0 && x + 1 <= 7 && y + 1 <= 7) { 
                corners[3] = boardLocations[x+1][y+1];
            }
            else {
                corners[3] = invalidSpaces;
            }
            for (int i = 2; i < 4 ; i++) {
                if (corners[i] == null)
                    valid = true;
                else {
                    if (canJump(x, y, i, corners[i], currentPlayer))
                        valid = true;
                }
            }
        }
        
        // Checks valid moves for kinged markers        
        else {                      
            // Check to see if corner is out of the bounds of the array
            if (x - 1 >= 0 && y -1 >= 0 && x - 1 <= 7 && y - 1 <= 7) { 
                corners[0] = boardLocations[x-1][y-1];
                }
            else {
                corners[0] = invalidSpaces;
            }
            if (x - 1 >= 0 && y + 1 >= 0 && x - 1 <= 7 && y + 1 <= 7) { 
               corners[1] = boardLocations[x-1][y+1];
                }
            else {
                corners[1] = invalidSpaces;
            }
            if (x + 1 >= 0 && y - 1 >= 0 && x + 1 <= 7 && y - 1 <= 7) { 
                corners[2] = boardLocations[x+1][y-1];
                }
            else {
                corners[2] = invalidSpaces;
            }
            if (x + 1 >= 0 && y + 1 >= 0 && x + 1 <= 7 && y + 1 <= 7) { 
                corners[3] = boardLocations[x+1][y+1];
            }
            else {
                corners[3] = invalidSpaces;
            }
            for (int i = 0; i < corners.length ; i++) {
                if (corners[i] == null)
                    valid = true;
                else {
                    if (canJump(x, y, i, corners[i], currentPlayer))
                        valid = true;
                }
            }
        }

        
        return valid;
    }
    
    public boolean checkMoveLocation(int x, int y, int markerRow, int markerCol, Player currentPlayer) {
        Point markerLocation = new Point(markerRow, markerCol);
        
        Point[] corners = new Point[4];
        corners[0] = new Point (x-1,y-1);
        corners[1] = new Point (x-1,y+1);
        corners[2] = new Point (x+1,y-1);
        corners[3] = new Point (x+1,y+1);
        boolean valid = false;
        
        // Prevents "o" from moving backwards
        if (currentPlayer.getMarker().equals("o")) {   
            for (int i = 2; i < 4; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;
                else {
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        if (canJump(x, y, i, boardLocations[corners[i].x][corners[i].y], currentPlayer)){
                            valid = true;
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y);
                        }
                    }
                }
            }
        }
        // Prevents "x" from moving backwards        
        else if (currentPlayer.getMarker().equals("x")) {   
            for (int i = 0; i < 2; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;
                else {                    
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        if (canJump(x, y, i, boardLocations[corners[i].x][corners[i].y], currentPlayer)){
                            valid = true;                            
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y);
                        }
                    }                
                }
            }
        }
        
        else {   
            for (int i = 0; i < 4; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;                
                else {      
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        if (canJump(x, y, i, boardLocations[corners[i].x][corners[i].y], currentPlayer)){
                            valid = true;
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y);
                        }
                    }
                }
            }
        }
        
        return valid;
    }
    
    public Boolean canJump(int row, int col, int jumpCorner, Player corner, Player currentPlayer) {
        boolean valid = false;
        
        // Check to see if the piece in its corner is of the same player
        if (currentPlayer == corner) {
            return valid;
        }
        
        // Finds which corner the piece can jump
        switch (jumpCorner) {
            case 0:
                row -= 2;
                col -= 2;
                break;
            case 1:
                row -= 2;
                col += 2;
                break;
            case 2:
                row += 2;
                col -= 2;
                break;
            case 3:
                row += 2;
                col += 2;
        }
        if (row >= 0 && col >= 0 && row <= 7 && col <= 7){
            if (boardLocations[row][col] == null){            
                valid = true;
                return valid;  
            }
        }
    
        return valid;
    }
    
    public void setInvalidLocations(Game game) {
         for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 != 0){
                occupyLocation(game.invalidSpaces, row, col);
                }
            }
        }
    }
    
    public void setInitialLocations(Game game) {
        // Set player one's markers (x)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0){
                occupyLocation(game.playerA, row, col);
                }
            }
        }
        // Set player two's markers (o)
        for (int row = 5; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0){
                occupyLocation(game.playerB, row, col);
                }
            }
        }
    }
}
