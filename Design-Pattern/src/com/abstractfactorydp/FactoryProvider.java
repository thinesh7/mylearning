package com.abstractfactorydp;

public class FactoryProvider {

	public static AbstractFactory getFactory(String choice) {
		if ("ANIMAL".equalsIgnoreCase(choice)) {
			return new AnimalFactory();
		} else if ("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		}
		return null;
	}

}
