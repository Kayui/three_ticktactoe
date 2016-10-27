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

    @Test public void testMapIsFullWithFullMap3x3() {
        Map map = new Map();
	for(int i = 1; i < 10; i++){
            map.setMove(1,i);
        }
        assertEquals(true, map.mapIsFull());
    }
	
   @Test public void testWinner() {
	Map map = new Map();
        assertEquals(GameStatus.PLAYER2_WON, map.winner(2));
    }

    @Test public void testCheckForWin() {
        Map map = new Map();
        assertEquals(GameStatus.UNDECIDED, map.checkForWin(1, 1));
    }
	
    @Test public void testCheckForWinExpectedWin() {
        Map map = new Map();
	map.setMove(1,1);
        map.setMove(1,2);
        map.setMove(1,3);
        assertEquals(GameStatus.PLAYER1_WON, map.checkForWin(1, 3));
    }

    @Test public void testCheckForWinExpectedWin2() {
        Map map = new Map();
        map.setMove(2,1);
        map.setMove(2,5);
        map.setMove(2,9);
        assertEquals(GameStatus.PLAYER2_WON, map.checkForWin(2, 9));
    }
}
