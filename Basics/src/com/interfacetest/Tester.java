package com.interfacetest;

public class Tester {

	public static void main(String[] args) {

		Service service = new Service();

		service.defaultMethod();

		service.getAccount();
		service.getCards();

		/*
		 * AccountService :: defaultMethod :: privateMethod 
		 * CardService :: defaultMethod :: privateMethod 
		 * Accounts 
		 * Cards
		 */
		
		AccountService.staticMethod();
		CardService.staticMethod();
		
		/*
		 * Java interface static method is similar to default method except that we can’t override 
		 * them in the implementation classes. This feature helps us in avoiding undesired results 
		 * in case of poor implementation in implementation classes.
		 */
	}

}
