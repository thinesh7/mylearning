package com.abstractfactorydp;

public interface AbstractFactory<T> {

	T create(String type);
}
