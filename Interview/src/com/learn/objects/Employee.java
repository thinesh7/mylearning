package com.learn.objects;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {

	private String firstName;
	private String lastName;
	
	private List<String> strList = new ArrayList<String>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<String> getStrList() {
		return strList;
	}

	public void setStrList(List<String> strList) {
		this.strList = strList;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			boolean flag = this.firstName == ((Employee) obj).firstName;
			System.out.println("Comparing--> Current Obj " + this.firstName + ", Checking with "
					+ ((Employee) obj).firstName + " " + flag);
			return flag;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return 123456789;
	}

	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

	@Override
	public int compareTo(Employee obj) {
		return this.firstName.compareTo(obj.firstName);
	}

}
