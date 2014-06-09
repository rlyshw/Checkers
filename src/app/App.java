package app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board(8);
		// TODO Form the logic within a do-while clause
		boolean isPlayer1 = true;
		
		do {
			do {
				// Logic related to the mouse clicks.
			}
			while (!board.validateMove()); // Probably will end up being some method of the mouse-click handler.  board.validateMove() is a place holder boolean.
			isPlayer1 = !isPlayer1;
		}
		while (!board.checkEndGame());
	}

}
