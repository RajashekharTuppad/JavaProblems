package for_looping;

public class Nested_Loop_Demo {

	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {					// 3 times of i value loop(1*3)
			System.out.println("i="+i);
			
				for( int j=1;j<=2;j++) {
					System.out.println("j="+j);   // 6 times of j value loop (2*3)
				}
				System.out.println("outer of inner loop");
		}
					System.out.println("outer of outer loop"); 
	}
}


      /* output of nested for loop
       
       i=1
       j=1
       j=2
       outer of inner loop
       i=2
       j=1
       j=2
       outer of inner loop
       i=3
       j=1
       j=2
       outer of inner loop
       outer of outer loop  */


// while infinite condition


  /*for(int i=1;i<=3;i++) {					// 3 times of i value loop(1*3)
	System.out.println("i="+i);
	
		int j=1;
		while( j<=2) {
			System.out.println("j="+j);
			 j++;                             // 6 times of j value loop (2*3)
		}
		
		System.out.println("outer of inner loop");
}
			System.out.println("outer of outer loop"); 
			
			}
			}
		*/

/* output of while loop

i=1
j=1
j=2
outer of inner loop
i=2
j=1
j=2
outer of inner loop
i=3
j=1
j=2
outer of inner loop
outer of outer loop  */
			
			




// do while infinite condition


/*for(int i=1;i<=3;i++) {					// 3 times of i value loop(1*3)
	System.out.println("i="+i);
	
		int j=1;
		do {
			System.out.println("j="+j);
			 j++;                               // 6 times of j value loop (2*3)
		}while(j<=2);
		System.out.println("outer of inner loop");
}
			System.out.println("outer of outer loop"); 
			
			}
			}
		*/

/* output of do while loop

i=1
j=1
j=2
outer of inner loop
i=2
j=1
j=2
outer of inner loop
i=3
j=1
j=2
outer of inner loop
outer of outer loop  */
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			