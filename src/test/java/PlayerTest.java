import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test public void testGetPoint() {
        Player player = new Player();      
        assertEquals(0, player.getPoint());
    }
	
    @Test public void testGames_played() {
        Player player = new Player();
        assertEquals(0, player.games_played());
    }

    @Test public void testGames_won() {
        Player player = new Player();
        assertEquals(0, player.games_won());
    }
/*
    @Test public void testGameWon() {
        Player player = new Player();
        assertEquals(0, 0);
    }
*/

/*
    @Test public void testgameLost() {
       Player player = new Player();
       assertEquals(0, 0);
    }
 */
    @Test public void testGetGamesWon() {
        Player player = new Player();
        assertEquals(0, player.getGamesWon());
    }

    @Test public void testGetGamesLost() {
        Player player = new Player();
        assertEquals(0, player.getGamesLost());
    }

    @Test public void testGetGamesPlayed(){
        Player player = new Player();
        assertEquals(0, player.getGamesPlayed());
    }
}
