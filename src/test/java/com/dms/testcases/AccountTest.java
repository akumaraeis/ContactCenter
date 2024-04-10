package com.dms.testcases;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.dms.basetest.BaseTest;

public class AccountTest extends BaseTest{
	
	public SoftAssert sf;
	public static Logger log;
	public static Select s1;
	public static Select s2;
	public static Select s3;
	public static Select s4;
	public static Select s5;

	public static JavascriptExecutor js;
	
	
	
@BeforeClass
	
	public void openUrl() throws IOException
	{
	
	
		
//		initBrowser(br);
	//	initBrowser(Machine);
		
		
		
		initBrowser("Local");
//		log = LogManager.getLogger(HomeTest.class);
//		log.info("Browser is launched");
	//	initBrowser();
	//	launchUrl();
		creatingObject();
		
		 
		 
	}
	
	@Test(priority=1)
	public void VerifyTestPageFunctionality() throws IOException, InterruptedException
	{
		
		launchUrl();
//		log.info("ChromeBrowser is launched");
		Thread.sleep(2000);
//		log.info("URL Is Launched");
		hp.ClickonActiveAccounts();
		Thread.sleep(3000);
//		log.info("Active Accounts page opens");
	//	SoftAssertion sf = new softAssertion();
		ap.ClickonAddnewBtn();
		Thread.sleep(3000);
//		ap.SendAccountName();
		String SerchName=ap.SendAccountName();
		Thread.sleep(2000);
		ap.SelectAccountType();
		Thread.sleep(2000);
		ap.SelectAccountStatus();
		Thread.sleep(2000);
		ap.SelectIndustryStatus();
		Thread.sleep(2000);
		ap.SendEmail();
		Thread.sleep(2000);
		ap.Sendwebsite();
		Thread.sleep(2000);
		ap.SendaccountDesc();
		Thread.sleep(2000);
		ap.Sendphone();
		Thread.sleep(2000);
		ap.SendAddress1();
		Thread.sleep(2000);
		ap.SendAddress2();
		Thread.sleep(2000);
		ap.SendCity();
		Thread.sleep(2000);
		ap.SendPostal();
		Thread.sleep(2000);
		ap.SelectState();
		Thread.sleep(2000);
		ap.Sendlatitude();
		Thread.sleep(2000);
		ap.Sendlongitude();
		Thread.sleep(2000);
		ap.ClickonSubmitBtn();
		Thread.sleep(2000);
		ap.SearchAccountName(SerchName);
		Thread.sleep(3000);
		String Actual = driverR.findElement(By.xpath("//*[contains(text(),\"Amit Qa\")]")).getText();
		System.out.println(Actual);
		String Expected =SerchName;
		sf = new SoftAssert ();
		sf.assertEquals(Actual, Expected);
		ap.ClickonEditBtn();
		Thread.sleep(2000);
		ap.SendEditEmail2();
		Thread.sleep(2000);
		ap.ClickonSubmitBtn();
		sf.assertAll();
		hp.ClickonAccountClearBtn();
		Thread.sleep(2000);
		
			//*******Read all the data in the Web-Table.************
		
/*		int rowno = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr")).size();
		System.out.println(rowno);
		int colno = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr[1]/td")).size();
		System.out.println(colno);
		
		for ( int r=1; r<=rowno ; r++)
		{
			for( int c=1;c<colno ;c++)
			{
				String data=driverR.findElement(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(" || "+data+" || ");
			}
			System.out.println();
		}
		
		
		 WebElement nextBtn = driverR.findElement(By.xpath("//li[normalize-space()='Next']"));
		 String nextAttr = nextBtn.getAttribute("class");
		
		
		while(!nextAttr.contains("disable"))
		{
			ap.ClickonNextBtn();
			Thread.sleep(2000);
			int rowno1 = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr")).size();
			int colno2 = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr[1]/td")).size();			
			for ( int r=1; r<=rowno1 ; r++)
			{
				for( int c=1;c<colno2 ;c++)
				{
					String data=driverR.findElement(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(" || "+data+" || ");
				}
				System.out.println();
			}
			 nextBtn = driverR.findElement(By.xpath("//li[normalize-space()='Next']"));
			 nextAttr = nextBtn.getAttribute("class");
			 JavascriptExecutor js = (JavascriptExecutor)driverR;
			 js.executeScript("window.scrollBy(0,1200)");
			ap.ClickonNextBtn();
			
			
		}
		
		//**************** Filter Operation Check******************
//		WebElement Accountstatus = driverR.findElement(By.xpath("(//select)[1]"));
//		js = (JavascriptExecutor)driverR;
//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",Accountstatus );
//		 Thread.sleep(2000);
//		Accountstatus.click();
//		s1 = new Select(Accountstatus);
//		s1.selectByVisibleText("Active");
//		Thread.sleep(2000);
//		hp.ClickonAccountSeachBtn();
//		Thread.sleep(1000);
//		hp.ClickonAccountClearBtn();
//		Thread.sleep(1000);
//		//		driverR.navigate().refresh();
//		Thread.sleep(1000);
//		WebElement AccountType = driverR.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/select[1]"));
//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",AccountType );
//		Thread.sleep(1000);
//		AccountType.click();
//		s2 = new Select(AccountType);
//		s2.selectByVisibleText("Vendor");
//		Thread.sleep(1000);
//		hp.ClickonAccountSeachBtn();
//		Thread.sleep(1000);
//		hp.ClickonAccountClearBtn();
//		Thread.sleep(1000);
//		
//		WebElement IndustryType = driverR.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/select[1]"));
//		s3 = new Select(IndustryType);
//		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",IndustryType );
//		 Thread.sleep(1000);
//		 IndustryType.click();
//		s3.selectByVisibleText("Construction");
//		Thread.sleep(1000);
//		hp.ClickonAccountSeachBtn();
//		Thread.sleep(1000);
//		hp.ClickonAccountClearBtn();
//		Thread.sleep(1000);
		
		
		
/*		int rowno = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr")).size();
		System.out.println(rowno);
//		int colno = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr[1]/td")).size();
//		System.out.println(colno);
		
		for ( int r=1; r<=rowno ; r++)
		{
			for( int c=1;c<=2 ;c++)
			{
				String data=driverR.findElement(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(" || "+data+" || ");				
			}
			System.out.println();
		}
		
//		for ( int r=1; r<=rowno ; r++)
//		{
//			
//				String data2=driverR.findElement(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr["+r+"]/td[2]]")).getText();
//				System.out.print(" || "+data2+" || ");
//			
//			System.out.println();
//		}
		
		 WebElement nextBtn = driverR.findElement(By.xpath("//li[normalize-space()='Next']"));
		 String nextAttr = nextBtn.getAttribute("class");
		
		
		while(!nextAttr.contains("disable"))
		{
			ap.ClickonNextBtn();
			Thread.sleep(2000);
			int rowno1 = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr")).size();
			int colno2 = driverR.findElements(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr[1]/td")).size();			
			for ( int r=1; r<=rowno1 ; r++)
			{
				for( int c=1;c<colno2 ;c++)
				{
					String data=driverR.findElement(By.xpath("//*[@class=\"card-body\"]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(" || "+data+" || ");
				}
				System.out.println();
			}
			 nextBtn = driverR.findElement(By.xpath("//li[normalize-space()='Next']"));
			 nextAttr = nextBtn.getAttribute("class");
			 JavascriptExecutor js = (JavascriptExecutor)driverR;
			 js.executeScript("window.scrollBy(0,1200)");
			ap.ClickonNextBtn();
			
			
		}
	*/	
		
		//*********Write data in google sheet*******
		
		
		
		
		
		

}

	@AfterClass
	public void closebrowser()
	{
		 if (driverR != null) {
	            
		teardown();
	}
	
	
}

}
