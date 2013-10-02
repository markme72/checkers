/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

import java.util.Scanner;

/**
 *
 * @author
 * Mark Earl
 */
public class Player {
    String name;
    double score;
 
    public Player() {
        
    }
    
    public String getName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name = input.next();
        return this.name;
    }
    
    public void setName(String theName) {
        this.name = theName;
    }
    
    public void displayName() {
        System.out.println("My name is " + this.name);
    }
    
    public void updateScore() {
        this.score++;
    }
}
