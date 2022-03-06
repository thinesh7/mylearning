package com.list.set.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		// 1.
		list.add(0);
		// 2.
		list.add(1, 1);

		System.out.println(list); // [0, 1]

		list.add(2, 2);

		System.out.println(list); // [0, 1, 2]

		list.add(99);
		// 3.
		list.addAll(0, list);
		System.out.println(list); // [0, 1, 2, 99, 0, 1, 2, 99]

		// 4.
		list.addAll(Arrays.asList(3, 4, 5));

		System.out.println(list); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 4, 5]

		// 5.
		list.remove(9);

		System.out.println(list); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 5]

		// 6.
		// List<Integer> newArrayList = list.clone;
		// System.out.println(newArrayList);

		List<Integer> newList = list;

		// 7.
		System.out.println(newList.contains(5));

		// 8.
		System.out.println(newList.containsAll(list));

		// 9.
		System.out.println(newList.equals(list));

		// 10.
		System.out.println(newList.lastIndexOf(99));

		// 11.
		newList.removeIf(x -> !(x % 2 == 0));

		System.out.println(newList); // [0, 2, 0, 2]

		// 12.
		list.retainAll(newList);

		System.out.println(list); // [0, 2, 0, 2]

		List<Integer> subList = list.subList(0, 2); // -> IMP index 0 , 1

		System.out.println(subList); // [0, 2]

	}
}
