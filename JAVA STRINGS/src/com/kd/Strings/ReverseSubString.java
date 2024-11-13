package com.kd.Strings;

import java.util.Scanner;

public class ReverseSubString {
	public String reverseSubString(String str) {
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			char[] crr=arr[i].toCharArray();
			for(int j=crr.length-1;j>=0;j--) {
				System.out.println(crr[j]);
			}
			System.out.println(" ");
		}
		return str;
		
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s1=scan.nextLine();
		 ReverseSubString reverseSubString= new  ReverseSubString();
		System.out.println( reverseSubString.reverseSubString(s1));
		 
		
		scan.close();

	}

}
