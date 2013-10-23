/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

//import java.awt.Dimension;
import java.util.Scanner;
//import java.util.regex.Pattern;

/**
 *
 * @author Mike Coleman
 */
public class GamePreferencesMenuControl {
    
    private Game game;

    public GamePreferencesMenuControl() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
    
       
    
    public void getMarker(Player player) {
        String marker = null;
                
        boolean valid = false;
        do {
            System.out.println("\n\t" + player.getName() 
                + ", enter a single character that will be used to mark your squares in the game.");
            Scanner in = Checkers.getInput();
            marker = in.nextLine();
            if (marker == null  || marker.length() < 1) {
                continue;
            }
            
            marker = marker.trim().substring(0, 1);
            marker = marker.toUpperCase();
            valid = this.saveMarker(player, marker);
        } while (!valid);

        this.saveMarker(player, marker);
   
    }
   
    
    
    
    private boolean saveMarker(Player player, String marker) { 

        if (player == null  ||  marker == null) {
            new CheckersError().displayError("saveMarker - player or marker is invalid");
            return false;
        }

   
        if (game.getPlayerA().getMarker().equals(game.getPlayerB().getMarker())) {
            new CheckersError().displayError("Both players can not use the same character for a marker.");
            return false;
        }
        
        // update the players markers
        player.setMarker(marker);
        
        return true;
    }   
    
    
}