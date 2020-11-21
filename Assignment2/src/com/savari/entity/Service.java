package com.savari.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.savari.config.DbConfig;

public class Service {
	private Connection conn;
	
	public Service() throws ClassNotFoundException, SQLException
	{
		conn = DbConfig.connectMySQL();
	}
	
	public void saveAuther(Auther user) throws SQLException
	{
		String query = String.format("INSERT INTO Auther(Autherid, auther_name, qualification)VALUES(%d,'%s','%s')",
				user.getAutherid(),user.getAuther_name(),user.getQualification());
		
		Statement stmt = (Statement) conn.createStatement();
		stmt.execute(query);
		
		System.out.println("Save Successfully");
	}
	
	public void saveBookCategory(BookCategory user) throws SQLException
	{
		String query = String.format("INSERT INTO BookCategory(Categoryid,catagoryName)VALUES(%d,'%s')",
				user.getCategoryid(),user.getCatagoryName());
		
		Statement stmt = (Statement) conn.createStatement();
		stmt.execute(query);
		
		System.out.println("Save Successfully");
	}
	
	public void saveBookMaster(BookMaster user) throws SQLException
	{
		String query = String.format("INSERT INTO BookMaster(Bookid,record_date,bookname,fkcatagotyid,fkauther_id,price)VALUES(%d,'%s','%s',%d,%d,%f)",
				user.getBookid(),user.getRecord_date(),user.getBookid(),user.getFkcatagotyid(),user.getFkauther_id(),user.getPrice());
		
		Statement stmt = (Statement) conn.createStatement();
		stmt.execute(query);
		
		System.out.println("Save Successfully");
	}
	
	public void showBook ()
	{
		try 
		{
			conn = DbConfig.connectMySQL();
			
			String query = "SELECT Bookid,record_date,bookname,fkcatagotyid,fkauther_id,price FROM BookMaster ";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %30s %30s %5d %5d %5.2f",
						R.getInt("Bookid"),
						R.getString("record_date"),
						R.getString("bookname"),
						R.getInt("fkcatagotyid"),
						R.getInt("fkauther_id"),
						R.getFloat("price")
						));
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
	
}
