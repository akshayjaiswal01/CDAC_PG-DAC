package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil 
{
	static Connection con = null;
	
	public static Connection getMyConnection()
	{
		if(con == null)
		{
			try 
			{
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				
				String url = "jdbc:mysql://192.168.10.117:3306/dac106?useSSL=false";
				String username = "dac106";
				String password = "welcome";
				
				con = DriverManager.getConnection(url, username, password);
				
				if(con != null)
				{
					System.out.println("Connection Established....");
				}
				else
				{
					System.out.println("Database not connected....");
				}
			} 
			catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return con;
	}
	
	public static void closeMyConnection()
	{
		if(con != null)
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
