package me.nonnon;

public class SinglyLinkedList {
	Node head;
	
	public SinglyLinkedList add(SinglyLinkedList list, String s) {
		Node newNode = new Node(s);
		newNode.next = null;
		
		if (list.head == null) {
			list.head = newNode;
		} 
		else {
			Node ptr = list.head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = newNode;
		}
		
		return list;
	}
	

}
