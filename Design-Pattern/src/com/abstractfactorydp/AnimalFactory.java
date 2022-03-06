package com.abstractfactorydp;

public class AnimalFactory implements AbstractFactory<Animal> {

	@Override
	public Animal create(String animalType) {
		if ("DOG".equalsIgnoreCase(animalType)) {
			return new Dog();
		} else if ("DUCK".equalsIgnoreCase(animalType)) {
			return new Duck();
		} else {
			return null;
		}
	}

}
