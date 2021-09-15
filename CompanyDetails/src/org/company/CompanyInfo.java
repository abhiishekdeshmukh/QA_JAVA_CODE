package org.company;

public class CompanyInfo 
{
	private void companyName(int companyId, String companyNa) 
	{
		System.out.println("Company Id & Name is: " + companyId +" " + companyNa);
	}
	private void companyName(int companyId, String companyNa, String companyCity) 
	{
		System.out.println("Company Id & Name & City is: " + companyId + " " + companyNa);
	}
	public static void main(String[] args) 
	{
		CompanyInfo ci = new CompanyInfo();
		ci.companyName(101, "TCS");
		ci.companyName(102, "Infosys", "Pune");
	}
}
