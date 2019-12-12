package chapter10.bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {	//shelf의 갯수를 반환
		return shelf.size();
	}
}
