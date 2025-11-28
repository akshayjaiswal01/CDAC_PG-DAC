package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.RegisterUserServiceI;
import com.demo.service.RegisterUserServiceImpl;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet("/registeruser")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phoneno = request.getParameter("phoneno");
		String address = request.getParameter("address");
		
		RegisterUserServiceI rservice = new RegisterUserServiceImpl();
		
		boolean status = rservice.addNewUser(username, password, email, phoneno, address);
		if(status)
		{
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println(" <h1> Failed to register </h1> ");
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.include(request, response);
		}
	}

}
