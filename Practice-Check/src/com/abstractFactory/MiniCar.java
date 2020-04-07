package com.abstractFactory;

public class MiniCar extends Car {
	MiniCar(Location location) { 
		super(CarType.MINI,location ); 
		construct(); 
	}
	
	void construct() { 
		System.out.println("Connecting to Mini car"); 
	}
}
