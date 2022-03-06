package com.mypractice;

public class InstanceOfTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> className = Class.forName("java.lang.String");

		System.out.println(className.isInstance(new String()));
		System.out.println(className.isInstance(Integer.valueOf(5)));

		System.out.println(new String() instanceof String);
		// System.out.println(new String() instanceof Integer.valueOf(5)); 
		// -> Incompatible conditional operand types String and Integer
	}	

}
