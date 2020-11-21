package com.savari.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.savari.config.DbConfig;

public class UserService {
	private Connection conn;
	
	public UserService() throws ClassNotFoundException, SQLException
	{
		conn = DbConfig.connectMySQL();
	}
	
	public void savePerson(Person user) throws SQLException
	{
		String query = String.format("INSERT INTO person(personid, person_name, address,city ,contactno, fklicenceid)VALUES(%d,'%s','%s','%s',%d,'%s')",
				user.getPersonid(),user.getPerson_name(),user.getAddress(),user.getCity(),user.getContactno(),user.getFklicenceid());
		
		Statement stmt = (Statement) conn.createStatement();
		stmt.execute(query);
		
		System.out.println("Save Successfully");
	}
	
	public void saveLicence(Licence user) throws SQLException
	{
		String query = String.format("INSERT INTO licence ( licenceid, licenceType) VALUES (%d, '%s')",
				user.getLicenceid(),user.getLicenceType());
		
		Statement stmt = (Statement) conn.createStatement();
		stmt.execute(query);
		System.out.println("Saved Successfully");
	}
	
}
