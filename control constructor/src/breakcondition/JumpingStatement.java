package breakcondition;

import java.util.Scanner;
public class JumpingStatement {

	public static void main(String[] args) {
		
  // divisible by 7
System.out.println("Enter the number of Range:");
		Scanner scan=new Scanner(System.in);
		int range=scan.nextInt();
		for(int i=1;i<=range;i++) {
			if(i%7==0) {
				System.out.println("...-> Divisible by 7="+i);
				break;
			}else {
				System.out.println("...-> Not Divisible by 7="+i);
			}
			System.out.println("With the Body of for loop");
		}
	System.out.println("...> The End...");
	scan.close();
	}

}
	
	//output
//	Enter the number of Range:
//		7
//		...-> Not Divisible by 7=1
//		With the Body of for loop
//		...-> Not Divisible by 7=2
//		With the Body of for loop
//		...-> Not Divisible by 7=3
//		With the Body of for loop
//		...-> Not Divisible by 7=4
//		With the Body of for loop
//		...-> Not Divisible by 7=5
//		With the Body of for loop
//		...-> Not Divisible by 7=6
//		With the Body of for loop
//		...-> Divisible by 7=7
//		...> The End...


		
		
// Divisible by 3 
//		System.out.println("Enter the number of Range:");
//		Scanner scan=new Scanner(System.in);
//		int range=scan.nextInt();
//		for(int i=1;i<=range;i++) {
//			if(i%3==0) {
//				System.out.println("...-> Divisible by 3="+i);
//				break;
//			}else {
//				System.out.println("...-> Not Divisible by 3="+i);
//			}
//			System.out.println("With the Body of for loop");
//		}
//		System.out.println("...> The End...");
//		scan.close();

// output
//Enter the number of Range:
//3
//...-> Not Divisible by 3=1
//With the Body of for loop
//...-> Not Divisible by 3=2
//With the Body of for loop
//...-> Divisible by 3=3
//...> The End...



