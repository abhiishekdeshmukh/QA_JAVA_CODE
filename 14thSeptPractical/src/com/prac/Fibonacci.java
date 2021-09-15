package com.prac;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int num1 = 0, num2 = 1, num3, i;
		System.out.println("Fibonacci Series from 1 to 100 is: ");
		System.out.println(num1);
		System.out.println(num2);
		
		for(i=2; i<=100; i++)
		{
			num3 = (num1 + num2);
			System.out.println(+num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
