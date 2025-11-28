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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/validateuser")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		LoginUserServiceI lservice=new LoginUserServiceImpl();
		MyUser user=lservice.validateUser(uname,pass);
		//user is valid
		System.out.println(user);
		if(user!=null) {
			//save user object in session
			HttpSession session=request.getSession();
			session.setAttribute("user", user);
			RequestDispatcher rd=request.getRequestDispatcher("showproduct");
			rd.forward(request, response);
		}else {
			//if user is invalid
			out.print("<h1>Invalid</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
			
		}
		
	}
	

}
