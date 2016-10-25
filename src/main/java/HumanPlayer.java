import java.util.Scanner;

public class HumanPlayer extends Player {
    public int getPoint(){ // Get user input or computer input 
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	return input;	
    }
}
