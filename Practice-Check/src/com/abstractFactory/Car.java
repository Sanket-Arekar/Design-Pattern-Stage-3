package com.abstractFactory;

public abstract class Car {
	
	abstract void construct();
	
	
	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	
	
	CarType model = null; 
	Location location = null;
	
	CarType getModel() { 
		return model; 
	} 
	
	void setModel(CarType model) { 
		this.model = model; 
	}
	
	Location getLocation() { 
		return location; 
	} 
	
	void setLocation(Location location) { 
		this.location = location; 
	}
	
	public String toString() { 
		return "CarModel -"+model + " located in "+location; 
	}
}
