package com.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		
		LocalDate myObj=LocalDate.now();
		System.out.println("LOCAL DATE");
		System.out.println(myObj);
		
		System.out.println("**************************");
		
		LocalTime myObj1=LocalTime.now();
		System.out.println("LOCAL TIME");
		System.out.println(myObj1);
		
		System.out.println("**************************");
		
		LocalDateTime myObj2=LocalDateTime.now();
		System.out.println("LOCAL DATETIME");
		System.out.println(myObj2);
		
		System.out.println("**************************");
		
		LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}
}
/* OUTPUT
 LOCAL DATE
2023-10-19
**************************
LOCAL TIME
00:11:39.929117800
**************************
LOCAL DATETIME
2023-10-19T00:11:39.929117800
**************************
Before formatting: 2023-10-19T00:11:39.929117800
After formatting: 19-10-2023 00:11:39
 */ 
