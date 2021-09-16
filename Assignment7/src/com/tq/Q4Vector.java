package com.tq;
import java.util.*;

public class Q4Vector 
{
	public static void main(String[] args) 
	{
		List<Integer> v1 = new Vector<Integer>();
		v1.add(105);
		v1.add(205);
		v1.add(305);
		v1.add(405);
		v1.add(505);
		v1.add(605);
		v1.add(705);
		v1.add(805);
		
		int len = v1.size();
		System.out.println(v1);
		System.out.println("Length of List is: " + len);
	}
}
