package org.tq;

import java.util.Scanner;

public class StringEqual 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Two Strings: ");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		sc.close();
		
		boolean eq = input1.equals(input2);
		System.out.println(eq);
	}
}
