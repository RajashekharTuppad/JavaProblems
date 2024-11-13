package com.kd.pattern_problems;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		scan.close();
		
		
	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				/*
				 System.out.print((char)(i+64));*/
				 if(j<=(6-i)) {
				System.out.print((char)(j+64)); 
			}
			
		}System.out.println(" ");
	}

}
}
	/* output
	      
	      for i 
	      AAAABBBBCCCCDDDDEEEE
	      
	      for j
	      ABCDABCDABCDABCDABCD
	  */
	  
	  
	  
