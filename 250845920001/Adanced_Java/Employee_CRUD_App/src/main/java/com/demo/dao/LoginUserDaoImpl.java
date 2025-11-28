package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginUserDaoImpl implements LoginUserDaoI 
{
	private static Connection conn;
	
	private static PreparedStatement selectuser;
	
	static 
	{
		conn = DBUtil.getMyConnection();
		
		try 
		{
			selectuser = conn.prepareStatement("select username, email, contactno from users where username=? and password=?");
			
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public MyUser validateUser(String username, String password) 
	{
		try 
		{
			selectuser.setString(1, username);
			selectuser.setString(2, password);
			
			ResultSet rs = selectuser.executeQuery();
			
			MyUser user = new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
			
			return user;
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
