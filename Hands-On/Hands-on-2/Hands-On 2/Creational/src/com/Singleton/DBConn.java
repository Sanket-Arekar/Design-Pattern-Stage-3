package com.Singleton;

//SingleTon class
public class DBConn {

	// static private member – ‘instance’ to hold its own instance
	private static DBConn instance = null;

	// Private constructor - to make only a single instance
	private DBConn() {

	}

	// Static function.
	public static DBConn getInstance() {

		// If there is no instance available, create new one (i.e. lazy initialization).
		if (instance == null) {
			instance = new DBConn();
		}
		return instance;
	}

}
