package com.vu.first.login;

public class CourseDetails 
{
	private void javaCourse() 
	{
		System.out.println("Java");
	}
	public void oracleCourse() 
	{
		System.out.println("Oracle");
	}
	private void seleniumCourse() 
	{
		System.out.println("Selenium");
	}
	
	public static void main(String[] args) 
	{
		//Create an object --ClassName objName = New ClassName();  -- Heap Memory
		CourseDetails courseDetails = new CourseDetails();
		
		//Call the methods -- objName.ClassName();
		courseDetails.javaCourse();
		courseDetails.oracleCourse();
		courseDetails.seleniumCourse();
	}
}
