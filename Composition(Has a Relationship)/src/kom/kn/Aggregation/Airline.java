package kom.kn.Aggregation;

public class Airline {

	 
		 
		 String name;
		 Pilot pilot;
		 
		 public Airline (String name , Pilot pilot) {
			 this.name= name;
			 this.pilot=pilot;
			 
		 }
		 public void operation() {
			 System.out.println(this.name+" is operating successfuly");
			 pilot.fly();
		

	}

}
