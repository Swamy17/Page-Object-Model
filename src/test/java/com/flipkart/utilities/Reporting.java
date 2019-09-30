package com.flipkart.utilities;
import java.io.File;
import java.io.IOException;
	import java.util.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import java.util.Date;
//import com.relevantcodes.extentreports.reports.ExtentHtmlReporter;

public class Reporting extends TestListenerAdapter {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	//public ExtentTest test;
	public ExtentTest logger;
	
	@BeforeTest
	public void onStart(ITestContext testContext)
	{
		
		String timeStamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // time stamp
		String repName="Test-Report-"+timeStamp+".html";
						htmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.repName");//specify Location
						htmlReporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
						
						
		
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName","LocalHost");
		extent.setSystemInfo("OS","Windows10");
		extent.setSystemInfo("TestName","Kumar");
		extent.setSystemInfo("Browser","Chrome");
		
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Functional Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		
		}
	
	public void onTestSuccess(ITestResult tr)
	{
		logger=extent.createTest(tr.getName()); //create new entry in the Report
		logger.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),ExtentColor.GREEN));
		String screenShotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
		File f=new File(screenShotPath);
				if(f.exists())
				{
					try
					{
						logger.fail("Screenshot is below:"+logger.addScreenCaptureFromPath(screenShotPath));
					}
					catch(IOException e)
					{
						e.printStackTrace();
					}
				}
	}
	
	
				public void onTestSkipped(ITestResult tr)
				{
					logger=extent.createTest(tr.getName());
					logger.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),ExtentColor.ORANGE));
				}
				
				public void onFinish(ITestContext testContext)
				{
					extent.flush();
				}
				
	}
	
	


