package com.kd.Strings;

public class StrindBuilder {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Ram");
		System.out.println("Data="+ sb);
		System.out.println("Length="+sb.length());
		System.out.println("Capacity="+sb.capacity());
		
		System.out.println("**************");
		System.out.println();
		
		sb.append("Sita");
		sb.append("Sita");
		sb.append("Sita");
		sb.append("Sita");
		sb.append(' ');
		System.out.println("Data="+ sb);
		System.out.println("Length="+sb.length());
		System.out.println("Capacity="+sb.capacity());
	}
}
/*
Data=Ram
Length=3
Capacity=19
**************

Data=RamSitaSitaSitaSita 
Length=20
Capacity=40
*/