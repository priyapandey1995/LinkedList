package com.bridgelabz;

public class LinkedList<T> {
	//private T size;
	private Node<T> head;
	private Node<T> tail;
	
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
			
			tail.next = node;
		//node will become the new tail of the list
			tail = node;
		}
	}
	
	public void toDisplay() {
		
		//current will point to head
		Node<T> current = head;
		if(head == null) {
			System.out.println("List is empty");
		}
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
}
