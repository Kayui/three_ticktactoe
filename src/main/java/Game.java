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
	    gameLoop();
    }

    private void gameLoop(){ // The game loop
        while(status == GameStatus.UNDECIDED){
            // Check who has the turn
            this.intrfc.displayMap(board);
            int player = checkWhosTurn();
            if(player == 1){
                this.intrfc.msgbox("Player 1 has the turn");
            }
            else{
                this.intrfc.msgbox("Player 2 has the turn");
            }

            boolean legalMove; 
            MapPoint point;

            // Get input until legal input has been received 
            do{
                point = currentPlayer.getPoint();
                legalMove = setMove(player, point);
            }while(!legalMove);
        
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
                this.intrfc.msgbox("Player 1 Wins the game!")
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

    public boolean setMove(int player, MapPoint point){
	    return board.setMove(player, point);	
    }

    public void checkForWin(int player, MapPoint point){
	    this.status = board.checkForWin(player, point);
    }
}
