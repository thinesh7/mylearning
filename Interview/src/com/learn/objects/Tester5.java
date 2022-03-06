package com.learn.objects;

public class Tester5 {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setFirstName("AAA");
		emp1.setLastName("BBB");
		emp1.getStrList().add("Test 1");
		emp1.getStrList().add("Test 2");
		emp1.getStrList().add("Test 3");
		
		Employee emp2 = emp1;
		Employee emp3 = emp2;
		Employee emp4 = emp3;
		
		emp4.getStrList().add("Test 4");
		
		
		System.out.println(emp2.getStrList());
		
		emp4 = new Employee();
		
		System.out.println(emp2.getStrList());

	}
}
