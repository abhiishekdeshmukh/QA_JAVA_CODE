package org.test;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String[] args) 
	{
		int temp, total=0, oinput=0;
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		oinput = input;
		
		while(input!= 0)
		{
			temp = input % 10;
			input = input / 10;
			total = total + (temp*temp*temp);
		}
		sc.close();
		
		if(total==oinput)
		{
			System.out.println(+oinput+ " is an ArmStrong Number");
		}
		else
		{
			System.out.println(+oinput+ " is not an ArmStrong Number");
		}
	}
}
