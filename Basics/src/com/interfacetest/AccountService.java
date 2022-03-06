package com.interfacetest;

public interface AccountService {

	void getAccount();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	// super.defaultMethod
	default void defaultMethod() {
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("AccountService :: defaultMethod :: privateMethod");
	}

	static void staticMethod() {
		System.out.println("AccountService :: staticMethod");
	}

}
