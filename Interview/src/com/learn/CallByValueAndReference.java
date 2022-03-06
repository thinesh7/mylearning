package com.learn;

class Rect {
	public int x;
	public int y;

	Rect(int a, int b) {
		x = a;
		y = b;
	}
}

class RectTest {

	Rect rect = new Rect(10, 15);

	public void test() {
		System.out.println("Reference --> " + rect.x + " " + rect.y);
		hh(rect);
		System.out.println("Reference --> " + rect.x + " " + rect.y);
	}

	public void hh(Rect r) {
		r.x = 5;
		r.y = 5;
	}

}

class OOO {

	private int oo = 10;

	public void test() {
		System.out.println("val --> " + oo);
		hh(oo);
		System.out.println("val --> " + oo);
	}

	public void hh(int a) {
		a = 5;
	}

}

public class CallByValueAndReference {

	public static void main(String[] args) {
		OOO o = new OOO();
		o.test();

		RectTest rectTest = new RectTest();
		rectTest.test();

	}

}
