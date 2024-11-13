package com.kd.Array;


import java.util.Scanner;
public class BinarySearchElementDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of the Array:");
		int [] arr=new int[scan.nextInt()];
		
			
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Elements of Array"+(i+1)+" is:");
			arr[i]=scan.nextInt();
			
		}
		
		System.out.println("enter  the search element:");
		int element=scan.nextInt();
		
		
		BinarySearchElement elementFound=new BinarySearchElement();
		elementFound.searchArrayElement(arr, element);
		
		scan.close();
	}

}

/*
 Enter the size of the Array:
2
Enter the Elements of Array1 is:
10
Enter the Elements of Array2 is:
20
enter  the search element:
10
The position of the element in the Arrayis:1
*/
