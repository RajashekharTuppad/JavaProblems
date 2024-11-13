package com.kd.looping;


import java.util.Scanner;
public class LargestPalindromeNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number as a Range:");
		int range=scan.nextInt();
		
		 largestpalindromeNumber(range);
		scan.close();
		

	}

		 static void largestpalindromeNumber(int range) {
			int i =range;
			while(i>=1) {
				
				if(isPalindrome(i)) {
					System.out.println("The Largest Palindrome Number="+i+",with in range"+range);
					break;}
				i--;
			}
				
				}
		 
		 static boolean isPalindrome(int num) {
			 int digit = 0,sum=0,temp=num;
			 while(num>0) {
			  digit=num%10;
			  sum=sum*10+digit;
			 num=num/10;
		
			 }
		 
		 if(temp==sum) {
			 return true;
		 }
		return false;
		 }
}
			
	/* output
	 * Enter the Number as a Range:
100
The Largest Palindrome Number=99,with in range100
	 */
	



		
	



		
	
