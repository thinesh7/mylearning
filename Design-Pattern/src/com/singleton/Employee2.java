package com.singleton;

public class Employee2 {

	private static Employee2 employee = createObj();

	private static Employee2 createObj() {
		return new Employee2();
	}

	private String fName;
	private String lName;

	public static Employee2 getInstance() {
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
