package com.kd.switch_case_condition;
/* Problem Statement 35: You're building an interactive weather application.
   The application takes a weather condition as input 
   (1 for Sunny, 2 for Rainy, 3 for Snowy, 4 for Windy) and suggests an activity.*/

import java.util.Scanner;
public class ProblemStatement35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number to detect weather ");
		int weather = scan.nextInt();
		isWeather(weather);
		scan.close();

	}

	 static void isWeather(int weather) {
			switch(weather)
			{
			case 1 :
				System.out.println(" Sunny ");
				break;
				
			case 2:
				System.out.println(" Rainy");
				break;
				
			case 3 :
				System.out.println(" Snowy ");
				break;
				
			case 4 :
				System.out.println(" Windy ");
				break;
		
				default:
					System.out.println(" Not a Weather Condition ");
					break;
			
	}
	 }
}
		
/*  
   output
    enter the number to detect weather 
		3
 		Snowy 
 		
 		enter the number to detect weather 
2
 Rainy
   */
	
