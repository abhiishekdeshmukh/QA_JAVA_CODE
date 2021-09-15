package org.tq;

import java.util.Scanner;

public class Vowels 
{
	public static void main(String[] args) 
	{
		int con=0,vowel=0;
		System.out.println("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		sc.close();
		ip = ip.toLowerCase();
		
		for(int i = 0; i < ip.length(); i++)
		{
			char ch = ip.charAt(i);
			if(ch =='a'||ch =='e'||ch == 'i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
			else if((ch >='a' && ch <= 'z'))
			{
				con++;
			}
		}
		System.out.println("Consonant: " + con);
		System.out.println("Vowels: " + vowel);
		
	}
}