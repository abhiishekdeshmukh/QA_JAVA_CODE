package org.add;

public class GreensTech 
{
	private void greensOmr(int addId, String city) 
	{
		System.out.println("Address ID & City is: " + addId + " " + city);
	}
	
	private void greensOmr(String city, int addId) 
	{
		System.out.println("City & Address ID is: " + city + " " + addId);
	}
	private void greensOmr(int addId) 
	{
		System.out.println("Address ID is: " + addId);
	}
	
	private void greensOmr(String addId)
	{
		System.out.println("Address ID is: "+ addId);
	}
	
	private void greensOmr(int addId , String city, String state, long pincode) 
	{
		System.out.println("Address ID & City & State & Pincode is:"+ addId +" "+ city +" " +state +" "+ pincode);
	}
	public static void main(String[] args) 
	{
		GreensTech gt = new GreensTech();
		gt.greensOmr(101, "Pune");
		gt.greensOmr("Mumbai", 102);
		gt.greensOmr(103);
		gt.greensOmr("E104");
		gt.greensOmr(105, "Nasik", "Maharashtra", 422101);
	}
}
