package com.flipkart.TestCases;

import org.testng.annotations.Test;

import com.flipkart.PageObjects.ActionMethods;
import com.flipkart.PageObjects.SelectDropdown;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DropdownSelect extends BaseClass

{
  @Test
  public void fun() throws InterruptedException
  {
	  ActionMethods ap=new ActionMethods(driver);
	  //a.gtt();
	  ap.dtest("3");

  }
}
