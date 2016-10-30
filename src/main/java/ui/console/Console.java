import java.util.Scanner;

public class Console extends ui {
    public Console() {}

    public void msgBox(String message) { // Prints the parameter string
        System.out.println(message);
    }

    public boolean yesNoBox(String message) { // Asks for input, returns true if input is 'y'
        Scanner readInput = new Scanner(System.in);
        this.msgBox(message);
		this.msgBox("(Y)es or (N)o?");
        char input = readInput.next().charAt(0);
		input = Character.toLowerCase(input);
		return input  == 'y';         
    }

    public int optionBox(String message, String[] options) { // Asks for integer input from the player, displays the parameter array
		this.msgBox(message);
		int i = 1;
		Scanner readInput = new Scanner(System.in);
		for (String option : options) {
			String number = Integer.toString(i);
			option = number + " " + option;
			System.out.println(option);
			i++;
		}	
        return readInput.nextInt();
    }

    public MapPoint pickOption(Map[] map) { // Should return what map the player wants if we later want to add support for different maps.
	return new MapPoint(0, 0, 0);
    }

    public void displayMap(Map map) { // Prints the map
		for(int y = 0; y < map.COLS; y++){
			System.out.println("-------------");
			for(int x = 0; x < map.ROWS; x++){
				int point = map.getPoint(new MapPoint(0, x, y));
				char symbol = point == GameStatus.PLAYER1_WON ? GameStatus.CROSS : 
				point == GameStatus.PLAYER2_WON ? GameStatus.CIRCLE : ' ';
				System.out.print("| " + symbol + " ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
    }

    public void displayMaps(Map[] map) { // Displays all available maps, currently only one available. This is if we later want to add support for different maps.
        for (Map onemap : map) {
			this.displayMap(onemap);		
		}  
    }
}                                                                                                                                                                                                                                                                                                                                     
