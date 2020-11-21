/*Manage Library Records with following requirements
1. Create Book Category
2. Create Auther
3. Add Book
4. Show Book Details

Database Tables
BookCategory
	Categoryid(INT), catagoryName (VARCHAR)
Auther
	Autherid (INT), auther_name (VARCHAR), qualification(VARCHAR)
BookMaster
	Bookid(INT), record_date(DATE), bookname(VARCHAR), fkcatagotyid(INT),fkauther_id(INT), price(DECIMAL)
Define Switch Case in Java and perform above Database Operations.
 */

package com.savari;

import java.sql.SQLException;
import java.util.Scanner;

import com.savari.entity.Auther;
import com.savari.entity.BookCategory;
import com.savari.entity.BookMaster;
import com.savari.entity.Service;


public class MainApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select any one option\n1.Create Book Category\n2.Create Auther\n3.Add Book\n4.Show book details");
		int choice = scan.nextInt();
		
		switchCase(choice);

	}

	private static void switchCase(int choice) {
		switch(choice)
		{
			case 1:
			{
				BookCategory obj1 = new BookCategory(8,"Language");
				
				try {
					Service category = new Service();
					category.saveBookCategory(obj1);
				} 
				catch (Exception e) {
					System.out.println("Exception is " + e);
				}
				break;
			}
			
			case 2:
			{
				Auther obj2 = new Auther(9,"Caprio","Masters");
				
				try {
					Service auther = new Service();
					auther.saveAuther(obj2);
				} 
				catch (Exception e) {
					System.out.println("Exception is " + e);
				}
				break;
			}
			
			case 3:
			{
				BookMaster obj3 = new BookMaster(12,"2020/03/25","WWW",1,5,99.25f);
				
				try {
					Service auther = new Service();
					auther.saveBookMaster(obj3);
				} 
				catch (Exception e) {
					System.out.println("Exception is " + e);
				}
				break;
			}
			
			case 4:
			{
				Service s;
				try {
					s = new Service();
					s.showBook();
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
				
				break;
			}
		}
	}
}
