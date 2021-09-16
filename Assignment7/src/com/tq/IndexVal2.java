package com.tq;

import java.util.ArrayList;
import java.util.List;

public class IndexVal2 
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
		
		System.out.println(li);
		int io1 = li.indexOf(10);
		System.out.println("Index value of 10 is: " + io1);
		int io2 = li.indexOf(70);
		System.out.println("Index value of 70 is: " + io2);
	}
}
