/*	Manage Vehicle License Database with following table
Licence Type
	licenceid (INT), type (VARCHAR)
Person
	personid (INT), person_name (VARCHAR), address (VARCHAR), city (VARCHAR), contactno (VARCHAR),fklicenceid (INT)
Write a Java Program to connect database and prompt Connection
Succeed or Error Message.
Define Switch Case as follow,
1. Add New Licence Type
2. Add New Person
Store Licence Types , Person Details.*/

package com.savari;

import java.sql.SQLException;
import java.util.Scanner;

import com.savari.entity.Licence;
import com.savari.entity.Person;
import com.savari.entity.UserService;

public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select any one option : \n1. Add new licence type \n2. Add new Person");
		int choice = scan.nextInt();
		
		addData(choice);	

	}

	private static void addData(int choice) {
		switch(choice)
		{
			case 1 :
			{
				Person obj1 = new Person(9,"Martin","25 Street", "Washim",987456320,4);
			
				try {
					UserService person = new UserService();
					person.savePerson(obj1);
				} 
				catch (Exception e) {
					System.out.println("Exception is " + e);
				}
				break;
			}
		
			case 2:
			{
				Licence obj2 = new Licence(8,"Taxi");
				
				UserService licence;
				try {
					licence = new UserService();
					licence.saveLicence(obj2);
				} 
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
	}

}
