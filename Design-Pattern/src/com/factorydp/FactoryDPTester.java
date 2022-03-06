package com.factorydp;

public class FactoryDPTester {

	public static void main(String[] args) {

		PolygonFactory.getInstance(0).display();
		PolygonFactory.getInstance(4).display();
		PolygonFactory.getInstance(3).display();

		System.out.println(PolygonFactory.getInstance(0) == PolygonFactory.getInstance(0));
	}

}
