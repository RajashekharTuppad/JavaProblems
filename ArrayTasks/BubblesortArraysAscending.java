package com.kn.ArrayTasks;

public class BubblesortArraysAscending {

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

}
