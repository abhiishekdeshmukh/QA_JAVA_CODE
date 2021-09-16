package com.tq;

import java.util.*;
public class Q4LinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		int len = li.size();
		System.out.println(li);
		System.out.println("Length of List is: " + len);
	}
}
