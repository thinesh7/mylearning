package com.code;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RepeativeCount {

	public static void main(String[] args) {

		Map<Character, Integer> result = new HashMap<>();

		String name = "thifffnesh";

		char[] nameArray = name.toCharArray();

		for (char charName : nameArray) {
			if (result.get(charName) != null) {
				result.put(charName, result.get(charName) + 1);
			} else {
				result.put(charName, 1);
			}
		}

		System.out.println(result);

		System.out.println(result.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.findFirst().get());

	}
}
