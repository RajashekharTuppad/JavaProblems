package Static_and_Instance;

public class Program {
		
	// static variable
		static int x,y;
		
	
		//static block
		static {
			System.out.println("***********************");
			System.out.println("Static Block");
			x=10;
			y=20;
		}
		
		
		// static method
		public static void disp1() {
			System.out.println("***********************");
			System.out.println("Static Method");
			System.out.println("x="+x);
			System.out.println("y="+y);
		}
		
		int a,b;
		{
			System.out.println("***********************");
			System.out.println("Instance Block");
			a=11;
			b=22;
			x=100;
			y=200;
		}
		
		public void disp2() {
			System.out.println("***********************");
			System.out.println("Instance Method");
			System.out.println("x="+x);
			System.out.println("y="+y);
			System.out.println("a="+a);
			System.out.println("b="+b);
		}
		
		public Program() {
			System.out.println("Constructor");
		}
}
