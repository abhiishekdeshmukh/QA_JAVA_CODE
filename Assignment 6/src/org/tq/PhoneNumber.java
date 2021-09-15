package org.tq;

import java.util.Scanner;

public class PhoneNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Phone Number: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		boolean boo = input.contains("abcdefghijklmnopqrstuvwxyz");
		System.out.println(boo);	
	}
}
