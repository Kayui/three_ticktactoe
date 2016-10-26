import java.util.Scanner;

public class HumanPlayer extends Player {
    public int getPoint(){ // Get user input or computer input 
	Scanner scan = new Scanner(System.in);
	int input;
	HumanPlayer p = new HumanPlayer();
	do{
	    input = scan.nextInt();
	}while(!p.pointIsValid(input));
	return input;	
    }

    public boolean pointIsValid(int point){
		return (point > 0 && point < 10);
    } 
}
