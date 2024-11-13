package com.kd.Array;

import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
			
			// create method
			public static void arrangeOfElements(int[] arr) {
				
				
				// loop to access each element of the given array
				for(int i=0;i<arr.length;i++) {
					int index=i;
		
					for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[index])
						index=j;
				}
						
						int smallerNumber = arr[index];
						arr[index]=arr[i];
						arr[i]=smallerNumber;	
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
				
				//call the method
				SelectionSort.arrangeOfElements(arr);
				
				System.out.println("SelectionSorted of Given Array is:");
				
				System.out.println(Arrays.toString(arr));
				
				scan.close();
			}
		}
	
/*
 Enter the size of the Array:
5
Enter the 1Elements of Array is:
32
Enter the 2Elements of Array is:
45
Enter the 3Elements of Array is:
87
Enter the 4Elements of Array is:
63
Enter the 5Elements of Array is:
54
[32, 45, 54, 63, 87]
 */

/*
 Enter the size of the Array:
8
Enter the 1Elements of Array is:
10
Enter the 2Elements of Array is:
49
Enter the 3Elements of Array is:
197
Enter the 4Elements of Array is:
-5
Enter the 5Elements of Array is:
78
Enter the 6Elements of Array is:
235
Enter the 7Elements of Array is:
-55
Enter the 8Elements of Array is:
30
SelectionSorted of Given Array is:
[-55, -5, 10, 30, 49, 78, 197, 235]
 */

	
