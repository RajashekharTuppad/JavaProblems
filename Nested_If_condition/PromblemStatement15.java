package com.kd.Nested_If_condition;
/*  Problem Statement 15: You are creating a program for a loan approval system.
   The eligibility for a loan is based on both age and income.
    A person is eligible if they are at least 18 years old and their annual income is over $40,000.
    Write a Java program that accepts age and income as input.
     If both conditions are met, the program should print "Loan Approved". */

import java.util.Scanner;
public class PromblemStatement15 {

	public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the Age:");
		int age =scan.nextInt();
		
		System.out.print("Enter the Income:$");
		double income =scan.nextDouble();
		
		loansystem(age,income);
		scan.close();
	}

	static void loansystem(int age, double income) {
		if(age>=18) {
			System.out.println("At the Age of " + age +  "Eligible for Loan");
			
			if(income>=40000) {
				System.out.println("Loan Approved");
			}else {
				System.out.println("Not Approved Due to insufficient annual income");
			}
		}
            else {
			System.out.println("Not Eligible and Not Able to Apply Loan");
		}
			}
		}
			
	/* 
	 output
	 Enter the Age:21
Enter the Income:$40000
At the Age of 21Eligible for Loan
Loan Approved



Enter the Age:17
Enter the Income:$41000
Not Eligible and Not Able to Apply Loan

Enter the Age:18
Enter the Income:$38000
At the Age of 18Eligible for Loan
Not Approved Due to insufficient annual income

	 */


