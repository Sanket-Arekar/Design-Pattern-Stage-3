package com.abstractFactory;

public class LuxuryCar extends Car {
	LuxuryCar(Location location) { 
		super(CarType.LUXURY, location); construct(); 
	}
	
	protected void construct() { 
		System.out.println("Connecting to luxury car"); 
	} 
}
