package com.AbstractFactory;

public abstract class HeadLight {
	
	protected final String _headLightModel;

	public HeadLight(String headLightModel) {
		_headLightModel = headLightModel;
	}

	public String getHeadLightModel() {
		return _headLightModel;
	}
}