package com.kn.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		
		//Array Declaration and Creation
		
		int[ ] arr= new int[scan.nextInt()];
		
		//Array initialization
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the"+(i+1) +" element");
			arr[i]=scan.nextInt();
			
		}
			
		// object creator
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.insertionsortarray(arr);
		
		System.out.println("The Sorted Array Elements as follows:");
		System.out.println(Arrays.toString(arr));
		 scan.close();
	}
	

	}
/*
 Enter the size of the Array:
5
enter the1 element
-2
enter the2 element
51
enter the3 element
-63
enter the4 element
20
enter the5 element
25
The Sorted Array Elements as follows:
[-63, -2, 20, 25, 51]
 */

