package org.test;

public class A1
{
	public A1()
	{
		this("JAVA");
		System.out.println("Default const...");
	}
 
	public A1(int id)
	{
		this(3456.5678f);
		System.out.println(id);
	}
	
	public A1(String name)
	{
		this(12);
		System.out.println(name);
	}
	
	public A1(float sal)
	{
		System.out.println(sal);
	}
 
	public static void main(String[] args)
	{
		A1 a = new A1();
	}
}
