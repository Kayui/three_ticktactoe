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

    public void gameWon(){ // Increments games won
        gamePlayed();
        this.gamesWon++;
    }

    public int getGamesWon(){ // Getter
        return this.gamesWon;
    }

    public void gameLost(){ // Increments games lost
    	gamePlayed();
        this.gamesLost++;
    }

    public int getGamesLost(){ // Getter
        return this.gamesLost;
    }
    
    public int getGamesPlayed(){ // Getter
        return this.gamesPlayed;
    }

    public void gameDraw(){ // Increments games ending in a draw
        gamePlayed();
        this.gamesDraw++;
    }

    public int getGamesDraw(){ // Getter
        return this.gamesDraw;
    }

    private void gamePlayed(){ // Increments games played
        this.gamesPlayed++;
    }
}

