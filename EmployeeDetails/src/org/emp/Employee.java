package org.emp;

public class Employee 
{
	private void empId(int eId)
	{
		System.out.println("EmpId is: " + eId);
	}
	private void empId(String eId)
	{
		System.out.println("EmpId is: "+ eId);
	}
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.empId(101);
		emp.empId("E102");
		
	}
}
