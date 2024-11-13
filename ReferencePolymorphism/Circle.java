package com.kd.ReferencePolymorphism;

public class Circle  extends Geometry {

	public void draw() {
		System.out.println("Drawing Circle");
	}
	public double calArea() {
		double r=2.5;
		return Math.PI*r*r;
	}

}
