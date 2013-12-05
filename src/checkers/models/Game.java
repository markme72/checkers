package checkers.models;

import java.util.Objects;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */

public class Game {
    public final static String PLAYER_A_DEFAULT_MARKER = "x";
    public final static String PLAYER_A_DEFAULT_KINGED_MARKER = "X";
    public final static String PLAYER_B_DEFAULT_MARKER = "o";
    public final static String PLAYER_B_DEFAULT_KINGED_MARKER = "O";

    public final static String INVALID_SPACE_DEFAULT_MARKER = "$";
    
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
    private Player kingedPlayerA;
    private Player kingedPlayerB;    
    private Player playerB;
    private Player currentPlayer;
    private Player kingedCurrentPlayer;
    private Player otherPlayer;
    private Player kingedOtherPlayer;
    private Player winner;
    private Player loser;
    private String status;
    private Board board;
    private Player invalidSpaces;

    public Game() {
   
       this.playerA = new Player() {};
       this.playerB = new Player() {};
       this.kingedPlayerA = new Player() {};
       this.kingedPlayerB = new Player() {};
       this.invalidSpaces = new Player() {};
       
       this.playerA.setMarker(Game.PLAYER_A_DEFAULT_MARKER);
       this.playerA.setKingedMarker(Game.PLAYER_A_DEFAULT_KINGED_MARKER);       
       this.playerB.setMarker(Game.PLAYER_B_DEFAULT_MARKER);
       this.playerB.setKingedMarker(Game.PLAYER_B_DEFAULT_KINGED_MARKER);       
       this.invalidSpaces.setMarker(Game.INVALID_SPACE_DEFAULT_MARKER);
    }

    public Game(String gameType) {
        this();

        this.gameType = gameType;
        this.board = new Board(8, 8);
        
        
    }
    
    public void setKingedCurrentPlayer(Player kingedCurrentPlayer) {
        this.kingedCurrentPlayer = kingedCurrentPlayer;
    }

    public void setKingedOtherPlayer(Player kingedOtherPlayer) {
        this.kingedOtherPlayer = kingedOtherPlayer;
    }

    public Player getKingedCurrentPlayer() {
        return kingedCurrentPlayer;
    }

    public Player getKingedOtherPlayer() {
        return kingedOtherPlayer;
    }
    
    public void setKingedPlayerA(Player kingedPlayerA) {
        this.kingedPlayerA = kingedPlayerA;
    }

    public void setKingedPlayerB(Player kingedPlayerB) {
        this.kingedPlayerB = kingedPlayerB;
    }

    public Player getKingedPlayerA() {
        return kingedPlayerA;
    }

    public Player getKingedPlayerB() {
        return kingedPlayerB;
    }

