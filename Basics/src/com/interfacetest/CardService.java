package com.interfacetest;

public interface CardService {

	void getCards();

	@Override
	boolean equals(Object obj);

	@Override
	int hashCode();

	default void defaultMethod() {
		privateMethod();
	}

	private void privateMethod() {
		System.out.println("CardService :: defaultMethod :: privateMethod");
	}

	static void staticMethod() {
		System.out.println("CardService :: staticMethod");
	}

}
