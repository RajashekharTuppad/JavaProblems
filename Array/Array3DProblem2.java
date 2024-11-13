package com.kd.Array;


import java.util.Scanner;
public class Array3DProblem2 {

	public static void main(String[] args) {
		
				Scanner scan=new Scanner(System.in);
				
				// Array declaration
				int[][][] arr;
				
				// Array Craetion
				//arr=[2][2][2]
				
				arr = new int[4][][];
				
				arr[0]=new int[3][];
				arr[0][0]= new int[1];
				arr[0][1]=	new int[2];	
				arr[0][2]=	new int[3];	
				
				arr[1]=new int[1][2];
				
				arr[2]=new int[2][];
				arr[2][0]= new int[1];
				arr[2][1]=	new int[1];	
				
				arr[3]=new int[3][];
				arr[3][0]= new int[1];
				arr[3][1]=	new int[2];
				arr[3][2]=	new int[2];
				
				
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
 ****Given the input elements:*******
1
2
3
4
5
6
7
8
9
10
11
12
13
1
14
**********The elements are:***********
1
2
3
4
5
6
7
8
9
10
11
12
13
1
14
*/
