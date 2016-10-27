public class Game{
   private Map board;
   private int status;
   private Player p1;
   private Player p2;
   private Player currentPlayer;
   public static final int PLAYER1_WON = 1;
   public static final int PLAYER2_WON = 2;
   public static final int DRAW = 3;
   public static final int UNDECIDED = 0;
   
   public void Game(){ // Constructor
 	 init();
   }
   public void init(){ // init and reset
   	status = UNDECIDED;
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
	
   }
   public int checkStatus(){ // returns GameStatus
      	return status;
  }
}
