package com.flipkart.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakemyTrip

{

	WebDriver driver;
	
		
	public MakemyTrip(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chFlights ']")
	@CacheLookup
	WebElement flight;
	
	@FindBy(xpath="//span[@class='chNavIcon appendBottom2 chSprite chHolidays ']")
	 	@CacheLookup
	WebElement hotel;
	
	@FindBy(xpath="//span[contains(@class,'chNavIcon appendBottom2 chSprite chHomestays')]")
	@CacheLookup
	WebElement home;
	
	@FindBy(xpath="//font[contains(text(),'Super Offers')]")
	@CacheLookup
	WebElement offer;
	
	
	public void clickflight()
	{
		flight.click();
	}

	public void clickHotel()
	{
		hotel.click();
		boolean b=offer.isDisplayed();
		if(b==true)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		
	}
	
	public void clickHome()
	{
		home.click();
	}
}
