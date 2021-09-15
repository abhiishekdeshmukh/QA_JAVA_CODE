package org.tq;

import java.util.Scanner;

public class StrEquality
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Two Strings: ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		sc.close();

		boolean eq = input1.equalsIgnoreCase(input2);
		if(eq==true)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("False");
		}		
	}
}
