/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Mike Coleman
 */
public class Game {
    public final static String PLAYER_A_DEFAULT_MARKER = "X";
    public final static String PLAYER_B_DEFAULT_MARKER = "O";
    
    
    public static final String ONE_PLAYER = "ONE_PLAYER";
    public static final String TWO_PLAYER = "TWO_PLAYER";
    
    public static final String CONTINUE = "CONTINUE";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
    
    private String gameType;
    private Player playerA;
    private Player playerB;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
    
    public Game() {
   
       this.playerA = new Player();
       this.playerB = new Player();
       
       this.playerA.setMarker(Game.PLAYER_A_DEFAULT_MARKER);
       this.playerB.setMarker(Game.PLAYER_B_DEFAULT_MARKER);
    }
    
    public Game(String gameType) {
        this();

        this.gameType = gameType;
        this.board = new Board(8, 8);
        
    }
   
    public void setStatus(String status) {
        this.status = status;
    }
 
    public String getStatus() {
        return status;
    }
    
    public Player getPlayerA() {
        return playerA;
    }
 
    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }
    
    public Player getPlayerB() {
        return playerB;
    }
     
    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }
    
    public Board getBoard() {
        return board;
    }
    
    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }
}
