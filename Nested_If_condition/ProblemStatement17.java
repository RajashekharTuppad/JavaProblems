package com.kd.Nested_If_condition;

/* Problem Statement 17: You are developing a mathematical game which includes identifying special types of squares. 
 The program should first check whether a rectangle with sides 'a' and 'b' is a square or not.
  If it is a square, then the program should check whether the square's side length is a perfect square number.
   If both conditions are met, it should print "Magic */
/*
import java.util.Scanner;
public class ProblemStatement17 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter side lengths 'a' and 'b':");
	        int a = scan.nextInt();
	        int b = scan.nextInt();
	        
	         mathematicalgame(a,b);
	         scan.close();
	}

 static void mathematicalgame(int a, int b) {
	 if (a == b) {
         int sqrt = (int) Math.sqrt(a);
         if (sqrt * sqrt == a) {
             System.out.println("Magic");
         } else {
             System.out.println("Square, but not a perfect square number");
         }
     } else {
         System.out.println("Not a square");
     }
 }
}
	
	 
	 output
	 
	 Enter side lengths 'a' and 'b':
	4
	4
	Magic

	Enter side lengths 'a' and 'b':
	2
	3
	Not a square
		
	*/	
		
	/*	
import java.util.Scanner;
public class ProblemStatement17 {	
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the length of side 'a': ");
    int a = scanner.nextInt();

    System.out.print("Enter the length of side 'b': ");
    int b = scanner.nextInt();

    if (isSquare(a, b)) {
        int sideLength = Math.min(a, b);
        if (isPerfectSquare(sideLength)) {
            System.out.println("Magic");
        } else {
            System.out.println("Not Magic");
        }
    } else {
        System.out.println("Not Magic");
    }
}

// Function to check if a rectangle with sides 'a' and 'b' is a square
public static boolean isSquare(int a, int b) {
    return a == b;
}

// Function to check if a number is a perfect square
public static boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
}
}
		
	/* 
	 	
	 output 
	 Enter the length of side 'a': 4
	Enter the length of side 'b': 5
	Not Magic */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		


