package com.prac;

import java.util.Scanner;

public class Digits 
{
	public static void main(String[] args) 
	{
		int temp = 0;
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		
		while(input!=0)
		{
			input = input / 10;
			temp++;
		}
		System.out.println("Number of Digits are: " +temp);
	}
}
