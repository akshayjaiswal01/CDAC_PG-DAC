package com.demo.servelets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.LoginUserServiceI;
import com.demo.service.LoginUserServiceImpl;

public class LoginUserServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginUserServiceI loginService = new LoginUserServiceImpl();
		
		MyUser user = loginService.validateUser(username, password);
		
		if(user != null)
		{
			//out.println("<h1> valid Credentials </h1>");
			
			RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.html");
 			rd.forward(request, response);
		}
		
		else
		{
			out.println("<h1> Invalid Credentials </h1>");
			
//			RequestDispatcher rd = request.getRequestDispatcher("login.html");
//			rd.include(request, response);
		}
		
	}
}
