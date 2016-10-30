class Menu {

    private ui intrfc;

    public Menu(ui _intrfc) {
	this.intrfc = _intrfc;
    }

    public int mainMenu() { // Displays the main menu with an option box
	return this.intrfc.optionbox("Tic Tac Toe!", new String[]{"New Game", "Exit"});
    }

    public int playerMenu() { // Displays an option box for game options
	return this.intrfc.optionbox("Choose your players:", new String[]{"Human vs Human", "Human vs Computer", "Computer vs Computer", "Cancel"});
    }

    public boolean exitMenu() { // Displays a Yes/No box to confirm exiting the game
	return this.intrfc.yesnobox("Are you sure you want to quit?");
    }

    public void settings() {
	// Maybe later!	
    } 
}
