public class Map{
    protected int[] _map = new int[9]; // An int with the map
    public void Map(){
	this.init(3,3);
    }    

    public void init(int width, int height){
    }
 
    public int hasWon(){ // returns Gamestatus. 
	return 0;
    }

    public boolean setMove(int player, int point){ // sets move, returns true if move is possible, else false
	if (this.fieldIsEmpty(point)) {
           this._map[point] = player;
           return true;     
	}
        return false;
    }

    public int getPoint(int point){ // returns point, 0 if unoccupied 1 if player1 2 if player 2
       return this._map[point];
    }

    public boolean fieldIsEmpty(int point){ // returns point, 0 if unoccupied 1 if player1 2 if player 2
       return this._map[point] == 0;
    }
}
