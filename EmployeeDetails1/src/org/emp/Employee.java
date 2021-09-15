package org.emp;

public class Employee 
{
	private void empId() 
	{
		System.out.println(101);
	}
	private void empName() 
	{
		System.out.println("Abhi");
	}
	private void empDob() 
	{
		System.out.println("29-06-1997");
	}
	private void empPhone() 
	{
		System.out.println("7020869957");
	}
	private void empEmail() 
	{
		System.out.println("abhi@gmail.com");
	}
	private void empAddress() 
	{
		System.out.println("Pune");

	}
	
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}
}
