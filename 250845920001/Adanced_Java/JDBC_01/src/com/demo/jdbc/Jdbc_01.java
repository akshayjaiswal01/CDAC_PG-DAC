package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Jdbc_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Connection con = null;
		try 
		{
			
			// step 1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			
			// step 2
			String url = "jdbc:mysql://192.168.10.117:3306/dac106?useSSL=false";
			
			String username = "dac106";
			
			String password = "welcome";
			
			con = DriverManager.getConnection(url, username, password);
			
			if(con != null)
			{
				System.out.println("Connection done");
			}
			else
			{
				System.out.println("Connection not done");
			}
			
			// step 3
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from emp limit 5");
			
			while(rs.next())
			{
				System.out.println("Employee ID: "+ rs.getInt(1));
				System.out.println("Employee Name: "+ rs.getString(2));
				System.out.println("Job: "+rs.getString(3));
				System.out.println("Manager: "+rs.getString(4));
				System.out.println("Hiredate: "+rs.getDate(5));
				System.out.println("Salary: "+rs.getDouble(6));
				
				System.out.println("--------------------------------------------");
			}
			
			
			System.out.println("Enter Employee No: ");
			int empno = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Employee Name: ");
			String ename = sc.next();
			
			System.out.println("Enter Job: ");
			String job = sc.next();
			
			sc.nextLine();
			System.out.println("MGR Code: ");
			int mgrcode = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Enter Hiredate (dd/mm/yyyy): ");
			String hiredate = sc.next();
			
			LocalDate ldt = LocalDate.parse(hiredate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.println("Enter Salary: ");
			double salary = sc.nextDouble();
			
			System.out.println("Enter Deptarment no: ");
			int deptno = sc.nextInt();
			
			String sqlquery = "insert into emp1 (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, DEPTNO) values (" 
								+empno+",'"+ename+"','"+job+"',"+mgrcode+",'"+ldt+"',"+salary+","+deptno+")";
			
			System.out.println(sqlquery);
			
			int n = stmt.executeUpdate(sqlquery);
			
			if(n > 0)
			{
				System.out.println("Insertion done");
			}
			else
			{
				System.out.println("Error");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
