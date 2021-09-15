package com.vu;

public class NewBank implements I1, I2
{
	private void educationLoan()
	{
		System.out.println("8");
	}
	private void homeLoan() 
	{
		System.out.println("9");
	}
	
	public static void main(String[] args) 
	{
		NewBank nb = new NewBank();
		nb.educationLoan();
		nb.homeLoan();
		
		nb.empName();
		nb.empId();
		
		nb.empStatus();
	}
	@Override
	public void empStatus() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void empName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void empId() {
		// TODO Auto-generated method stub
		
	}
}
