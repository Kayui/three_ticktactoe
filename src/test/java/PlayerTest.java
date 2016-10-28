import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {

    @Test public void testGetGamesWon() {
	HumanPlayer p =	new HumanPlayer();
        assertEquals(0, p.getGamesWon());
    }
    @Test public void testGameWon() {
        HumanPlayer p = new HumanPlayer();
	p.gameWon();
        assertEquals(1, p.getGamesWon());
    }
    @Test public void testgameLost() {
       HumanPlayer p =	new HumanPlayer();
       p.gameLost();
       assertEquals(1, p.getGamesLost());
    }

    @Test public void testGetGamesLost() {
	HumanPlayer p =	new HumanPlayer();
        assertEquals(0, p.getGamesLost());
    }

    @Test public void testGetGamesPlayed(){
	HumanPlayer p =	new HumanPlayer();
        assertEquals(0, p.getGamesPlayed());
    }

    @Test public void testGetGamesPlayed2(){
        HumanPlayer p = new HumanPlayer();
	p.gameWon();
	p.gameLost();
	p.gameDraw();
        assertEquals(3, p.getGamesPlayed());
    }

    @Test public void testGamesDraw(){
        HumanPlayer p = new HumanPlayer();
        p.gameDraw();
        p.gameDraw();
        assertEquals(2, p.getGamesDraw());
    }

    @Test public void testGetGamesDraw(){
        HumanPlayer p = new HumanPlayer();
        assertEquals(0, p.getGamesDraw());
    }
}
