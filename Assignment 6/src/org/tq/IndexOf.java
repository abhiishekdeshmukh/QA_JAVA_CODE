package org.tq;

public class IndexOf 
{
	public static void main(String[] args) 
	{
		String s1 = "Technology";
		int li1 = s1.lastIndexOf("o");
		System.out.println("Technology");
		System.out.println("Last Index of o is: " + li1);
		
		String s2 = "SeleniumAutomationtool";
		int li2 = s2.lastIndexOf("o");
		System.out.println("SeleniumAutomationtool");
		System.out.println("Last index of o is: " + li2);
		
		String s3 = "j a v a p r o g r a m";
		int li3 = s3.lastIndexOf(" ");
		System.out.println("j a v a p r o g r a m");
		System.out.println("Last Index of Whitespace is: " + li3);
		
		String s4 = "9095984678";
		int li4 = s4.indexOf("8");
		System.out.println("9095984678");
		System.out.println("Index of 8 is: " + li4);
	}
}
