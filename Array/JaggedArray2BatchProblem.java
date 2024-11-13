package com.kd.Array;

import java.util.Scanner;

public class JaggedArray2BatchProblem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array declaration//
		String[][] arr;
		// array creation
		
		System.out.println("Enter the base dimension:");
		arr=new String[scan.nextInt()][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" batch"+ (i+1) + "size=");
			 arr[i]= new String[scan.nextInt()];
			}
		
		//array initialization
		
		for(int i=0;i<arr.length;i++) {
					System.out.println(" friends present in"+ (i+1) + "batch");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("name of the friend"+ (j+1)+ "is=");
				
				  arr[i][j]=scan.next();
			}
		}
		     System.out.println("All friends of yours  are:");
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
						System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}
		
}
/*
 output
 Enter the base dimension:
2
 batch1size=2
 batch2size=3
 friends present in1batch
name of the friend1is=ram
name of the friend2is=raja
 friends present in2batch
name of the friend1is=mahesh
name of the friend2is=shahid
name of the friend3is=abhi
All friends of yors are:
ram
raja
mahesh
shahid
abhi
*/
 
	
