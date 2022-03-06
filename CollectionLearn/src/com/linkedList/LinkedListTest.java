package com.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> linkedList = new LinkedList<>();

		// 1.
		linkedList.add(0);
		// 2.
		linkedList.add(1, 1);

		System.out.println(linkedList); // [0, 1]

		linkedList.add(2, 2);

		System.out.println(linkedList); // [0, 1, 2]

		linkedList.add(99);
		// 3.
		linkedList.addAll(0, linkedList);
		System.out.println(linkedList); // [0, 1, 2, 99, 0, 1, 2, 99]

		// 4.
		linkedList.addAll(Arrays.asList(3, 4, 5));

		System.out.println(linkedList); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 4, 5]

		// 5.
		linkedList.remove(9);

		System.out.println(linkedList); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 5]

		// Extra:
		System.out.println(linkedList.get(6)); // 2

		// 6.
		LinkedList<Integer> newLinkedList = (LinkedList<Integer>) linkedList.clone();
		System.out.println(newLinkedList);

		// 7.
		System.out.println(newLinkedList.contains(5));

		// 8.
		System.out.println(newLinkedList.containsAll(linkedList));

		// 9.
		System.out.println(newLinkedList.equals(linkedList));

		// 10.
		System.out.println(newLinkedList.lastIndexOf(99));

		// 11.
		newLinkedList.removeIf(x -> !(x % 2 == 0));

		System.out.println(newLinkedList); // [0, 2, 0, 2]

		// 12.
		linkedList.retainAll(newLinkedList);

		System.out.println(linkedList); // [0, 2, 0, 2]

		List<Integer> subList = linkedList.subList(0, 2); // -> IMP index 0 , 1

		System.out.println(subList); // [0, 2]

	}
}
