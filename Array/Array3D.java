package com.kd.Array;


import java.util.Scanner;
public class Array3D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array declaration
		int[][][] arr;
		
		// Array Craetion
		//arr=[2][2][2]
		
		arr = new int[2][][];
		
		arr[0]=new int[2][];
		arr[0][0]= new int[2];
		arr[0][1]=	new int[3];	
		
		arr[1]=new int[2][];
		arr[1][0]= new int[2];
		arr[1][1]=	new int[1];	
		
		
		System.out.println("****Given the input elements:*******");
		// Array initialization
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("**********The elements are:***********");
		// Array Transversing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(arr[i][j][k]);
				}
			}
		}
		scan.close();
	}

}

/* 
 output
 ****Given the input elements:*******
10
20
30
40
50
60
70
80
**********The elements are:***********
10
20
30
40
50
60
70
80
*/
