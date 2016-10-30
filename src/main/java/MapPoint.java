public class MapPoint{
    private int map;	// Which map it points to
    private int pointX; // Which point X on the map
    private int pointY; // which point Y on the map

    MapPoint(int _map, int _pointX, int _pointY){ // Constructor
	this.map = _map; 
        this.pointX =  _pointX; 
        this.pointY = _pointY;
    }

    public int x() {
        return this.pointX;
    }

    public int y() {
        return this.pointY;
    }

    public int getMap(){
        return this.map;
    }
}
