package com.tq;

import java.util.ArrayList;
import java.util.List;

public class LastRemove 
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
		System.out.println(li);
		
		int lo = li.lastIndexOf(10);
		li.remove(lo);
		
		System.out.println(li);
	}
}