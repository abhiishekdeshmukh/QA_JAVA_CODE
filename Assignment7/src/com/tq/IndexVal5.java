package com.tq;

import java.util.ArrayList;
import java.util.List;

public class IndexVal5 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		System.out.println(li);
		Integer io = li.get(8);
		System.out.println("Value at Index 8 is: " + io);
	}
}
