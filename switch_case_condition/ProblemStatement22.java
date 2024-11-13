package com.kd.switch_case_condition;
/* Problem Statement 22: You're designing a game that involves guessing the name of a polygon 
  based on the number of sides. The program should take an integer representing the number 
  of sides of a polygon (3 for triangle, 4 for quadrilateral, 5 for pentagon, 6 for hexagon, 7 for heptagon, 8 for octagon) and 
  print the polygon name. */

import java.util.Scanner;

public class ProblemStatement22 {
	
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of the sides:");
		int sides =scan.nextInt();
		
		
	polygon(sides);
	scan.close();
	}
	
	
	static void polygon(int sides) {
	switch(sides){
	case 3:
	System.out.println("TRIANGLE ");
	break;

	case 4:
		System.out.println("QUADRILATERAL ");
		break;

	
	case 5:
		System.out.println("PENTAGON ");
		break;

	
	case 6:
		System.out.println("HEXAGON ");
		break;

	
	case 7:
		System.out.println("HEPTAGON ");
		break;

	
	case 8:
		System.out.println("OCTOGON ");
		break;
		
	default:
		System.out.println("NOT FORMING POLYGON STRECTURE");
		break;

	}

}

	  
	}

/* 
    OUTPUT
    
     Enter the number of the sides:
6
HEXAGON 

Enter the number of the sides:
8
OCTOGON 

Enter the number of the sides:
10
NOT FORMING POLYGON STRECTURE
   
     */	
