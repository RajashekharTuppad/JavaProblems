package com.kd.praticequestions;

import java.util.Scanner;
public class unicode {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character to be decoded");
		char ch=scan.next().charAt(0);
		int Ascii=ch;
		System.out.println("the decoded value of"+ ch +"is="+Ascii);
		
		scan.close();
	}

}
