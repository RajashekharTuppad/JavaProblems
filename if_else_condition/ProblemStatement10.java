package com.kd.if_else_condition;
/* Problem Statement 10: Imagine you're creating a simple number categorization program. 
  The program should take a number as input. If the number is a multiple of 5,
   the program should print "Multiple of 5". In all other cases, it should print "Not a multiple of 5".*/
import java.util.Scanner;
public class ProblemStatement10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int num=scan.nextInt();
		
		multipleof5(num);
		
		scan.close();
		

	}

	 static void multipleof5(int num) {
		if(num%5==0) {
			
			System.out.println("The Given Number " +num+ " multiple of 5");
		}
		else {
			System.out.println("The Given Number "+num+" is not multiple of 5");
		}
			
	}

}

/* output
  Enter the number:10
The Given Number 10multiple of 5 

Enter the number:44
The Given Number 44 is not multiple of 5
*/


