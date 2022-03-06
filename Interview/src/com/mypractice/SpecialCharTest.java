package com.mypractice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SpecialCharTest {

	public static void main(String[] args) throws ClassNotFoundException {

		String name = "thinesh";

		// Way -1 :
		IntStream chars = name.chars();

		List<Character> charList = chars.mapToObj(c -> (char) c).collect(Collectors.toList());
		System.out.println(charList);

		System.out.println(
				name.chars().mapToObj(c -> (char) c).sorted(Collections.reverseOrder()).collect(Collectors.toList()));

		// Way 2:

		char[] names = name.toCharArray();
		
		System.out.println("--> "+names);
 
		System.out.println(IntStream.range(0, names.length).mapToObj(i -> {
			System.out.println(i);
			return names[i];
		}).collect(Collectors.toList()));

		System.out.println(names.length);

		
	}
}
