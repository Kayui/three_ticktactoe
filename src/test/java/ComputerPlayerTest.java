import org.junit.Test;
import static org.junit.Assert.*;

public class ComputerPlayerTest {

	@Test public void testGetPoint() {
        	ComputerPlayer p = new ComputerPlayer();
		int number = p.getPoint();
        	assertTrue(0 <= number && number <= 8);
        }

}
