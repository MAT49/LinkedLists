package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	@Test
	@DisplayName("Testing add method")
	void addTest() {
		SinglyLinkedList list = new SinglyLinkedList();		
		assertNull(list.head);
		
		list.add(list, 5);
		assertNotNull(list.head);
		assertNull(list.head.next);
		
		
		
		
	}

}
