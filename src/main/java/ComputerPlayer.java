import java.util.Random;

public class ComputerPlayer extends Player {
	public MapPoint getPoint(){ // Returns a random valid MapPoint
		Random rand = new Random();
		return new MapPoint(0, rand.nextInt(3), rand.nextInt(3));
	}
	
	public boolean isHuman(){ // Returns false
            return false;
        }
}
