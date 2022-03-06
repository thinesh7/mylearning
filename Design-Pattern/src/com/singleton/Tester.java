package com.singleton;

public class Tester {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class.forName("com.singleton.Employee");
		Class.forName("com.singleton.Employee1");
		
		System.out.println("---");

		Employee employee = Employee.getInstrance();
		employee.setfName("AAA");
		employee.setlName("BBB");
		
		Employee employee1 = Employee.getInstrance();
		
		System.out.println(employee == employee1);
		
		System.out.println(Employee.getInstrance().getlName());
		
		System.out.println("-----");
		
		Employee1 emp1 = Employee1.getInstance();
		Employee1 emp2 = Employee1.getInstance();
		
		System.out.println(emp1==emp2);
	}
}
