package org.test;

import java.util.Scanner;

public class EvenOdd
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		if(input%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
