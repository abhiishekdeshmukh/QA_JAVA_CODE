package com.tq;

import java.util.ArrayList;
import java.util.List;

public class ListCommon1 
{
	public static void main(String[] args) 
	{
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		li2.add(8000);
		
		System.out.println("List 1: ");
		System.out.println(li);
		
		System.out.println("List 2: ");
		System.out.println(li2);
		
		li.retainAll(li2);
		System.out.println("Common values are: ");
		System.out.println(li);
	}
}
