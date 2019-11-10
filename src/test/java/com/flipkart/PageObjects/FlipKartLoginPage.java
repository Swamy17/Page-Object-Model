package com.flipkart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKartLoginPage {

WebDriver driver;


	
	public FlipKartLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		System.out.println("THis is new check in hi ");
				
			}
	
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	@CacheLookup
	
	 WebElement user1;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	@CacheLookup
	
	 WebElement pass1;
  
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]")
	@CacheLookup
		WebElement login1;
	
	
}
	
	