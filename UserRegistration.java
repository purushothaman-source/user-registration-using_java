package com.java.userregistration;

import java.util.Scanner;

public class UserRegistration {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to User-Registration Problem");

		int options = 1;
		while (options < 3) {

			switch (options) {
			case 1:
				UserRegistrationMethods.firstName();
				break;
			case 2:
				UserRegistrationMethods.lastName();
				break;
			}
			options++;
		}

	}

}