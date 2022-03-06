package com.abstractfactorydp;

public class Dog implements Animal {

	@Override
	public Animal getType() {
		System.out.println("DOG");
		return this;
	}

	@Override
	public Animal makeSound() {
		System.out.println("BOW BOW ..!");
		return this;
	}

}
