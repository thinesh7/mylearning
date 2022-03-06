package com.lean.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<String, Integer> budget = new HashMap<>();
		budget.put("clothes", 120);
		budget.put("grocery", 150);
		budget.put("transportation", 100);
		budget.put("utility", 130);
		budget.put("rent", 1150);
		budget.put("miscellneous", 90);
		
		System.out.println("map before sorting: " + budget);
		
		
		LinkedHashMap<String, Integer> sorted = budget.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByValue())
			// .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,LinkedHashMap::new));
			.collect(Collectors.toMap(e -> e.getKey(), Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println("map after sorting by values: " + sorted);
	}

}
