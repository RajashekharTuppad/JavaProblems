package com.kd.Nested_If_condition;

/* Problem Statement 14: You're working on a calendar application that provides users with interesting facts about years.
   The program should first check if the input year is a leap year.
    If it is, the program should further check if it belongs to the 21st century.
    If both conditions are true, it should print "21st Century Leap Year".
    If only the first condition is true, it should print "Leap Year".  */


import java.util.Scanner;
public class ProblemStatement14 {

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
			if(year>=2001 && year<=2100) {
				System.out.println("21st century Leap Year");
			}
		}
		else if(year%100==0) {
			System.out.println(year+"is not leap year");
	    }
		else if(year%4==0) {
			System.out.println(year + "is leap year");
			if(year>=2001 && year<=2100) {
				System.out.println("21st century Leap Year");
         }
		}
		else {
			System.out.println(year + "is not leap year");
		}
	}
}
		
/*

output

Enter the Year:
2024
2024is leap year
21st century Leap Year
Be Happy In EVERY YEAR 


Enter the Year:
2023
2023is not leap year
Be Happy In EVERY YEAR 

*/



