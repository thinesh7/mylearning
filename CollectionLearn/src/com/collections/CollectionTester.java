package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionTester {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();
		strList.add("a");

		// 1. Add All
		Collections.addAll(strList, "b", "c", "d");

		System.out.println(strList);

		// 2. shuffle
		Collections.shuffle(strList);

		System.out.println(strList);

		// 3. Sort
		Collections.sort(strList);

		System.out.println(strList);

		// 4. Collections.reverseOrder()
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);

		// 5.
		Integer max = Collections.max(Arrays.asList(1, 2, 3, 4, 5, 6, 9));
		System.out.println(max);

		// 6.
		System.out.println(Collections.min(Arrays.asList(1, 2, 3, 4, 5, 6, 9)));

	}

}
