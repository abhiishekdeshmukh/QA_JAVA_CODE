package com.tq;

import java.util.ArrayList;
import java.util.List;

public class FirstIndex 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		System.out.println(li);
		int io = li.indexOf(10);
		System.out.println("First Index value of 10 is: " + io);
		
	}
}
