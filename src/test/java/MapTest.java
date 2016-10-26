import org.junit.Test;
import static org.junit.Assert.*;

public class MapTest {
    @Test public void testHasWon() {
	Map map = new Map();
        assertEquals(0, map.hasWon());
    }

    @Test public void testSetMove() {
	Map map = new Map();
        assertEquals(true, map.setMove(1,3));
    }
 
    @Test public void testGetPoint() {
	Map map = new Map();
        assertEquals(0, map.getPoint(1));
    }
    
    @Test public void testFieldIsEmpty() {
        Map map = new Map();
        assertEquals(true, map.fieldIsEmpty(1));
    }

    @Test public void testMapIsFull() {
        Map map = new Map();
        assertEquals(false, map.mapIsFull());
    }

    @Test public void testCheckForWin() {
        Map map = new Map();
        assertEquals(GameStatus.UNDECIDED, map.checkForWin(1, 0, 0));
    }
}
