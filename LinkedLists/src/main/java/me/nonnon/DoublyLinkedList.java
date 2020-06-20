package me.nonnon;

import java.security.NoSuchAlgorithmException;
import java.util.NoSuchElementException;

public class DoublyLinkedList<T> {
	private static class LinkNode<T>{
		private T data;
		private LinkNode<T> next, prev;
		
		public LinkNode(T data) {
			this.data = data;
		}
	}
	
	private LinkNode<T> head;
	
	public void addNode(T data) {
		LinkNode<T> n = new LinkNode<T>(data);
		if (head == null) {
			head = n;			
		}
		else {
			LinkNode<T> ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
				
			}
			ptr.next = n;
			n.prev = ptr;			
		}
	}
	
	public void removeSingleNodeRepeatedly(T data)	{
		if (head == null) {
			return;			
		}
		if (head.data == data) {
			head = head.next;
			removeSingleNodeRepeatedly(data);
		}
		
		LinkNode<T> ptr = head;
		while (ptr != null) {
			if (ptr.data == data) {
				ptr.prev.next = ptr.next;
				if (ptr.next != null) {
				ptr.next.prev = ptr.prev;						
				}
				
			}
			ptr = ptr.next;
		}			
		
	}
	
	public T peek() {
		if (head == null) throw new NoSuchElementException();
		return head.data;
	}
	
	public int count() {
		LinkNode<T> ptr = head;
		int count = 0;
		if (head == null) return 0;
		while (ptr != null) {
			count++;
			ptr = ptr.next;
			
		}
		return count;
	}
	
	public void print() {
		LinkNode<T> ptr = head;
		while (ptr != null) {
			System.out.println(ptr.data);
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList<String> s = new DoublyLinkedList<String>();
		s.addNode("first");
		s.addNode("first");
		s.addNode("second");
		s.addNode("second");
		s.addNode("second");
		s.addNode("third");
		s.addNode("fourth");
		s.removeSingleNodeRepeatedly("second");
		s.removeSingleNodeRepeatedly("fourth");
		System.out.println(s.count());
		s.print();
		
	}
	
	

}
