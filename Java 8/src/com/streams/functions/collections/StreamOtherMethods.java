package com.streams.functions.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOtherMethods {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList();
		
		//System.out.println(list.stream().findFirst().get());
		
		list.stream().findAny().ifPresent((s)->System.out.println(s));
		
		System.out.println(list.stream().findAny().orElseGet(()-> 1000000000));;
	
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("Name1", 1);
		map.put("Name2", 2);
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		Stream.of(entrySet.toArray()).forEach(System.out::println);
		
		System.out.println(map.entrySet().stream().filter(i-> i.getKey()=="Name1").collect(Collectors.toList()));
		
	}
}
