package com.flipkart.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.PageObjects.LoginPage;
import com.flipkart.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
		public void loginDDT(String user,String pwd)
	{
		
		//driver.get(baseURL);
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassWord(pwd);
		lp.clickSubmit();
		
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
		
	}
	
	public boolean isAlertPresent() {
		
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
	}
	
	/*@Test
	public void loginTest()
	{
		
		driver.get(baseURL);
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
	}
		*/
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		
		String path=System.getProperty("user.dir")+"/src/test/java/com/flipkart/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colnum=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colnum];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colnum;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
			}
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return logindata;
	}
	
	

}
