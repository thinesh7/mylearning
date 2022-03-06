package com.clonablemarkerinterface;

public class Employee implements Cloneable {

	private String empName;
	private String empAddrs;
	private Company company;
	

	public Employee() {
	}

	public Employee(String empName, String empAddrs, Company company) {
		super();
		this.empName = empName;
		this.empAddrs = empAddrs;
		this.company = company;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddrs() {
		return empAddrs;
	}

	public void setEmpAddrs(String empAddrs) {
		this.empAddrs = empAddrs;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	
}
