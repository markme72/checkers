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
    private int rowCount = 8;
    private int columnCount = 8;
    private String name;
    private Point boardDimensions = new Point();
    private Player[][] boardLocations;

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
    
    public boolean locationUnoccupied(Point location, Player otherPlayer, Player invalidSpaces, Player kingedOtherPlayer) {
        int row = location.x;
        int column = location.y;
        
        if (this.boardLocations[row][column] == null || this.boardLocations[row][column] == otherPlayer || 
                this.boardLocations[row][column] == invalidSpaces || this.boardLocations[row][column] == kingedOtherPlayer) {
            return true;
        }
        else {
            return false;
        }
    }
    
    
    public boolean canMarkerMove(int x, int y, Player invalidSpaces, Player currentPlayer, Player otherPlayer) {
        Player[] corners = new Player[4];
        boolean valid = false;
        
        // Checks for valid moves for "o" player
        if (currentPlayer.getMarker().equals("o") && boardLocations[x][y].getMarker().equals("o")) {     
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
                    if(canJump(x - 2, y - 2, i, corners[i], currentPlayer) || canJump(x - 2, y + 2, i, corners[i], currentPlayer))
                        valid = true;
                }
            }
        }
        
        // Checks valid moves for "x" player
        else if (currentPlayer.getMarker().equals("x") && boardLocations[x][y].getMarker().equals("x")) {            
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
                    if (canJump(x + 2, y + 2, i, corners[i], currentPlayer) || canJump(x + 2, y - 2, i, corners[i], currentPlayer))
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
                    if (canJump(x + 2, y + 2, i, corners[i], currentPlayer) || canJump(x + 2, y - 2, i, corners[i], currentPlayer)
                            || canJump(x - 2, y - 2, i, corners[i], currentPlayer) || canJump(x - 2, y + 2, i, corners[i], currentPlayer))
                        valid = true;
                }
            }
        }

        
        return valid;
    }
    
    // Check to see if the marker is moving to a valid location
    public boolean checkMoveLocation(int x, int y, int markerRow, int markerCol, Player currentPlayer) {
        Point markerLocation = new Point(markerRow, markerCol); // Initial location of the marker
        
        Point[] corners = new Point[4];
        Point[] jumpCorners = new Point[4];
        corners[0] = new Point (x-1,y-1); // Top left corner
        corners[1] = new Point (x-1,y+1); // Top right corner
        corners[2] = new Point (x+1,y-1); // Bottom left corner
        corners[3] = new Point (x+1,y+1); // Bottom right corner
        jumpCorners[0] = new Point (x-2,y-2); 
        jumpCorners[1] = new Point (x-2,y+2);
        jumpCorners[2] = new Point (x+2,y-2);
        jumpCorners[3] = new Point (x+2,y+2);
        
        boolean valid = false;
        
        // Prevents "o" from moving backwards
        if (currentPlayer.getMarker().equals("o") && this.boardLocations[markerRow][markerCol].getMarker().equals("o")) {   
            for (int i = 2; i < 4; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;
                else if (jumpCorners[i].equals(markerLocation)){
                    // Checks to see if corners are out of the bounds of the array
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        boolean validJump = canJump(x, y, i, this.boardLocations[corners[i].x][corners[i].y], currentPlayer);
                        if (validJump){
                            valid = true;
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y,validJump);
                        }
                    }
                }
            }
        }
        // Prevents "x" from moving backwards        
        else if (currentPlayer.getMarker().equals("x") && this.boardLocations[markerRow][markerCol].getMarker().equals("x")) {
            for (int i = 0; i < 2; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;
                else if (jumpCorners[i].equals(markerLocation)){
                    // Checks to see if corners are out of the bounds of the array                    
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        boolean validJump = canJump(x, y, i, this.boardLocations[corners[i].x][corners[i].y], currentPlayer);
                        if (validJump){
                            valid = true;                            
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y, validJump);
                        }
                    }                
                }
            }
        }
        // If the marker is a kinged marker
        else {   
            for (int i = 0; i < 4; i++) {
                if (corners[i].equals(markerLocation))
                    valid = true;                
                else if (jumpCorners[i].equals(markerLocation)){
                    // Checks to see if corners are out of the bounds of the array                   
                    if (corners[i].x >= 0 && corners[i].y >= 0 && corners[i].x <= 7 && corners[i].y <= 7){
                        boolean validJump = canJump(x, y, i, this.boardLocations[corners[i].x][corners[i].y], currentPlayer);
                        if (validJump){
                            valid = true;
                            unoccupyLocation(currentPlayer, corners[i].x, corners[i].y, validJump);
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

        // If the chosen location is null then they can jump
        if (row >= 0 && col >= 0 && row <= 7 && col <= 7){
            if (boardLocations[row][col] == null){            
                valid = true;
                return valid;  
            }
        }
        return valid;
    }
    
    public void kingMe(Game game) {
        for (int i = 0; i < boardLocations[0].length; i += 2) {
            if (boardLocations[0][i] == game.getPlayerB()) {
                boardLocations[0][i] = game.getKingedPlayerB();
            }
        }
        
        for (int i = 1; i < boardLocations[7].length; i += 2) {
            if (boardLocations[7][i] == game.getPlayerA()) {
                boardLocations[7][i] = game.getKingedPlayerA();
            }
        }
    }
    
    public void occupyLocation(Player player, int x, int y, int row, int column)  {
        if (x == -1 && y == -1)
            boardLocations[row][column] = player;
        else
            this.boardLocations[row][column] = this.boardLocations[x][y];
    }
    
    public void unoccupyLocation(Player currentPlayer, int row, int column, Boolean canJump) {
        Player location = this.boardLocations[row][column];
        if (canJump)
            this.boardLocations[row][column] = null;
        else {
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
    }
    
    
    public void setInvalidLocations(Game game) {
         for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 != 0){
                occupyLocation(game.getInvalidSpaces(), -1, -1, row, col);
                }
            }
        }
    }
    
    public void setInitialLocations(Game game) {
        // Set player one's markers (x)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0){
                occupyLocation(game.getPlayerA(), -1, -1, row, col);
                }
            }
        }
        // Set player two's markers (o)
        for (int row = 5; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0){
                occupyLocation(game.getPlayerB(), -1, -1, row, col);
                }
            }
        }
    }
}
