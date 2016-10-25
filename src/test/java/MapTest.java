import org.junit.Test;
import static org.junit.Assert.*;

public class MapTest {
    Map map = new Map();
    @Test public void testHasWon() {
        assertEquals(0, map.hasWon());
    }

    @Test public void testSetMove() {
        assertEquals(true, map.setMove(0,0));
    }
 
    @Test public void testGetPoint() {
        assertEquals(0, map.getPoint(0));
    }
}
