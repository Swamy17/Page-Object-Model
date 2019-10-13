package com.flipkart.PageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.flipkart.PageObjects.LoginPage;
import com.flipkart.TestCases.BaseClass;


public class ActionMethods extends BaseClass
{

WebDriver driver;


	
	public ActionMethods(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		System.out.println("THis is new check in");
				
			}
	
	@FindBy(xpath="//button[text()='Double-Click Me To See Alert']")
	@CacheLookup
	
	 WebElement doubleclick;
	
	@FindBy(xpath="//span[text()='right click me']")
	@CacheLookup
	
	 WebElement rightclick;
  
	/*@FindBy(name="intlChilds")
	@CacheLookup
	
	WebElement adult;*/
	
	@FindBy(name="selenium_commands")
	@CacheLookup
	WebElement scmd;
	
	
	 	
	
		/*
		Actions action=new Actions(driver);
		action.doubleClick(doubleclick).build().perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);//synchronization
		//Switch to the alert box and click on OK button
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//right click()
		
		action.contextClick(rightclick).build().perform();*/
		
	/*	Select oselect=new Select(adult);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		oselect.selectByIndex(4);
		*/
		
	public void gtt() throws InterruptedException
	{
		 // Step 3: Select 'Selenium Commands' Multiple select box ( Use Name locator to identify the element )
		 Select oSelect = new Select(scmd);
		 
		 // Step 4: Select option 'Browser Commands' and then deselect it (Use selectByIndex and deselectByIndex)
		 oSelect.selectByIndex(0); 
		 Thread.sleep(2000);
		 oSelect.deselectByIndex(0);
		 
		 // Step 5: Select option 'Navigation Commands'  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		// oSelect.selectByVisibleText("Navigation Commands");
		 Thread.sleep(2000);
		// oSelect.deselectByVisibleText("Navigation Commands");
		 
		 // Step 6: Print and select all the options for the selected Multiple selection list.
		 List<WebElement> oSize = oSelect.getOptions();
		 int iListSize = oSize.size();
		 
		 // Setting up the loop to print all the options
		 for(int i =0; i < iListSize ; i++)
		 {
		 // Storing the value of the option 
		 String sValue = oSelect.getOptions().get(i).getText();
		 
		 // Printing the stored value
		 System.out.println(sValue);
		 
		 // Selecting all the elements one by one
		 oSelect.selectByIndex(i);
		 Thread.sleep(2000);
		 }
	}
	
		LoginPage lp=new LoginPage(driver);
		 public void dtest(String option)
		 {
					
					WebElement adult = null;
					lp.adult=adult;
					
					Select oselect=new Select(adult);
			
			 oselect.selectByValue(option);
		 }
	




	}
		 
		 
	
	
	