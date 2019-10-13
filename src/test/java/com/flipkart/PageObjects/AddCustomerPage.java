package com.flipkart.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
				
			}

	 @FindBy(name="uid")
	 @CacheLookup
	 
    WebElement txtUserName;
	 
	 @FindBy(name="password")
	 @CacheLookup
	 
	 WebElement txtPassWord;	
	 
	
	 
	 @FindBy(name="btnLogin")
	 @CacheLookup
	
			 WebElement	 btnLogin;


@FindBy(xpath="//a[@href='addcustomerpage.php']")
@CacheLookup
WebElement newCustomer;


@FindBy(name="name")
@CacheLookup

WebElement txtCustomerName;


@FindBy(xpath="//input[@value='f']")
@CacheLookup

WebElement rdGender;


@FindBy(xpath="//input[@id='dob']")
@CacheLookup

WebElement txtdob;

@FindBy(name="addr")
@CacheLookup

WebElement txtaddress;

@FindBy(name="city")
@CacheLookup

WebElement txtcity;

@FindBy(name="state")
@CacheLookup

WebElement txtstate;

@FindBy(name="pinno")
@CacheLookup

WebElement txtpinno;

@FindBy(name="telephoneno")
@CacheLookup

WebElement txttelephoneno;

@FindBy(name="emailid")
@CacheLookup

WebElement txtemailid;


@FindBy(xpath="//input[@type='password']")
@CacheLookup

WebElement password1;

@FindBy(name="sub")
@CacheLookup

WebElement sub;

public void clickAddNewCustomer()
{
	
	newCustomer.click();
}

public void custName(String cname)
{
	
	txtCustomerName.sendKeys(cname);
}

public void custgender(String cgender)
{
	rdGender.click();
	
}

public void custdob(String mm,String dd,String yy)
{
txtdob.sendKeys(mm);
txtdob.sendKeys(dd);
txtdob.sendKeys(yy);
	
}

public void custaddress(String caddress)
{
	
txtaddress.sendKeys(caddress);
}

public void custstate(String cstate)
{
	
txtstate.sendKeys(cstate);
}

public void custcity(String ccity)
{
	
txtcity.sendKeys(ccity);
}


public void custpinno(String cpinno)
{
	
txtpinno.sendKeys(cpinno);
}

public void custtelephoneno(String ctelephoneno)
{
	
	txttelephoneno.sendKeys(ctelephoneno);

}


public void custemailid(String cemailid)
{
	
txtemailid.sendKeys(cemailid);
System.out.println("This is the AddCustomer Page");
}

public void clickSubCustomer()
{
	
	sub.click();
}

public void custpwd(String cpassword)
{
	
	password1.sendKeys(cpassword);
}

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



}



