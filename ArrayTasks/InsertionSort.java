package com.kn.ArrayTasks;

public class InsertionSort {

	public int[] insertionsortarray(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int initialvalue = arr[i];
			int j=i-1;
			while( j>=0 && arr[j]>initialvalue) {
				arr[j+1]=arr[j];
				j--;
			}
		arr[j+1]=initialvalue;
		}
	
		return arr;
	}
	}

