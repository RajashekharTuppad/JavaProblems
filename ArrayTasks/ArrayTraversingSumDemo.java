package com.kn.ArrayTasks;

import java.util.Scanner;

public class ArrayTraversingSumDemo {

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
			// object of the class sumofelements
		ArrayTraversingSum arraytraversingsum= new  ArrayTraversingSum();
		
		// call the calss output
		 System.out.println("The Sum of the ArrayElements:"+arraytraversingsum.sumofelements(arr));
		
		 
		 scan.close();
	}

}

/*
Enter the size of the Array:
3
enter the1 element
10
enter the2 element
20
enter the3 element
30
**********************
Sum of the ArrayElements:
60
*/
