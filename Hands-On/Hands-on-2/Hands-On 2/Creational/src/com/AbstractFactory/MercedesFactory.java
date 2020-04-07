package com.AbstractFactory;

public class MercedesFactory extends Factory {
	
	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

	@Override
	public HeadLight makeHeadLight() {
		return new MercedesHeadLight();
	}
}