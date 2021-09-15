package org.test;

import java.util.Scanner;

public class Prime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Number: ");
		Scanner sc= new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2 ==0)
		{
			System.out.println(+input +" is not a Prime Number");
		}
		else
		{
			System.out.println(+input+ " is a Prime Number");
		}
		sc.close();
	}
}
