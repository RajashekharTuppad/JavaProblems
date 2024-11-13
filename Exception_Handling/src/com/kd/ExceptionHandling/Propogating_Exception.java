package com.kd.ExceptionHandling;

import java.util.Scanner;

public class Propogating_Exception {

	public static void main(String[] args) {
		System.out.println("Welcome To Calculator Application");
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the First Number:");
		int a=scan.nextInt();
		
		System.out.println("Enter the Second Number:");
		int b=scan.nextInt();
		
		multiply(a,b);
		System.out.println("Thank you for using the Calculator");
		
		scan.close();
		
	}

	public static void multiply(int a, int b) {
		System.out.println("Multiply method started");
		int product=a*b;
		System.out.println("Multiplication:"+product);
		
		divide(a,b);
		System.out.println("Multiplication method ended");	
	}

	private static void divide(int a, int b) {
		System.out.println("Division method started");
		try {
			double quotient=a/b;
			System.out.println("Division:"+quotient);
			System.out.println("Division method ended");
		}catch(ArithmeticException ae )	{
			System.out.println("Denominator value should be non zero:");
			ae.printStackTrace();
		}finally {
			System.out.println("Done with Excetion");
		}
	}

}
/*
 * output
 * 
 * 
 * Welcome To Calculator Application
Enter the First Number:
10
Enter the Second Number:
0
Multiply method started
Multiplication:0
Division method started
Denominator value should be non zero:
java.lang.ArithmeticException: / by zero
	at com.kd.ExceptionHandling.Propogating_Exception.divide(Propogating_Exception.java:38)
	at com.kd.ExceptionHandling.Propogating_Exception.multiply(Propogating_Exception.java:28)
	at com.kd.ExceptionHandling.Propogating_Exception.main(Propogating_Exception.java:17)
Done with Excetion
Multiplication method ended
Thank you for using the Calculator
 */
