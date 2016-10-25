public class Map{
    protected int map[]; // An int with the map
    public void init(int width, int height){
    
    }
 
    public int hasWon(){ // returns Gamestatus. 
	return 0;
    }
    public boolean setMove(int player, int point){ // sets move, returns true if move is possible, else false
	return true;
    }

    public int getPoint(int point){ // returns point, 0 if unoccupied 1 if player1 2 if player 2
	return 0;
    }
}
