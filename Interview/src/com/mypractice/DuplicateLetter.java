package com.mypractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateLetter {

	public static void main(String[] args) {

		String name = "Thinesh";
		char[] nameCharArray = name.toCharArray();

		Map<Character, Integer> result = new HashMap<>();

		for (char character : nameCharArray) {
			if (result.get(character) != null) {
				result.put(character, result.get(character)+1);
			} else {
				result.put(character, 1);
			}
		}
		
		Entry<Character, Integer> entry = result.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).findFirst().get();
		
		System.out.println(entry);
	}
	
	// result.values().stream().sorted(Collections.reverseOrder()).findFirst().get()

}
