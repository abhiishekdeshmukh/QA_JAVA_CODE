package org.tq;

import java.util.Scanner;

public class Email1 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Email ID: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		boolean boo = input.contains("@");
		System.out.println(boo);
	}
}
