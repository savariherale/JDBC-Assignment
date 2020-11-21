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
	
	public void showBus_Type ()
	{
		try 
		{			
			String query = "SELECT Bus_typeid, bus_type FROM Bus_Type ";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %30s",
						R.getInt("Bus_typeid"),
						R.getString("bus_type")
						));
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
	
	public void showBusMaster ()
	{
		try 
		{			
			String query = "SELECT BM.BusMasterid, BT.bus_type, BM.bus_number FROM BusMaster BM JOIN Bus_Type BT ON BM.fkbus_typeid = BT.Bus_typeid";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %20s %20s",
						R.getInt("BusMasterid"),
						R.getString("bus_type"),
						R.getString("bus_number")
						));
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
	
	public void ShowDriver ()
	{
		try 
		{			
			String query = "SELECT Driverid, join_date, driver_name, experience FROM Driver";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %20s %20s %5d",
						R.getInt("Driverid"),
						R.getString("join_date"),
						R.getString("driver_name"),
						R.getInt("experience")
						));
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
	
	public void ShowPlace ()
	{
		try 
		{			
			String query = "SELECT placeid, placeName FROM Place";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %20s",
						R.getInt("placeid"),
						R.getString("placeName")
						));
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
	
	public void ShowRoutMaster ()
	{
		try  
		{			
			String query1 = "SELECT R.Routid, BM.bus_number, BT.bus_type, D.driver_name,P.placeName, P1.placeName AS Placeto FROM RoutMaster R JOIN Place p1 ON R.fkplaceidto = P1.placeid JOIN Place P ON R.fkplaceidFrom = P.placeid JOIN BusMaster BM ON R.fkBusMasterid = BM.BusMasterid JOIN bus_type BT ON BM.fkbus_typeid = BT.Bus_typeid JOIN Driver D ON R.fkDriverid = D.Driverid ";
			
			Statement stmt = conn.createStatement();
			ResultSet R = stmt.executeQuery(query1);
			
			while(true)
			{
				if(R.next()==false)
					break;
				
				System.out.println(String.format("%5d %20s %20s %20s %20s %20s",
						R.getInt("Routid"),
						R.getString("bus_type"),
						R.getString("bus_number"),
						R.getString("driver_name"),
						R.getString("placeName"),
						R.getString("Placeto")
						));
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Exception is \n" + e);
		}
	}
}













