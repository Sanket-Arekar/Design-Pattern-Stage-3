package com.cognizant.designPatterns;

import java.util.Scanner;

public class OrderRepair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption = sc.nextLine().toLowerCase().trim();
		
		PhoneOrderRepair phoneOrderRepair = new PhoneOrderRepair();
		String productDetail = null;

		switch (processOption) {
		case "order":
			System.out.println("Please provide the phone model name");
			productDetail = sc.nextLine().trim();
			phoneOrderRepair.ProcessOrder(productDetail);
			break;
		case "repair":
			System.out.println("Is it the phone or the accessory that you want to be repaired?");
			String productType = sc.nextLine().toLowerCase().trim();
			if(productType.equals("phone")) {
				System.out.println("Please provide the phone model name");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.ProcessPhoneRepair(productDetail);
			}
			else {
				System.out.println("Please provide the accessory detail, like headphone, tempered glass");
				productDetail = sc.nextLine().trim();
				phoneOrderRepair.ProcessAccessoryRepair(productDetail);
			}
			break;
		default:
			System.out.println("Thank you");
			break;
		}
		
		sc.close();
	}

}
