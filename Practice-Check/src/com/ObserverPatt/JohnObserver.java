package com.ObserverPatt;

public class JohnObserver implements INotificationObserver{

	String personName;

	public JohnObserver(String personName) {
		this.personName = personName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void update() {
		
		System.out.println("Hello "+personName+", Notification has been received");
	}
}