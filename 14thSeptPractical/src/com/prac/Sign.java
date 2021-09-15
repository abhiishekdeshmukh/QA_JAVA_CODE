package com.prac;

import java.util.Scanner;

public class Sign 
{
	public static void main(String[] args) 
	{
		int total = 0;
		System.out.println("Enter 3 Numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	    int num3 = sc.nextInt();
	    sc.close();
		
		total = (num1*num2*num3);
		System.out.println("Multiplication is " + total);
		System.out.println("Sign is "+Math.signum(total));
	}
}
