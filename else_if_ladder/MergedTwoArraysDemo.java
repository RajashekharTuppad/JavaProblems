package com.kd.else_if_ladder;

import java.util.Scanner;
public class MergedTwoArraysDemo {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Enter the size of first Array:");
		  int arr[]=new int[scan.nextInt()];
		  
		  for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter the " + (i + 1) + " element  = ");
				 arr[i] = scan.nextInt();
				
		  }
		  
		  System.out.println("Enter the size of second Array:");
		  int brr[]=new int[scan.nextInt()];
		  
		  for (int i = 0; i < brr.length; i++) {
				System.out.println("Enter the " + (i + 1) + " element = ");
				 brr[i] = scan.nextInt();
		  }
		  int[] crr=new int[arr.length+brr.length];
		  MergedTwoArrays mergedtwoarrays = new MergedTwoArrays();
		  mergedtwoarrays.mergeTwoArray(crr[i]);
		  
		  scan.close();
		  }

		
			
		}
		

	

}
