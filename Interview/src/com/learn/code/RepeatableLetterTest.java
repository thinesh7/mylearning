package com.learn.code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RepeatableLetterTest {

	public static void main(String[] args) {

		String word = "Thinesh";

		Map<Character, Integer> map = new HashMap<>();

		char[] wordCharArrary = word.toCharArray();

		for (int i = 0; i < wordCharArrary.length; i++) {

			char currectChar = wordCharArrary[i];

			if (map.get(currectChar) != null) {
				map.put(currectChar, map.get(currectChar) + 1);
			} else {
				map.put(currectChar, 1);
			}
		}

		System.out.println(map);

		System.out.println(map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.findFirst().get());

	}

}
