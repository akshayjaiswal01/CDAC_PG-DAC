package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;
import com.demo.service.ProductServiceI;
import com.demo.service.ProductServiceImpl;

/**
 * Servlet implementation class ShowProductServlet
 */
@WebServlet("/showproduct")
public class ShowProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		
		MyUser user=(MyUser) session.getAttribute("user");
		//out.println("Hello");
		System.out.println(user);
		
		if(user != null && user.getUsername().equals("jay1"))
		{
			ProductServiceI pservice = new ProductServiceImpl();
			List<Product> plist = pservice.getAllProducts();
			request.setAttribute("plist", plist);
			RequestDispatcher rd = request.getRequestDispatcher("showproduct.jsp");
			rd.forward(request, response);
		}
		else
		{
			out.println("<h2> Invalid Credentials <h/2>");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.include(request, response);
		}
		
	}

}
