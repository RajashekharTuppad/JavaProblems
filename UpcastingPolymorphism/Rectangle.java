package com.kd.UpcastingPolymorphism;

public class Rectangle extends Shape {

	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	public double calArea() {
		double l=10.5,b=5.5;
		return l*b;
	}


}
