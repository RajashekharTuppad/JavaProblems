package com.kd.UpcastingPolymorphism;

public class Square extends Shape{

	public void draw() {
		System.out.println("Drawing Square");
	}
	public double calArea() {
		double side=2.5;
		return side*side;
	}


}
