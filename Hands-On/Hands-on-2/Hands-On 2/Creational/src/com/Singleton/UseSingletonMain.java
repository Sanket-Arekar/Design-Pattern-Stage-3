package com.Singleton;

public class UseSingletonMain {
	public static void main(String[] args) {

		DBConn s1 = DBConn.getInstance();
		System.out.println(s1);

		DBConn s2 = DBConn.getInstance();
		System.out.println(s2);

		System.out.println(s1 == s2);

//		 DBConn s3= new DBConn() ; // - Not Visible
	}

}
