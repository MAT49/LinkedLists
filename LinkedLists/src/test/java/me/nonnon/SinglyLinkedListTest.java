package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
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
		list.add(list, 2);
		list.remove(list);
		assertEquals(1, list.count());
		assertEquals(5, list.head.data);
	}
	
	@Test	
	@DisplayName("Testing removing matched value")
	void removeByValueTest() {
		list.add(list, 1);
		list.add(list, 2);
		list.add(list, 3);
		
		list.remove(list, 3);
		assertEquals(1, list.head.data);
		assertEquals(2, list.count());
	}

}
