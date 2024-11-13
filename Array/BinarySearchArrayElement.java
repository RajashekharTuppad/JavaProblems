package com.kd.Array;

import java.util.Scanner;

public class BinarySearchArrayElement {
	
	public  void searchArrayElement(int[] arr, int element) {
		int low=0;
		int mid=0;
		int high=arr.length-1;
		int position = -1;
		
		boolean isElementfound=false;
		 
		
		while(low<=high) {
			
			mid=(low+high)/2;
			
			if( element==arr[mid]) {
				
				isElementfound=true;
				position=mid+1;
				break;	
			}
			else if(element>arr[mid]) {
				low=mid+1;
				high=high;
			}
			else {
				high=mid-1;
				low=low;
			}
		}
		
		if(isElementfound) {
			System.out.println("The position of the element in the Arrayis:"+position);
		}else {
			System.out.println(" element not found ");
		}
	}
	
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
	
		

