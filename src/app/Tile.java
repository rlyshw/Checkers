package app;

// This is generally the same as Ian created it
public class Tile {
	public int state;
	int x; // x pos of tile
	int y; // y pos of tile
	
	public Tile(int startState, int x, int y) { // init the object
		state = startState;
		this.x=x;
		this.y=y;
		System.out.println("x: "+x+" y: "+y);
		System.out.println("State: "+state);
	}
	
	public void turnOn(int player) {
		
	}
}
