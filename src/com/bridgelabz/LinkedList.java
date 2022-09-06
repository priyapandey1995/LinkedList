package com.bridgelabz;

public class LinkedList<T> {
	//private T size;
	 Node <T> head;
	 Node <T> tail;
	
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
	
	public void toAddNodeAtFirst(T data) {
		 Node<T> newNode = new Node <T>(data);
		 
		 if(head == null) {
			 head = newNode;
			 newNode.next = null;
		 }else {
			 Node <T> temp = head;
			 head = newNode;
			 newNode.next = temp;
		 }
	}
		 
		 public void addNodeAtLast(T data) {
			 Node <T> newNode = new Node <T>(data);
			 if(head == null) {
				 head = newNode;
				 tail = newNode;
				 newNode.next = null;
				 
			 }else {
				 tail.next = newNode;
				 newNode.next = null;
				 tail = tail.next;
			 }
		 }
		 
		 public void toAddInBetween(int index, T data) {
			 
			 Node <T> newNode =new Node <T>(data);
			 newNode.next = null;
			 
			 if(index == 0) {
				 toAddNodeAtFirst(data);
			 }
			 
				 else {
					 Node <T> currentPos = head;
					 Node <T> prevPos = head;
					 for(int i = 0;i< index;i++) {
						 prevPos = currentPos;
						 currentPos = currentPos.next;
						 if(currentPos == null) {
							 addNodeAtLast(data);
							 return;
						 }
						 
					 }
					 Node <T> temp = prevPos.next;
					 prevPos.next = newNode;
					 newNode.next = temp;
				 }
			 }

		 
		public void toDeleteAtFirstElement() {
			
			if(head == null) {
				System.out.println("List is empty!nothing to delete");
			}
			else {
				head = head.next;
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
