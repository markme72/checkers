/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers.enums;

/**
 *
 * @author
 * markearl
 */
public enum GameType {
    TWO_PLAYER ("TWO_PLAYER");

    String value;
    
    GameType(String value) {
        this.value = value;   
    }
    
    public String getValue() {
        return value;
    }
}
