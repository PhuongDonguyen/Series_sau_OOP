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


	public static void main(String[] args) {
//		Experience
//		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(QUERY);) {
//			while (rs.next()) {
//				// Display values
//				System.out.print("Name: " + rs.getString("name"));
//				System.out.print(", street: " + rs.getString("street"));
//				System.out.print(", district: " + rs.getString("district"));
//				System.out.print(", ward: " + rs.getString("ward"));
//				System.out.println(", floorArea: " + rs.getString("floorarea"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

		
		// beginner
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			String query = "SELECT * FROM building";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				System.out.print("ID: " + rs.getLong("id"));
				System.out.print("Name: " + rs.getString("name"));
				System.out.print(", street: " + rs.getString("street"));
				System.out.print(", district: " + rs.getString("district"));
				System.out.print(", ward: " + rs.getString("ward"));
				System.out.println(", floorArea: " + rs.getString("floorarea"));
			}
			
		} catch(ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (conn != null) conn.close();
				if (stmt != null) stmt.close();
				if (rs != null) rs.close();
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
		
	}
}
