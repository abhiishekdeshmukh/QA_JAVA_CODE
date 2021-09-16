package com.tq;

import java.util.*;

public class Q3 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		
		//To add values to the list
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(90);
		
		int len = li.size();
		System.out.println(li);
		System.out.println("Length of List is: " + len);
		
	}
}
