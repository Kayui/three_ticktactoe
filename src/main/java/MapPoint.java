public class MapPoint{
    private int map;
    private int pointX;
    private int pointY;
    MapPoint(int _map, int _pointX, int _pointY){
	this.map = _map; // Which map it points to
        this.pointX =  _pointX; // Which point X on the map
	this.pointY = _pointY; // which point Y on the map
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
