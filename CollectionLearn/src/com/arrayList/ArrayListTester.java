package com.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTester {

	public static void main(String[] args) {

		ArrayList<Integer> arraylist = new ArrayList<>();

		// 1.
		arraylist.add(0);
		// 2.
		arraylist.add(1, 1);

		System.out.println(arraylist); // [0, 1]

		arraylist.add(2, 2);

		System.out.println(arraylist); // [0, 1, 2]

		arraylist.add(99);
		// 3.
		arraylist.addAll(0, arraylist);
		System.out.println(arraylist); // [0, 1, 2, 99, 0, 1, 2, 99]

		// 4.
		arraylist.addAll(Arrays.asList(3, 4, 5));

		System.out.println(arraylist); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 4, 5]

		// 5.
		arraylist.remove(9);

		System.out.println(arraylist); // [0, 1, 2, 99, 0, 1, 2, 99, 3, 5]

		// 6.
		ArrayList<Integer> newArrayList = (ArrayList<Integer>) arraylist.clone();
		System.out.println(newArrayList);

		// 7.
		System.out.println(newArrayList.contains(5));

		// 8.
		System.out.println(newArrayList.containsAll(arraylist));

		// 9.
		System.out.println(newArrayList.equals(arraylist));

		// 10.
		System.out.println(newArrayList.lastIndexOf(99));

		// 11.
		newArrayList.removeIf(x -> !(x % 2 == 0));

		System.out.println(newArrayList); // [0, 2, 0, 2]

		// 12.
		arraylist.retainAll(newArrayList); 

		System.out.println(arraylist); // [0, 2, 0, 2]

		List<Integer> subList = arraylist.subList(0, 2); // -> IMP index 0 , 1

		System.out.println(subList); // [0, 2]
	}

}
