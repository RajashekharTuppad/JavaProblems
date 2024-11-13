package com.kd.Array;

import java.util.Scanner;
public class FindGivenNumberInTheArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// Array Declaration
		int[] arr;
		
		// Array creation
		 
		  arr=new int[3];
		
		
		//Array initialization

		for(int i=0;i<arr.length;i++) {
			System.out.println("The Int numbers" + (1+i) + "are:");
			 arr[i]=scan.nextInt();
		}
			 System.out.println("Enter the element which has to  be find  in the Array:");
			  int tofind=scan.nextInt();
		
		
			  boolean isNumberfound=FindNumberinArray(arr,tofind);
			  System.out.println("the number"+tofind+"is found= "+isNumberfound);
		}
	

	private static boolean FindNumberinArray(int[] arr, int tofind) {
		for(int i=0;i<arr.length;i++) {
			if(tofind==arr[i]) {
				return true;
			}
			
		}
		return false;
	}
}

/* output
The Int numbers1are:
10
The Int numbers2are:
20
The Int numbers3are:
30
Enter the element which has to  be find  in the Array:
20
the number20is found= true
 */


