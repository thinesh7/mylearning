package com.singleton;

public class Employee {

	private static Employee employee = new Employee();

	private String fName;
	private String lName;

	private Employee() {
		System.out.println("Employee - Obj Creation");
	}

	public static Employee getInstrance() {
		return employee;
	}

	public static Employee getEmployee() {
		return employee;
	}

	public static void setEmployee(Employee employee) {
		Employee.employee = employee;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public boolean equals(Object obj) {
		return this == obj;
	}
}
