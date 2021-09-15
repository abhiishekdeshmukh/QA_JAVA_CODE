package org.test;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args) 
	{
		int fact=1;
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=input; i++)
		{
			fact = (fact*i);
		}
		System.out.println(fact);
	}
}
