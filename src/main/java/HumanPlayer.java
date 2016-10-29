import java.util.Scanner;

public class HumanPlayer extends Player {
    public MapPoint getPoint(){ 
		Scanner scan = new Scanner(System.in);
		int x, y;

		do{
			x = getInputX(scan);
		}while(!this.pointIsValid(x));

		do{
			y = getInputY(scan);
		}while(!this.pointIsValid(y));

		return new MapPoint(0, x-1, y-1);	
	}

	public boolean pointIsValid(int point){
		return (point >= 1 && point <= 3);
    } 
	public int getInput(Scanner scan){
		int coordinate = scan.nextInt();
		return coordinate;
	}

	public int getInputX(Scanner scan){
                System.out.println("Choose Column");
                int x = getInput(scan);
		return x;
        }

	public int getInputY(Scanner scan){
                System.out.println("Choose Row");
                int y = getInput(scan);
		return y;
        }
}
