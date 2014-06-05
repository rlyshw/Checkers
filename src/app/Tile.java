package app;

// This is generally the same as Ian created it
public class Tile {
	public boolean isPlayer1; // Whether Player1 is on this tile
	public boolean isPlayer2; // Whether Player2 is on this tile
	int x; // x pos of tile
	int y; // y pos of tile
	
	public Tile(boolean player1, boolean player2, int x1, int y1) { // init the object
		isPlayer1=player1;
		isPlayer2=player2;
		x=x1;
		y=y1;
	}
}
