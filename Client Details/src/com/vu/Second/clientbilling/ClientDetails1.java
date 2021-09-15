package com.vu.Second.clientbilling;

import java.util.Scanner;

public class ClientDetails1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//nextLine - ctrl+2 L
		System.out.println("Enter your Name:");
		String nel = sc.nextLine();
		System.out.println("Your Name is: " + nel);
		
		//next 
		System.out.println("Enter your Name:");
		String ne = sc.next();
		System.out.println("Your Name is: " + ne);
		
		//nextLong
		System.out.println("Enter Phone:");
		long nl = sc.nextLong();
		System.out.println("Phone Number is" + nl);
		
		//nextFloat
		System.out.println("Enter Avg Value:");
		float nf = sc.nextFloat();
		System.out.println("Avg value is:" +  nf);
		
		//nextDouble
		System.out.println("Enter Salary:");
		double nd = sc.nextDouble();
		System.out.println("Salary is:" + nd );
		
		//nextBoolean
		System.out.println("Enter Employee Status:");
		boolean nc = sc.nextBoolean();
		System.out.println("Employee Status is: " + nc);
		sc.close();
	}
	
}
