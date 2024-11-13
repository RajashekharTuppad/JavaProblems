package com.kd.looping;
// Write a program to find sum of the number in a range that are divisible by given number.

import java.util.Scanner;
public class DivisiblebygivenNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number u want to divisible the range:");
		int givennumber=scan.nextInt();
		
		range_divisible_by_givennumber(givennumber);
		scan.close();
		

	}

	 static void range_divisible_by_givennumber(int givennumber) {
		int sum=0;
		int count=0;
		for(i=0;i<100;i++) {
			if(i%givennumber==0) {
				
			}
			sum=sum+i;
			count++;
		}
	}

	 System.out.println("Sum of number b/w 0 to 100:"+sum);
	 System.out.println("Total numbers:"+count);
}


