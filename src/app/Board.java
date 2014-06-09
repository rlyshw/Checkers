package app;

import java.util.ArrayList;
import java.util.List;

public class Board {
	public List<Tile> tileList = new ArrayList<Tile>(); //Creates a List object consisting of Tile objects
	public Board(int size) {
		int startRows = (size-2)/2;
		if(size==8 || size==10 || size==12){ // These are the only sizes of checker boards
			for(int x=1;x<=size;x++){
				for(int y=1;y<=size;y++) { // For every row and column, add a Tile
					// TODO Handle the placement of virtual checkers using purely math. 
					// If (x is even) XOR (y is even), then state is 1 or 2, depending on the current row
					if((x%2==0)^(y%2==0)) {
						if(x<=startRows){ //Starting positions
							tileList.add(new Tile(2, x, y)); 
						}
						else if(x>startRows+2) {
							tileList.add(new Tile(1, x, y));
						}
						else {
							tileList.add(new Tile(0, x, y));
						}
					}
					else {
						tileList.add(new Tile(0,x,y));
					}
				}
			}
		}
		else{
			System.out.println("Error, board must be 8, 10, or 12 tiles in size"); //Handle board size 
		}
	}
	 
	public void Move(Tile tile0, Tile tile1, int player) {
		tile0.state = 0;
		tile1.state = player;
	}
	
	public void Kill(Tile tile, int player) {
		
	}
}
