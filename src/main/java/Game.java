public class Game{
    private Map board;
    private int status;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private ui intrfc;   

    public void Game(){}

    public void init(Player p1, Player p2, ui _intrfc){ // Init and reset
        this.status = GameStatus.UNDECIDED;
        this.p1 = p1;
        this.p2 = p2;
        this.currentPlayer = p1;
	this.intrfc = _intrfc;
        this.board = new Map();
    }

    public void start() {
	displayMap(); // Print the map
	gameLoop();
    }

    private void gameLoop(){ // The game loop
        while(status == GameStatus.UNDECIDED){
            int player = checkWhosTurn(); // Check who has the turn
            if(player == 1){
                this.intrfc.msgBox("X has the turn");
            }
            else{
                this.intrfc.msgBox("O has the turn");
            }

            boolean legalMove; 
            MapPoint point;

            // Get input until legal input has been received 
            do{
                point = currentPlayer.getPoint();
                legalMove = setMove(player, point);
		if(!legalMove && currentPlayer.isHuman()){
		    illegalMoveMsg(point);
		}
            }while(!legalMove);
	    displayMap();
            checkForWin(player, point);
            switchPlayer();    
        }
        resolve();	
    }

    private void displayMap(){
	this.intrfc.displayMap(board);
    }
    
    private void illegalMoveMsg(MapPoint point){ // Print error message for illegal moves
	this.intrfc.msgBox("The point: " + (point.x() + 1) + ", " + (point.y() + 1) + " is occupied. Try again");
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
                this.intrfc.msgBox("Player 1 Wins the game!");
                p1.gameWon();
                p2.gameLost();
                break;
            case GameStatus.PLAYER2_WON:
		this.intrfc.msgBox("Player 2 Wins the game!");
                p2.gameWon();
                p1.gameLost();
                break;
            case GameStatus.DRAW:
		this.intrfc.msgBox("Game ended in a draw!");
                p1.gameDraw();
                p2.gameDraw();
                break;
            default:
                break;
	    }
    }

    public boolean setMove(int player, MapPoint point){ // Places the player's mark, returns true if the field is available
	    return board.setMove(player, point);	
    
    }

    public void checkForWin(int player, MapPoint point){ // Checks if the game is over
        this.status = board.checkForWin(player, point);
    }

/* Dummy code if we want to add the possibility of keeping score 
    public void printScore(){ 
	this.intrfc.msgBox("Player 1:");
	System.out.println(this.p1.getGamesWon());
	System.out.println(this.p1.getGamesLost());
	System.out.println(this.p1.getGamesDraw());
	System.out.println(this.p1.getGamesPlayed());

	this.intrfc.msgbox("Player 2:");
        System.out.println(this.p2.getGamesWon());
        System.out.println(this.p2.getGamesLost());
        System.out.println(this.p2.getGamesDraw());
        System.out.println(this.p2.getGamesPlayed());	
    }
*/
}
