package com.demo.service;

import com.demo.dao.RegisterUserDaoI;
import com.demo.dao.RegisterUserDaoImpl;

public class RegisterUserServiceImpl implements RegisterUserServiceI 
{

	private RegisterUserDaoI rdao;
	
	public RegisterUserServiceImpl()
	{
		rdao = new RegisterUserDaoImpl();
	}
	
	@Override
	public boolean addNewUser(String username, String password, String email, String phoneno, String address) 
	{
		
		return rdao.addNewUser( username,  password,  email,  phoneno,  address);
	}

}
