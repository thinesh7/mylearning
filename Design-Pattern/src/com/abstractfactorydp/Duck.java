package com.abstractfactorydp;

public class Duck implements Animal {

	@Override
	public Animal getType() {
		System.out.println("DUCK");
		return this;
	}

	@Override
	public Animal makeSound() {
		System.out.println("BACK BACK ..!");
		return this;
	}

}
