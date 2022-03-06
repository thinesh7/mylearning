package com.streams.realtime.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

	public static List<Employee> evaluateTaxUsers(String type) {
		return (type.equalsIgnoreCase("TAX"))
				? DB.getAllEmp().stream().filter((emp) -> emp.getSalary() > 500000).collect(Collectors.toList())
				: (type.equalsIgnoreCase("NON TAX")) ? DB.getAllEmp().stream()
						.filter((emp) -> emp.getSalary() <= 500000).collect(Collectors.toList())
						: new ArrayList<Employee>();
	}

	public static void main(String[] args) {

		System.out.println(evaluateTaxUsers("non tax"));

		int a = 0;
		int b = 5;
		int g = (a > b) ? a : (b > 10) ? b : (b == 0) ? 5 : 6;

	}

}
