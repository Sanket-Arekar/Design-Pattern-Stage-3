package com.AbstractFactory;

public class FactoryMaker {

	public static Factory getFactory(String factoryName) {
	
		if (factoryName.equals("audi"))
			return new AudiFactory();
		else if (factoryName.equals("mercedes"))
			return new MercedesFactory();
		else
			return null;
	}
}