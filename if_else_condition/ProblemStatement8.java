package com.kd.if_else_condition;

/* Problem Statement 8: You are creating a program for a luxury hotel. The hotel provides 
   senior citizens a special discount on room bookings. The program should take age as input.
    If the age is 60 or above, the program should print "Senior Citizen Discount Applicable".
     Otherwise, it should print "Regular Charges Applicable".*/

import java.util.Scanner;
public class ProblemStatement8 {

	public static void main(String[] args) { 
       
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Age of the Citizen:");
		int age=scan.nextInt();
		
		
		citizenage(age);
		System.out.println("Thank you for visiting our hotel");
		scan.close();
		

	}

	 static void citizenage(int age) {
		 if(age>=60) {
			 System.out.println("Senior Citizen Discount Applicable");
		 }
		 else {
			 System.out.println("Senior Citizen Discount Not Applicable");
		 }
		 }	
	}


/* output
Enter the Age of the Citizen:
60
Senior Citizen Discount Applicable
Thank you for visiting our hotel*/

/*
Enter the Age of the Citizen:
55
Senior Citizen Discount Not Applicable
Thank you for visiting our hotel
*/

