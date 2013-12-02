package checkers;

import checkers.enums.ErrorType;
import java.awt.Point;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class Location {
    private int markerRow;
    private int markerCol;
    private int moveRow;
    private int moveCol;

    
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
                    new CheckersError(ErrorType.ERROR104).display();
                continue;
                }
            }
            else if (coordinates[0].length() >= 2 || coordinates[1].length() >= 2 || coordinates.length > 2){
                new CheckersError(ErrorType.ERROR104).display();
                continue;
                }
            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[^1-8]");
                if (pattern.matcher(coordinates[0]).matches() && pattern.matcher(coordinates[1]).matches()){
                  new CheckersError(ErrorType.ERROR105).display();
                  continue;  
                }
            Board board = game.getBoard();
            
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            this.markerRow = Integer.parseInt(coordinates[0]);
            this.markerCol = Integer.parseInt(coordinates[1]);

            
            location = new Point(row-1, column-1);
            
            if (board.locationUnoccupied(location, game.getOtherPlayer(), game.getInvalidSpaces(), game.getKingedOtherPlayer())) {
                new CheckersError(ErrorType.ERROR106).display();
                continue;
            }
            
            if (!board.canMarkerMove(row - 1, column - 1, game)) {
                new CheckersError(ErrorType.ERROR107).display();
                continue;
            }
                
            valid = true;
            
        }
        
        return location;
    }
    
    public Point getMoveLocation(Game game, boolean jump) {
        Scanner input = Checkers.getInputFile();
        String coordinates[];
        Point location = null;
        int oldMoveRow = this.moveRow;
        int oldMoveCol = this.moveCol;
        
        boolean valid = false;
        
        while(!valid) {
            if (!jump){
                System.out.println(game.getCurrentPlayer().getName() + ", where would you like to move?"
                        + " (e.g. 1 8 or 1,8)");
            }
            else {
                System.out.println(game.getCurrentPlayer().getName() + ", jump again!"
                        + " (e.g. 1 8 or 1,8)");                
            }
            String rowColumn = input.nextLine();
            rowColumn = rowColumn.trim();
            rowColumn = rowColumn.replace(',', ' ');
            coordinates = rowColumn.split("\\s"); 
                        
            if (coordinates.length == 1) { 
                if (coordinates[0].toUpperCase().equals("Q")) {
                    return null;
                }
                else {
                    new CheckersError(ErrorType.ERROR104).display();
                continue;
                }
            } 
            
            else if (coordinates[0].length() >= 2 || coordinates[1].length() >= 2 || coordinates.length > 2){
                new CheckersError(ErrorType.ERROR104).display();
                continue;
            }

            
            // Checks if row is a number 1-8
            Pattern pattern = Pattern.compile("[^1-8]");
                if (pattern.matcher(coordinates[0]).matches() && pattern.matcher(coordinates[1]).matches()){
                    new CheckersError(ErrorType.ERROR105).display();
                    continue;  
                }
                
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            this.moveRow = Integer.parseInt(coordinates[0]);
            this.moveCol = Integer.parseInt(coordinates[1]);
            
            Board board = game.getBoard();
            
            location = new Point(row-1, column-1);
            
            if (board.locationOccupied(location)) {
                new CheckersError(ErrorType.ERROR108).display();
                continue;
            }
            if (jump){
                if (!board.checkMoveLocation(row - 1, column - 1, oldMoveRow - 1, oldMoveCol - 1, game)) {
                    new CheckersError(ErrorType.ERROR109).display();
                    continue;
                }
            }
            else
                if(!board.checkMoveLocation(row - 1, column - 1, this.markerRow - 1, this.markerCol - 1, game)) {
                    new CheckersError(ErrorType.ERROR109).display();
                    continue;
            }
            valid = true;
            
        }
        
        return location;
    }
    

    public int getMarkerRow() {
        return markerRow;
    }

    public void setMarkerRow(int markerRow) {
        this.markerRow = markerRow;
    }

    public int getMarkerCol() {
        return markerCol;
    }

    public void setMarkerCol(int markerCol) {
        this.markerCol = markerCol;
    }

    public int getMoveRow() {
        return moveRow;
    }

    public void setMoveRow(int moveRow) {
        this.moveRow = moveRow;
    }

    public int getMoveCol() {
        return moveCol;
    }

    public void setMoveCol(int moveCol) {
        this.moveCol = moveCol;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.markerRow;
        hash = 43 * hash + this.markerCol;
        hash = 43 * hash + this.moveRow;
        hash = 43 * hash + this.moveCol;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.markerRow != other.markerRow) {
            return false;
        }
        if (this.markerCol != other.markerCol) {
            return false;
        }
        if (this.moveRow != other.moveRow) {
            return false;
        }
        if (this.moveCol != other.moveCol) {
            return false;
        }
        return true;
    }


    
}
