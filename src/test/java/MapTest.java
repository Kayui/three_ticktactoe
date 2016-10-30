import org.junit.Test;
import static org.junit.Assert.*;

public class MapTest {
    @Test public void testSetMove() {
	Map map = new Map();
        assertEquals(true, map.setMove(1, new MapPoint(0, 0, 0)));
    }

    @Test public void testBadMove() {
	Map map = new Map();
	map.setMove(1, new MapPoint(0, 0, 0));
	assertEquals(false, map.setMove(1, new MapPoint(0, 0, 0)));
    }
 
    @Test public void testGetPoint() {
	Map map = new Map();
	map.setMove(1, new MapPoint(0, 0, 1));
        assertEquals(1, map.getPoint(new MapPoint(0, 0, 1)));
    }
    
    @Test public void testFieldIsEmpty() {
        Map map = new Map();
        assertEquals(true, map.fieldIsEmpty(new MapPoint(0, 0, 1)));
    }

    @Test public void testFieldIsNotEmpty() {
	Map map = new Map();
	map.setMove(1, new MapPoint(0, 0, 1));
	assertEquals(false, map.fieldIsEmpty(new MapPoint(0, 0, 1)));
    }

    @Test public void testMapIsFull() {
        Map map = new Map();
        assertEquals(false, map.mapIsFull());
    }

    @Test public void testMapIsFullWithFullMap3x3() {
        Map map = new Map();
	for(int x = 0; x < 3; x++){
	    for(int y = 0; y < 3; y++){
		map.setMove(1, new MapPoint(0, x, y));
	    }
	}
        assertEquals(true, map.mapIsFull());
    }
	
   @Test public void testWinner() {
	Map map = new Map();
        assertEquals(GameStatus.PLAYER2_WON, map.winner(2));
    }

    @Test public void testCheckForWin() {
        Map map = new Map();
        assertEquals(GameStatus.UNDECIDED, map.checkForWin(1, new MapPoint(0, 0, 0)));
    }
	
    @Test public void testCheckForWinExpectedWin() {
        Map map = new Map();
	map.setMove(1, new MapPoint(0, 0, 0));
        map.setMove(1, new MapPoint(0, 0, 1));
        map.setMove(1, new MapPoint(0, 0, 2));
        assertEquals(GameStatus.PLAYER1_WON, map.checkForWin(1, new MapPoint(0, 0, 2)));
    }

    @Test public void testCheckForWinDiagonal1ExpectWin() {
        Map map = new Map();
        map.setMove(2, new MapPoint(0, 0, 0));
        map.setMove(2, new MapPoint(0, 1, 1));
        map.setMove(2, new MapPoint(0, 2, 2));
        assertEquals(GameStatus.PLAYER2_WON, map.checkForWin(2, new MapPoint(0, 2, 2)));
    }

     @Test public void testCheckForWinDiagonal2ExpectWin() {
        Map map = new Map();
        map.setMove(1, new MapPoint(0, 0, 2));
        map.setMove(1, new MapPoint(0, 1, 1));
        map.setMove(1, new MapPoint(0, 2, 0));
        assertEquals(GameStatus.PLAYER1_WON, map.checkForWin(1, new MapPoint(0, 2, 0)));
    }

    @Test public void testCheckForWinDiagonal1ExpectLoss() {
        Map map = new Map();
        map.setMove(2, new MapPoint(0, 0, 0));
        map.setMove(2, new MapPoint(0, 0, 1));
        map.setMove(2, new MapPoint(0, 2, 2));
        assertNotEquals(GameStatus.PLAYER2_WON, map.checkForWin(2, new MapPoint(0, 2, 2)));
    }

     @Test public void testCheckForWinDiagonal2ExpectLoss() {
        Map map = new Map();
        map.setMove(1, new MapPoint(0, 0, 0));
        map.setMove(1, new MapPoint(0, 0, 1));
        map.setMove(1, new MapPoint(0, 2, 2));
        assertNotEquals(GameStatus.PLAYER1_WON, map.checkForWin(1, new MapPoint(0, 2, 2)));
    }
	
     @Test public void testInit() {
        Map map = new Map();
	map.init(3,3);
        assertEquals(0, map.getPoint(new MapPoint(0, 0, 0)));
	assertEquals(0, map.getPoint(new MapPoint(0, 0, 1)));
	assertEquals(0, map.getPoint(new MapPoint(0, 0, 2)));
	assertEquals(0, map.getPoint(new MapPoint(0, 1, 0)));
	assertEquals(0, map.getPoint(new MapPoint(0, 1, 1)));
	assertEquals(0, map.getPoint(new MapPoint(0, 1, 2)));
	assertEquals(0, map.getPoint(new MapPoint(0, 2, 0)));
	assertEquals(0, map.getPoint(new MapPoint(0, 2, 1)));
	assertEquals(0, map.getPoint(new MapPoint(0, 2, 2)));
    }

    @Test public void checkForWinWithDraw() {
        Map map = new Map();
	map.setMove(1, new MapPoint(0, 0, 0));
        map.setMove(1, new MapPoint(0, 0, 1));
        map.setMove(2, new MapPoint(0, 0, 2));
	map.setMove(2, new MapPoint(0, 1, 0));
	map.setMove(2, new MapPoint(0, 1, 1));
	map.setMove(1, new MapPoint(0, 1, 2));
	map.setMove(1, new MapPoint(0, 2, 0));
	map.setMove(1, new MapPoint(0, 2, 1));
	map.setMove(2, new MapPoint(0, 2, 2));

        assertEquals(GameStatus.DRAW, map.checkForWin(2, new MapPoint(0, 2, 2)));
    }
}

