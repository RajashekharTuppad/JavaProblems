package com.kd.switch_case_condition;
/* Problem Statement 27: As part of a calendar application,
  you are creating a feature that displays the number of days in a month. 
  The program should take a month number (1 for January, 2 for February, and so on till*/


import java.util.Scanner;
public class ProblemStatement27 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the MONTH Number:");
		int  month =scan.nextInt();
		
		calender(month);
		
		scan.close();
	}
	
	// 2023 Calendar//
	static void calender(int month) {
		
	switch(month){
	case 1:
	System.out.println("January");
	System.out.println("January month has 31 Days");
	break;

	case 2:
		System.out.println("February");
		System.out.println("February month has  28 Days");
		break;

	
	case 3:
		System.out.println("March");
		System.out.println("March month has  31 Days");
		break;
		
	case 4:
		System.out.println("April");
		System.out.println("April month has  30 Days");
		break;
		
	case 5:
		System.out.println("May");
		System.out.println("May month has  31 Days");
		break;
		
	case 6:
		System.out.println("June");
		System.out.println("June month has  30 Days");
		break;
	
	case 7:
		System.out.println("July");
		System.out.println("July month has  31 Days");
		break;
		
	case 8:
		System.out.println("August");
		System.out.println("June month has  31 Days");
		break;
		
	case 9:
		System.out.println("September");
		System.out.println("September month has  30 Days");
		break;
		
	case 10:
		System.out.println("October");
		System.out.println("October month has  31 Days");
		break;
		
	case 11:
		System.out.println("November");
		System.out.println("November month has  30 Days");
		break;
		
	case 12:
		System.out.println("December");
		System.out.println("December month has  31 Days");
		break;
		
		
	default:
		System.out.println("Bro The Calender has only 12 months");
		break;
	}

}
}
	
/* output 
   
   Enter the MONTH Number:
5
May
May month has  31 Days  


Enter the MONTH Number:
6
June
June month has  30 Days
*/
