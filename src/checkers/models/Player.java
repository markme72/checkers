package checkers.models;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public abstract class Player {

    public static final String REGULAR_PLAYER = "REGULAR";
    
    private String name;
    private String playerType;
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String marker;
    private String kingedMarker;
    private int numOfMarkers = 12;

    public Player() {
    }

    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    public String getKingedMarker() {
        return kingedMarker;
    }   
    
    public void setKingedMarker(String kingedMarker) {
        this.kingedMarker = kingedMarker;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }


    
   
    public double getWinningPercentage(long wins, long losses, long ties) {
     
        if (wins < 0 ) {
            System.out.println("\n\tThe number of wins must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (losses < 0 ) {
            System.out.println("\n\tThe number of losses must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        if (ties < 0 ) {
            System.out.println("\n\tThe number of ties must be "
                    + "greater than or equal to zero.");
            return -999;
        }
        
        double totalScore = wins + losses + ties;
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = wins / totalScore;
        return winLossRatio * 100;
    }

    public String getPlayerStastics() {
        String playerStatistics = 
                this.getName() + " has won "
                + this.getWinningPercentage(this.wins, this.losses, this.ties) + "% of the games."
                + "\n\t" + this.getWins() + " wins, "
                + this.getLosses() + " losses and "
                + this.getTies() + " ties.";
        
        return playerStatistics;
    }

    public int getNumOfMarkers() {
        return this.numOfMarkers;
    }
    
}
