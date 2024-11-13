package com.kd.Array;
// sum of the Array Elements//

import java.util.Scanner;
public class ArrayProgram2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// Array Declaration
		int[] arr;
		
		// Array creation
		System.out.println("Enter the size of the Array:");
		  arr=new int[scan.nextInt()];
		
		
		//Array initialization
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println("The Int numbers are:");
			 arr[i]=scan.nextInt();
		
			sum=sum+arr[i];
		}
			System.out.println("Sum of the Array Elements:"+sum);
			scan.close();
}
	
}
/*  output
Enter the size of the Array:
5
Enter1 int String data:
10
Enter2 int String data:
20
Enter3 int String data:
30
Enter4 int String data:
40
Enter5 int String data:
50
The Int numbers are:
10
The Int numbers are:
20
The Int numbers are:
30
The Int numbers are:
40
The Int numbers are:
50
Sum of the Array Elements:150*/