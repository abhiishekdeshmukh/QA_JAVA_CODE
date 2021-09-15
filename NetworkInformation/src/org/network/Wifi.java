package org.network;

public class Wifi 
{
	private void wifiName() 
	{
		System.out.println("Wifi1");
	}
	public static void main(String[] args) 
	{
		Wifi wi = new Wifi();
		wi.wifiName();
		
		MobileData md = new MobileData();
		md.dataName();
		
		Lan l1 = new Lan();
		l1.lanName();
		
		Wireless wl = new Wireless();
		wl.modemName();
	}
}
