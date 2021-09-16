package com.tq;

import java.util.ArrayList;
import java.util.List;

public class ListInsert 
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
		System.out.println("Inserting 50 at Index 2 ");
		li.add(2, 50);
		System.out.println(li);
		
		System.out.println("Inserting 70 at the end of list:");
		int size1 = li.size();
		li.add(size1, 70);
		System.out.println(li);
	}
}
