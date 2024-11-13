package com.kd.Strings;

import java.util.Scanner;

public class CharacterCounterDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String:");
		String str=scan.nextLine();
		
		// creating object
		CharacterCounter s=new CharacterCounter();
		s.CountCharacter(str);
		
		scan.close();
		
		
	}

}
