package com.abstractfactorydp;

public class ColorFactory implements AbstractFactory<Color> {

	@Override
	public Color create(String colorType) {
		if ("WHITE".equalsIgnoreCase(colorType)) {
			return new White();
		} else if ("BLACK".equalsIgnoreCase(colorType)) {
			return new Black();
		} else {
			return null;
		}
	}

}
