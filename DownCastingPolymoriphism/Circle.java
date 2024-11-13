package com.kd.DownCastingPolymoriphism;

public class Circle extends Shape {

	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	public double calArea() {
		double radius =2.5;
		return Math.PI*radius*radius;
	}
	
	public double calPeri() {
		double radius=3.5;
		return 2*Math.PI*radius;
	}

}
