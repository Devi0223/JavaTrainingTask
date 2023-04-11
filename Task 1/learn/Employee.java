package com.learn;

import java.io.*;
import java.util.Comparator;

public class Employee implements Serializable,Comparable<Employee>{

	private int empid;
	private String EmpName;

	public Employee() {
		System.out.println("From Employee Constructor");
	}

	public Employee(int eno, String ename) {
		this.empid = eno;
		this.EmpName = ename;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", EmpName=" + EmpName + "]";
	}

	@Override
	public int compareTo(Employee em) {
		return this.empid - em.empid;
	}

	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			//return e1.getEid() -e2.getEid();
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
	};

}
