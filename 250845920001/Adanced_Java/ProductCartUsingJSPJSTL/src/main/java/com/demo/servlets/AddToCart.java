package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		MyUser user = (MyUser) session.getAttribute("user");
		System.out.println();
		
		if(user != null && user.getUsername().equals("jay1"))
		{
			int pid = Integer.parseInt(request.getParameter("pid"));
			String pname = request.getParameter("pname");
			double price = Double.parseDouble(request.getParameter("price"));
			int qty = Integer.parseInt(request.getParameter("qty"));
			
			Set<Product> cart = (Set<Product>) session.getAttribute("cart");
			
			if(cart == null)
			{
				cart = new HashSet<>();
			}
			
			Product p = new Product(pid, pname, price, qty);
			
			
			boolean status = cart.add(p);
			session.setAttribute("cart", cart);
			 cart.stream().forEach(System.out::println);
			 RequestDispatcher rd=request.getRequestDispatcher("showproduct");
			 rd.forward(request, response);
		}
		else 
		{
			out.print("<h1>Invalid credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
		}

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}

}
