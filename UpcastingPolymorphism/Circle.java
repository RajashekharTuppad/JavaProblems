package com.kd.UpcastingPolymorphism;

public class Circle extends Shape{

	public void draw() {
		System.out.println("Drawing Circle");
	}
	public double calArea() {
		double r=2.5;
		return Math.PI*r*r;
	}


}
