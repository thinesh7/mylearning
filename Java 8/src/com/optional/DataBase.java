package com.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBase {

	public static List<Employee> getAllEmp() {
		return Stream
				.of(new Employee(101, "john", "john@gmail.com", Arrays.asList(397937955l, 21654725l)),
					new Employee(102, "smith", "smith@gmail.com", Arrays.asList(89563865l, 2487238947l)),
					new Employee(103, "peter", "peter@gmail.com", Arrays.asList(38946328654l, 3286487236l)),
					new Employee(104, "kely", "kely@gmail.com", Arrays.asList(389246829364l, 948609467l)),
				    new Employee(105, "zelly", "zelly@gmail.com", Arrays.asList(9948629364l, 5389246809467l)))
				.collect(Collectors.toList());
	}
}
