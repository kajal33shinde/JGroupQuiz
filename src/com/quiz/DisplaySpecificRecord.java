package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DisplaySpecificRecord {

	public void displayRecord() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Project1db?characterEncoding=utf8", "root", "root");
			Scanner sc = new Scanner(System.in);
			System.out.println("=====================================================");
			System.out.println("Display Specific Record...");
			System.out.println("Enter student Id");
			String stdId = sc.nextLine();
			PreparedStatement stmt = con.prepareStatement("select * from userdetails where stdId='" + stdId + "'");
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("stdId = " + rs.getString(1));
				System.out.println("firstName = " + rs.getString(2));
				System.out.println("lastName = " + rs.getString(3));
				System.out.println("mobileNumber = " + rs.getString(4));
				System.out.println("mailId = " + rs.getString(5));
				System.out.println("marks = " + rs.getString(6));

			} else {
				System.out.println("Record Not Found...");
			}
			con.close();
			stmt.close();
			rs.close();
			sc.close();

		  }catch (Exception e) {
			e.printStackTrace();
		}
		//GetData.getData();
	}
}
