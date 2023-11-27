package com.laptrinhjavaweb.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerJDBC {
	static final String DB_URL = "jdbc:mysql://localhost:3306/javasql92023";
	static final String USER = "root";
	static final String PASS = "xinchaovietnam";
	
	public static void main(String[] args) {
//		Long id = null;
//		String name = null;
//		String street = null;
//		String district = null;
//		String ward = null;
//		Integer floorArea = null;
//		Integer numberOfBasement = null;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			StringBuilder query = new StringBuilder("SELECT * FROM customer where 1 = 1");

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query.toString());
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
//				System.out.print("ID: " + rs.getLong("id") + ", Type: " + rsmd.getColumnType(1));
//				System.out.print(", name: " + rs.getString("name"));
//				System.out.print(", street: " + rs.getString("street"));
//				System.out.print(", district: " + rs.getString("district"));
//				System.out.print(", ward: " + rs.getString("ward"));
//				System.out.println(", floorArea: " + rs.getString("floorarea"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (stmt != null)
					stmt.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}
