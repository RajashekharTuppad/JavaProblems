package ifelseladdercondition;

//The Given Character whether is vowel or consonents //
import java.util.Scanner;

public class Vowel_or_Consonents {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
			
			System.out.println("Enter the Character=");
			
			char c =scan.next().charAt(0);
		
			if(c =='a'|| c=='A')
			{	
			System.out.println("The given character"+c+"is a vowel");
			}
		
			else if(c=='e'|| c=='E')
			{
				System.out.println("The given character"+c+"is a vowel");
			
			}
			
			else if(c=='i'|| c=='I')
			{
				System.out.println("The given character"+c+"is a vowel");
			
			}
			
			else if(c=='o'|| c=='O')
			{
				System.out.println("The given character"+c+"is a vowel");
			
			}
			
			else if(c=='u'|| c=='U')
			{
				System.out.println("The given character"+c+"is a vowel");
			
			}
			
			else 
			{
				System.out.println("The given character"+c+"is a CONSONENTS");
			}
			
	       scan.close();

	}

}
