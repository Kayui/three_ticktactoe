import org.junit.Test;
import static org.junit.Assert.*;

public class ConsoleTest {
    @Test public void testDisplayMap() {
        Console console = new Console();
	Map map = new Map();
	console.displayMap(map);
	//String testString = "this is a reliable test"; 
	//assertEquals("this is a reliable test", console.msgbox(testString));
	//find out how to test
    }    

    @Test public void testPickOption() {
        Console console = new Console();
	String message = "message";
	console.msgbox(message);
    }
}
