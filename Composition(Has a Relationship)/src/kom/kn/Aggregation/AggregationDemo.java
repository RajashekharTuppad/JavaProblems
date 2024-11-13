package kom.kn.Aggregation;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilot pilot=new Pilot("Flying Beast");
		Airline airline=new Airline("Emirates",pilot);
		
		airline.operation();
		
		
		//Shutdown Emirates
		airline = null;
		System.out.println("--->Airline has been SHUTDOWN");
		pilot.fly();

	}

}
