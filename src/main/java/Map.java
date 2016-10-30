public class Map{
    public static final int ROWS = 3;
    public static final int COLS = 3;
    protected int[][] _map = new int[ROWS][COLS]; // An int with the map
    
    public void Map(){ // Constructor
        this.init(ROWS,COLS);
    }    

    public void init(int width, int height){ // Set the value of each field of the board to 0(although this is done by default)
        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
            this._map[i][j] = 0;
            }
        }
    }

    public boolean setMove(int player, MapPoint point){ // Places the players mark, returns true if move is possible, else false
        if (this.fieldIsEmpty(point)) {
            this._map[point.x()][point.y()] = player;
            return true;     
        }
        return false;
    }

    public int getPoint(MapPoint point){ // Returns point, 0 if unoccupied 1 if player1 2 if player 2
        return this._map[point.x()][point.y()];
    }

    public boolean fieldIsEmpty(MapPoint point){ // Returns true if the field is empty, that is if no player is occuping it
        return getPoint(point) == 0;
    }

    public boolean mapIsFull(){ // Returns true if every field is occupied by some player
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(_map[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public int checkForWin(int player, MapPoint point){ // Checks every possible way of winning, returns a winner, draw or that the game is not yet over
        boolean won = (checkForHorizontalWin(player, point.y()) || checkForVerticalWin(player, point.x()) 
                || checkForDiagonalWin1(player, point.y(), point.x()) || checkForDiagonalWin2(player, point.y(), point.x()));
        if(won){
            return winner(player);
        }
        if(mapIsFull()){
            return GameStatus.DRAW;
        }	
        return GameStatus.UNDECIDED;
    }
   
    public boolean checkForVerticalWin(int player, int row){ // Checks for win vertically
        for(int i = 0; i < 3; i++){
            if(_map[row][i]!=player){
                return false;
            }
        }
        return true;
    }

    public boolean checkForHorizontalWin(int player, int col){ // Checks for win horizontally
        for(int i = 0; i < 3; i++){
            if(_map[i][col]!=player){
                return false;
            }
        }
        return true;
    }

    public boolean checkForDiagonalWin1(int player, int col, int row){ // Checks for win diagonally from top to bottom
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

    public boolean checkForDiagonalWin2(int player, int col, int row){  // Checks for win diagonally from bottom to top
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

    public int winner(int player){ // Returns the winner of the game
        if(player == 1){
            return GameStatus.PLAYER1_WON;
        }
        else{
            return GameStatus.PLAYER2_WON;
        }
    }
}
