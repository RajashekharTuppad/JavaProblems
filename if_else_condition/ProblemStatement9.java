package com.kd.if_else_condition;
/*  Problem Statement 9: You are creating a program for a calendar application.
      The application should be able to identify leap years. Your Java program should 
      take a year as input and if the year is a leap year, the program should print "Leap Year".
       Otherwise, it should print "Non-Leap Year".*/

import java.util.Scanner;
public class ProblemStatement9 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		int year =scan.nextInt();
		
		leapyear(year);
		System.out.println("Be Happy In EVERY YEAR ");	
		scan.close();
	}

	static void leapyear(int year) {
		if(year%400==0) {
			System.out.println(year +  "is leap year");
		}
		else if(year%100==0) {
			System.out.println(year+"is not leap year");
	    }
		else if(year%4==0) {
			System.out.println(year + "is leap year");
         }
		else {
			System.out.println(year + "is not leap year");
		}
	}
}
		
/* output
	Enter the Year:
2028
2028is leap year
Be Happy In EVERY YEAR  */

/*
Enter the Year:
2021
2021is not leap year
Be Happy In EVERY YEAR */
