import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {

    @Test public void testCheckStatus() {
        Game game = new Game();
        assertEquals(0, game.checkStatus());
    }

    @Test public void testGameLoop() {
        Game game = new Game();
    }
}
