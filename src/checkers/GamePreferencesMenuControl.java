/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.awt.Dimension;

/**
 *
 * @author Mark Earl, Ryan Plumb, Mike Coleman
 */
public class GamePreferencesMenuControl {
    
    private Game game;

    public GamePreferencesMenuControl(Game game) {
        this.game = game;
    }
    
    
    public void getMarker(Player player) { 
        
        GetMarkerView getMarkerView = new GetMarkerView(this.game);
        String marker = getMarkerView.getInput(player);
        
        if (marker == null) { // user changed there mind and quit??
            return;
        }
      
        player.setMarker(marker); // update the players markers
        
        return;
    }
        
    
    
    
    
}
