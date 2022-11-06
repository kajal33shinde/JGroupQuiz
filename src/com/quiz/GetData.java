package com.quiz;

import java.util.Scanner;

public class GetData {

	public static void getData() {
		 Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("***************WELCOME TO QUIZ APPLICATION**************************************************");
		System.out.println();
		System.out.println("============================================================================================");

		System.out.println("Enter 1 : Admin Login ");
		 System.out.println();

		 System.out.println("Enter 2 : Registration and Quiz ");
		 System.out.println();

		 System.out.println("Enter 3 : Get Students All Data");
		 System.out.println();

		 System.out.println("Enter 4 : Get Specific Student Details");
		 System.out.println();

		 System.out.println("Enter 5 : You Selected Exit");
		 System.out.println();
         System.out.println("Please enter the number...");
		 int checkLogin = scanner.nextInt();
		 System.out.println("********************************************************************************************");

		 if(checkLogin == 1) {
			 AdminPage adminClass = new AdminPage();
			 adminClass.admin();
			 
		 }else if(checkLogin == 2) {
		 StudentRegistration studentRegistration= new StudentRegistration();
		 studentRegistration.displayStudent();
		 
		 }else if(checkLogin == 3) {
			 AllStudentData allStudentData = new AllStudentData();
			 allStudentData.sortedMarks();
		 }else if(checkLogin == 4) {
			 DisplaySpecificRecord displaySpecificRecord = new DisplaySpecificRecord();
			 displaySpecificRecord.displayRecord();
		 }else if(checkLogin == 5) {
			 System.out.println("You selected Exit.");
				 System.out.println("*******************************************FINISH**************************************************");

		}else {
		 //wrong input
				System.out.println("You Entered Wrong input.");
		 }
		 scanner.close();
		 }
	}

