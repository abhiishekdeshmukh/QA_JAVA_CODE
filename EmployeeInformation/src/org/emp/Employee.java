package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee 
{
	private void empName() 
	{
		System.out.println("Abhishek");
	}
	public static void main(String[] args) 
	{
		Employee em = new Employee();
		em.empName();
		
		Company co = new Company();
		co.companyName();
		
		Client cl = new Client();
		cl.clientName();
		
		Project pr = new Project();
		pr.projectName();
	}
}