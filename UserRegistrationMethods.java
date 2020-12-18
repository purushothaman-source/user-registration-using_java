package com.java.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMethods {
	static Scanner input = new Scanner(System.in);
	static String text;
	static String firstName = "^[A-Z][a-z]{2,}$";
	static String lastName = "^[A-Z][a-z]{2,}$";
	static String email = "^[0-9a-zA-Z]+([.\\-_+][0-9a-zA-Z]+)*@[a-z0-9A-Z]+.[a-z]{2,4}([.][a-zA-Z]{2,})*$";
	static String mobile = "^91[ ][6-9][0-9]{9}$";

	// FirstName method
	public static void firstName() {
		while (true) {
			System.out.println("Enter FirstName : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(firstName);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("*******Invalid firstName Pattern , Try Again******");
		}

	}

	// LastName Method
	public static void lastName() {
		while (true) {
			System.out.println("Enter lastName : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(lastName);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("****Invalid lastName Pattern , Try Again***");

		}

	}

	// Email method
	public static void email() {
		while (true) {
			System.out.println("Enter Email : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(email);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("******Invalid email Pattern , Try Again*******");

		}

	}

	// mobileFormat Method
	public static void mobile() {
		while (true) {
			System.out.println("Enter mobilenumber with country code follow by space : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(mobile);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("******Invalid mobile Format , Try Again*******");

		}

	}

}
