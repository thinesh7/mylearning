package com.optional;

public class OptionalWithStreams {

	public static Employee getEmployeeByEmailID(String email) throws Exception {
		return DataBase.getAllEmp().stream().filter(cust -> cust.getEmail().equals(email)).findAny()
				.orElseThrow(() -> new Exception("No Customer Present with this email id..!"));
	}

	public static boolean isEmployeeByPresentEmailID(String email) throws Exception {
		return DataBase.getAllEmp().stream().filter(cust -> cust.getEmail().equals(email)).findAny().isPresent();
	}
	
	public static boolean isEmployeeByPresentEmailID2(String email) throws Exception {
		return DataBase.getAllEmp().stream().anyMatch(cust -> email.equals(cust.getEmail()));
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(getEmployeeByEmailID("johnz@gmail.com")); --> // Exception
		System.out.println(isEmployeeByPresentEmailID2("john@gmail.com"));
	}
}

