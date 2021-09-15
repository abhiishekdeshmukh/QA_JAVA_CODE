package org.tq;

public class IdentityHash1 
{
	public static void main(String[] args) 
	{
		//Non Literal
		String a = new String("Nisha");
		String b = new String("Nisha");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
