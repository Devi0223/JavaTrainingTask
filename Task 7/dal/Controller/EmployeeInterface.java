package com.dal.Controller;

import java.io.IOException;

public interface EmployeeInterface {

	public void addEmp();
	public void viewEmp() ;
	public void SerialEg() throws IOException;
	public void Deserial() throws IOException;
	public void sortByEid();
	public void sortByEname();
	public void updateEmp();
	public void deleteEmp();
}
