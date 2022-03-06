package com.streams.functions.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("two", 2);
		map.put("eight", 8);
		map.put("one", 1);
		map.put("seven", 7);
		map.put("zero", 0);
		map.put("three", 3);
		map.put("four", 4);

		// 1. Traditional Way:
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println("Before--> " + entryList);
		Collections.sort(entryList, Comparator.comparing(Entry::getValue));
		System.out.println("After--> " + entryList);

		// 2. In Stream:
		System.out.println("Using Stream 1--> "
				+ map.entrySet().stream().sorted(Comparator.comparing(Entry::getValue)).collect(Collectors.toList()));

		System.out.println("Using Stream 2--> "
				+ map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()));

	}
}
