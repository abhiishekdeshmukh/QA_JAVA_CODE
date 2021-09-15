package org.tq;

import java.util.Scanner;

public class Gmail 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Email: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		boolean co = input.contains("gmail");
		if(co==true)
		{
			String rep = input.replace("gmail","yahoo");
			System.out.println(rep);
		}
		else
		{
			System.out.println(input);
		}
	}
}
