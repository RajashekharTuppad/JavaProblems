package com.kd.switch_case_condition;

/*  Problem Statement 33: You're designing an application for space enthusiasts that
  provides information about the solar system. The application should take a planet's name
   as input and outputs its order from the Sun.
    Consider the order: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune.*/
import java.util.Scanner;
public class ProblemStatement33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the planet Name: ");
		String planetName = scan.nextLine();
		isPlanetName(planetName);
		scan.close();
}

 static void isPlanetName(String planetName) {
		switch(planetName)
		{
		case "mercury":
		System.out.println(" 1 ");
		break;
		
		case "venus":
			System.out.println(" 2 ");
			break;
			
		case "earth":
			System.out.println(" 3 ");
			break;
			
		case "mars":
			System.out.println(" 4 ");
			break;
			
		case "jupiter":
			System.out.println(" 5 ");
			break;
			
		case "saturn":
			System.out.println(" 6 ");
			break;
			
		case "uranus":
			System.out.println(" 7 ");
			break;
			
		case "neptune":
			System.out.println(" 8 ");
			break;
			
			default:
				System.out.println(" not a planet ");
				break;
		}
			
		}
		
	}
		
/* 
 output
  Enter the planet Name: 
earth
 3 
  
  
   Enter the planet Name: 
mars
 4 
 *  */

