package com.kd.switch_case_condition;

import java.util.Scanner;

/* You're developing a program to help beginners learn English.
  The program should take a number between 0 to 9 as input and print the corresponding
   English word for the number. */

public class ProblemStatement21 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number b/w 0 to 9 only:");
		int num =scan.nextInt();
		
		learnEnglish(num);
		
		scan.close();
	}
		
	 static void learnEnglish(int num) {
		
	switch(num){
	case 0:
	System.out.println("ZERO ");
	break;

	case 1:
		System.out.println("ONE ");
		break;

	
	case 2:
		System.out.println("TWO ");
		break;

	
	case 3:
		System.out.println("THREE ");
		break;

	
	case 4:
		System.out.println("FOUR ");
		break;

	
	case 5:
		System.out.println("FIVE ");
		break;
		
	case 6:
		System.out.println("SIX ");
		break;
		
	case 7:
		System.out.println("SEVEN ");
		break;
		
	case 8:
		System.out.println("EIGHT ");
		break;
		
	case 9:
		System.out.println("NINE ");
		break;
	
	default:
		System.out.println("Number does not lie between 0 to 9");
		break;

	}

}

	
}
/* 
 * output
 
Enter the number b/w 0 to 9 only:
4
FOUR */
