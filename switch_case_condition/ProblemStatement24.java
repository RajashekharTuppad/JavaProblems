package com.kd.switch_case_condition;

/* Problem Statement 24: You're developing an interactive tool for a driving school.
   The tool takes a traffic light color (Red, Yellow, Green) as input and suggests the action a driver should take.
    The program should print "Stop" for "Red", "Ready" for "Yellow", and "Go" for "Green". */

import java.util.Scanner;
public class ProblemStatement24 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Traffic Light Color:");
		String color =scan.nextLine();
		
		trafficlight(color);
		System.out.println(" Please,Always Drive Carefully");
		scan.close();
	}
	
	static void trafficlight(String color) {
		
	switch(color){
	case "Red":
	System.out.println("Stop");
	break;

	case "Yellow":
		System.out.println("Ready ");
		break;

	
	case "Green":
		System.out.println("Go");
		break;

	
	default:
		System.out.println("Fast and Furious ");
		break;
	}

}
}

/*
 output
 Enter the Traffic Light Color:
Red
Stop
 Please,Always Drive Carefully
 
 Enter the Traffic Light Color:
Yellow
Ready 
 Please,Always Drive Carefully
 
 
 Enter the Traffic Light Color:
Green
Go
 Please,Always Drive Carefully
 
 */
