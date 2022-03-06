package com.wrapper;

public class WrapperTest {

	public static void main(String[] args) {

		int i = 10;

		// Wrap it to object
		Integer i1 = new Integer(i);

		// unWrap it to primitive:
		int i2 = Integer.valueOf(i1);
		int i3 = i1.intValue();

		float f = Float.valueOf(new Float(55f));

		int pareseInt = Integer.parseInt("5");

		// static -> valueOf() , pareInt() and intValue() -> .floatValue()
		

		// Auto Boxing
		Integer integer = 55;

		// Auto unboxing:
		int ii = integer;

		System.out.println(ii);

	}

}
