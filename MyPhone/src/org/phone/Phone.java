package org.phone;

public class Phone 
{
	private void phoneInfo(int phoneId, String phoneName) 
	{
		System.out.println("Phone Id & Phone Name is: " + phoneId + " " + phoneName);
	}
	
	private void phoneInfo(String phoneName, int phoneId) 
	{
		System.out.println("Phone Name & Phone Id is: " + phoneName + " " + phoneId);
	}
	
	public static void main(String[] args) 
	{
		Phone ph = new Phone();
		ph.phoneInfo(101, "Apple");
		ph.phoneInfo("Samsung", 102);
	}
}
