package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {
	
	SinglyLinkedList list;
	
	@BeforeEach
	void init() {
		list = new SinglyLinkedList();
	}

	@Test
	@DisplayName("Testing add method")
	void addTest() {
//		SinglyLinkedList list = new SinglyLinkedList();		
		assertNull(list.head);
		
		list.add(list, 5);
		assertAll("Should return if node of the linkedlist is set up correctly",
		() -> assertNotNull(list.head),
		() -> assertEquals(5, list.head.data),
		() -> assertNull(list.head.next)
		);
	}
	
	@Test
	@DisplayName("Testing remove method")
	void removeTest() {
		list.add(list,  5);
		list.remove(list);
		assertEquals(0, list.count());
	}

}
