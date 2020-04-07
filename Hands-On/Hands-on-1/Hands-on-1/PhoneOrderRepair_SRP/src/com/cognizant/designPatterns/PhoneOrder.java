package com.cognizant.designPatterns;

public class PhoneOrder implements IOrder{
	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

}
