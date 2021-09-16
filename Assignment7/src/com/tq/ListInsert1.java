package com.tq;

import java.util.ArrayList;
import java.util.List;

public class ListInsert1 
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
		
		System.out.println("Initial list is: ");
		System.out.println(li);
		li.add(8, 80);
		System.out.println("Inserting 80 at 8th Index: ");
		System.out.println(li);
	}
}
