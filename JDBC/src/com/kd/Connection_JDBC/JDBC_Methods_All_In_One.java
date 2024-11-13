package com.kd.Connection_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Methods_All_In_One {

    private static final String URL = "jdbc:mysql://localhost:3306/university";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Raj@2001";
    private static final String INSERT_QUERY = "INSERT INTO STUDENT6 VALUES(?,?,?);";
    private static final String UPDATE_QUERY = "UPDATE student6 SET name=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM student6 WHERE id=?;";
    private static final String SELECT_QUERY = "SELECT * FROM student6;";

    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            Scanner scan = new Scanner(System.in);
            System.out.println("1. to insert data");
            System.out.println("2. to read data");
            System.out.println("3. to update data");
            System.out.println("4. delete data");
            System.out.println("Choose query");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    createData(con, INSERT_QUERY, scan);
                    break;
                case 2:
                    ResultSet result = readData(con, SELECT_QUERY);
                    while (result.next()) {
                        System.out.println("ID = " + result.getInt(1) + " Name = " + result.getString(2));
                    }
                    break;
                case 3:
                    updateData(con, UPDATE_QUERY);
                    break;
                case 4:
                    deleteData(con, DELETE_QUERY);
                    break;
                default:
                    System.out.println("Invalid option");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to Establish Connection");
            e.printStackTrace();
        } 
    }

    // Insert Data
    public static void createData(Connection con, String insertQuery, Scanner scan) {
        try {
            System.out.println("Enter value for ID : ");
            int id = scan.nextInt();
            System.out.println("Enter value for Name : ");
            String name = scan.next();
            System.out.println("Enter value for Marks : ");
            int marks = scan.nextInt();

            PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, marks);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // To Read Data
    private static ResultSet readData(Connection con, String selectQuery) {
        ResultSet resultSet = null;
        try {
            PreparedStatement pstmt = con.prepareStatement(SELECT_QUERY);
            resultSet = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    // To Update Data
    private static void updateData(Connection con, String updateQuery) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter ID : ");
            int id = scan.nextInt();
            System.out.println("Enter new Name : ");
            String name = scan.next();

            PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        scan.close();
    }

    // To Delete Data
    private static void deleteData(Connection con, String deleteQuery) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter ID to be deleted : ");
            int id = scan.nextInt();

            PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY);
            pstmt.setInt(1, id);
            pstmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        scan.close();
    }
}
