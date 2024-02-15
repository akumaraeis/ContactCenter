package com.dms.testcases;


import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.util.Assert;
import com.dms.basetest.BaseTest;
import com.dms.pageObjects.CreateDocPage;

public class TC_login_002 extends BaseTest{
	
	public SoftAssert sf;
	String id;
	String pd;
	String id2;
	String pd2;
	
	
	
	@BeforeClass
	
	public void openUrl() throws IOException
	{
		initBrowser();
//		launchUrl();
		creatingObject();
//		 id = getFile("username");
//		 pd = getFile("password");
		 id2 = getFile("username2");
		 pd2 = getFile("password2");
		
	}
	
//	@Test(priority=1)
//	public void VerifyloginWithCorrectCredential() throws IOException, InterruptedException
//	{
//		launchUrl();
//		sf = new SoftAssert();
//		String expected= "https://staging.intelledocs.io/login";
//		String actual = driverR.getCurrentUrl();
//		System.out.println(actual);
//		sf.assertEquals(actual, expected);
//	lp.sendusername(id);
//	Thread.sleep(2000);
//	lp.sendpassword(pd);
//	Thread.sleep(2000);
//	lp.clickonsubmit();
//	Thread.sleep(5000);
//	boolean actual2=lp.isDirectedTodashboard();
//	System.out.println(actual2);
//	sf.assertTrue(actual2);
//	sf.assertAll();
////	CreateDocPage cd = new CreateDocPage();
//	try {
//	cd.ClickonCreate1();
//	cd.sendDocTitle2();
//	Thread.sleep(2000);
//    cd.SelectDocType3();
//	cd.SelectProcess4();
//	cd.SelectProject5();
//	cd.Selectcategory6();
//	cd.SelectKeywords7();
//	cd.AddDescription8();
//	cd.SelectDrive9();
//	//cd.SubmitDoc10();
//}
//	catch(Exception e)
//	{
//		System.out.println("The Exception name :"+e.getMessage());
//	}


//}


	


	
	@Test(priority=1)
	public void VerifyloginWithInCorrectCredential() throws IOException, InterruptedException
	{
		launchUrl();
		sf = new SoftAssert();
		String expected= "https://staging.intelledocs.io/login";
		String actual = driverR.getCurrentUrl();
		System.out.println("the landing url name :-"+actual);
		sf.assertEquals(actual, expected);
	lp.sendusername(id2);
	Thread.sleep(2000);
	lp.sendpassword(pd2);
	Thread.sleep(2000);
	lp.clickonsubmit();
	Thread.sleep(2000);
	boolean actual2=lp.isDirectedTodashboard();
	System.out.println(actual2);
	SoftAssert sf = new SoftAssert();
	sf.assertTrue(actual2);
	sf.assertAll();

}
	@AfterClass
	public void closebrowser()
	{
		teardown();
	}
	
	
}
