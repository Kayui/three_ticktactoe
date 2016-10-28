public class Game{
   private Map board;
   private int status;
   private Player p1;
   private Player p2;
   private Player currentPlayer;
   
   public void Game(){ // Constructor
 	 init();
   }
   public void init(){ // init and reset
   	status = GameStatus.UNDECIDED;
	p1 = new HumanPlayer();
	p2 = new HumanPlayer();
	currentPlayer = p1;
	board = new Map();
   }
   public void gameLoop(){ // the game loop
	//check who plays
	//get input
	//place mark
	//check for end of game
	//switch player
	//repeat
	while(status == GameStatus.UNDECIDED){
	    	
	}	
   }
   public int checkStatus(){ // returns GameStatus
      	return status;
  }
}
