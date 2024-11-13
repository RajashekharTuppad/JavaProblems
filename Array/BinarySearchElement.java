package com.kd.Array;

public class BinarySearchElement {
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
}

	
		
	


