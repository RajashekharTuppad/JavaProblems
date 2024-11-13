package com.kd.SortingOfComplexObjects_Comparable;

public  class Student implements Comparable<Student> {
	
	public int id;
	 public String name;
	public double percentage;

	
	public Student(int id,String name,double percentage) {
		this.id=id;
		this.name=name;
		this.percentage=percentage;	
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public double getPercentage() {
		return percentage;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}


	@Override
	public int compareTo(Student s) {
		if(this.id>s.id) {
			return 1;
		}else if(this.id< s.id) {
			return -1;
		}else {
		return 0;
	}
	
	
	}
	
}

