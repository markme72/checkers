package checkers.menus;

import checkers.controls.GameMenuControl;
import checkers.enums.StatusType;
import checkers.exceptions.GameException;
import checkers.exceptions.MenuException;
import checkers.models.Game;
import java.util.Objects;

/**
 *
 * @author Mark Earl, Ryan Plumb
 */
public class GameMenuView extends Menu {
    
    private Game game;
    private GameMenuControl gameMenuControl = null; 


    private final static String[][] menuItems = {
        {"1", "Take your turn"},
        {"2", "Display the board"},
        {"3", "New Game"},
        {"4", "Report Game Statistics"},
        {"5", "Report Player Stastics"},
        {"6", "Change game preferences"},
        {"7", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(Game game) {
        super(GameMenuView.menuItems);
        this.game = game;
        this.gameMenuControl = new GameMenuControl(game);      
    }

    
    
    public Object getInput(Object object) throws MenuException {
        this.game = (Game) object;

        this.game.setStatus(StatusType.CONTINUE.getValue());

        String gameStatus = this.game.getStatus();

        do {
            this.display();
        
            // get commaned entered
            try {
                String command = this.getCommand();
                switch (command) {
                    case "1":
                        this.gameMenuControl.getBoardView().displayBoard(this.game.getBoard());
                        this.gameMenuControl.takeTurn();
                    
                        // Checks for a winner
                        if (this.game.getStatus().equals(StatusType.PLAYING.getValue())) {
                            this.game.setStatus(this.game.checkForWin(this.game.getBoard().getBoardLocations(), 
                                                this.game.getStatus()));
                            gameStatus = this.game.getStatus();
                        }
                        break;
                    case "2":
                        this.gameMenuControl.displayBoard();
                        break;
                    case "3":
                        this.gameMenuControl.startNewGame();
                        break;
                    case "4":
                        this.gameMenuControl.displayGameStatistics();
                        break;
                    case "5":
                        this.gameMenuControl.displayPlayerStatistics();
                        break;
                    case "6":
                        this.gameMenuControl.displayPreferencesMenu();
                        break;
                    case "7":
                        this.gameMenuControl.displayHelpMenu();
                        break;
                    case "Q":
                        gameStatus = "QUIT";
                        break;
                }  
            } catch (GameException | MenuException tex) {
                System.out.println("\n\t" + tex.getMessage());
                continue;
            }
        } while (!gameStatus.equals("QUIT") && !gameStatus.equals(StatusType.WINNER.getValue()));
        
        return StatusType.PLAYING.getValue();
    }

    public GameMenuControl getGameMenuControl() {
        return gameMenuControl;
    }

    public void setGameMenuControl(GameMenuControl gameMenuControl) {
        this.gameMenuControl = gameMenuControl;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.gameMenuControl);
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
        final GameMenuView other = (GameMenuView) obj;
        if (!Objects.equals(this.gameMenuControl, other.gameMenuControl)) {
            return false;
        }
        return true;
    }
   
}
