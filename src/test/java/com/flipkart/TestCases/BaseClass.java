package com.flipkart.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.flipkart.utilities.ReadConfig;

public class BaseClass {
	
	public static Logger logger;
	
	ReadConfig readConfig=new ReadConfig();
	
	
	
	public String baseURL=readConfig.getApplicationURL();
	//public String userName=readConfig.getUserName();
	//public String password=readConfig.getPassword();
	//public String c=readConfig.getCountry();
	
	public static WebDriver driver;
		
	

	@Parameters("browser")
	
	@BeforeClass
	public void setUp(String br)
	{
		
		
		if(br.equals("chrome"))
		{
				
				System.setProperty("webdriver.chrome.driver", readConfig.getChromepath());
		driver=new ChromeDriver();
		System.out.println("Im in BaseClass");
		}
		/*else if(equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", readConfig.getIEpath());
		} */
		
		
		
		 logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("D:\\Automation-master\\Flipkart01\\src\\test\\java\\log4j.properties");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	//driver.get(baseURL);

	/*
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
	*/

}
