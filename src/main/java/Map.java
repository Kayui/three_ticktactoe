public class Map{
    public static final int ROWS = 3;
    public static final int COLS = 3;
    protected int[][] _map = new int[ROWS][COLS]; // An int with the map
    public void Map(){
	this.init(3,3);
    }    

    public void init(int width, int height){
	for(int i = 0; i < width; i++){
	    for(int j = 0; j < height; j++){
		_map[i][j] = 0;
	    }
	}
    }
 
    public int hasWon(){ // returns Gamestatus. 
	return 0;
    }

    public boolean setMove(int player, int point){ // sets move, returns true if move is possible, else false
	if (this.fieldIsEmpty(point)) {
           this._map[(point - 1)/3][(point - 1)%3] = player;
           return true;     
	}
        return false;
    }

    public int getPoint(int point){ // returns point, 0 if unoccupied 1 if player1 2 if player 2
       return this._map[(point - 1)/3][(point - 1)%3];
    }

    public boolean fieldIsEmpty(int point){ // returns point, 0 if unoccupied 1 if player1 2 if player 2
       return getPoint(point) == 0;
    }

    public boolean mapIsFull(){
         for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(_map[i][j] == 0){
		     return false;
		}
            }
        }
	return true;
    }

   public int checkForWin(int player, int point){
	int row = (point - 1 ) / 3;
	int col = (point - 1) % 3;
	boolean won = checkForVerticalWin(player, row);
	if(won){
	    return winner(player);
	}
	won = (checkForHorizontalWin(player, col) || checkForVerticalWin(player, row) || checkForDiagonalWin1(player, col, row) || checkForDiagonalWin2(player, col, row));
        if(won){
            return winner(player);
	}
	if(mapIsFull()){
	    return GameStatus.DRAW;
	}	
   	return GameStatus.UNDECIDED;
   }
   
   public boolean checkForVerticalWin(int player, int row){
       for(int i = 0; i < 3; i++){
            if(_map[row][i]!=player){
                return false;
            }
       }
       return true;
   }

   public boolean checkForHorizontalWin(int player, int col){
       for(int i = 0; i < 3; i++){
            if(_map[i][col]!=player){
                return false;
            }
       }
       return true;
   }

   public boolean checkForDiagonalWin1(int player, int col, int row){
       if(row == col){
            for(int i = 0; i < 3; i++){
                if(_map[i][i]!=player){
                    return false;
                }
            }
            return true;
	}
	return false;
   }

   public boolean checkForDiagonalWin2(int player, int col, int row){
 	if((row + col) == 2){
            for(int i = 0; i < 3; i++){
                if(_map[i][2 - i]!=player){
                    return false;
                }
            }
	    return true;
	}
	return false;      
   }

   public int winner(int player){
	if(player == 1){
	    return GameStatus.PLAYER1_WON;
	}else{
	    return GameStatus.PLAYER2_WON;
	}
   }
}
