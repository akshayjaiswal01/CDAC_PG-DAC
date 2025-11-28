package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class LoginUserDaoImpl implements LoginUserDaoI 
{
static Connection con = null;
	
	static
	{
		con = DBUtil.getMyConnection();
	}
	@Override
	public MyUser validateUser(String username, String password) 
	{
		try 
		{
			PreparedStatement selectuser = con.prepareStatement("select * from user where username=? and password=?");
			
			selectuser.setString(1, username);
			selectuser.setString(2, password);
			MyUser user=null;
			ResultSet rs = selectuser.executeQuery();
			
			if(rs.next())
			{
				user = new MyUser(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
			}
			return user;
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		return null;
	}

}
