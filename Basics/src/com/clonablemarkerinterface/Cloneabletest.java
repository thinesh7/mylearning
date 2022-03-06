package com.clonablemarkerinterface;

public class Cloneabletest {

	public static void main(String[] args) throws CloneNotSupportedException {

		// java.lang.CloneNotSupportedException: com.clonablemarkerinterface.Employee

		// Imp -> Cloneable (I) and override equals method..!

		Company com = new Company();
		com.setName("jj");

		Employee emp1 = new Employee("Name", "Addrs", com);

		Employee emp2 = (Employee) emp1.clone();

		System.out.println(emp1 + " - " + emp2);

		System.out.println(emp1 == emp2);

		System.out.println(emp1.getEmpAddrs() == emp2.getEmpAddrs());
		
		System.out.println(emp2.getCompany().getName());

	}

}
