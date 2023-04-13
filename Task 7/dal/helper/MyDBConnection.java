package com.dal.helper;

import java.sql.*;

public class MyDBConnection {

	public static Connection con;
	
	public static Connection getDBConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","localdatabase","Password");
		} 
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void main(String[] args) {
		System.out.println(getDBConnection());
	}
}
