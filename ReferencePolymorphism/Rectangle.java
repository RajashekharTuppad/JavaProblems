package com.kd.ReferencePolymorphism;

public class Rectangle extends Geometry {

	public void draw() {
		System.out.println("Drawing Rectangle");
	}
	public double calArea() {
		double l=10.5,b=5.5;
		return l*b;
	}

}
