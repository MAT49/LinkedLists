package me.nonnon;

import java.util.HashSet;

public class Q2_1 {
	// Write code to remove duplicates from an unsorted linked list. How would you solve this problem if a 
	// temporary buffer is not allowed?
	
	public SinglyLinkedList removeDuplicates(SinglyLinkedList list) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node prev = null;
		Node ptr = list.head;		
		while (ptr != null) {
			if (set.contains(ptr.data)) {
				prev.next = ptr.next;
			} else {
				set.add(ptr.data);
				prev = ptr;
			}
			ptr = ptr.next;
		}
		return list;
	}
	
	public SinglyLinkedList removeDupWithoutBuffer(SinglyLinkedList list) {
		Node current = list.head;
		while (current != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			current = current.next;
		}
		return list;
	}
	

}
