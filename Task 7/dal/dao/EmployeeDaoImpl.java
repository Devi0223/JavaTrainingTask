package com.dal.dao;

import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.dal.helper.MyDBConnection;
import com.learn.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	@Override
	public void insertEmployee(Employee emp) {
	     
		try {
			con  = MyDBConnection.getDBConnection();
			ps=con.prepareStatement("insert into dalemp values(?,?)");
			
			ps.setInt(1, emp.getEmpid());
			ps.setString(2, emp.getEmpName());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDBConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from dalemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));				
			}			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
		con  = MyDBConnection.getDBConnection();
		try {
			String q = null;
			int eid = emp.getEmpid();
			String empname = null;
			stmt = con.createStatement();
			q = "Select * from dalemp where empid='" + eid + "'";
			rs = stmt.executeQuery(q);
			if (rs.next()) 
			{
				System.out.println("Selected employee details: " + rs.getInt(1) + " -- " + rs.getString(2));

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name to be updated");
				empname= sc.nextLine();
				
				q = "UPDATE dalemp " + "SET empname = '" + empname + " ' " + "WHERE empid = '" + eid + "'";
				stmt.executeUpdate(q);
				System.out.println("Employee Id - " + eid + " record got updated in DB...");
			} else {
				System.out.println("Record not found");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}

	@Override
	public void deleteEmployee(int eid) {
		con = MyDBConnection.getDBConnection();
		try {

			String q = null;

			stmt = con.createStatement();
			q = "Select * from dalemp where empid='" + eid + "'";
			rs = stmt.executeQuery(q);

			if (rs.next()) {
				System.out.println("Employee id:" + rs.getString(1));
				System.out.println("Do you want to delete the record? Y/N");
				Scanner sc = new Scanner(System.in);

				String choice = sc.nextLine();

				if (choice.equalsIgnoreCase("Y")) {
					q = "delete from dalemp where empid='" + eid + "'";
					stmt.executeUpdate(q);
					System.out.println("Employee Id - " + eid + " record got deleted from DB...");
				}
				System.out.println("");

			} else {
				System.out.println("Record not found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}