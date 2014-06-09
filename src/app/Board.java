package app;

import java.util.*;
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
			System.err.println("Error, board must be 8, 10, or 12 tiles in size"); //Handle board size 
		}
	}
	
	public boolean checkEndGame() {
		int player1 = 0;
		int player2 = 0;
		for(int i=1;i<=tileList.size();i++) {
				if (tileList.get(i).state == 1)
					player1++;
				else if (tileList.get(i).state == 2)
					player2++;
			}
		return (player1 == 0 || player2 == 0);
	}
	
	public void restartGame(int size) {
		int startRows = (size-2)/2;
		for(int x=1;x<=size;x++){
			for(int y=1;y<=size;y++) {
				if((x%2==0)^(y%2==0)) {
					if(x<=startRows){
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
}
