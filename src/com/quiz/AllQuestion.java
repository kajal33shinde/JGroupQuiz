package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AllQuestion {
	public Map<Integer, Map<String, String>> addAllQuestion() {
		Map<Integer, Map<String, String>> allQus = new HashMap<>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/Project1db?characterEncoding=utf8", "root", "root");
			PreparedStatement ps = connection.prepareStatement("select * from question");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Map<String, String> singleQ = new LinkedHashMap<String, String>();
				int QNo = rs.getInt(1);
				String qus = rs.getString(2);
				String optionA = rs.getString(3);
				String optionB = rs.getString(4);
				String optionC = rs.getString(5);
				String optionD = rs.getString(6);
				String ans = rs.getString(7);

				singleQ.put("qus", qus);
				singleQ.put("optionA", optionA);
				singleQ.put("optionB", optionB);
				singleQ.put("optionC", optionC);
				singleQ.put("optionD", optionD);
				singleQ.put("ans", ans);

				allQus.put(QNo, singleQ);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return allQus;
	}

}
