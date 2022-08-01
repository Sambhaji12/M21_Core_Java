package com.cg.JDBC_connection;
import java.sql.*;
public class JDBC_Connectivity {

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/capgimini","root","sambhaji@1998");
			Statement stmt=com.createStatement();
			System.out.println("inserting record:");
			String sql="Insert into student values(12)";
			stmt.executeUpdate(sql);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
