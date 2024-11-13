package com.kn.ArrayTasks;

public class ArrayTraversingSum {

	public int sumofelements(int[] arr) {
		System.out.println("**********************");
		System.out.println("Sum of the ArrayElements:");

		
		// Traversing of Elements
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}
		System.out.println(sum);
		return sum;
			
	}

}
