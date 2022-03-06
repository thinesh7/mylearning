package com.learn;

class SingletonExample {

	private static SingletonExample singletonExample = new SingletonExample();

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		return singletonExample;
	}

}

public class SingletonTest {

	public static void main(String[] args) {

		SingletonExample instance1 = SingletonExample.getInstance();

		SingletonExample instance2 = SingletonExample.getInstance();

		System.out.println(instance1 == instance2);
	}
}
