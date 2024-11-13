package com.kd.looping;

/*   Write a program to find the number of digits in a number.*/


import java.util.Scanner;
public class NumberOfDigitsinaNumber {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=scan.nextInt();
		
		
		findnumofdigitsinnumber(num);
		scan.close();

	}

	 static void findnumofdigitsinnumber(int num) {
		 int count=0;
		 // Enter the condition//
		 while(num>0) {
			 num=num/10;
			 count++;
			 
		 }
		System.out.println("No of Digits in Number is:"+count);
	}

}

/*
 Enter the Number:
1234
No of Digits in Number is:4*/
