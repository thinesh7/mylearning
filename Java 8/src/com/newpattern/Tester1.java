package com.newpattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Tester1 {

	public static void main(String[] args) {
		
		List<String> listOfString1 = Arrays.asList("1","2","3","4","5");

		List<String> listOfString2 = new ArrayList<String>();
		
		
		Consumer<String> consumer1 = p -> System.out.println(p+" Show");
		Consumer<String> consumer2 = p -> {listOfString2.add(p);System.out.println("Added");};
		
		//Chain Consumer
		listOfString1.forEach(consumer1.andThen(consumer2));
		
		System.out.println(listOfString2);
		
	}
}
