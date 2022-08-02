package com.cg.JDBC_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class SecondExample 
{

	public static void main(String[] args) throws SQLException
	{
		// to connect with mysql server used the url
		String driver="com.mysql.cj.jdbc.Driver";
		String dbURL="jdbc:mysql://localhost:3306/cg";
		String dbUsername="root";
		String dbPassword="sambhaji@1998";
		String str="SELECT * FROM student1";
		
		
		try
		{
			Class.forName(driver);
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
		Connection com=DriverManager.getConnection(dbURL ,dbUsername,dbPassword);
		Statement st=com.createStatement();
		ResultSet rs=st.executeQuery(str);
		while(rs.next())
		{
			String s="";
			
			for(int i=1;i<=2;i++)
			{
				s=s+" "+rs.getString(i);
			}
			System.out.println(s);
		}
		}catch(SQLException e)
		{
			System.out.println(e);
			
		}
	}

}
