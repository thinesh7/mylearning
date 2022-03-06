package com.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {

		String word = "My name is Thinesh and I have done my engineering in the year so and so from so and so university";
		String[] wordArray = word.split(" ");

		Map<String, Integer> result = new HashMap<>();

		for (String s : wordArray) {
			if (result.get(s) != null) {
				result.put(s, result.get(s) + 1);
			} else {
				result.put(s, 1);
			}
		}

		result.forEach((key, value) -> {
			System.out.println("Word : " + key + " -  Count : " + value);
		});
		
		System.out.println("----");
		
		result.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach( entry -> {
			System.out.println("Word : " + entry.getKey() + " -  Count : " + entry.getValue());
		});

	}

}
