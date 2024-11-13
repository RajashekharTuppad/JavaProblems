package com.kd.else_if_ladder;

import java.util.Scanner;

public class Merged2ArrayDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30 };
		int[] brr = { 40, 50 };
		int[] crr = new int[arr.length + brr.length];

		for (int i = 0; i < arr.length; i++) {
			crr[i] = arr[i];
		}

		
		for (int i = 0; i < brr.length; i++) {
			crr[arr.length+i] = brr[i];
			
		}

		Meregd2Array merged2array = new Meregd2Array();
		merged2array.mergeArray(crr);

	}

}
