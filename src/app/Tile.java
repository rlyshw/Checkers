package app;

// This is generally the same as Ian created it
public class Tile {
	public int state;
	int x; // x pos of tile
	int y; // y pos of tile
	
	public Tile(int startState, int x1, int y1) { // init the object
		state = startState;
		x=x1;
		y=y1;
		System.out.println("x: "+x+" y: "+y);
		System.out.println("State: "+state);
	}
	
	public void turnOn(int player) {
		
	}
}