    public Player getInvalidSpaces() {
        return invalidSpaces;
    }
    
    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.gameType);
        hash = 79 * hash + Objects.hashCode(this.playerA);
        hash = 79 * hash + Objects.hashCode(this.kingedPlayerA);
        hash = 79 * hash + Objects.hashCode(this.kingedPlayerB);
        hash = 79 * hash + Objects.hashCode(this.playerB);
        hash = 79 * hash + Objects.hashCode(this.currentPlayer);
        hash = 79 * hash + Objects.hashCode(this.kingedCurrentPlayer);
        hash = 79 * hash + Objects.hashCode(this.otherPlayer);
        hash = 79 * hash + Objects.hashCode(this.kingedOtherPlayer);
        hash = 79 * hash + Objects.hashCode(this.winner);
        hash = 79 * hash + Objects.hashCode(this.loser);
        hash = 79 * hash + Objects.hashCode(this.status);
        hash = 79 * hash + Objects.hashCode(this.board);
        hash = 79 * hash + Objects.hashCode(this.invalidSpaces);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.gameType, other.gameType)) {
            return false;
        }
        if (!Objects.equals(this.playerA, other.playerA)) {
            return false;
        }
        if (!Objects.equals(this.kingedPlayerA, other.kingedPlayerA)) {
            return false;
        }
        if (!Objects.equals(this.kingedPlayerB, other.kingedPlayerB)) {
            return false;
        }
        if (!Objects.equals(this.playerB, other.playerB)) {
            return false;
        }
        if (!Objects.equals(this.currentPlayer, other.currentPlayer)) {
            return false;
        }
        if (!Objects.equals(this.kingedCurrentPlayer, other.kingedCurrentPlayer)) {
            return false;
        }
        if (!Objects.equals(this.otherPlayer, other.otherPlayer)) {
            return false;
        }
        if (!Objects.equals(this.kingedOtherPlayer, other.kingedOtherPlayer)) {
            return false;
        }
        if (!Objects.equals(this.winner, other.winner)) {
            return false;
        }
        if (!Objects.equals(this.loser, other.loser)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.board, other.board)) {
            return false;
        }
        if (!Objects.equals(this.invalidSpaces, other.invalidSpaces)) {
            return false;
        }
        return true;
    }

    public void start() {

        this.setPlayingOrder(playerA, playerB, kingedPlayerA, kingedPlayerB);

        // clear the board
        this.board.clearTheBoard();
        this.setStatus(Game.NEW_GAME);
        this.setPlayingOrder(this.playerA, this.playerB, this.kingedPlayerA, this.kingedPlayerB);
    }

    private void setPlayingOrder(Player player1, Player player2, Player kingedPlayerA, Player kingedPlayerB) {
            this.currentPlayer = player1;
            this.kingedCurrentPlayer = kingedPlayerA;
            this.otherPlayer = player2;
            this.kingedOtherPlayer = kingedPlayerB;
    }

    public void recordWinner() {
        if (this.currentPlayer == this.playerA) {
            this.winner = this.playerA;
            this.loser = this.playerB;
        } else {
            this.winner = this.playerB;
            this.loser = this.playerA;
        }

        long noWins = this.winner.getWins();
        noWins++;
        this.winner.setWins(noWins);
        long noLosses = this.loser.getLosses();
        noLosses++;
        this.loser.setLosses(noLosses);

        this.setStatus(Game.WINNER);
        
    }

    public void recordTie() {
        long player1Ties = this.playerA.getTies();
        player1Ties++;
        this.playerA.setTies(player1Ties);
        long player2Ties = this.playerB.getTies();
        player2Ties++;
        this.playerB.setTies(player2Ties);

        this.setStatus(Game.TIE);
       
    }

    public String checkForWin(Player[][] boardLocations, String gameStatus) {
        int player1 = 0;
        int player2 = 0;
        
        for (int row = 0; row < boardLocations.length; row+= 1) {
            for (int col = 0; col < boardLocations[row].length; col+= 2) {
                if (boardLocations[row][col] == invalidSpaces)
                    col = 1;
                if (boardLocations[row][col] == this.playerA || boardLocations[row][col] == this.kingedPlayerA)
                    player1++;
                else
                    player2++;
            }
        }
        
        if (player1 == 0) {
            this.winner = this.playerB;
            this.loser = this.playerA;
            gameStatus = Game.WINNER;
            System.out.print(getWinningMessage());
            board.clearTheBoard();
        }
        else if (player2 == 0) {
            this.winner = this.playerA;
            this.loser = this.playerB;
            gameStatus = Game.WINNER;
            System.out.print(getWinningMessage());
            board.clearTheBoard();
        }
        else if (player1 == 1 && player2 == 1) {
            gameStatus = Game.TIE;
            System.out.print(getTiedMessage());
            board.clearTheBoard();
        }
        return gameStatus;
    }

    private String getWinningMessage () {
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + winner.getName() + "! You won the game."
             + "\n\t Sorry " + loser.getName() + ", You are the loser." 
             + "\n\t*******************************************************************************";
    }

    private String getTiedMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }
    
    
}
