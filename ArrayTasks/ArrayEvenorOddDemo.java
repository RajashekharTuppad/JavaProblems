package com.kn.ArrayTasks;

import java.util.Scanner;

public class ArrayEvenorOddDemo {

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
		ArrayEvenorOdd  evenorodd= new  ArrayEvenorOdd();
		
		evenorodd.countevenoroddelements(arr);
		 scan.close();
	}

	}


