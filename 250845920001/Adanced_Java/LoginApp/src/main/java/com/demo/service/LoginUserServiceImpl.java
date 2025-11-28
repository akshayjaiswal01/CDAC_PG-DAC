package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginUserDaoI;
import com.demo.dao.LoginUserDaoImpl;

public class LoginUserServiceImpl implements LoginUserServiceI 
{
	private LoginUserDaoI ldao;
	
	public LoginUserServiceImpl()
	{
		ldao = new LoginUserDaoImpl();
	}
	@Override
	public MyUser validateUser(String username, String password) 
	{
		return ldao.validateUser(username, password);
	}

}
