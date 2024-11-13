package com.kd.else_if_ladder;

/*You're designing a software that teaches young kids about different types of characters.
  The program should take a character as input. If it's a lowercase vowel, it should print "Lowercase Vowel". 
  If it's an uppercase vowel, it should print "Uppercase Vowel".
   If it's a lowercase consonant, it should print "Lowercase Consonant".
    If it's an uppercase consonant, it should print "Uppercase Consonant".
     If it's a digit, it should print "Digit". 
     For all other characters, it should print "Special Character".  */



// very important logic use program//


import java.util.Scanner;
public class ProblemStatement12 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch=scan.next().charAt(0);
		
		ischaracter(ch);
		scan.close();
			

	}

       static void ischaracter(char ch) {
    	   
    	   int unicode= (int)ch;
    	   System.out.println("The unicode of given character="+unicode);
    	   
    	   if(unicode>=65 && unicode<=90){
    		   if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    	   {
    		   System.out.println("the given number character"+ch+"is Uppercase Vowel");
    	   }else {
    		   System.out.println("the given number character"+ch+"is not an Uppercase consonant");
    	   }
    	   }
    	   else if(unicode>=97 && unicode<=122)
    	   {
    		   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    		   {
    		   System.out.println("the given number character"+ch+"is Lowercase Vowel");
    	       }else {
    	    	   System.out.println("the given number character"+ch+"is not an  Lowercase consonant");
    	       }
    	       }
    	   
    	   else if(unicode>=48 && unicode<=57)
    	   {
    		   System.out.println("the given number character" +ch+ "is digit number ");
    		   
    	       }
    	   else if(unicode>=32 && unicode<=47)
    		   
    	   {
    		   System.out.println("the given number character" +ch+ "is Special Character");
    	   }
    	   else
    	   {
    		   System.out.println("the given number character" +ch+ "is unknown");
    	   }
		
	}
}

/* 
 output
 
 Enter the character:
m
The unicode of given character=109
the given number charactermis not an  Lowercase consonant


Enter the character:
M
The unicode of given character=77
the given number characterMis not an Uppercase consonant


Enter the character:
A
The unicode of given character=65
the given number characterAis Uppercase Vowel


Enter the character:
a
The unicode of given character=97
the given number characterais Lowercase Vowel


Enter the character:
$
The unicode of given character=36
the given number character$is Special Character

Enter the character:
0
The unicode of given character=48
the given number character0is digit number 

 */


       