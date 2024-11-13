package com.kd.Array;


import java.util.Scanner;
public class SumMultiplicationOfArray {


	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the  1st array :");
		int [] arr=new int[scan.nextInt()];
		
		System.out.println("Enter the size of the  2st array:");
		int[] brr=new int[scan.nextInt()];
		
	
		for(int i = 0;i<arr.length;i++) {
		System.out.println("enter the data of first array:"+(i+1)+"element");
		arr[i]=scan.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.println("enter the data of second  array:"+(i+1)+"element");
			brr[i]=scan.nextInt();
		}
			// sum of array
			
			for(int i = 0;i<arr.length;i++){
				
			int	sum = arr[i]+brr[i];
				System.out.println("sum of" +(i+1)+"  array:"+sum);
			}
			// product of array
			for(int i = 0;i<arr.length;i++){	
				int	product = arr[i]*brr[i];
					System.out.println("product of" +(i+1)+" array:"+product);
				}
			scan.close();
		}			
	}
	
	
			
