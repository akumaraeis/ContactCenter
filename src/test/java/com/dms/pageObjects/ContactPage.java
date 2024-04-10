package com.dms.pageObjects;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactPage {
	
	public static WebDriver driver2;
	public static JavascriptExecutor js ;
	
	@FindBy(xpath="//a[normalize-space()='Add New']")
	private WebElement addnew ;

	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement Firstname ;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement LastName ;
	
	@FindBy(xpath="//select[@name='contactTypeId']")
	private WebElement ContactType ;
	
	@FindBy(xpath="//select[@name='contactStatusId']")
	private WebElement ContactStatus ;
	
	@FindBy(xpath="//*[@placeholder=\"email Id\"]")
	private WebElement  Contactemail;
	
	@FindBy(xpath="//*[@name=\"accountDesc\"]")
	private WebElement ContactDesc ;
	
	@FindBy(xpath="//*[@placeholder=\"phone No\"]")
	private WebElement Contactphone ;
	
	@FindBy(xpath="//input[@placeholder='Mobile No']")
	private WebElement ContactMob ;

	@FindBy(xpath="//button[normalize-space()='Submit']")
	private WebElement Submitbtn ;
	
	@FindBy(xpath="//button[normalize-space()='Submit']")
	private WebElement submit ;
	
	@FindBy(xpath="//input[@name='account_name']")
	private WebElement AccountFilter ;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	private WebElement Search ;
	
	@FindBy(xpath="//li[normalize-space()='Next']")
	private WebElement Nextbtn ;
	
	    public ContactPage(WebDriver driverR)
		{
			driver2 = driverR;
			PageFactory.initElements(driverR, this);
		}
//********time stamp
	    public static String timestamp()
	    {
	    	//return new SimpleDateFormat("yyyyddHHmm").format(new Date(10));
	    	LocalDateTime dt=LocalDateTime.now();
	    	DateTimeFormatter df = DateTimeFormatter.ofPattern("mm");
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
	    
	    public void SendFirstName() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",Firstname );
			Thread.sleep(2000);
			Firstname.sendKeys("Amit");
		}
	    
	    public void SendLastName() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",LastName );
			Thread.sleep(2000);
			LastName.sendKeys("Kumar"+timestamp());
		}
	    
	    public void SelectContactType() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",ContactType );
			Thread.sleep(2000);
			Select s1 = new Select(ContactType);
			s1.selectByIndex(1);	
		}
	    public void SelectContactStatus() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",ContactStatus );
			Thread.sleep(2000);
			Select s2 = new Select(ContactStatus);
			s2.selectByIndex(1);	
		}
	    
	    public void SendEmail() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",Contactemail );
			Thread.sleep(2000);
			Contactemail.sendKeys("Amit.k"+timestamp()+"@gmail.com");
		}
	    public void SendDesc() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",ContactDesc );
			Thread.sleep(2000);
			ContactDesc.sendKeys("Testing Contact");
		}
	    
	    public void SendContactphone() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",Contactphone );
			Thread.sleep(2000);
			Contactphone.sendKeys("0612222"+timestamp());
		}
	    
	    public void SendMobile() throws InterruptedException
		{
		    js = (JavascriptExecutor)driver2;
			js.executeScript("arguments[0].setAttribute('style','background:violet;border:40px solid green;')",ContactMob );
			Thread.sleep(2000);
			ContactMob.sendKeys("843084"+timestamp());
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
	

}
