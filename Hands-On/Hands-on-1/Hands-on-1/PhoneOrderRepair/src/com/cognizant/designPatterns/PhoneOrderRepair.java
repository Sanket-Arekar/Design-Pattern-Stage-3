package com.cognizant.designPatterns;

public class PhoneOrderRepair implements IOrderRepair {

	@Override
	public void ProcessOrder(String modelName) {
		System.out.println(modelName + " order accepted!");
	}

	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted!");
	}

}
