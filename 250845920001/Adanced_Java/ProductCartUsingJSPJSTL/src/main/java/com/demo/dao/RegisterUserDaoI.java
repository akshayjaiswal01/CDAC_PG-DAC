package com.demo.dao;

public interface RegisterUserDaoI {

	boolean addNewUser(String username, String password, String email, String phoneno, String address);

}
