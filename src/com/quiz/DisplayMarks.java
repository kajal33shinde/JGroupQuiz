package com.quiz;

import java.util.Map;
import java.util.Set;

public class DisplayMarks {
	public int saveMarks() {

		System.out.println();
		System.out.println("                 Welcome to Quiz Site      ");
		System.out.println("========================================================");
		System.out.println("Instructions to Students:\r\n" + "\n"+
				"1. Attempt 10 questions, each question carries 01 mark\r\n" + 
				"2. No negative Marking\r\n" + 
				"3. For answer enter the correct option \r\n" + 
				"4. Once you entered the answer, you cannot change the answer. Be careful about it.");
	
	 System.out.println();
	 System.out.println("***************************************************************************************************");

		int marks = 0;
		AllQuestion allobj = new AllQuestion();
		Map<Integer, Map<String, String>> map = allobj.addAllQuestion();
		Set<Integer> keySet = map.keySet();
		int Q = 1;
		for (Integer key : keySet) {

			System.out.print("Q" + Q + ".");
			Q++;

			Map<String, String> singleQ = map.get(key);

			DisplaySingleQ display1Q = new DisplaySingleQ();

			marks = marks + display1Q.getsingleQ(singleQ);
		}
		System.out.println("============================================================================");
		System.out.println("Your marks are " + marks + " out of 10");

		if (marks >= 8) {

			System.out.println("Grade A");

		} else if (marks >= 6) {

			System.out.println("Grade B");

		} else if (marks == 5) {

			System.out.println("Grade C");

		} else if (marks < 5) {
			System.out.println("Grade D");
		}
		return marks;
	}
}
