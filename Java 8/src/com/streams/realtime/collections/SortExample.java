package com.streams.realtime.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

	public static void main(String[] args) {

		List<Employee> employees = DB.getAllEmp();

		System.out.println(employees);

		// 1. Traditional Way:
		Collections.sort(employees, (e1, e2) -> {
			double s1 = e1.getSalary();
			double s2 = e2.getSalary();
			return (s1 < s2) ? 1 : (s1 > s2) ? -1 : 0;
		});

		System.out.println(employees);

		// 2. Using Sort in Stream:
		System.out.println(employees.stream().sorted((e1, e2) -> {
			double s1 = e1.getSalary();
			double s2 = e2.getSalary();
			return (s1 < s2) ? -1 : (s1 > s2) ? 1 : 0;
		}).collect(Collectors.toList()));

		// 3. Using Sort in Stream:
		System.out.println(employees.stream().sorted((e1, e2) -> {
			double s1 = e1.getSalary();
			double s2 = e2.getSalary();
			return (s1 < s2) ? 1 : (s1 > s2) ? -1 : 0;
		}).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()));

		System.out.println(
				employees.stream().sorted(Comparator.comparing((emp) -> emp.getSalary())).collect(Collectors.toList()));
		
	}
}
