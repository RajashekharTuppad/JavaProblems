package com.kd.Connection_JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/university";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "Raj@2001";
    private static final String INSERT_QUERY = "INSERT INTO STUDENT6 VALUES (?,?,?);";
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
            System.out.println("4. to delete data");
            System.out.println("Choose query");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    createData(con, INSERT_QUERY, scan);
                    break;
                case 2:
                    readData(con, SELECT_QUERY);
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

    public static void createData(Connection con, String insertQuery, Scanner scan) {
        try {
            System.out.println("Enter value for ID : ");
            int id = scan.nextInt();
            System.out.println("Enter value for Name : ");
            String name = scan.next();

            PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, 0); // Assuming the third column is MARKS and setting it to 0 for simplicity
            pstmt.execute();
            System.out.println("Data inserted successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void readData(Connection con, String selectQuery) {
        try {
            PreparedStatement pstmt = con.prepareStatement(SELECT_QUERY);
            ResultSet result = pstmt.executeQuery();
            while (result.next()) {
                System.out.println("ID = " + result.getInt(1) + ", Name = " + result.getString(2   ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateData(Connection con, String updateQuery) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID to update: ");
        int id = scan.nextInt();
        System.out.println("Enter new name: ");
        String newName = scan.next();

        try {
            PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY);
            pstmt.setString(1, newName);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Data updated successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteData(Connection con, String deleteQuery) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID to delete: ");
        int id = scan.nextInt();

        try {
            PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully");
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
            scan.close();
        }
    }
}
