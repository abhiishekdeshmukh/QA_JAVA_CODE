package org.test;

import java.util.Scanner;

public class Vote 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}
