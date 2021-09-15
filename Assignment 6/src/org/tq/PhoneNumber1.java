package org.tq;

import java.util.Scanner;

public class PhoneNumber1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Phone Number: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		int len = input.length();
		if(len == 10)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	
	}
}
