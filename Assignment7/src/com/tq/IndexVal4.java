package com.tq;

import java.util.ArrayList;
import java.util.List;

public class IndexVal4 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		Integer io = li.get(4);
		System.out.println("Value at Index 4 is: " + io);
	}
}
