import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    @Test public void testHasWon() {
	Game game = new Game();
        assertEquals(0, game.hasWon());
    }
}
