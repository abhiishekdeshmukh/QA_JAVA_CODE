package com.tq;

import java.util.ArrayList;
import java.util.List;

public class LastIndex 
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
		
		System.out.println(li);
		int lo = li.lastIndexOf(10);
		System.out.println("Last Index value of 10 is: " + lo);
	}
}
