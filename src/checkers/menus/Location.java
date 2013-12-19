package checkers.menus;

import checkers.models.Board;
import checkers.models.Game;
import checkers.controls.Checkers;
import checkers.controls.CheckersError;
import checkers.enums.ErrorType;
import checkers.exceptions.GameException;
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

    
    public boolean getMarkerLocation(Game game, Point markerCoordinates) throws GameException {
        Point location = null;
        
        boolean valid = false;

            Board board = game.getBoard();
            
            int row = markerCoordinates.x;
            int column = markerCoordinates.y;
            
            this.markerRow = markerCoordinates.x;
            this.markerCol = markerCoordinates.y;

            
            location = new Point(row, column);
            
            if (board.locationUnoccupied(location, game.getOtherPlayer(), game.getInvalidSpaces(), game.getKingedOtherPlayer())) {
                throw new GameException(ErrorType.ERROR106.getMessage());
            }
            
            if (!board.canMarkerMove(row, column, game)) {
                throw new GameException(ErrorType.ERROR107.getMessage());
            }
        
        
        return true;
    }
    
    public Point getMoveLocation(Game game, boolean jump, Point markerCoordinates) throws GameException {
        Point location = null;
        int oldMoveRow = this.moveRow;
        int oldMoveCol = this.moveCol;
                
            int row = markerCoordinates.x;
            int column = markerCoordinates.y;
            
            this.moveRow = markerCoordinates.x;
            this.moveCol = markerCoordinates.y;
            
            Board board = game.getBoard();
            
            location = new Point(row, column);
            
            if (board.locationOccupied(location)) {
                new CheckersError(ErrorType.ERROR108).display();
            }
            if (jump){
                if (!board.checkMoveLocation(row, column, oldMoveRow, oldMoveCol, game)) {
                    throw new GameException(ErrorType.ERROR109.getMessage());
                }
            }
            else
                if(!board.checkMoveLocation(row, column, this.markerRow, this.markerCol, game)) {
                    throw new GameException(ErrorType.ERROR109.getMessage());
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
