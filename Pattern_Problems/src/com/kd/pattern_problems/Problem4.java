package com.kd.pattern_problems;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		scan.close();
		
		
	
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(i);
				
				
				/*or  
				
				System.out.print(j); */
			}
		}
	}

}
/* output of i
5555544444333332222211111

output of j 
1234512345123451234512345

*/


	