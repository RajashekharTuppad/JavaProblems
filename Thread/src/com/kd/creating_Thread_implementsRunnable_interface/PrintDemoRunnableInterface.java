package com.kd.creating_Thread_implementsRunnable_interface;

public class PrintDemoRunnableInterface {

	public static void main(String[] args) {
		
		//Creating objects of the classes
		//having independent activities
		PrintNumber pn=new PrintNumber();
		PrintCharacter pc=new PrintCharacter();
		
		
		//creating Thread class object & assiding activities
		Thread t1=new Thread(pn);
		Thread t2=new Thread(pc);
		
		//starting the Thread
		t1.start();
		t2.start();
		

	}

}
