package org.tq;

import java.util.Scanner;

public class Email 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Email ID: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		boolean boo = input.contains("@");
		if(boo == true)
		{
			System.out.println("Email ID is valid");
		}
		else
		{
			System.out.println("Email ID is not valid");
		}
	}
}
