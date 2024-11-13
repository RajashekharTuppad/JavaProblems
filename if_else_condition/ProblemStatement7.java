package com.kd.if_else_condition;

/* Problem Statement 7: You're developing a software tool for a financial institution. 
    The software should be able to validate if the input balance amount is positive or negative.
    Write a Java program that takes a balance amount as input. If the amount is less than 0, 
   the program should print "Negative Balance". Otherwise, it should print "Positive Balance". */


import java.util.Scanner;
public class ProblemStatement7 {

	public static void main(String[] args) {
		
		
Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the Amount in Rs.");
		double amount=scan.nextInt();
		
		
		balancedamount(amount);
		scan.close();
		

	}

	 static void balancedamount(double amount) {
		 
		 if(amount>0) {
			 System.out.println("Given Amount  is "+amount+" is Positive Balance");
		 }
		 else {
			 System.out.println("Given Amount is "+amount+" is Negative Balance");
		 }
		 }	
		
	}

/* Output
Enter the Amount in Rs.200
Given Amount  is 200.0 is Positive Balance


Enter the Amount in Rs.-200
Given Amount is -200.0 is Negative Balance
*/
