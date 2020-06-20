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
	
	public void removeSingleNode(T data)	{
		if (head == null) ;			
		else if (head.data == data)  head = head.next;
		else {
			LinkNode<T> ptr = head;
			while (ptr.data != null) {
				if (ptr.data == data) {
					ptr.prev.next = ptr.next;
					ptr.next.prev = ptr.prev;
					return;
				}
				ptr = ptr.next;
			}			
		}
	}
	
	public T peek() {
		if (head == null) throw new NoSuchElementException();
		return head.data;
	}
	
	public static void main(String[] args) {
		DoublyLinkedList<String> s = new DoublyLinkedList<String>();
		s.addNode("first");
		s.addNode("second");
		s.addNode("third");
		s.addNode("fourth");
		System.out.println(s.peek());
		s.removeSingleNode("second");
		System.out.println(s.peek());
		s.removeSingleNode("fourth");
		System.out.println(s.peek());
		
	}
	
	

}
