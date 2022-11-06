package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentRegistration {

	public void displayStudent() {
		//AdminPage.admin();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the firstName:");
		String firstName = sc.nextLine();
		System.out.println("Please enter the lastName:");
		String lastName = sc.nextLine();
		System.out.println("Please enter the mobile number:+91");
		String mobileNumber = sc.nextLine();
		System.out.println("Please enter the Email:");
		String mailId = sc.nextLine();
		System.out.println("Registration successfull..");

		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/Project1db?characterEncoding=utf8", "root", "root");
		PreparedStatement prepareStatement = connection
				.prepareStatement("insert into userdetails(firstName, lastName, mobileNumber, mailid, marks)values(?,?,?,?,?)");
		
		prepareStatement.setString(1, firstName);
		prepareStatement.setString(2, lastName);
		prepareStatement.setString(3, mobileNumber);
		prepareStatement.setString(4, mailId);
		DisplayMarks displayMarks = new DisplayMarks();
		int marks = displayMarks.saveMarks();
		prepareStatement.setInt(5, marks);		

		int i = prepareStatement.executeUpdate();
		// System.out.println(i);
		System.out.println("Registration successfull.." + i);
		
		connection.close();
		prepareStatement.close();
	}
		catch(Exception e) {
			   e.printStackTrace();
			   }
		sc.close();
		//GetData.getData();
			}
	
}
