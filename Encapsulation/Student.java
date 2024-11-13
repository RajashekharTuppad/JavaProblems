package com.kd.Encapsulation;

public class Student {
 
	private int rollNumber;
	private String Name;
	private int marks;
	private String gender;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Student(int rollNumber, String name, int marks, String gender) {
		this.rollNumber = rollNumber;
		 this.Name = name;
		this.marks = marks;
		this.gender = gender;
	}
	
	}


