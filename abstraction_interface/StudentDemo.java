package com.kd.abstraction_interface;

public class StudentDemo {

	public static void main(String[] args) {
		
		CSStudent cs1=new CSStudent();
		MechStudent ms1=new MechStudent();
		
		StudentDemo.callMethods(ms1);
		StudentDemo.callMethods(cs1);
	}
		
		static void callMethods(Student s){
			s.study();
			s.doProject();
		}

	}


