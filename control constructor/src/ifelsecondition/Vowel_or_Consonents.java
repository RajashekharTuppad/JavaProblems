package ifelsecondition;

// The Given Character whether is vowel or consonents //
import java.util.Scanner;

public class Vowel_or_Consonents {

	public static void main(String[] args) 
		{
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Character=");
		
		char c =scan.next().charAt(0);
	
		if(c =='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
		{	
		System.out.println("The given character is vowel");
		}
	
		else
		{
			System.out.println("The given character is consonents");
		
		}
       scan.close();
	}

}
