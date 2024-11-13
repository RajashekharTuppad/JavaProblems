package com.kd.else_if_ladder;


/*  Problem Statement 11: As part of a school assignment, you are creating a program to categorize integers.
  The program should take an integer as input. If the integer is less than 0, it should print "Negative". 
  If the integer is greater than 0, it should print "Positive". 
  If the integer is exactly 0, it should print "Zero".*/


import java.util.Scanner;
public class ProblemStatement11 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter the Integer:");
		int integer=scan.nextInt();
		
		
		theinteger(integer);
		scan.close();
	}
	
	 static void theinteger(int integer) {
		 if(integer>0) {
			 System.out.println("The Given Integer " +integer+ " is Positive");
		 }
		 else if(integer<0) {
			 System.out.println("The Given Integer " +integer+ " is Negative");
		 }
		 else {
			 System.out.println("The Given Integer " +integer+ " is Zero");
		 }
		
	}

}

/* output
 	Enter the Integer:
0
The Given Integer 0 is Zero


Enter the Integer:
22
The Given Integer 22 is Positive  

 * Enter the Integer:
-22
The Given Integer -22 is Negative
 */




