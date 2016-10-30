import java.util.Scanner;

public class HumanPlayer extends Player {
    private ui intrfc;
    HumanPlayer(ui _interface){ // Determine what Ui is going to be used
	intrfc = _interface;
    }

    public MapPoint getPoint(){ // Get the point of insertion from the player, return it as MapPoint
	Scanner scan = new Scanner(System.in);
	int x = getInputX(scan);
	int y = getInputY(scan);

	return new MapPoint(0, x-1, y-1);	
    }

    public boolean isHuman(){ // Returns true
        return true;
    }
	
	public boolean pointIsValid(int point){ // Validate that the point is within bounds
	    return (point >= 1 && point <= 3);
        } 
	public int getInput(Scanner scan){ // Get point input from the player and validate
	    int coordinate;
            do{
                coordinate = scan.nextInt();
                if(!this.pointIsValid(coordinate)){
                    inputOutOfBounds();
                }
            }while(!this.pointIsValid(coordinate));
            return coordinate;
	}

	public int getInputX(Scanner scan){ // Get input from point x
            this.intrfc.msgbox("Choose Column");
            int x = getInput(scan);
	    return x;
        }

	public int getInputY(Scanner scan){ // Get input from point y
            this.intrfc.msgbox("Choose Row");
            int y = getInput(scan);
	    return y;
        }
	
	private void inputOutOfBounds(){ // Writes error message
	    this.intrfc.msgbox("The input was out of bounds");
	}
}
