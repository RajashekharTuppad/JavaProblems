package com.kd.Array;

import java.util.Scanner;
public class JaggedArray1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		// Array declaration//
		int[][] arr;
		// array creation
		
		System.out.println("Enter the base dimension:");
		arr=new int[scan.nextInt()][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(" batch"+ (i+1) + "size");
			 arr[i]= new int [scan.nextInt()];
			}
		
		//array initialization
		
		for(int i=0;i<arr.length;i++) {
					System.out.print(" array element"+ (i+1) + "data");
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter data for "+ (j+1)+ "element=");
				
				  arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		scan.close();
	}
		
}
/*  OUTPUT 
    BASE DIMENSION IS 2D
Enter the size of 1ST ELEMENT:
2
Enter the size of 2ND ELEMENT:
3
1D array element1data
enter the data for1element=
10
enter the data for2element=
20
1D array element2data
enter the data for1element=
30
enter the data for2element=
40
enter the data for3element=
50
10
20
30
40
50
*/
