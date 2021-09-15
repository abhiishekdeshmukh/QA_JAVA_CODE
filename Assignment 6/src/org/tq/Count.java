package org.tq;

import java.util.Scanner;

public class Count 
{
	public static void main(String[] args) 
	{
		int caps = 0, small = 0, number = 0, special = 0;
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                caps++;
            else if (ch >= 'a' && ch <= 'z')
                small++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
		System.out.println("Caps Count: " + caps);
		System.out.println("Small Count: " + small);
		System.out.println("Number Count: " + number);
		System.out.println("Special Count: " + special);
		
	}
}
