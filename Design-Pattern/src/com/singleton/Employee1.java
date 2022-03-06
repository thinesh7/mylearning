package com.singleton;

public class Employee1 {

	private static Employee1 employee;

	static {
		employee = new Employee1();
	}

	private String fName;
	private String lName;

	private Employee1() {
		System.out.println("Employee1 - Obj Creation");
	}

	public static Employee1 getInstance() {
		return employee;
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

}
