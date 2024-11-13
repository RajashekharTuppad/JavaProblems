package ifelseladdercondition;

import java.util.Scanner;

// TAKE INPUT AS MARKS AND PASS THE STUDENT WITH NECCESSARY GRADES //
public class Cgpa {

	public static void main(String[] args) {
		
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the Marks Taken By The Student=");
			
			int marks=scan.nextInt();
		
			if(marks>=90)
			{	
			System.out.println("Student got A Grade");
			}
		
			else if(c=='e'|| c=='E')
			{
				System.out.println("Student got A Grade");
			
			}
			
			else if(c=='i'|| c=='I')
			{
				System.out.println("Student got A Grade");
			
			}
			
			else if(c=='o'|| c=='O')
			{
				System.out.println("Student got A Grade");
			
			}
			
			else if(c=='u'|| c=='U')
			{
				System.out.println("Student got A Grade");
			
			}
			
			else 
			{
				System.out.println("The given character"+c+"is a CONSONENTS");
			}
			
	       scan.close();
	}

}
