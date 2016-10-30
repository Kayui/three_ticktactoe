/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'andri' at '25/10/16 11:39' with Gradle 3.1
 *
 * @author thmt, @date 25/10/16 11:39
 */
import static java.lang.System.*;

public class TicTacToe {
    public static void main(String [ ] args) {
        Console intrfc = new Console();	
	Menu menu = new Menu(intrfc);
	
	// 0 = Human vs Human
	// 1 = Human vs Computer
	// 2 = Computer vs Computer
	// 3 = Exit
	while(true){
	    int choice = menu.mainMenu();
   	    if(choice == 1){
    	        Game game = new Game();
		choice = menu.playerMenu();	
	        if(choice == 1){
	            game.init(new HumanPlayer(), new HumanPlayer(), intrfc);
		    game.start();
	        }
	        else if(choice == 2){
	            game.init(new HumanPlayer(), new ComputerPlayer(), intrfc);
		    game.start();
	        }
	        else if(choice == 3){
	            game.init(new ComputerPlayer(), new ComputerPlayer(), intrfc);
		    game.start();
 	        }
	    }
	    else if(choice == 2){
	        if(menu.exitMenu()){	    
	            System.exit(0);
	        }
	    }
	}
    }
	
    public TicTacToe() {
    }

    public boolean testMethod() {
        return true;
    }
}
