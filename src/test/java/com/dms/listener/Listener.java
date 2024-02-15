package com.dms.listener;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.dms.utility.Utility;

public class Listener implements ITestListener{
	 ExtentSparkReporter sparkReporter;
	 ExtentReports extentreports;
	 ExtentTest test;
	 String capturepath;
	
	public void configureReport() throws IOException
	{
	//	File file = new File("report.html");
		String timestamp2 = new SimpleDateFormat("yyyy.MM.dd.HH.mm").format(new Date());
		String repName = "ExtentReport-"+timestamp2+".html";
		 sparkReporter = new ExtentSparkReporter(repName);
		 extentreports = new ExtentReports();
		     extentreports.attachReporter(sparkReporter);
		   // system information info
   	   	    capturepath = Utility.getScreenshot();
		     extentreports.setSystemInfo("Machine1", "Testpc1");
		     extentreports.setSystemInfo("Operating system", "Windows 11 pro");
		     extentreports.setSystemInfo("Browser", "Chrome");
		     extentreports.setSystemInfo("Environment", "QA Environment");
		     extentreports.setSystemInfo("Host", "QA");
		     extentreports.setSystemInfo("UserName", "Amit kumar");
		     
		     // config to change look & feel
		     sparkReporter.config().setDocumentTitle("Extent Report of CRM Project");
		     sparkReporter.config().setReportName("This is my Automation Report");
		     sparkReporter.config().setTheme(Theme.DARK);
		     
		     
	}

	
	

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		try {
			configureReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			configureReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The name of the Test Method Successfully Passed :"+result.getName());
		test=extentreports.createTest(result.getName());
		test=extentreports.createTest(result.getName()).addScreenCaptureFromPath(capturepath, "Screenshot of Passed test case of login page");
		test.log(Status.PASS,MarkupHelper.createLabel("Name of the Passed test is :" +result.getName(), ExtentColor.GREEN) );
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			configureReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("The name of the Test Method failed :"+result.getName());
		test=extentreports.createTest(result.getName());
		test=extentreports.createTest(result.getName()).addScreenCaptureFromPath(capturepath, "Screenshot of failed test case of login page");
		test.log(Status.FAIL,MarkupHelper.createLabel("Name of the failed test is :" +result.getName(), ExtentColor.RED) );
		
			
		}
		

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("The name of the Test Method Skipped :"+result.getName());
		
		test=extentreports.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("Name of the failed test is :" +result.getName(), ExtentColor.ORANGE) );
	}
	
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extentreports.flush();
			}
	
	
	}



