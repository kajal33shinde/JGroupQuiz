package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AllStudentData {

	public void sortedMarks() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Project1db?characterEncoding=utf8", "root", "root");

			PreparedStatement stmt = con.prepareStatement("select*from userdetails order by marks desc");

			ResultSet rs = stmt.executeQuery();
			System.out.println("Display marks in sorting order...");
			System.out.println();
			while (rs.next()) {
				System.out.print("stdId = " + rs.getString(1) + "\t firstName = " + rs.getString(2) + "\t marks = "
						+ rs.getString(6) + "\n");
				System.out.println();
			}
			con.close();
			stmt.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//GetData.getData();
	}

}
