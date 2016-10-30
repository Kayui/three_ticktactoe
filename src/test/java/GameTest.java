import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test public void testCheckWhosTurn() {
	Player p1 = new ComputerPlayer();
        Player p2 = new ComputerPlayer();
        Game game = new Game();
        game.init(p1, p2, new Console());
	assertEquals(1, game.checkWhosTurn());
    }
    
    @Test public void testSwitchPlayer() {
        Player p1 = new ComputerPlayer();
        Player p2 = new ComputerPlayer();
        Game game = new Game();
        game.init(p1, p2, new Console());
        game.switchPlayer();
        assertEquals(2, game.checkWhosTurn());
    }

    @Test public void testResolveP1Wins() {
        Player p1 = new ComputerPlayer();
	Player p2 = new ComputerPlayer();
	Game game = new Game();
        game.init(p1, p2, new Console());
        game.setMove(1, new MapPoint(0, 0, 0));
	game.setMove(1, new MapPoint(0, 0, 1));
        game.setMove(1, new MapPoint(0, 0, 2));
 	game.checkForWin(1, new MapPoint(0, 0, 2));
	game.resolve();
        assertEquals(1, p1.getGamesWon());
    }
   
    @Test public void testResolveP2Wins() {
        Player p1 = new ComputerPlayer();
        Player p2 = new ComputerPlayer();
        Game game = new Game();
        game.init(p1, p2, new Console());
        game.setMove(2, new MapPoint(0, 1, 0));
        game.setMove(2, new MapPoint(0, 1, 1));
        game.setMove(2, new MapPoint(0, 1, 2));
        game.checkForWin(2, new MapPoint(0, 1, 2));
        game.resolve();
        assertEquals(1, p2.getGamesWon());
    }
}
