package com.hashMap;

public class Employee implements Comparable<Employee> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			boolean flag = this.name == ((Employee) obj).name;
			System.out.println(
					"Comparing--> Current Obj " + this.name + ", Checking with " + ((Employee) obj).name + " " + flag);
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
		return this.name;
	}

	@Override
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.getName());
	}

}
