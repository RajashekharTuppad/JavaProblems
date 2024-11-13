package com.kd.simple_if_condition;

/* Problem Statement 5: You're creating a typing software that helps users improve 
   their typing skills. One part of the software focuses on capital letters. 
   Your program should accept a character as input. If the character is a capital letter, 
   the program should print "Capital letter detected". */
import java.util.Scanner;
public class ProblemStatement5 {

	public static void main(String[] args) {
		
		
		Scanner scan =new Scanner(System.in );
		System.out.println(" Enter the Characater ");
		char Ch = scan.next().charAt(0);
		scan.close();
		 boolean ischar = ischar(Ch);
		 if (ischar == true)
		 {
			 System.out.println(" the Character  is capital ");
		 }else {
			 System.out.println(" the Character  is NOT capital ");
		 }
		
	}

	 static boolean  ischar(char ch) {
		if(Character .isUpperCase(ch))
		{
		return true ;
		}else
		{
			return false;
		}
	}

}

/* output
 Enter the Character 
a
 the character is NOT capital 

Enter the Character 
A
the character is capital 

*/
