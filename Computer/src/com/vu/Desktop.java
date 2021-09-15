package com.vu;

public class Desktop implements HardWare, Software
{
	private void desktopModel() 
	{
			System.out.println("Apple");
	}
	public static void main(String[] args) 
	{
		Desktop dp = new Desktop();
		dp.desktopModel();
		dp.hardwareResources();
		dp.softwareResources();
	}
	@Override
	public void softwareResources() 
	{
		System.out.println("MacOS");
	}
	@Override
	public void hardwareResources() 
	{
		System.out.println("M1");
	}
}
