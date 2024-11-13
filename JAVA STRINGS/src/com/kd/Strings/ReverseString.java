package com.kd.Strings;

public class ReverseString {
	public static void main(String[] args) {
		String str="Hello";
		System.out.println("Original String:"+str);
		int n=str.length();
		 String rev=" ";
		 char ch;
		 for(int i=0;i<n;i++) {
			ch=str.charAt(i);
			 rev = ch+rev;
		 }
		System.out.println("Rev string:"+rev);
		 
		System.out.println("************************");
	
		// String Builder
	String str1="Reverse String Using StringBuilder";
	System.out.println("Original string:"+str1);
	
	StringBuilder reverseString=new StringBuilder(str1);
	reverseString.reverse();
	
	String result=reverseString.toString();
	System.out.println("Rev string:"+result);
	
	System.out.println("************************");
	
	
	// String Buffer
	
		String str2="Reverse String Using StringBuffer";
		System.out.println("Original string:"+str2);
		
		StringBuffer reverseString1= new StringBuffer(str2);
		reverseString1.reverse();
		
		String result1=reverseString1.toString();
		System.out.println("Rev string:"+result1);
	}	
}
/*
 Original String:Hello
Rev string:olleH 
************************
Original string:Reverse String Using StringBuilder
Rev string:redliuBgnirtS gnisU gnirtS esreveR
************************
Original string:Reverse String Using StringBuffer
Rev string:reffuBgnirtS gnisU gnirtS esreveR
 */
