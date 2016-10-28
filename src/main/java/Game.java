public class Game{
    private Map board;
    private int status;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
   
    public void Game(){ // Constructor
    }

    public void init(Player p1, Player p2){ // Init and reset
        this.status = GameStatus.UNDECIDED;
        this.p1 = p1;
        this.p2 = p2;
        this.currentPlayer = p1;
        this.board = new Map();
    }

    public void gameLoop(){ // The game loop
	while(status == GameStatus.UNDECIDED){
	    int player = checkWhosTurn();
	    MapPoint point = currentPlayer.getPoint();
	    setMove(player, point);
	    checkForWin(player, point);
	    switchPlayer();	
	}
	resolve();	
    }

    public int checkWhosTurn(){ // Check who's turn it is
	
        if(this.currentPlayer == this.p1){
                return 1;
        }
        else{
                return 2;
        }
    }
    
    public void switchPlayer(){ // Switch the current player
	if(this.currentPlayer == this.p1){
            this.currentPlayer = this.p2;
        }
        else{
            this.currentPlayer = this.p1;
        }
    }

    public void resolve(){ // Update the score for each player
    	switch(status){
	    case GameStatus.PLAYER1_WON:
	    p1.gameWon();
	    p2.gameLost();
	    break;
	    case GameStatus.PLAYER2_WON:
            p2.gameWon();
            p1.gameLost();
            break;
	    case GameStatus.DRAW:
            p1.gameDraw();
            p2.gameDraw();
            break;
	    default:
	    break;
	}
    }

    public void setMove(int player, MapPoint point){
	board.setMove(player, point);	
    }

    public void checkForWin(int player, MapPoint point){
	this.status = board.checkForWin(player, point);
    }
}
