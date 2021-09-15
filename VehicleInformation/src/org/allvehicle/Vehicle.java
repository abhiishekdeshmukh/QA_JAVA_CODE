package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle 
{
	private void VehicleNecessary() 
	{
		System.out.println("Vehicle Necessary");
	}
	public static void main(String[] args) 
	{
		Vehicle ve = new Vehicle();
		ve.VehicleNecessary();
		
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		
		ThreeWheeler thw = new ThreeWheeler();
		thw.Auto();
		
		FourWheeler fw = new FourWheeler();
		fw.car();
		fw.bus();
		fw.lorry();
	}
}
