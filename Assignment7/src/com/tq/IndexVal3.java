package com.tq;

import java.util.ArrayList;
import java.util.List;

public class IndexVal3 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		System.out.println(li);
		Integer io = li.get(2);
		System.out.println("Value at Index 2 is: " + io);
	}
}
