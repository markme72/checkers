package checkers;

import java.util.Scanner;

/**
 *
 * @author
 * Mark Earl
 */
public class Player {
    public static final String REGULAR_PLAYER = "REGULAR";
    public static final String COMPUTER_PLAYER = "COMPUTER"; 
    String name = "Fred";
    long wins = 0;
    long losses = 0;
    long ties = 0;
    String playerType;
    private String marker;
 
    public Player() {   
    }
    
    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        return this.name;
    }
    
    public String setPlayerType() {
        Scanner input = new Scanner(System.in);
        System.out.println("Which side will, " + name + " be? (x or o):");
        this.playerType = input.next();
        return this.playerType;
    }
    
    public void setName(String theName) {
        this.name = theName;
    }
    
    public void displayName() {
        System.out.println("Default player is " + this.name);
    }
    
    public void updateScore() {
        this.wins++;
    }
     
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    public String getPlayerStatistics() {
        String playerStatistics = "";
        return playerStatistics;
    }
}
