package me.nonnon;

class Node {


	Node head;
	String description;
	
	public Node(){
		head = null;
		description = "generic";
	}
	
	public Node(Node head, String description) {		
		this.head = head;
		this.description = description;
	}
	
}
