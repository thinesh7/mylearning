package com.streams.realtime.map;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMap {

	public static void main(String[] args) {

		Map<Employee, Integer> map = new TreeMap<Employee, Integer>(
				(o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));
		map.put(new Employee("DDD", 70_000), 4);
		map.put(new Employee("BBB", 50_000), 2);
		map.put(new Employee("CCC", 80_000), 3);
		map.put(new Employee("AAA", 90_000), 1);

		// 1. Normal Way:
		System.out.println(map);

		// 2. Using Stream
		System.out.println(
				map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
						.collect(Collectors.toList()));

		// 2.1 Using Stream
		System.out.println(map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
				.collect(Collectors.toList()));

		// 3. Using Stream
		System.out.println(map.entrySet().stream().sorted(Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toList()));

	}
}
