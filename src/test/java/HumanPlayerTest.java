import org.junit.Test;
import static org.junit.Assert.*;

public class HumanPlayerTest {
    @Test public void testPointIsValid() {
        HumanPlayer p = new HumanPlayer();
        assertEquals(true, p.pointIsValid(2));
    }

    @Test public void testPointIsValidExpectFalse() {
        HumanPlayer p = new HumanPlayer();
        assertEquals(false, p.pointIsValid(123));
    }

    @Test public void testGetPoint() {
        HumanPlayer p = new HumanPlayer();
	//how to test??
        //assertEquals(1, p.getPoint());
    }
}
