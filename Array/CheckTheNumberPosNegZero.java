package com.kd.Array;

import java.util.Scanner;

public class CheckTheNumberPosNegZero {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// Array Declaration
		int[] arr;
		
		// Array creation
		 System.out.print("Enter the size of the Array:");
		  arr=new int[scan.nextInt()];
		
		
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("The Int numbers" + (1+i) + "are:");
			 arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter the required number to check:");
		 	int num=scan.nextInt();
		 	
		
			// create method//
		
		
	}

}
