import java.util.Random;

public class ComputerPlayer extends Player {
	public MapPoint getPoint(){ // Get user input or computer input
		Random rand = new Random();
		return new MapPoint(0, rand.nextInt(3), rand.nextInt(3));
	}
}
