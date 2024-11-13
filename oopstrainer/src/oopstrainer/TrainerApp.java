package oopstrainer;
public class TrainerApp {
		public static void main(String[] args) {
			Trainer t1= new Trainer();
			//Behaviour or Action Performed or Member Function or Instances Methods
			System.out.println("ID="+t1.id+",Name="+t1.name+",SKILLS="+t1.skills);
			t1.id =1234;
			t1.name = "DHONI";
			t1.skills ="JAVA";
			System.out.println("After initializing..");
			System.out.println("ID="+t1.id+",Name="+t1.name+",SKILLS="+t1.skills);
			System.out.println("---> Behaviours ");
		    t1.train();
		    t1.sloveproblem();
		    
		    Trainer t2= new Trainer();
		    t2.id=5678;
			t2.name= "RAJA";
			t2.skills ="TEATING";
			System.out.println("After initializing..");
			System.out.println("ID="+t2.id+",Name="+t2.name+",SKILLS="+t2.skills);
			System.out.println("---> Behaviours ");
		    t2.train();
		    t2.sloveproblem();
		}

		}
  
	