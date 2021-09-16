package com.tq;

import java.util.ArrayList;
import java.util.List;

public class IndexVal 
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
		int io = li.indexOf(50);
		System.out.println("Index value of 10 is: " + io);
		
		int io1 = li.indexOf(90);
		System.out.println("Index value of 90 is: " + io1);
	}
}
