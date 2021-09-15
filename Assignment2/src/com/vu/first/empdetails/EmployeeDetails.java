package com.vu.first.empdetails;

import java.util.Scanner;

public class EmployeeDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Emp ID:");
		int empId = sc.nextInt();
		System.out.println("Emp ID is: "+ empId );
		
		System.out.println("Enter Name:");
		String empName = sc.next();
		System.out.println("Name is: "+ empName );
		
		System.out.println("Enter Email ID:");
		String empEmail = sc.next();
		System.out.println("Email ID is: "+ empEmail );
		
		System.out.println("Enter Phone No:");
		long empPhone = sc.nextLong();
		System.out.println("Phone Number is: "+ empPhone );
		
		System.out.println("Enter Salary:");
		double empSalary = sc.nextDouble();
		System.out.println("Salary is "+ empSalary );
		
		System.out.println("Enter Gender");
		String empGender = sc.next();
		System.out.println("Gender is "+ empGender );
		
		System.out.println("Enter City:");
		String empCity = sc.next();
		System.out.println("City is "+ empCity );
		
		sc.close();
		
	}
	
}
