package app;

import java.util.ArrayList;
import java.util.List;

public class Board {
	public List<Tile> tileList = new ArrayList<Tile>(); //Creates a List object consisting of Tile objects
	public Board(int size) {
		if(size==8 || size==10 || size==12){ //These are the only sizes of checker boards
			for(int x=0;x<size;x++){
				for(int y=0;y<size;y++) {
					tileList.add(new Tile(false, false, x, y)); //For every row and column, add a Tile
				}
			}
		}
		else{
			System.out.println("Error, board must be 8, 10, or 12 tiles in size"); //Handle board size 
		}
	}
}
