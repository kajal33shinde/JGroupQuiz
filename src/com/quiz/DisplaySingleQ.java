package com.quiz;

import java.util.Map;
import java.util.Scanner;

public class DisplaySingleQ {
	int marks = 0;

	public int getsingleQ(Map<String, String> singleQ) {
		Scanner sc = new Scanner(System.in);

		String qus = singleQ.get("qus");
		String optionA = singleQ.get("optionA");
		String optionB = singleQ.get("optionB");
		String optionC = singleQ.get("optionC");
		String optionD = singleQ.get("optionD");
		String ans = singleQ.get("ans");

		boolean ansCheck = true;
		while (ansCheck) {

			System.out.println(qus);
			// System.out.println();
			System.out.println("\t1. " + optionA);
			System.out.println("\t2. " + optionB);
			System.out.println("\t3. " + optionC);
			System.out.println("\t4. " + optionD);

			// System.out.println();
			System.out.println("Please Enter your Ans: ");
			int userAns = sc.nextInt();

			ansCheck = false;
			if (userAns == 1) {
				if (optionA.equals(ans)) {
					marks++;
				}
			} else if (userAns == 2) {
				if (optionB.equals(ans)) {
					marks++;
				}
			} else if (userAns == 3) {
				if (optionC.equals(ans)) {
					marks++;
				}
			} else if (userAns == 4) {
				if (optionD.equals(ans)) {
					marks++;
				}
			}else{
				ansCheck = true;
				System.out.println("Incorrect Answer");
			}
		}
		sc.close();
		return marks;
		
	}

}
