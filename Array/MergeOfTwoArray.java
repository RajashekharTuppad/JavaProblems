package com.kd.Array;

import java.util.Scanner;
public class MergeOfTwoArray {
	
	public static void mergeTwoArray(int[] arr, int[] brr) {
		int[] crr=new int[arr.length+brr.length];
		
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			
				crr[arr.length+i]=brr[i];
			}
		for(int i=0;i<crr.length; i++) {
			System.out.print(crr[i]+" ");
		}
		
	}

	
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
	  
	 mergeTwoArray(arr,brr);
	  scan.close();
	  }

	
		
	}
	

