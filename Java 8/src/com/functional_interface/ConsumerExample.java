package com.functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();

		Consumer<String> con1 = (name) -> names.add(name);

		con1.accept("AAA");
		con1.accept("BBB");
		con1.accept("CCC");

		Consumer<String> con2 = (name) -> System.out.println(name);

		names.forEach(con2);
	}
}
