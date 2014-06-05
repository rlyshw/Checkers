package app;

public class Tile {
	boolean isPlayer1;
	boolean isPlayer2;
	int x;
	int y;
	public Tile(boolean player1, boolean player2, int x1, int y1) {
		isPlayer1=player1;
		isPlayer2=player2;
		x=x1;
		y=y1;
	}
}
