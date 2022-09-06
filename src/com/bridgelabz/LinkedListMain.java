package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		//to add the nodes to the list
		list.addNodeAtLast(56);
		list.addNodeAtLast(70);
		//list.toDisplay();
		list.toAddInBetween(1, 30);
		//System.out.println();
		//list.toDisplay();
		
		
		list.toDisplay();
	}
}
