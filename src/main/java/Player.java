public abstract class Player{
    protected int gamesWon;
    protected int gamesLost;
    protected int gamesPlayed;

    public Player(){
    	this.gamesWon = 0;
	this.gamesLost = 0;
	this.gamesPlayed = 0;
    } 

    public abstract int getPoint(); // Get user input or computer input

    public void gameWon(){
	this.gamesPlayed += 1;
	this.gamesWon += 1;
    }

    public int getGamesWon(){
	return this.gamesWon;
    }

    public void gameLost(){
    	this.gamesPlayed += 1;
	this.gamesLost += 1;
    }

    public int getGamesLost(){
	return this.gamesLost;
    }

    public int getGamesPlayed(){
	return this.gamesPlayed;
    }	
}

