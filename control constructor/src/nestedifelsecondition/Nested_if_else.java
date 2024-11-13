package nestedifelsecondition;

public class Nested_if_else {

	public static void main(String[] args) {
		
		int a=17;
		if(a>=10);
		{
			System.out.println("If Body");
			if(a>15) {
				System.out.println("Inner If Body");
			}
		
			else {
			System.out.println("Inner Else Body");	
			}
		}
	 { 
		
				System.out.println("Else Body");
				
				if(a>5) {
					System.out.println("Nested else if");
				}else {
					System.out.println("Nested else else");
				}
			}
			System.out.println("....THE END...");
		}
		
		}

	


