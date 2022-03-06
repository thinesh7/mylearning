package com.factorydp;

public class PolygonFactory {

	/*
	 * When the implementation of an interface or an abstract class is expected to
	 * change frequently When the current implementation cannot comfortably
	 * accommodate new change When the initialization process is relatively simple,
	 * and the constructor only requires a handful of parameters
	 */

	public static Polygon getInstance(int noOfSides) {
		if (noOfSides == 4) {
			return new Square();
		} else if (noOfSides == 3) {
			return new Triangle();
		} else if (noOfSides == 0) {
			return new Circle();
		}
		return null;
	}

}
