package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList  list = new LinkedList ();
		
		//to add the nodes to the list
		list.toInsertData(56);
		list.toInsertData(30);
		list.toInsertData(70);
		//list.toDisplay();
		//list.toAddInBetween(1, 30);
		//System.out.println();
		//list.toDisplay();
		//list.toDeleteAtFirstElement();
		list.toDeleteLastElement();
		
		
		list.toDisplay();
	}
}
