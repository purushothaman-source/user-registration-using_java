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
	static String passwordR1 = "^[a-zA-Z0-9]{8,}$";
	static String passwordR2 = "^(?=.*[A-Z])[a-zA-Z0-9]{8,}$";
	static String passwordR3 = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

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

	// Password rule1 Method
	public static void passwordR1() {
		while (true) {
			System.out.println("Enter password with minimum 8 characters  : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(passwordR1);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("******Invalid password , Try Again*******");

		}

	}

	// Password rule2 Method
	public static void passwordR2() {
		while (true) {
			System.out.println("Enter password with minimum 8 characters with atleast one UpperCase   : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(passwordR2);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("******Invalid password , Try Again*******");

		}

	}

	// Password rule3 Method
	public static void passwordR3() {
		while (true) {
			System.out.println(
					"Enter password with minimum 8 characters with atleast one UpperCase and atleast 1 numeric  : ");
			text = input.nextLine();
			Pattern pattern = Pattern.compile(passwordR3);
			Matcher matcher = pattern.matcher(text);
			if (matcher.matches()) {
				System.out.println(">>>>Valid pattern>>>>");
				break;
			} else
				System.out.println("******Invalid password , Try Again*******");

		}

	}

}
