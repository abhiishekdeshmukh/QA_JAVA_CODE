package org.tq;

public class IdentityHash 
{
	public static void main(String[] args) 
	{
		//Literal
		String string1 = "Nisha";
		String string2 = "Nisha";
		
		System.out.println(System.identityHashCode(string1));
		System.out.println(System.identityHashCode(string2));
	}
}
