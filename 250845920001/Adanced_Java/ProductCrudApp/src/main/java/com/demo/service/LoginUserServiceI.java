package com.demo.service;

import com.demo.beans.MyUser;

public interface LoginUserServiceI {

	MyUser validateUser(String username, String password);

}
