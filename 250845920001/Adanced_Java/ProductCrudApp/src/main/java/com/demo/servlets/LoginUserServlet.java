package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.LoginUserServiceI;
import com.demo.service.LoginUserServiceImpl;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet("/validateuser")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginUserServiceI lservice = new LoginUserServiceImpl();
		
		MyUser user = lservice.validateUser(username, password);
		
		if(user != null)
		{
			//out.println(" <h1> Login Success </h1> ");
			HttpSession session= request.getSession();
	    	 session.setAttribute("user",user);
	    	 RequestDispatcher rd =request.getRequestDispatcher("category");
	    	 rd.forward(request, response);
		}
		else
		{
			out.println(" <h1> Invalid Credentials </h1> ");
			RequestDispatcher rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}
	}

}
