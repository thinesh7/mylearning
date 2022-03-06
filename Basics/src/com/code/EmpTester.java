package com.code;

import java.util.Arrays;
import java.util.List;

public class EmpTester {

	private class AAAA {

	}
	
	protected class A{}
	

	public static void main(String[] args) {
		
		Integer i= 1;
		Integer i2 =1;
		
		
		System.out.println(i==i2);

		List<Employee> empList = Arrays.asList(new Employee(1, "AAA", 5000.68), new Employee(1, "AAA", 4000.68),
				new Employee(1, "AAA", 3000.68), new Employee(1, "AAA", 10000.68));

		empList.stream().sorted((x, y) -> {
			return (int) -(x.getSalary() - y.getSalary());
		}).forEach(System.out::println);
		System.out.println("-------------");

		Employee emp = new Employee(1, "AAA", 5000.68);
		System.out.println(emp);
		callMe(emp);
		System.out.println(emp);
	}

	public static void callMe(Employee emp) {
		emp.setEmpName("???");
		emp.setSalary(0);
		emp = new Employee(1, "AAA", 5000.68); // useless assignment to local variable "emp".
		emp = null; // -> useless assignment to local variable "emp".
	}
	
	
	
	
}
