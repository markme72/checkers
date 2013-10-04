package checkers;

import java.util.Scanner;

/**
 *
 * @author
 * Mark Earl
 */
public class Player {
    String name = "Fred";
    long wins = 0;
    long losses = 0;
    long ties = 0;
    String playerType;
 
    public Player() {
        
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
        System.out.println("My name is " + this.name);
    }
    
    public void updateScore() {
        this.wins++;
    }
}
