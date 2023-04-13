package com.dal.dao;

import com.learn.Employee;

public interface EmployeeDao {
	
	public void insertEmployee(Employee emp);
	public void showEmployee();
	public void updateEmployee(Employee emp);
	public void deleteEmployee(int eid);

}