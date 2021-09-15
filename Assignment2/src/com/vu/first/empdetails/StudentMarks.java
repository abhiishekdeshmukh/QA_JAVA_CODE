package com.vu.first.empdetails;
import java.util.Scanner;
public class StudentMarks
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID:");
		int studentId = sc.nextInt();
		System.out.println("Student ID is: "+ studentId);
		
		System.out.println("Enter Student Name:");
		String studentName = sc.next();
		System.out.println("Student Name is: "+ studentName);
		
		System.out.println("Enter Marks for English: ");
		int mark1 = sc.nextInt();
		
		System.out.println("Enter Marks for Maths: ");
		int mark2 = sc.nextInt();
		
		System.out.println("Enter Marks for Science: ");
		int mark3 = sc.nextInt();
		
		System.out.println("Enter Marks for History:");
		int mark4 = sc.nextInt();
		
		System.out.println("Enter Marks for Geography: ");
		int mark5 = sc.nextInt();
		
		int total = (mark1 + mark2 + mark3 + mark4 + mark5);
		System.out.println("Total marks are: " + total);
		
		int average = (total/5);
		System.out.println("Average Marks are: " + average);
		
		sc.close();
			
		}
		
}
