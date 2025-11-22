package com.demo.beans;

public class MyUser 
{
	private String username;
	private String password;
	private String email;
	private String phoneno;
	private String address;
	
	
	public MyUser() {
		super();
	}


	public MyUser(String username, String password, String email, String phoneno, String address) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
	}


	public MyUser(String username, String email, String phoneno, String address) {
		super();
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		this.address = address;
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


	public String getPhoneno() {
		return phoneno;
	}


	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "MyUser [username=" + username + ", password=" + password + ", email=" + email + ", phoneno=" + phoneno
				+ ", address=" + address + "]";
	}
	
	
}
