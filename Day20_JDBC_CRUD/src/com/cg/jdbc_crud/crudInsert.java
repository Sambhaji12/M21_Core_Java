package com.cg.jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class crudInsert 
{
	public static void main (String a[]) throws SQLException
	{
	String dbURL="jdbc:mysql://localhost:3306/capgimini";
	String dbUsername="root";
	String dbPassword="sambhaji@1998";
	try
	{
		Connection connection=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		String query="INSERT INTO emp(ID,NAME,EMAIL_ID,PASSWORD)VALUES (103,'ram', 'ram@gmail.com','ram123')";
		PreparedStatement p=connection.prepareStatement(query);
	
		
		int r=p.executeUpdate(query);
	
			if(r>0)
				{
				System.out.println("new user is inserted :");
			
				}
			connection.close();
	}
		catch(SQLException se)
		{
		se.printStackTrace();
		
		}
	
	}
	
}
