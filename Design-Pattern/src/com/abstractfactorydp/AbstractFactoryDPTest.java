package com.abstractfactorydp;

public class AbstractFactoryDPTest {

	public static void main(String[] args) {

		AbstractFactory factory = FactoryProvider.getFactory("animal");
		Animal animal = ((Animal) factory.create("dog"));
		animal.getType();
		animal.makeSound();

		((Animal) FactoryProvider.getFactory("animal").create("duck")).getType().makeSound();

		((Color) FactoryProvider.getFactory("color").create("white")).getColor();
		
		((Color) FactoryProvider.getFactory("color").create("black")).getColor();

	}
}
