import java.util.Scanner;

public class console extends ui {
    public void msgbox(String message) {
        System.out.println(message);
    }
    public boolean yesnobox(String message) {
        Scanner readInput = new Scanner(System.in);
        this.msgbox(message);
	this.msgbox("(Y)es or (N)o?");
        char input = readInput.next().charAt(0);
	input = Character.toLowerCase(input);
	return input  == 'y';         
    }
    public int optionbox(String message, String[] options) {
	this.msgbox(message);
	int i = 0;
	Scanner  readInput = new Scanner(System.in);
	for (String option : options) {
		String number = Integer.toString(i);
		option = number + " " + option;
		System.out.println(option);
		i++;
	}	
        return readInput.nextInt();
    }
    public MapPoint pickOption(Map[] map) {
           return new MapPoint(0,0);
    }
    public void displayMap(Map map) {
	// TODO: Hardcoding the withd*height of the map
	// Should be fixed ASAP! Or else it will be rather
	// difficult to maintain this code when we go 
	// corporate
	for (int i = 0; i < 9; i++) {
		if (i == 0 || i % 3 == 0) {
			System.out.println("");
		}
		int point = map.getPoint(i);
		char symbol = point == GameStatus.PLAYER1_WON ? GameStatus.CROSS : 
		point == GameStatus.PLAYER2_WON ? GameStatus.CIRCLE : ' ';
		System.out.print(symbol+'\t');
	} 
    }
    public void displayMaps(Map[] map) {
        for (Map onemap : map) {
		this.displayMap(onemap);		
	}  
    }
}                                                                                                                                                                                                                                                                                                                                     
