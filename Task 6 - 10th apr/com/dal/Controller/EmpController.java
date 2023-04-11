package com.dal.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import com.learn.Employee;

public class EmpController implements EmployeeInterface {
	Employee emp;

	List empList = new ArrayList();
	
	public void addEmp() {
		emp = new Employee();
		System.out.println("Enter eid");
		Scanner sc = new Scanner(System.in);
		int eid = sc.nextInt();
		emp.setEmpid(eid);

		System.out.println("Enter eName");
		String ename = sc.next();
		emp.setEmpName(ename);
		empList.add(emp);
		System.out.println("Employee added successfully");
	}

	public void viewEmp() {
		//System.out.println(emp);
		/*Iterator i = empList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		empList.forEach(System.out::println);
		
	}

	public void SerialEg() throws IOException {
		// TODO Auto-generated method stub
		try {

			FileOutputStream fos = new FileOutputStream("dedalus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(empList);
			System.out.println("Serilized to file dedalus.txt");
			oos.close();
			fos.close();
		} 
		catch (FileNotFoundException fnf) {
			System.out.println("No file");
		}
	}
	
	public void Deserial() throws IOException{
		
		try {
			FileInputStream fileip = new FileInputStream("dedalus.txt");
			ObjectInputStream ois = new ObjectInputStream(fileip);
			
			empList =(ArrayList)ois.readObject();
			System.out.println("Deserialize the file dedalus.txt");
			System.out.println(empList);
			ois.close();
			fileip.close();
		}
		catch(FileNotFoundException fnf )
		{
			System.out.println("file not found");
		}
		catch(ClassNotFoundException  cnf )
		{
			System.out.println("fnf");
		}
	}
	
	@Override
	public void sortByEid() {
		Collections.sort(empList);
		System.out.println("After sorting by EID");
		System.out.println(empList);
	}
 
	@Override
	public void sortByEname() {
		Collections.sort(empList, Employee.NameComparator);
		System.out.println(empList);
		
	}
}
