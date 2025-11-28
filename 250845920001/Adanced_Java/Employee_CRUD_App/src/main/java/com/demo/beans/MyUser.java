package com.demo.beans;

public class MyUser 
{
	private String username;
	private String password;
	private String email;
	private String contactno;
	
	
	public MyUser() {
		super();
	}


	public MyUser(String username, String password, String email, String contactno) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.contactno = contactno;
	}
	
	


	public MyUser(String username, String email, String contactno) {
		super();
		this.username = username;
		this.email = email;
		this.contactno = contactno;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}


	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", email=" + email + ", contactno="
				+ contactno + "]";
	}
	
	
}
