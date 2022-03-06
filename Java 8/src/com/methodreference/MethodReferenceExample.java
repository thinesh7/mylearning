package com.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		//Normal Lambda:
		Consumer<String> consumer = s -> System.out.println("Hello "+s);
		consumer.accept("Thinesh");
		
		Consumer<String> con = System.out::println;
		con.accept("Thinesh");
		
		Comparator<Integer> c = Integer::compare;
		
		System.out.println(c.compare(5, 6));
		
		List<String> test = new ArrayList<String>();
		
		test.add("Test1"); 
		test.add("Test2");
		
		test.forEach(System.out::println);
		
		
	}
}
