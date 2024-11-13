package com.kd.ExceptionHandling;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Calculator Application");
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Numerator Value:");
		int n=scan.nextInt();
		
		System.out.println("Enter the Denominator Value:");
		int d=scan.nextInt();
		
		double division=0;
		try {
			division = n/d;
		}catch(ArithmeticException ae) {
			System.out.println("Kindly provide denominator value as non zero value");
		}
		
		System.out.println("Division:"+division);
		System.out.println("Thank you for using Calculator Application");
			
		
		scan.close();
	}
}

/* output
 Welcome to the Calculator Application
Enter the Numerator Value:
5
Enter the Denominator Value:
0
Kindly provide denominator value as non zero value
Division:0.0
Thank you for using Calculator Application
*/
