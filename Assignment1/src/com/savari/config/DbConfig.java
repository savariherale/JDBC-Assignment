package com.savari.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
	public static Connection connectMySQL() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentdatabase","root","savari");
		
		if(conn == null)
		{
			System.out.println("Connection Failed");
		}
		else
		{
			System.out.println("Connected Successfully");
		}		
		
		return conn;
	}
}
