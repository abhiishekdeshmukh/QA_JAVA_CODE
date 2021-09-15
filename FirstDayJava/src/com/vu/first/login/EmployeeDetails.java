package com.vu.first.login;

public class EmployeeDetails 
{
	private void empName() 
	{
		System.out.println("Abhi");

	}
	private void empId() 
	{
		System.out.println(707);

	}
	public void empLocation() 
	{
		System.out.println("USA");

	}
public static void main(String[] args) 
{
	EmployeeDetails emp = new EmployeeDetails();
	emp.empName();
	emp.empId();
	emp.empLocation();
	
	CourseDetails co = new CourseDetails();
	co.oracleCourse();
}
}
