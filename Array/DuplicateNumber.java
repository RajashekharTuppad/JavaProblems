package com.kd.Array;


import java.util.Scanner;
public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] arr= {23,73,86,23,25};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("The Duplicate number is "+ arr[i]);
					break;
				}
				
			}
				break;
		
}
		scan.close();
}
}
/* 
output
The Duplicate number is23
*/


/*
 
 	int[] arr= {23,73,86,23,25};
	int k=0;	
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					k=j;
					break;
				}
				
			}
			}
				System.out.println(arr[k]);
		
		}
		
		// output
		 
The Duplicate number is23
		*/



