package com.abstractFactory;

public class MicroCar extends Car {
	MicroCar(Location location) { 
		super(CarType.MICRO, location); 
	construct(); 
	} 
	
	protected void construct() { 
		System.out.println("Connecting to Micro Car "); 
	}
}
