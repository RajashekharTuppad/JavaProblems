package com.kn.ArrayTasks;

import java.util.Scanner;

public class ArrayTraversingBackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		ArrayTraversingBack arraytraversingbackword=new  ArrayTraversingBack();
		 arraytraversingbackword.printArrayElements(arr);
		 scan.close();
	}

	}

/*
 Enter the size of the Array:
2
enter the1 element
22
enter the2 element
444
**********************
Array Elements as Follows:
444 
22 
*/
