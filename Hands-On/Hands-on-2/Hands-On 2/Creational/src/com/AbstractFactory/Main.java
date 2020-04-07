package com.AbstractFactory;

import java.util.Scanner;

public final class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String company = sc.next().toLowerCase().trim();				// audi or mercedes
		sc.close();
		
		Client client = new Client();
		client.doSomeClientJob(company);
	}
}