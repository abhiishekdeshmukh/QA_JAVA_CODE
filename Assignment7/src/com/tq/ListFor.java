package com.tq;

import java.util.*;

public class ListFor 
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
		
		System.out.println("For loop: ");
		for (int i=0; i<li.size(); i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("Enhanced For loop: ");
		for (Integer x: li)
		{
			System.out.println(x);
		}
	}
}
