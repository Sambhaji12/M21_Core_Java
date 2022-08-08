package com.cg.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static void main(String[] args) throws SQLException
	{
		String dbURL="jdbc:mysql://localhost:3306/cg";
		String dbUsername="root";
		String dbPassword="sambhaji@1998";
		try
		{
			// to checked the eclipse connected to my sql or not 
		Connection connection=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
		if(connection !=null)
		{
			System.out.println("connection get established:");
			connection.close();//to close connection
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}



