package com.kd.Nested_If_condition;

/*  You're designing a program for a recruitment agency that determines whether a candidate is suitable for a job role.
  The program should take years of experience and the candidate's skill level as inputs.
   A candidate is suitable if they have more than 5 years of experience and a skill level above 7.
    If the candidate has the required experience, it should then check their skill level.
     If both conditions are met, it should print "Suitable Candidate". */

   import java.util.Scanner;
     public class ProblemStatement19 {
    		public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println(" enter the skill level  of the candidate(out of 10): ");
	int skill = scan.nextInt();
	
	System.out.println(" enter the experience level  of the candidate(out of 10): ");
	int experience = scan.nextInt();
	
	isskillandexperience(skill,experience);
	scan.close();
}

    static void  isskillandexperience(int skill, int experience) {
	if(skill>=7)
	{
		if(experience>=5)
		{
			System.out.println(" suitable candidate ");
		}else
		{
			System.out.println("Not Suitable Due to Experience criteria");
		}
	}
	else
	{
		System.out.println("Not Suitable Candidate ");
	}
  }
}
     
     
     
     /*
     
     output
     
     enter the skill level  of the candidate(out of 10): 
	8
 enter the experience level  of the candidate(out of 10): 
	7
 suitable candidate 
 
 //
 
  enter the skill level  of the candidate(out of 10): 
	6
 enter the experience level  of the candidate(out of 10): 
	4
Not Suitable Candidate 

     
     
     
     */