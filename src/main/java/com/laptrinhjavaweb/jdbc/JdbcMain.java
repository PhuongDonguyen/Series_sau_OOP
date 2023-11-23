package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {
	static final String DB_URL = "jdbc:mysql://localhost:3306/javasql92023";
	static final String USER = "root";
	static final String PASS = "xinchaovietnam";
	static final String QUERY = "SELECT * FROM building";

	public static void main(String[] args) {
//		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(QUERY);) {
//			while (rs.next()) {
//				// Display values
//				System.out.print("Name: " + rs.getString("name"));
//				System.out.print(", street: " + rs.getString("street"));
//				System.out.print(", district: " + rs.getString("district"));
//				System.out.println(", ward: " + rs.getString("ward"));
//				System.out.println(", floorArea: " + rs.getString("floorarea"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
//		try {
//			Integer value1 = 0/10;
//			System.out.println(value1);
//			Class.forName("com.mysql.jdbc.Driver"); // ensures that the MySQL JDBC driver is available 
//			Integer value2 = 10/0;
//			System.out.println(value2);
//			System.out.println("Something");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Thiếu file jar rồi a gì ơi");
//		} catch (Exception e) {
//			System.out.println("Lỗi ngoại lệ rồi a gì ơi");
//		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);
			while (rs.next()) {
				
			}
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
