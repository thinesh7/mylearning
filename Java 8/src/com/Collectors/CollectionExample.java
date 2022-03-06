package com.Collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class CollectionExample {

	public static void main(String[] args) {
		
		Collection<String> strings = Arrays.asList("onee","tw","three","fourx","s");
		
		Collection<String> list = new ArrayList<String>(strings);
		
		list.removeIf(s -> {
			System.out.println(s.length()>2);
			return (s.length()>2);
		});
		
		System.out.println(list); // [tw, s]
		
		Long count = list.stream().collect(Collectors.counting());
		
		System.out.println(count);
		
		String result = list.stream().collect(Collectors.joining(","));
		
		System.out.println(result); // tw,s
		
		System.out.println(Long.max(2l, 3l));
		
		BinaryOperator<Long> sum = (l1,l2)->l1+l2;
		
		BinaryOperator<Long> sum2 = Long::sum;
		
	}
}
