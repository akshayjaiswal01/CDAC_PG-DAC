package com.demo.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDaoI;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeServiceI 
{

	private EmployeeDaoI edao;
	
	public EmployeeServiceImpl()
	{
		this.edao = new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addEmployee() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int eid = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Employee Name: ");
		String ename = sc.next();
		
		sc.nextLine();
		System.out.println("Enter Job: ");
		String job = sc.nextLine();
		
		System.out.println("Enter Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter Joining Date (dd/MM/yyyy) : ");
		String jdt = sc.next();
		
		LocalDate ldt = LocalDate.parse(jdt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Date sqldate = Date.valueOf(ldt);
		
		Employee emp = new Employee(eid, ename, job, salary, sqldate);
		
		return edao.save(emp);
	}

	@Override
	public List<Employee> displayAll() 
	{
		return edao.displayAll();
		
	}

	@Override
	public Employee findById(int id) 
	{
		return edao.findById(id);
	}

	@Override
	public boolean updateSalary(int id, double salary) 
	{
		return edao.updateSalary(id, salary);
	}

	@Override
	public List<Employee> sortBySalary() 
	{
		
		return edao.sortBySalary();
	}

	@Override
	public boolean deleteById(int id) 
	{
		
		return edao.deleteById(id);
	}


}
