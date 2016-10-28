import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerPlayerTest {

	@Test public void testGetPoint() {
        	ComputerPlayer p = new ComputerPlayer();
		MapPoint point = p.getPoint();
        	assertTrue(0 <= point.x() && point.x() <= 3);
		assertTrue(0 <= point.y() && point.y() <= 3);
        }

}
