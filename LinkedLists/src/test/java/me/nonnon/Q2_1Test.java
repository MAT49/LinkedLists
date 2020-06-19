package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class Q2_1Test {
	
	SinglyLinkedList list;
	Q2_1 slist;
	
	@BeforeEach
	void init() {
		list = new SinglyLinkedList();
		slist = new Q2_1();
	}

	@Test
	@DisplayName("Testing removeDuplicates method")
	void testRemoveDuplicates() {
//		SinglyLinkedList list = new SinglyLinkedList();
		list.add(list, 1);
		list.add(list, 2);
		list.add(list, 2);
		list.add(list, 3);
		list.add(list, 4);
		list.add(list, 4);
		
		assertEquals(6, list.count());
		
//		Q2_1 slist = new Q2_1();		
		SinglyLinkedList listWithoutDup = slist.removeDuplicates(list);
		
		assertEquals(4, listWithoutDup.count());
	}
	
	
	@Test
	@DisplayName("Testing remove method without using buffers")
	void removeDupWithoutBufferTest() {
		list.add(list, 1);
		list.add(list, 1);
		list.add(list, 2);
		list.add(list, 3);
		list.add(list, 4);
		list.add(list, 4);
		
		SinglyLinkedList listWithoutDup = slist.removeDupWithoutBuffer(list);
		
		assertAll("Should return whether duplicate nodes were deleted",
			() -> assertEquals(4, listWithoutDup.count()),
			() -> assertEquals(2, listWithoutDup.head.next.data)
		);
		
	}

}
