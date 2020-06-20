package me.nonnon;

public class SinglyLinkedList {
	Node head;
	
	public SinglyLinkedList add(SinglyLinkedList list, int num) {
		Node newNode = new Node(num);
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
	
	public SinglyLinkedList remove(SinglyLinkedList list) {
		if (list.head == null) {
			return null;
		}
		else {
			Node ptr = list.head;
			Node prev = null;
			while (ptr.next != null) {
				prev = ptr;
				ptr = ptr.next;				
			}
			prev.next = null;
			return list;
		}		
	}
	
	public SinglyLinkedList remove(SinglyLinkedList list, int num) {
		Node ptr = list.head;
		
		if (ptr.data == num) {
			head = head.next;
			return list;
		}
		while (ptr.next != null) {
			if (ptr.next.data == num) {
				ptr.next = ptr.next.next;
				return list;
			}
			ptr = ptr.next;
		}
		return list;
	}
	
	
	public int count() {
		Node ptr = head;
		int count = 0;
		if (ptr == null) {
			return 0;
		}
		while (ptr != null) {
			count++;
			ptr = ptr.next;
		}
		return count;
	} 

}
