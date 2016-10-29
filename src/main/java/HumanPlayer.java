import java.util.Scanner;

public class HumanPlayer extends Player {
    public MapPoint getPoint(){ 
		Scanner scan = new Scanner(System.in);
		int x, y;

		do{
			System.out.println("Choose Column");
			x = scan.nextInt();
		}while(!this.pointIsValid(x));

		do{
			System.out.println("Choose Row");
			y = scan.nextInt();
		}while(!this.pointIsValid(y));

		return new MapPoint(0, x-1, y-1);	
	}

	public boolean pointIsValid(int point){
		return (point >= 1 && point <= 3);
    } 
}
