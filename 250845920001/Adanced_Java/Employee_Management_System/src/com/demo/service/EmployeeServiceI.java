package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServiceI {

	boolean addEmployee();

	List<Employee> displayAll();

	Employee findById(int id);

	boolean updateSalary(int id, double salary);

	List<Employee> sortBySalary();

	boolean deleteById(int id);

}
