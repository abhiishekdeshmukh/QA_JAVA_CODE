package com.vu.first.billing;

import com.vu.first.login.*;
import com.vu.first.login.EmployeeDetails;

public class ClientDetails 
{
	private void clientName() 
	{
		System.out.println("Air Canada");

	}
	private void clientLocation() 
	{
		System.out.println("Canada");

	}
	public static void main(String[] args) 
	{
		ClientDetails cd = new ClientDetails();
		cd.clientName();
		cd.clientLocation();
		
		CourseDetails coo = new CourseDetails();
		coo.oracleCourse();
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.empLocation();
	}
}
