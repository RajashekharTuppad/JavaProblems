package com.kn.ArrayTasks;

import java.util.Arrays;
import java.util.Scanner;

import com.kd.Array.BubbleSortAscendingOrder;

public class BubblesortArraysAscendingDemo {

	
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
7
Enter the 1Elements of Array is:
48
Enter the 2Elements of Array is:
32
Enter the 3Elements of Array is:
64
Enter the 4Elements of Array is:
9
Enter the 5Elements of Array is:
17
Enter the 6Elements of Array is:
96
Enter the 7Elements of Array is:
5
[5, 9, 17, 32, 48, 64, 96]
 */

	
