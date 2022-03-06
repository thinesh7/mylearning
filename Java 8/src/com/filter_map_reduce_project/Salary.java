package com.filter_map_reduce_project;

import java.util.List;

public class Salary {

	public static void main(String[] args) {

		List<Employee> employees = DataBase.getEmployees();

		System.out.println(employees.stream().filter((emp) -> emp.getGrade().equals("A"))
				.mapToDouble((emp) -> emp.getSalary()).average().getAsDouble());

		Double reduce = employees.stream().filter((emp) -> emp.getGrade().equals("A")).map((emp) -> emp.getSalary())
				.reduce(0.0, (a, b) -> a + b) / employees.stream().filter((emp) -> emp.getGrade().equals("A")).count();

		System.out.println(reduce);
	}
	
}
