package com.tq;

import java.util.ArrayList;
import java.util.List;

public class Replace1 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		li.add(10);
		
		System.out.println("Initial List is: ");
		System.out.println(li);
		
		li.set(7, 90);
		System.out.println("Replacing value at 7th Index with 90: ");
		System.out.println(li);
	}
}
