package com.flipkart.TestCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.PageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{
	
	

	@Test
	public void loginTest()
	{
		
		/*driver.get(baseURL);
		logger.info("Opening URL");
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName(userName);
		logger.info("Entered URL");
		lp.setPassWord(password);
		logger.info("Entered Password");
		
		lp.clickSubmit();
		if(driver.getTitle().equals("hhhjh"))
		{
			AssertJUnit.assertTrue(true);
		}
			else
			AssertJUnit.assertTrue(false);
	}*/
		
		LoginPage lp=new LoginPage(driver);
		lp.setdp("3");
		
	}
}
