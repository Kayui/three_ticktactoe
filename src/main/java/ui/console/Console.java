import java.util.Scanner;

public class Console extends ui {
    public Console() {}

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

    public MapPoint pickOption(Map[] map) {
		return new MapPoint(0, 0, 0);
    }

    public void displayMap(Map map) {
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

    public void displayMaps(Map[] map) {
        for (Map onemap : map) {
			this.displayMap(onemap);		
		}  
    }
}                                                                                                                                                                                                                                                                                                                                     
