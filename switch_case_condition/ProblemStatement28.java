package com.kd.switch_case_condition;

/* Problem Statement 28: You're developing a restaurant App which helps the customers to know 
   the special dish of the day. The application should take a day of the week as input
    (1 for Monday, 2 for Tuesday, etc.) and outputs the special dish of that day.
     Consider the following dishes: Monday - Pasta, Tuesday - Tacos, Wednesday - Sushi,
      Thursday - Steak, Friday - Pizza, Saturday - Lobster, Sunday - Brunch. */

import java.util.Scanner;

public class ProblemStatement28 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the weekday number:");
		int  day =scan.nextInt();
		
		specialdish(day);
		System.out.println("Plaese visit again");
		scan.close();
	}
	
	static void specialdish(int day) {
		
	switch(day){
	case 1:
	System.out.println("Monday");
	System.out.println("Monday-Pasta");
	break;

	case 2:
		System.out.println("Tuesday ");
		System.out.println("Tuesday-Tacos");
		break;

	
	case 3:
		System.out.println("Wednesday");
		System.out.println("Wednesday - Sushi");
		break;
		
	case 4:
		System.out.println("Thursday");
		System.out.println("Thursday- Steak");
		break;
		
	case 5:
		System.out.println("Friday");
		System.out.println("Friday-Pizza");
		break;
		
	case 6:
		System.out.println("Saturday");
		System.out.println("Saturday-Lobster");
		break;
	
	default:
		System.out.println("Sunday ");
		System.out.println("Sunday - Brunch");
		break;
	}

}
}

/*
 Enter the weekday number:
2
Tuesday 
Tuesday-Tacos
Plaese visit again

Enter the weekday number:
5
Friday
Friday-Pizza
Plaese visit again
  */	

	
