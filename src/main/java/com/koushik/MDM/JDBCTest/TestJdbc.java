package com.koushik.MDM.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl="jdbc:mysql://127.0.0.1:3306/?user=weatherApp-database";
		String pass="weather";
		String user="weatherApp-database";
		System.out.println("Connecting to databse: "+jdbcUrl);
		try {
			Connection myCon = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
