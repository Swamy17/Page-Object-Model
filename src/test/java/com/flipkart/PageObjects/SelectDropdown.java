package com.flipkart.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {
	
WebDriver driver;
	
	public SelectDropdown(WebDriver rdriver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
				
			}

	 @FindBy(name="firstName")
	 @CacheLookup
	  WebElement fn;
	 @FindBy(name="country")
	 @CacheLookup
	  WebElement coun;
		
	// Select oselect=new Select(coun);	
	/* public void setdropdown(String option)
	 {
		
		 Select oselect=new Select(coun);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 	oselect.selectByValue(option);
	 	
	 	
	 }*/
	 
	 
	 public void firstName(String firstName)
	 {
		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 fn.sendKeys(firstName);
		 
	 }

}
