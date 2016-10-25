import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
    @Test public void initTest() {
        Player player = new Player();      
        assertEquals(0, player.getPoint());
    }
}
