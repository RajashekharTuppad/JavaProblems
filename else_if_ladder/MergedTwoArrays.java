package com.kd.else_if_ladder;

import java.util.Scanner;
public class MergedTwoArrays {

	


		public static int[] mergeTwoArray(int[] arr, int[] brr) {
			int[] crr=new int[arr.length+brr.length];
			
			for(int i=0;i<arr.length;i++) {
				crr[i]=arr[i];
			}
			for(int i=0;i<brr.length;i++) {
				
					crr[arr.length+i]=brr[i];
				}
			return crr;
		}

		
		
		



	}


