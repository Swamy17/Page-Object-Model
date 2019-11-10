package com.flipkart.TestCases;

import org.testng.annotations.Test;

import com.flipkart.PageObjects.MakemyTrip;

public class TC_MakeMyTrip_Tabs_001 extends BaseClass {
	
	@Test
	public void tabs()
	{
		MakemyTrip mt=new MakemyTrip(driver);
		
		//mt.clickflight();
		mt.clickHotel();
		mt.clickHome();
		
	}
	

}
