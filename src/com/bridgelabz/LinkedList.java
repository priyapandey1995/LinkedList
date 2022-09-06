package com.bridgelabz;

public class LinkedList<T> {
	//private T size;
	private Node<T> head;
	private Node<T> tail;
	
	/**
	 * 
	 * @param data t
	 * firstly the new node is created
	 * then,check whether the head is == null
	 * if its null,then both head and tail will point to a new node
	 * 
	 */
	
	public void toInsertData(T data)
	{
		//to create a new node
		Node<T> node = new Node <T> (data);
		
		//to check whether the list is empty or not
		if(head == null) {
			
		//if the list is empty both the head and tail will point to new node
			head = node;
			tail = node;
		}
		else {
			//node will be add after the tail
			tail.next = node;
		//node will become the new tail of the list
			tail = node;
		}
	}
	
	//to append
	public void toAppend(int data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
		//here,node will be added after the tail,and so hence the tail next will point to node
			tail.next = node;
			tail = node;//new tail will be added in the list
			
		}
	}
	
	public void toDisplay() {
		
		//current will point to head
		Node<T> current = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		while(current != null) {
			System.out.print(current.data + "==>");
			current = current.next;
		}
	}
	
	
	
}
