import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test public void testGameLoop() { //able to test?
        Game game = new Game();
    }

    @Test public void testCheckWhosTurn() {
	Player p1 = new ComputerPlayer();
        Player p2 = new ComputerPlayer();
        Game game = new Game();
        game.init(p1, p2);
	assertEquals(1, game.checkWhosTurn());
    }
    
    @Test public void testSwitchPlayer() {
        Player p1 = new ComputerPlayer();
        Player p2 = new ComputerPlayer();
        Game game = new Game();
        game.init(p1, p2);
        game.switchPlayer();
        assertEquals(2, game.checkWhosTurn());
    }

    @Test public void testResolve() {
        Player p1 = new ComputerPlayer();
	Player p2 = new ComputerPlayer();
	Game game = new Game();
        game.init(p1, p2);
        game.setMove(1,1);
	game.setMove(1,2);
        game.setMove(1,3);
 	game.checkForWin(1,3);
	game.resolve();
        assertEquals(1, p1.getGamesWon());
    }
}
