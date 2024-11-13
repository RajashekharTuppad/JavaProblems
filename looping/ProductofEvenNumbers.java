package com.kd.looping;
/*  Write a program to calculate the product of first n even numbers.*/

import java.util.Scanner;
public class ProductofEvenNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers u want to give:");
		int givenumbers=scan.nextInt();
		
		
		product_of_first_n_even_numbers(givenumbers);
		scan.close();
		

	}

	static void product_of_first_n_even_numbers(int givenumbers) {
		
		// condition//
		Scanner scan = new Scanner(System.in);
		int i=1;
		int even=1;
		
		int givenumber = 1;
		scan.close();
		for(i=1;i<=givenumber;i++) {
			System.out.println("Enter the input number"+ i +":");
			int number=scan.nextInt();
			if(number%2==0) {
				even=even*number;
			}
			System.out.println("Product of even numbers:"+even);
			
		}
		
	}

}
