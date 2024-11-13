package com.kd.switch_case_condition;
/* You are developing a weekday management software for a company.
  The program should take a weekday number (1 for Monday, 2 for Tuesday,
   and so on till 7 for Sunday) and print the corresponding day. */


import java.util.Scanner;
public class ProblemStatement26 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the weekday number:");
		int  day =scan.nextInt();
		
		weekday(day);
		System.out.println("Have a Good Day");
		scan.close();
	}
	
	static void weekday(int day) {
		
	switch(day){
	case 1:
	System.out.println("Monday");
	break;

	case 2:
		System.out.println("Tuesday ");
		break;

	
	case 3:
		System.out.println("Wednesday");
		break;
		
	case 4:
		System.out.println("Thursday");
		break;
		
	case 5:
		System.out.println("Friday");
		break;
		
	case 6:
		System.out.println("Saturday");
		break;
	
	default:
		System.out.println("Sunday ");
		break;
	}

}
}
	
/*
 output 
 Enter the weekday number:
2
Tuesday 
Have a Good Day

 Enter the weekday number:
7
Sunday 
Have a Good Day
 
 */
