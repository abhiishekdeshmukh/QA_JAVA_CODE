package org.tq;

import java.util.Scanner;

public class ReplaceSpace 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		String rep = input.replace(" ","#");
		System.out.println(rep);
	}
}
