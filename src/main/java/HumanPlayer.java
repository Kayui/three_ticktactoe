import java.util.Scanner;

public class HumanPlayer extends Player {
    public MapPoint getPoint(){ // Get user input or computer input 
	Scanner scan = new Scanner(System.in);
	int x;
	int y;
	
	do{
	    x = scan.nextInt();
	}while(!this.pointIsValid(x));

	do{
	    y = scan.nextInt();
	}while(!this.pointIsValid(y));

	return new MapPoint(0, x, y);	
    }

    public boolean pointIsValid(int point){
	return (point >= 0 && point < 3);
    } 
}
