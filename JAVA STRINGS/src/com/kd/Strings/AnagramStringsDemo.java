package com.kd.Strings;

import java.util.Scanner;

public class AnagramStringsDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the 1st String:");
		String str1=scan.nextLine();
		
		System.out.println("Enter the 2nd String:");
		String str2=scan.nextLine();
		 
		//create object of AnagramString class
		AnagramStrings anagramStrings = new AnagramStrings();
		
		// call method isAnagram to check specified 2 strings
		
		boolean isAnagram=anagramStrings.isAnagram(str1,str2);
		
		//print results call the boolean function
		if(isAnagram) {
			System.out.println(str1+"&"+str2+"are Anagram String");
		}else {
			System.out.println(str1+"&"+str2+"are not  Anagram String");
		}
		scan.close();

	}

}
