package com.kn.ArrayTasks;


import java.util.Scanner;
public class ArrayTraversingDemo {

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
		ArrayTraversing arraytraversing=new  ArrayTraversing();
		 arraytraversing.printArrayElements(arr);
		 scan.close();
	}
	

}

/* 
 Enter the size of the Array:
3
enter the1 element
1111
enter the2 element
2222
enter the3 element
3333
**********************
Array Elements as Follows:
1111 
2222 
3333 
*/
