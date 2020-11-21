/*Bus_Type
	Bus_typeid(INT), bus_type(VARCHAR)
BusMaster
	BusMasterid(INT), fkbus_typeid(INT), bus_number(VARCHAR)
Driver
	Driverid(INT), join_Date(DATE), driver_name(VARCHAR), experience(INT)
Place
	Placeid(INT), placeName(VARCHAR)
RoutMaster
	Routid(INT), fkBusMasterid(INT), fkDriverid(INT), fkplaceidFrom(int),fkplaceidTo(INT)
Define following Views in Database
1. Show Bus_Types (bus_typeid, bus_type)
2. Show BusDetails (BusMasterid, bus_type, bus_number)
3. Show DriverDetails (driver_id, join_date, driver_name, experiance)
4. Show Place (placeid, placeName)
5. Show RoutMaster (Routid, bus_type,bus_number, driver_name,placeName_From,placeName_To)*/

package com.savari;

import java.sql.SQLException;
import java.util.Scanner;

import com.savari.entity.Service;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select any one option\n1.Show Bus_Types\n2.Show BusDetails\n3.Show DriverDetails\n4.Show Place \n5.Show RoutMaster");
		int choice = scan.nextInt();
		
		switchCase(choice);
	}

	private static void switchCase(int choice) {
		switch(choice)
		{
			case 1:
			{
				Service s;
			
				try {
					s = new Service();
					s.showBus_Type();
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
			
			case 2:
			{
				Service s;
			
				try {
					s = new Service();
					s.showBusMaster();
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
			
			case 3:
			{
				Service s;
			
				try {
					s = new Service();
					s.ShowDriver();
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
			
			case 4:
			{
				Service s;
			
				try {
					s = new Service();
					s.ShowPlace();
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
			
			case 5:
			{
				Service s;
			
				try {
					s = new Service();
					s.ShowRoutMaster();
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
		
		}
		
	}

}
