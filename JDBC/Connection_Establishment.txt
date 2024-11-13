package com.kd.Connection_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Connection_Establishment {

	private static final String URL="jdbc:mysql://localhost:3306/university";
	private static final String USER_NAME="root";
	private static final String PASSWORD="Raj@2001";
	//private static final String CREATE_STUDENT_QUERY="CREATE TABLE STUDENT6(ID INT,NAME VARCHAR(20),MARKS INT);";
	//private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT6 VALUES(1,'RAM',100);";
	//private static final String UPDATE_STUDENT_QUERY="update student6 set name='Shree Ram' where id=1;";
	//private static final String DELETE_STUDENT_QUERY="delete from student6 where id=1;";
	private static final String SELECT_ALL_STUDENT6_QUERY="select * from student6;";
	public static void main(String[] args) {
	Connection con=null;
	try {
		//1)Load and Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// FQCN(Fully Qualified Class Name)-Conical Name
		System.out.println("---> Driver Loaded & Registered Successfully !<----");
		
		
		// 2) Establish the Connection with Databases
		con=DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		System.out.println("--->Connection Establishment Successfully<---"+con);
		
		
		//3) CREATE STATEMENT OBJECT
		/*String CREATE_STUDENT_QUERY=
				"CREATE TABLE STUDENT6(ID INT,NAME VARCHAR(20),MARKS INT);";*/
		
		Statement stmt= con.createStatement();
		
		
		//4) send and executeQuery
		//stmt.execute(CREATE_STUDENT_QUERY);
		//stmt.execute(INSERT_STUDENT_QUERY);
		
		//stmt.execute(UPDATE_STUDENT_QUERY);
		
		//int rowsAffected=stmt.executeUpdate(DELETE_STUDENT_QUERY);
		
		//System.out.println( rowsAffected+"Rows Affected");
		//System.out.println("-->Student6 Table deleted successfully<----");
		
		ResultSet rs=stmt.executeQuery(SELECT_ALL_STUDENT6_QUERY);
		while(rs.next()) {
			System.out.println("ID=  "+rs.getInt(1)+",NAME="+rs.getString(2)+",MARKS="+rs.getInt(3));
		}
		
	}catch(ClassNotFoundException e) {
		System.out.println("----->Driver Not Found<---");
		e.printStackTrace();
	} catch (SQLException e) {
		System.out.println("--->Failed to Establish Connection<---");
		e.printStackTrace();
	}finally {
		//5 Close the connection
		try {
		if(con!=null) {}
		con.close();
		System.out.println("!..Connection closed..!");
		}catch(SQLException e) {
			e.printStackTrace();	}
	}
		

	}

}
