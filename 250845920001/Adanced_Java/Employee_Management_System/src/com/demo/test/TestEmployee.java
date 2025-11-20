package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeServiceI;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int choice;
		EmployeeServiceI eservice = new EmployeeServiceImpl();
		
		do
		{
			System.out.println("1. Add new Employee \n"
							 + "2. Delete Employee By ID \n"
							 + "3. Update Salary \n"
							 + "4. Find By ID \n"
							 + "5. Display All \n"
							 + "6. Sort By Salary \n"
							 + "7. Exit");
			
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice)
			{
				case 1->
				{
					boolean status = eservice.addEmployee();
					if(status)
					{
						System.out.println("Employee added successfully....");
					}
					else
					{
						System.out.println("Failed to add!!!");
					}
				}
				
				case 2->
				{
					System.out.println("Enter Employee ID to delete: ");
					int id = sc.nextInt();
					
					boolean status = eservice.deleteById(id);
					if(status)
					{
						System.out.println("Employee deleted successfully");
					}
					else
					{
						System.out.println("Failed to delete");
					}
				}
				
				case 3->
				{
					System.out.println("Enter Employee ID to update: ");
					int id = sc.nextInt();
					
					System.out.println("Enter Updated Salary: ");
					double salary = sc.nextDouble();
					
					boolean status = eservice.updateSalary(id, salary);
					if(status)
					{
						System.out.println("Salary updated successfully");
					}
					else
					{
						System.out.println("Not found");
					}
				}
				
				case 4->
				{
					System.out.println("Enter Employee ID to search: ");
					int id = sc.nextInt();
					
					Employee emp = eservice.findById(id);
					
					if(emp != null)
					{
						System.out.println(emp);
					}
					else
					{
						System.out.println("Employee Not Found");
					}
				}
				
				case 5->
				{
					List<Employee> elist = eservice.displayAll();
					elist.forEach(System.out::println);
				}
				
				case 6 ->
				{
					List<Employee> elist = eservice.sortBySalary();
					elist.forEach(System.out::println);
				}
				
				case 7 ->
				{
					System.exit(0);
				}
			}
		}
		while(choice != 7);

	}

}
