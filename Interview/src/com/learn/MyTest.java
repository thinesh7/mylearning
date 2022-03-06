package com.learn;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

class III implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

public class MyTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add(null);
		set.add(null);
		set.add(null);

		System.out.println(set); // [null]

		Set<String> mySet = new TreeSet<>((a, b) -> {
			return 5;
		});

		/*
		 * mySet.add(null); mySet.add(""); mySet.add("");
		 */

		System.out.println(mySet);

		III i = new III();

		List<String> list = new ArrayList<>();
		list.add("ZZZ");
		list.add("AAA");
		list.add("BBB");
		list.add("TTT");
		list.add("TTT");

		System.out.println(list);

		System.out.println(list.stream().map(null).sorted().collect(Collectors.toList()));

		System.out.println(list.stream().sorted((a, b) -> -a.compareTo(b)).findFirst().get());

		String name = "thinaesh";

		Arrays.asList(name.toCharArray()).stream().forEach(x -> {

		});
		// .collect(Collectors.toList()));

		Character cc = new Character('a');
		cc.compareTo('b'); // Character.toString((char) a).compareTo(Character.toString((char) b)

		List<Object> asList = Arrays.asList(name.toCharArray());
	}

}
