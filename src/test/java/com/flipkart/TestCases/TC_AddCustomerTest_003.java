package com.flipkart.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.flipkart.PageObjects.AddCustomerPage;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.utilities.XLUtils;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	@Test(dataProvider="CustomerTestData")
	public void addNewCustomer(String user,String pwd,String name,String gender,String mm,String dd,String yy,String add,String state,String city,String pin,String telephone,String email,String password) throws InterruptedException
	{
		//LoginPage lp=new LoginPage(driver);
		//lp.setUserName(userName);
		//lp.setPassWord(password);
		//lp.clickSubmit();
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		System.out.println("This is 3rd method:");
		
		addcust.setUserName(user);
		addcust.setPassWord(pwd);
		addcust.clickSubmit();
		addcust.clickAddNewCustomer();
		addcust.custName(name);
		addcust.custgender(gender);
		addcust.custdob(mm, add, yy);
		Thread.sleep(3000);
		addcust.custaddress(add);
		addcust.custstate(state);
		addcust.custcity(city);
		addcust.custpinno(pin);
		Thread.sleep(3000);
		addcust.custtelephoneno(telephone);
		addcust.custemailid(email);
		addcust.clickSubCustomer();
		addcust.custpwd(password);
		
		//addcust.clickAddNewCustomer();
		//addcust.custName(cname);
		
		//Thread.sleep(3000);
		/*
		AddCustomerPage addcust=new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		Thread.sleep(3000);
		addcust.custName("Kumar");
		addcust.custgender("female");
		addcust.custdob("10","15","1987");
		Thread.sleep(3000);
		addcust.custaddress("INDIA");
		addcust.custcity("Hyderabad");
		Thread.sleep(3000);
	 addcust.custstate("TS");
	   addcust.custpinno("500018");
		addcust.custtelephoneno("9703770585");
		addcust.custemailid("tkumaraswamy19@gmail.com");
		addcust.custpwd("Kumar@123");
		addcust.clickSubCustomer();
		Thread.sleep(5000);
		*/
	}
	
	
		
		@DataProvider(name="CustomerTestData")
		String [][] getData() throws Exception
		{
			
			String path=System.getProperty("user.dir")+"/src/test/java/com/flipkart/testData/LoginData.xlsx";
			int rownum=XLUtils.getRowCount(path,"Sheet1");
			int colnum=XLUtils.getCellCount(path,"Sheet1",1);
			
			String cusdata[][]=new String[rownum][colnum];
			
			for(int i=1;i<=rownum;i++)
			{
				for(int j=0;j<colnum;j++)
				{
					cusdata[i-1][j]=XLUtils.getCellData(path,"Sheet1",i,j);
				}
			}
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			return cusdata;
		}
		
		
		
	}


