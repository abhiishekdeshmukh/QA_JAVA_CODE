package com.tq;

import java.util.ArrayList;
import java.util.List;

public class Replace 
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
		
		System.out.println("Initial List is: ");
		System.out.println(li);
		
		li.set(2, 305);
		System.out.println("Replacing 300 with 305: ");
		System.out.println(li);
	}
}
