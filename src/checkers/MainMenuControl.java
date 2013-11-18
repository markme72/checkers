package checkers;

import java.util.Scanner;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class MainMenuControl {
    
    
    public void startGame(long noPlayers) {
                
        if (noPlayers != 1  &&  noPlayers != 2) {
            new CheckersError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        game = this.createGame("TWO_PLAYER");
       
        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput(game);
    }

    
    
    private Game createGame(String gameType) {
        Game game = null;
        Player playerA = null;
        Player kingedPlayerA = null;
        Player playerB = null;
        Player kingedPlayerB = null;
        
        if (gameType == null) {
            new CheckersError().displayError("MainCommands - create: gameType is null");
            return null;
        }
        

        game = new Game(Game.TWO_PLAYER);
        playerA = new Player(Player.REGULAR_PLAYER, Game.PLAYER_A_DEFAULT_MARKER);
        playerA.setName("Player 1");
        kingedPlayerA = new Player(Player.REGULAR_PLAYER, Game.PLAYER_A_DEFAULT_KINGED_MARKER);
        kingedPlayerA.setName("Player 1");
        playerB = new Player(Player.REGULAR_PLAYER, Game.PLAYER_B_DEFAULT_MARKER);
        playerB.setName("Player 2");
        kingedPlayerB = new Player(Player.REGULAR_PLAYER, Game.PLAYER_B_DEFAULT_KINGED_MARKER);
        kingedPlayerB.setName("Player 1");



        game.setPlayerA(playerA);
        game.setKingedPlayerA(kingedPlayerA);
        game.setPlayerB(playerB);
        game.setKingedPlayerB(kingedPlayerB);
        
        return game;
    } 
    
    
    private String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
    
    /*
     * Display help menu action
     */
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }
    
}
