package com.flipkart.PageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

 WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	/*@FindBy(xpath="//div[text()='My Account']")
	@CacheLookup
	
	public WebElement myAccount;

	 
	 @FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	 @CacheLookup
	 
    WebElement txtUserName;
	 
	 @FindBy(xpath="//input[@type='password']")
	 @CacheLookup
			
	WebElement txtPassWord;	
	 
	 @FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	 @CacheLookup
	
			 WebElement	 btnLogin;
	 */
	
	@FindBy(id="intlChilds")
	@CacheLookup
	
	public WebElement adult;
	
	
	 @FindBy(name="uid")
	 @CacheLookup
	 
    WebElement txtUserName;
	 
	 @FindBy(name="password")
	 @CacheLookup
			
	WebElement txtPassWord;	
	 
	 @FindBy(name="btnLogin")
	 @CacheLookup
	
			 WebElement	 btnLogin;
	 
	 @FindBy(xpath="//a[@href='Logout.php']")
		@CacheLookup
		
		public WebElement Logout;
	
	 
	 //Action methods for Login Page.
	 
	public void setUserName(String uname)
	{
		
		txtUserName.sendKeys(uname);
	}
	
	public void setPassWord(String pwd)
	{
		txtPassWord.sendKeys(pwd);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	public void clickLogout()
	{
		Logout.click();
	}
	
	  
		
		 	
		public void setdp(String option)
		{
			/*
			Actions action=new Actions(driver);
			action.doubleClick(doubleclick).build().perform();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);//synchronization
			//Switch to the alert box and click on OK button
			
			Alert alert=driver.switchTo().alert();
			alert.accept();
			
			//right click()
			
			action.contextClick(rightclick).build().perform();*/
			
			Select oselect=new Select(adult);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			oselect.selectByValue(option);
			
		}
		
		
		}


	

