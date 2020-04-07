package com.ObserverPatt;

public class Main {

	   public static void main(String[] args) {
	    JohnObserver so=new JohnObserver("Steve");
	    JohnObserver jo=new JohnObserver("John");
	    
	    NotificationService NS=new NotificationService();
	    
	  
	    NS.registerObserver(so);
	    NS.registerObserver(jo);
	    NS.notifyObservers();
	    System.out.println();
	    
	    NS.removeObserver(jo);
	    NS.notifyObservers();
	   }
	}