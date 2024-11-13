package com.kd.switch_case_condition;


/*  Problem Statement 23: As part of a game, you're creating a feature that takes a Roman numeral
   as input and returns the corresponding decimal number. The Roman numerals from 1 to 5 are 
   I, II, III, IV, V.*/
import java.util.Scanner;
public class ProblemStatement23 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Roman Number(only from 1to5):");
		String romannumber =scan.nextLine();
		
		romannumeral(romannumber);
		scan.close();
	}
	
	static void romannumeral(String romannumber) {
		
	switch(romannumber){
	case "I":
	System.out.println("ONE");
	break;

	case "II":
		System.out.println("TWO ");
		break;

	
	case "III":
		System.out.println("THREE");
		break;

	
	case "IV":
		System.out.println("FOUR ");
		break;

	
	case "V":
		System.out.println("FIVE");
		break;
		
	default:
		System.out.println("out of condition");
		break;
	}

}

	 
	}


/* 
 OUTPUT
 
  Enter the Roman Number(only from 1to5):
   I
   ONE
   
   Enter the Roman Number(only from 1to5):
III
THREE
  */
