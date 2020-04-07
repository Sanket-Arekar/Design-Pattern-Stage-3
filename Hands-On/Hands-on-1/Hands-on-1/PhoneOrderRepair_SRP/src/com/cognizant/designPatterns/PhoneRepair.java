package com.cognizant.designPatterns;

public class PhoneRepair implements IPhoneRepair,IAccesoriesRepair {
	
	
	@Override
	public void ProcessPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
	}

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType + " repair accepted!");
	}

}
