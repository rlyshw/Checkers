package app;

import java.util.ArrayList;
import java.util.List;

public class Board {
	public List<Tile> tileList = new ArrayList<Tile>();
	public Board(int size) {
		if(size==8 || size==10 || size==12){
			for(int x=0;x<size;x++){
				for(int y=0;y<size;y++) {
					tileList.add(new Tile(false, false, x, y));
				}
			}
		}
		else{
			System.out.println("Error, board must be 8, 10, or 12 tiles in size");
		}
	}
}
