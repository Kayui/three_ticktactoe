import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
	
    @Test public void testGames_played() {
	HumanPlayer p = new HumanPlayer();
        assertEquals(0, p.getGamesPlayed());
    }

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
}
