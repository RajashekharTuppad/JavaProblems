package com.kd.SoftwareEngg;

public class SoftwareEnggDemo {

	public static void main(String[] args) {
		
		SoftwarwEngg se=new SoftwarwEngg();
		se.attendMeting();
		se.doTesting();
		System.out.println("===============================");
		
		BackendEngg be=new BackendEngg();
		be.attendMeting();
		be.doTesting();
		be.doBackendProject();
		System.out.println("=================================");
		
		DatabaseEngg db= new DatabaseEngg();
		db.attendMeeting();
		db.doTesting();
		db.doDatabaseProject();
		db.learnSql();
		System.out.println("=================================");
		
		JavaBackendEngg jb=new JavaBackendEngg();
		jb.attendMeting();
		jb.doTesting();
		jb.doBackendProject();
		jb.learnJava();
		
		System.out.println("=================================");
		PythonBackendEngg pb= new PythonBackendEngg();
		pb.attendMeting();
		pb.doTesting();
		pb.doBackendProject();
		pb.learnJava();
		
	}

}
