package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDaoI 
{
	static Connection con = null;
	
	static
	{
		con = DBUtil.getMyConnection();
	}

	@Override
	public List<Product> getAllProducts() 
	{
		List<Product> plist = new ArrayList<>();
		
		try 
		{
			PreparedStatement selectprod = con.prepareStatement("select * from product1");
			
			ResultSet rs = selectprod.executeQuery();
			
			while(rs.next())
			{
				plist.add(new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDate(5).toLocalDate(), rs.getInt(6)) );
			}
			return plist;
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		return null;
	}
	
}
