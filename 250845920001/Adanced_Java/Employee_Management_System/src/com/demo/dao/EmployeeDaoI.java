package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDaoI {

	boolean save(Employee emp);

	List<Employee> displayAll();

	Employee findById(int id);

	boolean updateSalary(int id, double salary);


	List<Employee> sortBySalary();

	boolean deleteById(int id);

}
