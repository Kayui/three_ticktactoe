public abstract class Player{
    protected int gamesWon;
    protected int gamesLost;
    protected int gamesPlayed;
    protected int gamesDraw;

    public Player(){
    	this.gamesWon = 0;
	this.gamesLost = 0;
	this.gamesPlayed = 0;
	this.gamesDraw = 0;
    } 

    public abstract MapPoint getPoint(); // Get user input or computer input

    public void gameWon(){
	gamePlayed();
	this.gamesWon++;
    }

    public int getGamesWon(){
	return this.gamesWon;
    }

    public void gameLost(){
    	gamePlayed();
	this.gamesLost++;
    }

    public int getGamesLost(){
	return this.gamesLost;
    }
    
    public int getGamesPlayed(){
	return this.gamesPlayed;
    }

    public void gameDraw(){
        gamePlayed();
        this.gamesDraw++;
    }

    public int getGamesDraw(){
        return this.gamesDraw;
    }

    private void gamePlayed(){
	this.gamesPlayed++;
    }
}

