package com.kd.Array;


import java.util.Scanner;
public class SumOf2DArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		int[][] arr=new int[2][2];
	
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter the data of  array:"+(i+1)+"element"+(j+1)+": ");
		arr[i][j]=scan.nextInt();
		}
		}
	
		
		scan.close();

	}
		
}
