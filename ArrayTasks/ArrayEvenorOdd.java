package com.kn.ArrayTasks;

public class ArrayEvenorOdd {

	
		public void countevenoroddelements(int[] arr) {
			System.out.println("**********************");
			System.out.println("Array Elements as Follows:");
			
			 int counteven=0;
			 int countodd=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					counteven++;
				}else {
					countodd++;
				}
			
			}
			
			System.out.println("The no of even elements are:"+counteven);
			System.out.println("The no of odd elements are:"+countodd);
			
	}

}
