class Menu {

    private ui intrfc;

    public Menu(ui _intrfc) {
	this.intrfc = _intrfc;
    }

    public int mainMenu() {
	return this.intrfc.optionbox("Tic Tac Toe!", new String[]{"New Game", "Exit"});
    }

    public int playerMenu() {
	return this.intrfc.optionbox("Choose your players:", new String[]{"Human vs Human", "Human vs Computer", "Computer vs Computer", "Cancel"});
    }

    public boolean exitMenu() {
	return this.intrfc.yesnobox("Are you sure you want to quit?");
    }

    public void settings() {
	// Maybe later!	
    } 
}
