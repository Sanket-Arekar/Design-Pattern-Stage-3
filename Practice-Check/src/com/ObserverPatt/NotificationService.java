package com.ObserverPatt;


import java.util.ArrayList;

public class NotificationService implements INotificationService{

	private ArrayList<INotificationObserver> observers = new ArrayList<INotificationObserver>();
	

	
	public ArrayList<INotificationObserver> getObservers() {
		return observers;
	}
	public void setObservers(ArrayList<INotificationObserver> observers) {
		this.observers = observers;
	}

	public void notifyObservers() {
		System.out.println("***Notifying to all the subscribers***");
		 for (INotificationObserver ob : observers) {
             ob.update();
      }

	}

	public void registerObserver(INotificationObserver observer) {
		 observers.add(observer);
		
	}

	public void removeObserver(INotificationObserver observer) {
		 observers.remove(observer);
		
	}

}