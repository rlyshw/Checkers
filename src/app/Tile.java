package app;

// This is generally the same as Ian created it
public class Tile {
	
	public int state;
	public final int X; // x pos of tile
	public final int Y; // y pos of tile
	
	public Tile(int state, int X, int Y) { // init the object
		this.state = state;
		this.X=X;
		this.Y=Y;
		System.out.println("X: " + X + " Y: " + Y);
		System.out.println("State: " + state);
	}
	
	public void changeState() {
		this.state = 0;
	}
	
	public void changeState(int playerState) {
		this.state = playerState;
	}
}
