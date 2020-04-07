package com.ObserverPatt;

public interface INotificationService {
	   public void registerObserver(INotificationObserver observer);
	  public void removeObserver(INotificationObserver observer);
	  public void notifyObservers();
}