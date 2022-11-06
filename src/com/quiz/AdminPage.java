package com.quiz;

import java.util.Scanner;

public class AdminPage {

	public void admin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Login");
		System.out.println();
		System.out.println("Enter your  Admin name");// Admin
		String userName = scanner.next();
		System.out.println("Enter your password");// Password
		String userPassword = scanner.next();

		String userName1 = "Admin";
		String password = "Password";

		if (userName.equals(userName1) && userPassword.equals(password)) {
			System.out.println("Login successfull...");

		} else {
			System.out.println("Enter Wrong user name or password");
		}
		System.out.println("=======================================================================");
		scanner.close();
		GetData.getData();
	}

	public static void main(String[] args) {
		AdminPage obj = new AdminPage();
		obj.admin();
	}
}