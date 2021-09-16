package com.tq;

import java.util.Scanner;

public class Q1 
{
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		int sum = 0;
		System.out.println("Enter 10 Numbers: ");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

	
}
