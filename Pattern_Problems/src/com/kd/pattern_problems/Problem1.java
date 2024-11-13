package com.kd.pattern_problems;


import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		scan.close();
	
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println(j);
			   
				/* 
				or
				
				System.out.print(j); */
			}
		}
	}


/* output of i
1111122222333334444455555

output of j 
1234512345123451234512345

*/
