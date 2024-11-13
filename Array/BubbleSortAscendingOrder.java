package com.kd.Array;

import java.util.Arrays;
import java.util.Scanner;
public class BubbleSortAscendingOrder {
	
	// create method
	public static void arrangeOfElements(int[] arr) {
		
		// loop to access each element of the given array
		for(int i=0;i<arr.length;i++) {
			boolean swapped=false;
			
			// loop to compare adjacent elements
			for(int j=0;j<arr.length-1-i;j++) {
				
				// compare two arrays elements
				
				if(arr[j]>arr[j+1]) {
					//swapping will occur here
					 int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					swapped=true;
				
				}
			}
			
			// no swapping means the array is already sorted
			if(swapped==false) 
				break;
			
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int [] arr=new int[scan.nextInt()];
		
			
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the " +(i+1)+ "Elements of Array is:");
			arr[i]=scan.nextInt();
		}
		
		BubbleSortAscendingOrder.arrangeOfElements(arr);
		System.out.println(Arrays.toString(arr));
		
		scan.close();
	}
}
/*
Enter the size of the Array:
5
Enter the 1Elements of Array is:
25
Enter the 2Elements of Array is:
846
Enter the 3Elements of Array is:
54
Enter the 4Elements of Array is:
78
Enter the 5Elements of Array is:
20
[20, 25, 54, 78, 846]
 */


