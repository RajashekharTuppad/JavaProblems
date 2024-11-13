package com.kd.Abstraction_CarExample;

public abstract class Car {

	public void start() {
		System.out.println("Car is Started");
	}
	
	public void stop() {
		System.out.println("Car is Stoped");
	}
	
	 abstract public void refuel();
}
