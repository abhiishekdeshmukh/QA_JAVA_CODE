package org.tq;

import java.util.Scanner;

public class ReplaceVowels 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
	    input = input.replaceAll("[AaEeIiOoUu]", "@");
	    System.out.println(input);
	}
}
