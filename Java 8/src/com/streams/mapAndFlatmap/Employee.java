package com.streams.mapAndFlatmap;

import java.util.List;

public class Employee {

	private int id;
	private String name;
	private String email;
	private List<Long> phoneNumbers;

	public Employee() {
	}

	public Employee(int id, String name, String email, List<Long> phoneNumbers) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumbers=" + phoneNumbers + "]";
	}

}
