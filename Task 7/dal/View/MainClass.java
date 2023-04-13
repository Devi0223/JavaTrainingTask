package com.dal.View;

import com.dal.Controller.EmpController;
import com.dal.Controller.EmployeeInterface;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.function.Predicate;

import com.dal.exception.UserNtFoundException;


public class MainClass {

	public static void main(String[] args) throws IOException {

		try {
			String userName = null;
			String pwd = null;

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

		//	Predicate<User> auth= u->u.userName.equals("devi") && u.pwd.equals("password");
			 
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Username: ");
			userName = br.readLine();

			System.out.println("Enter Password: ");
			pwd = br.readLine();
			
			User user=new User(userName,pwd);
	        
			/*if(auth.test(user))
			{
				System.out.println("Welcome " + userName);
	        }
	        else
	        {
	         System.out.println("Invalid user");	
			}
			*/
			
			if (userName.equals("devi") && pwd.equals("password")) {
				System.out.println("Welcome " + userName);
			} else {
				throw new UserNtFoundException();
			}

			System.out.println("Welcome");
			EmployeeInterface ec = new EmpController();

			
			String choice = null;

			do {
				System.out.println("Enter your choice");
				System.out.println("1.Add Employee");
				System.out.println("2. View Employee ");
				System.out.println("3. serialize ");
				System.out.println("4. Deserialize ");
				System.out.println("5. sortbyID ");
				System.out.println("6. sortbyName ");
				System.out.println("7. update employee");
				System.out.println("8. Delete Employee");
				int sch = sc.nextInt();
				switch (sch) {
				case 1: {
					ec.addEmp();
					break;
				}
				case 2: {
					ec.viewEmp();
					break;
				}
				case 3: {
					ec.SerialEg();
					break;
				}
				case 4: {
					ec.Deserial();
					break;
				}
				case 5: {
					ec.sortByEid();
					break;
				}
				case 6: {
					ec.sortByEname();
					break;
				}
				case 7: {
					ec.updateEmp();
					break;
				}
				case 8: {
					ec.deleteEmp();
					break;
				}
				default: {
					System.out.println("Enter your choice");
					break;
				}
				}
				System.out.println("Do you want to continue Y or y");
				choice = sc.next();
			} while (choice.equals("Y") || choice.equals("y"));

			System.out.println("Exited");
			System.exit(0);

		}
		catch (UserNtFoundException unf) {
			System.out.println(unf);
		}

	}
	

	static class User {
		String userName;
		String pwd;

		User(String userName, String pwd) {
			this.userName = userName;
			this.pwd = pwd;
		}
	}

}
