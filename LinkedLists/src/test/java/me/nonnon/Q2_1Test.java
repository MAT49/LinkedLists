package me.nonnon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q2_1Test {

	@Test
	void testRemoveDuplicates() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(list, 1);
		list.add(list, 2);
		list.add(list, 2);
		list.add(list, 3);
		list.add(list, 4);
		list.add(list, 4);
		
		assertEquals(6, list.count());
		
		Q2_1 slist = new Q2_1();		
		SinglyLinkedList listWithoutDup = slist.removeDuplicates(list);
		
		assertEquals(4, list.count());
	}

}
