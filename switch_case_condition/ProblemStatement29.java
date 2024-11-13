package com.kd.switch_case_condition;

import java.util.Scanner;

/*  Problem Statement 29: You're designing a program for a library which provides information 
   about different book genres. The program should take a genre number as input and
    print the corresponding genre. 
 Consider the following genres: 1 - Fiction, 2 - Non-Fiction, 3 - Fantasy, 4 - Mystery, 5 - Biography.*/ 
public class ProblemStatement29 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the genre number :");
		int genrenumber =scan.nextInt();
		
		library(genrenumber);
		scan.close();
	}
	
	static void library(int genrenumber) {
		
	switch(genrenumber){
	case 1:
	System.out.println("Fiction");
	break;

	case 2:
		System.out.println("Non-Fiction ");
		break;

	
	case 3:
		System.out.println("Fantasy");
		break;
		
	case 4:
		System.out.println("Mystery");
		break;
		
	case 5:
		System.out.println("Biography");
		break;
	
	default:
		System.out.println("NO OTHER OPTIONS ");
		break;
	}
	}

}

/* 
 Enter the genre number :
3
Fantasy

Enter the genre number :
5
Biography

Enter the genre number :
10
NO OTHER OPTIONS 

 */
