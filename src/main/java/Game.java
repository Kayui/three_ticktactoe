public class Game{
   private Map maps;
   private GameStatus status;
   private Player p1;
   private Player p2;
   public void Game(){ // Constructor
 	 init();
   }
   public void init(){ // init and reset
   	status = new GameStatus();
	p1 = new HumanPlayer();
	p2 = new HumanPlayer();
   }
   public void gameLoop(){ // the game loop
	 	   
   }
   public int hasWon(){ // returns GameStatus
      return 0;
   }
}
