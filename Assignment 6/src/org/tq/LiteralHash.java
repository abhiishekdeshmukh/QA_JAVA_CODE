package org.tq;

public class LiteralHash 
{
	public static void main(String[] args) 
	{
		String a = "Nisha";
		String b = "Rengan";
		String c = "NishaRengan";
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
	}
}
