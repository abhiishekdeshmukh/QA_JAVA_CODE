package org.lang;

public class StateDetails 
{
	private void southIndia() 
	{
		System.out.println("South India");
	}
	private void northIndia() 
	{
		System.out.println("North India");
	}
	public static void main(String[] args) 
	{
		StateDetails sd = new StateDetails();
		sd.southIndia();
		sd.northIndia();
		
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
	}
}
