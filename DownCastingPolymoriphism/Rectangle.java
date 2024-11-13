package com.kd.DownCastingPolymoriphism;

public class Rectangle extends Shape {
	
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	
	public double calArea() {
		double l =2.5,b=3.5;
		return l*b;
	}
	
	public double calPeri() {
		double l=2.5,b=4.5;
		return 2*(l+b);
	}

	

}
