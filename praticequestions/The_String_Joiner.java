package com.kd.praticequestions;

import java.util.Scanner;

public class The_String_Joiner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Two Strings:");
		String a=scan.nextLine();
		String b=scan.nextLine();
		
		System.out.println("The String Joining="+(a+" "+b));
		

	}

}
