package continuecondition;
import java.util.Scanner;
		public class JumpingStatement {

			public static void main(String[] args) {
				
		System.out.println("Enter the number of Range:");
				Scanner scan=new Scanner(System.in);
				int range=scan.nextInt();
				for(int i=1;i<=range;i++) {
					if(i%7==0) {
						System.out.println("...-> Divisible by 7="+i);
						continue;
					}else {
						System.out.println("...-> Not Divisible by 7="+i);
					}
					System.out.println("With the Body of for loop");
				}
			System.out.println("...> The End...");
			scan.close();
			}	
	}

//output(7)
		/*Enter the number of Range:                            
			10
			...-> Not Divisible by 7=1
			With the Body of for loop
			...-> Not Divisible by 7=2
			With the Body of for loop
			...-> Not Divisible by 7=3
			With the Body of for loop
			...-> Not Divisible by 7=4
			With the Body of for loop
			...-> Not Divisible by 7=5
			With the Body of for loop
			...-> Not Divisible by 7=6
			With the Body of for loop
			...-> Divisible by 7=7
			...-> Not Divisible by 7=8
			With the Body of for loop
			...-> Not Divisible by 7=9
			With the Body of for loop
			...-> Not Divisible by 7=10
			With the Body of for loop
			...> The End...*/
		

		
	 /*
		package continuecondition;
		import java.util.Scanner;
				public class JumpingStatement {

					public static void main(String[] args) {
						
				System.out.println("Enter the number of Range:");
						Scanner scan=new Scanner(System.in);
						int range=scan.nextInt();
						for(int i=1;i<=range;i++) {
							if(i%3==0) {
								System.out.println("...-> Divisible by 3="+i);
								continue;
							}else {
								System.out.println("...-> Not Divisible by 3="+i);
							}
							System.out.println("With the Body of for loop");
						}
					System.out.println("...> The End...");
					scan.close();
					}	
			}
		
		//output(3)
		
	/*	Enter the number of Range:
			10
			...-> Not Divisible by 3=1
			With the Body of for loop
			...-> Not Divisible by 3=2
			With the Body of for loop
			...-> Divisible by 3=3
			...-> Not Divisible by 3=4
			With the Body of for loop
			...-> Not Divisible by 3=5
			With the Body of for loop
			...-> Divisible by 3=6
			...-> Not Divisible by 3=7
			With the Body of for loop
			...-> Not Divisible by 3=8
			With the Body of for loop
			...-> Divisible by 3=9
			...-> Not Divisible by 3=10
			With the Body of for loop
			...> The End...*/

