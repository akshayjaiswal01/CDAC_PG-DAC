package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterUserDaoImpl implements RegisterUserDaoI 
{
	static Connection con = null;
	
	static 
	{
		con = DBUtil.getMyConnection();
	}

	@Override
	public boolean addNewUser(String username, String password, String email, String phoneno, String address) 
	{
		try 
		{
			PreparedStatement insertuser = con.prepareStatement("insert into user values(?,?,?,?,?)");
			
			insertuser.setString(1, username);
			insertuser.setString(2, password);
			insertuser.setString(3, email);
			insertuser.setString(4, phoneno);
			insertuser.setString(5, address);
			
			int n = insertuser.executeUpdate();
			
			return n>0;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
