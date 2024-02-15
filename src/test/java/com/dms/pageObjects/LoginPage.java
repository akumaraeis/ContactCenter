package com.dms.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driverL;
	@FindBy (xpath ="//*[@id=\"email\"]")
	 private WebElement username;
	
	@FindBy (xpath ="//*[@id=\"password\"]")
	 private WebElement password;
	
	@FindBy (xpath ="//*[@type=\"submit\"]")
	 private WebElement submit;
	
	@FindBy(xpath="//*[text()=\"Dashboard\"]")
	private WebElement dashboard;
	
	
	 public LoginPage(WebDriver driverR)
	{
		driverL = driverR;
		PageFactory.initElements(driverR, this);
	}
	
	public void sendusername(String id)
	{
		username.sendKeys(id);
	}
	
	public void sendpassword(String pd)
	{
		password.sendKeys(pd);
	}
	
	public void clickonsubmit()
	{
		submit.click();
	}
	
	public boolean isDirectedTodashboard()
	{
		return dashboard.isDisplayed();
	}
	
	
	
	
	
	
}
