package com.kd.praticequestions;

/*you are designing a software that teaches young kids about different types of character as input.
 if its a lowercase vowel,it should print "Lowercase vowel, if its an uppercase vowel,it should print
 " */

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
    		   System.out.println("the given number character"+ch+"is not an Uppercase Vowel");
    	   }
    	   }
    	   else if(unicode>=97 && unicode<=122)
    	   {
    		   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    		   {
    		   System.out.println("the given number character"+ch+"is Lowercase Vowel");
    	       }else {
    	    	   System.out.println("the given number character"+ch+"is not an  Lowercase Vowel");
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
