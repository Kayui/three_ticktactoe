import java.util.Random;

public class ComputerPlayer extends Player {
	public int getPoint(){ // Get user input or computer input
		Random rand = new Random();
		int num = rand.nextInt(8);
		return num;
	}
}
