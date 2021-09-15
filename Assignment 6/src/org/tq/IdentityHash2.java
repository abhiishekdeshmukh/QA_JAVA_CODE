package org.tq;

public class IdentityHash2 
{
	public static void main(String[] args) 
	{
		//Non Literal
		String a = new String("Nisha");
		String b = new String("Rengan");
		String c = new String("NishaRengan");
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
	}
}
