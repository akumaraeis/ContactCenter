package com.dms.pageObjects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountPage {
	
	public static WebDriver driver2;
	public static JavascriptExecutor js ;
	
	@FindBy(xpath="//a[normalize-space()='Add New Account']")
	private WebElement addnew ;

	@FindBy(xpath="//input[@placeholder='account Name']")
	private WebElement accountname ;
	
	@FindBy(xpath="//select[@name='accountTypeId']")
	private WebElement accountType ;
	
	@FindBy(xpath="//select[@name='accountStatusId']")
	private WebElement accountStatus ;
	
	@FindBy(xpath="//select[@name='industryId']")
	private WebElement industry ;
	
	@FindBy(xpath="//input[@placeholder='email Id']")
	private WebElement  email;
	
	@FindBy(xpath="//input[@placeholder='website']")
	private WebElement website ;
	
	@FindBy(xpath="//input[@placeholder='accountDesc']")
	private WebElement accountDesc ;
	
	@FindBy(xpath="//input[@placeholder='phone No']")
	private WebElement phone ;
	
	@FindBy(xpath="//input[@placeholder='address line 1']")
	private WebElement address1 ;
	 
	@FindBy(xpath="//input[@placeholder='address line 2']")
	private WebElement address2 ;
	
	@FindBy(xpath="//input[@placeholder='city']")
	private WebElement city ;
	
	@FindBy(xpath="//input[@placeholder='postal Code']")
	private WebElement postal ;
	
	@FindBy(xpath="//select[@name='stateId']")
	private WebElement  state;
	
	@FindBy(xpath="//input[@placeholder='latitude']")
	private WebElement latitude ;

	@FindBy(xpath="//input[@placeholder='longitude']")
	private WebElement longitude ;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	private WebElement submit ;
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement AccountFilter ;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	private WebElement Search ;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[2]")
	private WebElement Editbtn ;
	
	@FindBy(xpath="//input[@placeholder='email Id']")
	private WebElement Email2 ;
	
	@FindBy(xpath="//li[normalize-space()='Next']")
	private WebElement Nextbtn ;
	
	
	
	    public AccountPage(WebDriver driverR)
		{
			driver2 = driverR;
			PageFactory.initElements(driverR, this);
		}
//********time stamp
	    public static String timestamp()
	    {
	    	//return new SimpleDateFormat("yyyyddHHmm").format(new Date(10));
	    	LocalDateTime dt=LocalDateTime.now();
	    	DateTimeFormatter df = DateTimeFormatter.ofPattern("yyhhmm");
	    	String mydata=dt.format(df);
	    	return mydata;
	    	
	    }
	    public void ClickonAddnewBtn() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",addnew );
			Thread.sleep(2000);
			addnew.click();
		}
	    
	    public String SendAccountName() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",accountname );
			Thread.sleep(2000);
			accountname.sendKeys("Amit Qa"+timestamp());
		 return ("Amit Qa"+timestamp());
		}
	    
	    
	    
	public void SelectAccountType() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",accountType );
			Thread.sleep(2000);
		Select s1 = new Select(accountType);
		s1.selectByIndex(2);
		}

	public void SelectAccountStatus() throws InterruptedException
	{
	    js = (JavascriptExecutor)driver2;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",accountStatus );
		Thread.sleep(2000);
	Select s2 = new Select(accountStatus);
	s2.selectByIndex(1);
	}
	
	public void SelectIndustryStatus() throws InterruptedException
	{
	    js = (JavascriptExecutor)driver2;
		js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",industry );
		Thread.sleep(2000);
	Select s3 = new Select(industry);
	s3.selectByIndex(1);
	}
	 public void SendEmail() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",email );
			Thread.sleep(2000);
			email.sendKeys("amit.qa"+timestamp()+"@gmail.com");
		}
	
	 public void Sendwebsite() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",website );
			Thread.sleep(2000);
			website.sendKeys("www.aeis.com");
		}
	
	 public void SendaccountDesc() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",accountDesc );
			Thread.sleep(2000);
			accountDesc.sendKeys("Testing");
		}
	 
	 public void Sendphone() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",phone );
			Thread.sleep(2000);
			phone.sendKeys("9430"+timestamp());
		}
	
	 public void SendAddress1() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",address1 );
			Thread.sleep(2000);
			address1.sendKeys("New Jersey");
		}
	 public void SendAddress2() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",address2 );
			Thread.sleep(2000);
			address2.sendKeys("New Jersey");
		}
	 
	 public void SendCity() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",city );
			Thread.sleep(2000);
			city.sendKeys("New Jersey");
		}
	 public void SendPostal() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",postal );
			Thread.sleep(2000);
			postal.sendKeys("623002");
		}
	 public void SelectState() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",state );
			Thread.sleep(2000);
		Select s4 = new Select(state);
		s4.selectByVisibleText("New Jersey");
		}
	 
	 public void Sendlatitude() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",latitude );
			Thread.sleep(2000);
			latitude.sendKeys("16.00713500");
		}
	 public void Sendlongitude() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",longitude );
			Thread.sleep(2000);
			longitude.sendKeys("16.00713500");
		}
	
	 public void ClickonSubmitBtn() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",submit );
			Thread.sleep(2000);
			submit.click();
		
		}
	
	 public void SearchAccountName(String ActName) throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",AccountFilter );
			Thread.sleep(2000);
			AccountFilter.sendKeys( ActName);
			Thread.sleep(2000);
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",Search );
			Search.click();
		
		}
	 public void ClickonNextBtn() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",Nextbtn );
			Thread.sleep(2000);
			Nextbtn.click();	
		}
	 public void ClickonEditBtn() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",Editbtn );
			Thread.sleep(2000);
			Editbtn.click();	
		}
	 
	 public void SendEditEmail2() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:yellow;border:4px solid green;')",Email2 );
			Thread.sleep(2000);
			Email2.clear();
			Thread.sleep(2000);
			Email2.sendKeys("EditedAmit"+timestamp()+"@gmail.com");;	
		}
	
}



