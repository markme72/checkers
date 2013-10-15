/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package checkers;

/**
 *
 * @author Mike
 */
public class Statistics {

    String name;
    int wins = 0;
    int losses = 0;

    
    public Statistics() {
    }
  
    public void displayName() {
        System.out.println("\t\tGreetings, my name is "  + this.name); 
    }
   
    public double getWinningPercentage(double wins, double losses) {
     
        if (wins < 0 ) {
            System.out.println("\n\tThe number of wins must be greater than or equal to zero.");
            return -1;
        }
        
        if (losses < 0 ) {
            System.out.println("\n\tThe number of losses must be greater than or equal to zero.");
            return -1;
        }
        
        
        double totalGames = wins + losses;
        
        if (totalGames == 0) {
            return 0;
        }
        
        double winLossRatio = wins / totalGames;
        return winLossRatio * 100;
    }  
}